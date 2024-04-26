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
from studentca_marks c, StudentEnd_Marks e , attendance_eligibility a
where c.Eligibility_Status = 'Eligible' and a.Eligiblity = 'Eligible' and
c.userId = e.userId and
c.courceCode = e.courceCode and
a.userId = e.userId and
a.userId = c.userId and
a.courceCode = e.courceCode and
a.courceCode = c.courceCode ;


