-- user table

CREATE TABLE User(
      userId VARCHAR(20),
      type VARCHAR(20),
      uName VARCHAR(20),
      phoneNumber INT,
      email VARCHAR(20),
      gender VARCHAR(10),
      pwd VARCHAR(8),
      image VARCHAR(100),
      PRIMARY KEY(userId)
);

-- cource table

CREATE TABLE Cource(
      courceCode VARCHAR(20),
      cName VARCHAR(20),
      credit INT,
      weeek INT,
      theory INT,
      practical INT,
      userId VARCHAR(20),
      PRIMARY KEY(courceCode),
      FOREIGN KEY(userId) REFERENCES user(userId)
);


-- notice tables

CREATE TABLE Notice(
     number INT,
     date VARCHAR(20),
     title VARCHAR(20),
     PRIMARY KEY(number)
);

-- timetable table

CREATE TABLE timeTable(
     title VARCHAR(20),
     dipartment VARCHAR(10),
     level INT,
     drivelink VARCHAR(200)
     
);

-- ///////////////////////////////////////////////////////////////////////////////////////////////






-- CREATE TABLE Admin(
--          adminId VARCHAR(20),
--          aName VARCHAR(20),
--          phoneNumber INT,
--          email VARCHAR(20),
--          gender VARCHAR(10),
--          pwd VARCHAR(8),
--          PRIMARY KEY(adminId)
         
--          );



-- lecturer table

-- CREATE TABLE lecturer(
--          lecturerId VARCHAR(20),
--          lName VARCHAR(20),
--          phoneNumber INT,
--          email VARCHAR(20),
--          gender VARCHAR(10),
--          pwd VARCHAR(8),
--          PRIMARY KEY(lecturerId),
         
--          );


-- student table

-- CREATE TABLE Student(
--          studentId VARCHAR(20),
--          sName VARCHAR(20),
--          phoneNumber INT,
--          email VARCHAR(20),
--          adress VARCHAR(30),
--          img VARCHAR(100),
--          gender VARCHAR(10),
--          pwd VARCHAR(8),
--          PRIMARY KEY(studentId)

         
--          );


-- technical officer table

-- CREATE TABLE TechnicalOfficer(
--          tecId VARCHAR(20),
--          tName VARCHAR(20),
--          phoneNumber INT,
--          email VARCHAR(20),
--          gender VARCHAR(10),
--          pwd VARCHAR(8),
--          PRIMARY KEY(tecId)

         
--          );








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



-- attendance table

CREATE TABLE Attendance(
      
      studentId VARCHAR(20),
      courceCode VARCHAR(20),
      date Date,
      type VARCHAR(10),
      status VARCHAR(10),
      medicalId VARCHAR(20),
      FOREIGN KEY (studentId) REFERENCES Student(studentId),
      FOREIGN KEY (medicalId) REFERENCES Medical(medicalId),
      FOREIGN KEY (courceCode) REFERENCES Cource(courceCode)

      
);



-- medical tables

CREATE TABLE Medical(
      studentId VARCHAR(20),
      courceCode VARCHAR(20),
      date Date,
      description VARCHAR(100),
      medicalId VARCHAR(20),
      PRIMARY KEY(medicalId),
      FOREIGN KEY (studentId) REFERENCES Student(studentId),
      FOREIGN KEY (courceCode) REFERENCES Cource(courceCode)

      
);



