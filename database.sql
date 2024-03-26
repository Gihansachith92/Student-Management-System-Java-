-- admin table

CREATE TABLE Admin(
         adminId VARCHAR(20),
         aName VARCHAR(20),
         phoneNumber INT,
         email VARCHAR(20),
         gender VARCHAR(10),
         pwd VARCHAR(8),
         PRIMARY KEY(adminId)
         
         );



-- lecturer table

CREATE TABLE lecturer(
         lecturerId VARCHAR(20),
         lName VARCHAR(20),
         phoneNumber INT,
         email VARCHAR(20),
         gender VARCHAR(10),
         pwd VARCHAR(8),
         courceCode VARCHAR(20),
         PRIMARY KEY(lecturerId),
         FOREIGN KEY (courceCode) REFERENCES Cource(courceCode)
         
         );


-- student table

CREATE TABLE Student(
         studentId VARCHAR(20),
         sName VARCHAR(20),
         phoneNumber INT,
         email VARCHAR(20),
         adress VARCHAR(30),
         img VARCHAR(100),
         gender VARCHAR(10),
         pwd VARCHAR(8),
         PRIMARY KEY(studentId)

         
         );


-- technical officer table

CREATE TABLE TechnicalOfficer(
         tecId VARCHAR(20),
         tName VARCHAR(20),
         phoneNumber INT,
         email VARCHAR(20),
         gender VARCHAR(10),
         pwd VARCHAR(8),
         PRIMARY KEY(tecId)

         
         );



-- cource table

CREATE TABLE Cource(
      courceCode VARCHAR(20),
      cName VARCHAR(20),
      credit INT,
      weeek INT,
      theory INT,
      practical INT,
      PRIMARY KEY(courceCode)
);


-- student Marks table

CREATE TABLE StudentMarks(
      q1 INT,
      q2 INT,
      q3 INT,
      midP INT,
      midT INT,
      endP INT,
      endT INT,
      assesment INT,
      studentId VARCHAR(20),
      courceCode VARCHAR(20),
      FOREIGN KEY (studentId) REFERENCES Student(studentId),
      FOREIGN KEY (courceCode) REFERENCES Cource(courceCode)

      
);