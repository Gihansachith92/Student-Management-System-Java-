-- Create the StudentCA_Marks view 
CREATE VIEW StudentCA_Marks AS
SELECT e.userId, e.courceCode,
    ((e.q1 + e.q2 + e.q3 - LEAST(e.q1, LEAST(e.q2, e.q3))) / 2) * 0.05 AS `Quiz_Score`,
    (e.assesment * 0.05) AS `Assessment_Mark`,
    ((e.midT + e.midP) * 0.20) AS `MidMark`,
    (
        ((e.q1 + e.q2 + e.q3 - LEAST(e.q1, LEAST(e.q2, e.q3))) / 2) * 0.05 +
        (e.assesment * 0.05) +
        ((e.midT + e.midP) * 0.20)
    ) as `CA_Marks`,
    CASE
        WHEN (
            ((e.q1 + e.q2 + e.q3 - LEAST(e.q1, LEAST(e.q2, e.q3))) / 2) * 0.05 +
            (e.assesment * 0.05) +
            ((e.midT + e.midP) * 0.20)
        ) >= 15 THEN 'Eligible'
        ELSE 'Not_Eligible'
    END AS `Eligibility_Status`
FROM StudentMarks e
INNER JOIN User s ON e.userId = s.userId;




-- Create the StudentEnd_Marks view with a 70% adjusted assessment mark
CREATE VIEW StudentEnd_Marks AS
SELECT e.userId, e.courceCode, 
    ((e.endP  + e.endT ) * 0.70) AS `EndMark`
FROM StudentMarks e
INNER JOIN User s ON e.userId = s.userId;



-- Create the StudentFinal_Marks view
create view StudentFinal_Marks AS
select c.userId, c.courceCode, (c.CA_Marks + e.EndMark) as FinalMark
from StudentCA_Marks c, StudentEnd_Marks e , attendance_eligibility a
where c.Eligibility_Status = 'Eligible' and a.Eligiblity = 'Eligible' and
c.userId = e.userId and
c.courceCode = e.courceCode and
a.userId = e.userId and
a.userId = c.userId and
a.courceCode = e.courceCode and
a.courceCode = c.courceCode ;


-- create the StudentGradePoint view
create view StudentGradePoint AS 
select  userId, courceCode, 
   case
      when(FinalMark>= 85 and FinalMark<= 100) then 'A+'
      when(FinalMark>= 80 and FinalMark<= 84.999999) then 'A'
      when(FinalMark>= 75 and FinalMark<= 79.999999) then 'A-'
      when(FinalMark>= 70 and FinalMark<= 74.999999) then 'B+'
      when(FinalMark>= 65 and FinalMark<= 69.999999) then 'B'
      when(FinalMark>= 60 and FinalMark<= 64.999999) then 'B-'
      when(FinalMark>= 55 and FinalMark<= 59.999999) then 'C+'
      when(FinalMark>= 50 and FinalMark<= 54.999999) then 'C'
      when(FinalMark>= 45 and FinalMark<= 49.999999) then 'C-'
      when(FinalMark>= 40 and FinalMark<= 44.999999) then 'D+'
      when(FinalMark>= 35 and FinalMark<= 39.999999) then 'D'
      when(FinalMark>= 0 and FinalMark<= 34.999999) then 'F'
      ELSE 'Not_Valid'
   end   AS 'Grade' ,

  case
      when(FinalMark>= 85 and FinalMark<= 100) then 4.0
      when(FinalMark>= 80 and FinalMark<= 84.999999) then 4.0
      when(FinalMark>= 75 and FinalMark<= 79.999999) then 3.7
      when(FinalMark>= 70 and FinalMark<= 74.999999) then 3.3
      when(FinalMark>= 65 and FinalMark<= 69.999999) then 3.0
      when(FinalMark>= 60 and FinalMark<= 64.999999) then 2.7
      when(FinalMark>= 55 and FinalMark<= 59.999999) then 2.3
      when(FinalMark>= 50 and FinalMark<= 54.999999) then 2.0
      when(FinalMark>= 45 and FinalMark<= 49.999999) then 1.7
      when(FinalMark>= 40 and FinalMark<= 44.999999) then 1.3
      when(FinalMark>= 35 and FinalMark<= 39.999999) then 1.0
      when(FinalMark>= 0 and FinalMark<= 34.999999) then 0
      ELSE 'Not_Valid'
   end   AS 'Grade_Point'

from StudentFinal_Marks;



