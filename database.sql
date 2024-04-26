-- user table

CREATE TABLE User(
      userId VARCHAR(20),
      type VARCHAR(20),
      uName VARCHAR(100),
      phoneNumber INT,
      email VARCHAR(100),
      gender VARCHAR(10),
      pwd VARCHAR(100),
      image VARCHAR(300),
      PRIMARY KEY(userId)
);

-- cource table

CREATE TABLE Cource(
      courceCode VARCHAR(20),
      cName VARCHAR(100),
      credit INT,
      weeek INT,
      theory INT,
      practical INT,
      userId VARCHAR(20),
      PRIMARY KEY(courceCode),
      FOREIGN KEY(userId) REFERENCES User(userId) ON DELETE CASCADE ON UPDATE CASCADE

);


-- notice tables

CREATE TABLE Notice(
     number INT,
     date VARCHAR(20),
     title VARCHAR(400),
     PRIMARY KEY(number)
);

-- timetable table

CREATE TABLE timeTable(
     title VARCHAR(300),
     dipartment VARCHAR(10),
     level INT,
     drivelink VARCHAR(500)
     
);

-- ///////////////////////////////////////////////////////////////////////////////////////////////




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
      userId VARCHAR(20),
      courceCode VARCHAR(20),
      FOREIGN KEY(userId) REFERENCES user(userId),
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



