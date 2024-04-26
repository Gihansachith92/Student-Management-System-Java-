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
      userId VARCHAR(60),
      courceCode VARCHAR(60),
      FOREIGN KEY (userId) REFERENCES User(userId),
      FOREIGN KEY (courceCode) REFERENCES Cource(courceCode));



-- attendance table

CREATE TABLE attendance (
    userID VARCHAR(60),
    courseCode VARCHAR(60),
    sessionDate DATE,
    sessionType ENUM('Theory', 'Practical', 'Combined'),
    A_status ENUM('Present', 'Absent'),
    FOREIGN KEY (userID) REFERENCES User(userId),
    FOREIGN KEY (courseCode) REFERENCES Cource(courceCode));



-- medical tables

CREATE TABLE medical(
    medicalID VARCHAR(50),
    courceCode VARCHAR(50),
    userId VARCHAR(20),
    description VARCHAR(60),
    FOREIGN KEY(userId) REFERENCES User(userId),
    FOREIGN KEY(courceCode) REFERENCES course(courceCode),
    PRIMARY KEY(medicalID));



