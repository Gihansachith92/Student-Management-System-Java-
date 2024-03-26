
-- Admin table
INSERT INTO "admin" (adminId,aName,phoneNumber,email,gender,pwd)
VALUES ('admin001','admin',753383838,'admin@gmail.com','male','admin123');



-- lecturer table
INSERT INTO "admin" (lecturerId,lName,phoneNumber,email,gender,pwd)
VALUES  ('LEC001','Smith',1234567890,'smith@example.com','Male','pass123'),
        ('LEC002','Johnson',9876543210,'johnson@example.com','Female','abc@123'),
        ('LEC003','Brown',5555555555,'brown@example.com','Male','securePwd'),
        ('LEC004','Garcia',3333333333,'garcia@example.com','Female','p@ssw0rd');

-- Student table
INSERT INTO Student (studentId, sName, phoneNumber, email, adress, img, gender, pwd) VALUES
('TG1001', 'John Doe', 1234567890, 'john@example.com', '123 Main St, City, Country', 'john_doe.jpg', 'Male', 'password1'),
('TG1002', 'Jane Smith', 9876543210, 'jane@example.com', '456 Elm St, City, Country', 'jane_smith.jpg', 'Female', 'password2'),
('TG1003', 'David Johnson', 5554443333, 'david@example.com', '789 Oak St, City, Country', 'david_johnson.jpg', 'Male', 'password3'),
('TG1004', 'Emily Davis', 2223334444, 'emily@example.com', '101 Pine St, City, Country', 'emily_davis.jpg', 'Female', 'password4'),
('TG1005', 'Michael Brown', 7778889999, 'michael@example.com', '202 Cedar St, City, Country', 'michael_brown.jpg', 'Male', 'password5'),
('TG1006', 'Jennifer Wilson', 3332221111, 'jennifer@example.com', '303 Maple St, City, Country', 'jennifer_wilson.jpg', 'Female', 'password6'),
('TG1007', 'Daniel Martinez', 9998887777, 'daniel@example.com', '404 Birch St, City, Country', 'daniel_martinez.jpg', 'Male', 'password7'),
('TG1008', 'Jessica Taylor', 6667778888, 'jessica@example.com', '505 Walnut St, City, Country', 'jessica_taylor.jpg', 'Female', 'password8'),
('TG1009', 'Christopher Anderson', 4445556666, 'christopher@example.com', '606 Spruce St, City, Country', 'christopher_anderson.jpg', 'Male', 'password9'),
('TG1010', 'Amanda Thomas', 1112223333, 'amanda@example.com', '707 Birch St, City, Country', 'amanda_thomas.jpg', 'Female', 'password10');

-- TechnicalOfficer table
INSERT INTO TechnicalOfficer (tecId, tName, phoneNumber, email, gender, pwd) VALUES
('TO001', 'John Smith', 1234567890, 'john@example.com', 'Male', 'password1'),
('TO002', 'Pushpa Doe', 9876543210, 'jane@example.com', 'Female', 'password2');


-- Cource table
INSERT INTO Course (courceCode, cName, credit, weeek, theory, Theory, lecturerId) VALUES
('ICT01', 'Data Structures and Algorithms', 3, 15, 1, 0, 'LEC001'),
('ICT04', 'Object Oriented Programming', 2, 15, 1, 0, 'LEC002'),
('ICT03', 'Object Oriented Programming Practicum', 2, 15, 0, 1, 'LEC002'),
('ICT04', 'Object Oriented Analysis and Design', 3, 15, 1, 0, 'LEC003'),
('ICT05', 'E-Commerce Implementation, Management and Security', 3, 15, 1, 0, 'LEC004'),
('TCS2112', 'Business Economics', 3, 15, 9, 3, 'LEC004');

INSERT INTO StudentMarks (q1, q2, q3, midP, midT, endP, endT, assesment, studentId, courceCode) VALUES

-- Data Structures and Algorithms
(80, 45, 56, 0, 56, 0, 78, 45, 'TG1001', 'ICT01'),
(46, 12, 100, 0, 63, 0, 55, 66, 'TG1002', 'ICT01'),
(34, 67, 33, 0, 12, 0, 65, 88, 'TG1003', 'ICT01'),
(67, 56, 12, 0, 34, 0, 48, 55, 'TG1004', 'ICT01'),
(67, 100, 12, 0, 12, 0, 45, 43, 'TG1005', 'ICT01'),
(90, 78, 65, 0, 88, 0, 78, 34, 'TG1006', 'ICT01'),
(45, 15, 45, 0, 34, 0, 35, 64, 'TG1007', 'ICT01'),
(12, 45, 12, 0, 55, 0, 90, 34, 'TG1008', 'ICT01'),
(03, 78, 04, 0, 10, 0, 10, 67, 'TG1009', 'ICT01'),
(50, 36, 10, 0, 75, 0, 12, 49, 'TG1010', 'ICT01'),

-- Object Oriented Programming
(90, 92, 88, 0, 67, 0, 85, 90, 'TG1001', 'ICT04'),
(85, 88, 82, 0, 67, 0, 82, 88, 'TG1002', 'ICT04'),
(88, 90, 85, 0, 67, 0, 80, 86, 'TG1003', 'ICT04'),
(65, 70, 55, 0, 67, 0, 65, 78, 'TG1004', 'ICT04'),
(60, 65, 55, 0, 67, 0, 74, 45, 'TG1005', 'ICT04'),
(65, 60, 55, 0, 67, 0, 71, 44, 'TG1006', 'ICT04'),
(60, 62, 58, 0, 67, 0, 55, 55, 'TG1007', 'ICT04'),
(35, 30, 25, 0, 67, 0, 43, 45, 'TG1008', 'ICT04'),
(32, 28, 30, 0, 67, 0, 28, 23, 'TG1009', 'ICT04'),
(30, 35, 25, 0, 67, 0, 51, 15, 'TG1010', 'ICT04');

-- Object Oriented Programming Practicum
(90, 95, 80, 70, 0, 85, 0, 88, 'TG1001', 'ICT04'),
(85, 88, 75, 67, 0, 65, 0, 85, 'TG1002', 'ICT04'),
(88, 92, 78, 75, 0, 61, 0, 90, 'TG1003', 'ICT04'),
(70, 75, 60, 60, 0, 55, 0, 80, 'TG1004', 'ICT04'),
(65, 70, 58, 50, 0, 66, 0, 78, 'TG1005', 'ICT04'),
(68, 72, 56, 44, 0, 43, 0, 75, 'TG1006', 'ICT04'),
(62, 67, 54, 56, 0, 54, 0, 73, 'TG1007', 'ICT04'),
(45, 50, 35, 41, 0, 33, 0, 20, 'TG1008', 'ICT04'),
(40, 45, 30, 34, 0, 22, 0, 68, 'TG1009', 'ICT04'),
(38, 42, 28, 24, 0, 45, 0, 65, 'TG1010', 'ICT04');

-- Object Oriented Analysis and Design
(90, 95, 80, 0, 67, 0, 82, 88, 'TG1001', 'ICT04'),
(85, 88, 75, 0, 67, 0, 80, 85, 'TG1002', 'ICT04'),
(88, 92, 78, 0, 67, 0, 85, 90, 'TG1003', 'ICT04'),
(70, 75, 60, 0, 60, 0, 78, 80, 'TG1004', 'ICT04'),
(65, 70, 58, 0, 63, 0, 76, 78, 'TG1005', 'ICT04'),
(68, 72, 56, 0, 58, 0, 74, 75, 'TG1006', 'ICT04'),
(62, 67, 54, 0, 65, 0, 72, 73, 'TG1007', 'ICT04'),
(45, 50, 35, 0, 28, 0, 65, 70, 'TG1008', 'ICT04'),
(40, 45, 30, 0, 25, 0, 62, 68, 'TG1009', 'ICT04'),
(38, 42, 28, 0, 30, 0, 60, 65, 'TG1010', 'ICT04');

-- E-Commerce Implementation, Management and Security
(90, 95, 80, 0, 87, 0, 82, 88, 'TG1001', 'ICT05'),
(85, 88, 75, 0, 62, 0, 80, 85, 'TG1002', 'ICT05'),
(88, 92, 78, 0, 57, 0, 85, 90, 'TG1003', 'ICT05'),
(70, 75, 60, 0, 65, 0, 78, 80, 'TG1004', 'ICT05'),
(65, 70, 58, 0, 68, 0, 76, 78, 'TG1005', 'ICT05'),
(68, 72, 56, 0, 70, 0, 74, 75, 'TG1006', 'ICT05'),
(62, 67, 54, 0, 63, 0, 72, 73, 'TG1007', 'ICT05'),
(45, 50, 35, 0, 30, 0, 65, 70, 'TG1008', 'ICT05'),
(40, 45, 30, 0, 28, 0, 62, 68, 'TG1009', 'ICT05'),
(38, 42, 28, 0, 32, 0, 60, 65, 'TG1010', 'ICT05');

-- Business Economics
(90, 92, 88, 0, 67, 0, 85, 92, 'TG1001', 'TCS2112'),
(85, 88, 82, 0, 77, 0, 83, 88, 'TG1002', 'TCS2112'),
(88, 90, 85, 0, 42, 0, 87, 86, 'TG1003', 'TCS2112'),
(65, 70, 55, 0, 44, 0, 73, 70, 'TG1004', 'TCS2112'),
(60, 65, 55, 0, 56, 0, 67, 65, 'TG1005', 'TCS2112'),
(65, 60, 55, 0, 45, 0, 69, 68, 'TG1006', 'TCS2112'),
(60, 62, 58, 0, 15, 0, 68, 62, 'TG1007', 'TCS2112'),
(35, 30, 25, 0, 20, 0, 32, 28, 'TG1008', 'TCS2112'),
(32, 28, 30, 0, 70, 0, 30, 26, 'TG1009', 'TCS2112'),
(30, 35, 25, 0, 43, 0, 28, 32, 'TG1010', 'TCS2112');



INSERT INTO Attendance (studentId, courseCode, date, type, status)
VALUES 

    
    -- Monday /////////////////////////////////////////////////////////////////// Start

    ("TG1001","ICT01","2024-01-01","Theory","Present"),
    ("TG1001","ICT01","2024-01-08","Theory","Present"),
    ("TG1001","ICT01","2024-01-15","Theory","Present"),
    ("TG1001","ICT01","2024-01-22","Theory","Absent"),
    ("TG1001","ICT01","2024-01-29","Theory","Present"),

    ("TG1001","ICT01","2024-02-05","Theory","Present"),
    ("TG1001","ICT01","2024-02-12","Theory","Absent"),
    ("TG1001","ICT01","2024-02-19","Theory","Present"),
    ("TG1001","ICT01","2024-03-26","Theory","Present"),
    ("TG1001","ICT01","2024-03-04","Theory","Present"),

    ("TG1001","ICT01","2024-03-11","Theory","Present"),
    ("TG1001","ICT01","2024-03-18","Theory","Present"),
    ("TG1001","ICT01","2024-03-25","Theory","Absent"),
    ("TG1001","ICT01","2024-04-01","Theory","Present"),
    ("TG1001","ICT01","2024-04-08","Theory","Present"),

 
    ("TG1002","ICT01","2024-01-01","Theory","Present"),
    ("TG1002","ICT01","2024-01-08","Theory","Absent"),
    ("TG1002","ICT01","2024-01-15","Theory","Present"),
    ("TG1002","ICT01","2024-01-22","Theory","Present"),
    ("TG1002","ICT01","2024-01-29","Theory","Present"),

    ("TG1002","ICT01","2024-02-05","Theory","Present"),
    ("TG1002","ICT01","2024-02-12","Theory","Present"),
    ("TG1002","ICT01","2024-02-19","Theory","Present"),
    ("TG1002","ICT01","2024-03-26","Theory","Present"),
    ("TG1002","ICT01","2024-03-04","Theory","Absent"),

    ("TG1002","ICT01","2024-03-11","Theory","Present"),
    ("TG1002","ICT01","2024-03-18","Theory","Present"),
    ("TG1002","ICT01","2024-03-25","Theory","Present"),
    ("TG1002","ICT01","2024-04-01","Theory","Present"),
    ("TG1002","ICT01","2024-04-08","Theory","Present"),

   
    ("TG1003","ICT01","2024-01-01","Theory","Absent"),
    ("TG1003","ICT01","2024-01-08","Theory","Absent"),
    ("TG1003","ICT01","2024-01-15","Theory","Absent"),
    ("TG1003","ICT01","2024-01-22","Theory","Present"),
    ("TG1003","ICT01","2024-01-29","Theory","Present"),

    ("TG1003","ICT01","2024-02-05","Theory","Present"),
    ("TG1003","ICT01","2024-02-12","Theory","Present"),
    ("TG1003","ICT01","2024-02-19","Theory","Present"),
    ("TG1003","ICT01","2024-03-26","Theory","Present"),
    ("TG1003","ICT01","2024-03-04","Theory","Present"),

    ("TG1003","ICT01","2024-03-11","Theory","Present"),
    ("TG1003","ICT01","2024-03-18","Theory","Present"),
    ("TG1003","ICT01","2024-03-25","Theory","Absent"),
    ("TG1003","ICT01","2024-04-01","Theory","Present"),
    ("TG1003","ICT01","2024-04-08","Theory","Present"),

 
    ("TG1004","ICT01","2024-01-01","Theory","Present"),
    ("TG1004","ICT01","2024-01-08","Theory","Present"),
    ("TG1004","ICT01","2024-01-15","Theory","Present"),
    ("TG1004","ICT01","2024-01-22","Theory","Absent"),
    ("TG1004","ICT01","2024-01-29","Theory","Present"),

    ("TG1004","ICT01","2024-02-05","Theory","Present"),
    ("TG1004","ICT01","2024-02-12","Theory","Present"),
    ("TG1004","ICT01","2024-02-19","Theory","Absent"),
    ("TG1004","ICT01","2024-03-26","Theory","Present"),
    ("TG1004","ICT01","2024-03-04","Theory","Present"),

    ("TG1004","ICT01","2024-03-11","Theory","Present"),
    ("TG1004","ICT01","2024-03-18","Theory","Present"),
    ("TG1004","ICT01","2024-03-25","Theory","Absent"),
    ("TG1004","ICT01","2024-04-01","Theory","Present"),
    ("TG1004","ICT01","2024-04-08","Theory","Present"),

 
    ("TG1005","ICT01","2024-01-01","Theory","Present"),
    ("TG1005","ICT01","2024-01-08","Theory","Present"),
    ("TG1005","ICT01","2024-01-15","Theory","Present"),
    ("TG1005","ICT01","2024-01-22","Theory","Present"),
    ("TG1005","ICT01","2024-01-29","Theory","Present"),

    ("TG1005","ICT01","2024-02-05","Theory","Absent"),
    ("TG1005","ICT01","2024-02-12","Theory","Present"),
    ("TG1005","ICT01","2024-02-19","Theory","Present"),
    ("TG1005","ICT01","2024-03-26","Theory","Present"),
    ("TG1005","ICT01","2024-03-04","Theory","Present"),

    ("TG1005","ICT01","2024-03-11","Theory","Present"),
    ("TG1005","ICT01","2024-03-18","Theory","Present"),
    ("TG1005","ICT01","2024-03-25","Theory","Present"),
    ("TG1005","ICT01","2024-04-01","Theory","Present"),
    ("TG1005","ICT01","2024-04-08","Theory","Present"),

    
   
    ("TG1006","ICT01","2024-01-01","Theory","Present"),
    ("TG1006","ICT01","2024-01-08","Theory","Present"),
    ("TG1006","ICT01","2024-01-15","Theory","Present"),
    ("TG1006","ICT01","2024-01-22","Theory","Present"),
    ("TG1006","ICT01","2024-01-29","Theory","Present"),

    ("TG1006","ICT01","2024-02-05","Theory","Present"),
    ("TG1006","ICT01","2024-02-12","Theory","Present"),
    ("TG1006","ICT01","2024-02-19","Theory","Present"),
    ("TG1006","ICT01","2024-03-26","Theory","Present"),
    ("TG1006","ICT01","2024-03-04","Theory","Present"),

    ("TG1006","ICT01","2024-03-11","Theory","Present"),
    ("TG1006","ICT01","2024-03-18","Theory","Present"),
    ("TG1006","ICT01","2024-03-25","Theory","Absent"),
    ("TG1006","ICT01","2024-04-01","Theory","Present"),
    ("TG1006","ICT01","2024-04-08","Theory","Present"),

 
    ("TG1007","ICT01","2024-01-01","Theory","Present"),
    ("TG1007","ICT01","2024-01-08","Theory","Present"),
    ("TG1007","ICT01","2024-01-15","Theory","Present"),
    ("TG1007","ICT01","2024-01-22","Theory","Present"),
    ("TG1007","ICT01","2024-01-29","Theory","Present"),

    ("TG1007","ICT01","2024-02-05","Theory","Present"),
    ("TG1007","ICT01","2024-02-12","Theory","Present"),
    ("TG1007","ICT01","2024-02-19","Theory","Present"),
    ("TG1007","ICT01","2024-03-26","Theory","Present"),
    ("TG1007","ICT01","2024-03-04","Theory","Present"),

    ("TG1007","ICT01","2024-03-11","Theory","Present"),
    ("TG1007","ICT01","2024-03-18","Theory","Present"),
    ("TG1007","ICT01","2024-03-25","Theory","Absent"),
    ("TG1007","ICT01","2024-04-01","Theory","Present"),
    ("TG1007","ICT01","2024-04-08","Theory","Present"),


    ("TG1008","ICT01","2024-01-01","Theory","Present"),
    ("TG1008","ICT01","2024-01-08","Theory","Present"),
    ("TG1008","ICT01","2024-01-15","Theory","Present"),
    ("TG1008","ICT01","2024-01-22","Theory","Present"),
    ("TG1008","ICT01","2024-01-29","Theory","Present"),

    ("TG1008","ICT01","2024-02-05","Theory","Present"),
    ("TG1008","ICT01","2024-02-12","Theory","Present"),
    ("TG1008","ICT01","2024-02-19","Theory","Absent"),
    ("TG1008","ICT01","2024-03-26","Theory","Present"),
    ("TG1008","ICT01","2024-03-04","Theory","Present"),

    ("TG1008","ICT01","2024-03-11","Theory","Present"),
    ("TG1008","ICT01","2024-03-18","Theory","Present"),
    ("TG1008","ICT01","2024-03-25","Theory","Present"),
    ("TG1008","ICT01","2024-04-01","Theory","Present"),
    ("TG1008","ICT01","2024-04-08","Theory","Present"),

  
    ("TG1009","ICT01","2024-01-01","Theory","Present"),
    ("TG1009","ICT01","2024-01-08","Theory","Present"),
    ("TG1009","ICT01","2024-01-15","Theory","Present"),
    ("TG1009","ICT01","2024-01-22","Theory","Present"),
    ("TG1009","ICT01","2024-01-29","Theory","Present"),

    ("TG1009","ICT01","2024-02-05","Theory","Present"),
    ("TG1009","ICT01","2024-02-12","Theory","Present"),
    ("TG1009","ICT01","2024-02-19","Theory","Present"),
    ("TG1009","ICT01","2024-03-26","Theory","Present"),
    ("TG1009","ICT01","2024-03-04","Theory","Present"),

    ("TG1009","ICT01","2024-03-11","Theory","Present"),
    ("TG1009","ICT01","2024-03-18","Theory","Present"),
    ("TG1009","ICT01","2024-03-25","Theory","Absent"),
    ("TG1009","ICT01","2024-04-01","Theory","Present"),
    ("TG1009","ICT01","2024-04-08","Theory","Present"),

    ("TG1010","ICT01","2024-01-01","Theory","Present"),
    ("TG1010","ICT01","2024-01-08","Theory","Present"),
    ("TG1010","ICT01","2024-01-15","Theory","Present"),
    ("TG1010","ICT01","2024-01-22","Theory","Present"),
    ("TG1010","ICT01","2024-01-29","Theory","Present"),

    ("TG1010","ICT01","2024-02-05","Theory","Present"),
    ("TG1010","ICT01","2024-02-12","Theory","Present"),
    ("TG1010","ICT01","2024-02-19","Theory","Absent"),
    ("TG1010","ICT01","2024-03-26","Theory","Present"),
    ("TG1010","ICT01","2024-03-04","Theory","Present"),

    ("TG1010","ICT01","2024-03-11","Theory","Present"),
    ("TG1010","ICT01","2024-03-18","Theory","Present"),
    ("TG1010","ICT01","2024-03-25","Theory","Present"),
    ("TG1010","ICT01","2024-04-01","Theory","Present"),
    ("TG1010","ICT01","2024-04-08","Theory","Present");

    -- Monday /////////////////////////////////////////////////////////////////// End


    -- Tuesday /////////////////////////////////////////////////////////////////// Start

    ("TG1001","ICT04","2024-01-02","Practical","Present"),
    ("TG1001","ICT04","2024-01-09","Practical","Present"),
    ("TG1001","ICT04","2024-01-16","Practical","Present"),
    ("TG1001","ICT04","2024-01-23","Practical","Absent"),
    ("TG1001","ICT04","2024-01-30","Practical","Present"),

    ("TG1001","ICT04","2024-02-06","Practical","Present"),
    ("TG1001","ICT04","2024-02-13","Practical","Present"),
    ("TG1001","ICT04","2024-02-20","Practical","Present"),
    ("TG1001","ICT04","2024-03-27","Practical","Present"),
    ("TG1001","ICT04","2024-03-05","Practical","Absent"),

    ("TG1001","ICT04","2024-03-12","Practical","Present"),
    ("TG1001","ICT04","2024-03-19","Practical","Present"),
    ("TG1001","ICT04","2024-03-26","Practical","Present"),
    ("TG1001","ICT04","2024-04-02","Practical","Present"),
    ("TG1001","ICT04","2024-04-09","Practical","Present"),

 
    ("TG1002","ICT04","2024-01-02","Practical","Present"),
    ("TG1002","ICT04","2024-01-09","Practical","Present"),
    ("TG1002","ICT04","2024-01-16","Practical","Present"),
    ("TG1002","ICT04","2024-01-23","Practical","Present"),
    ("TG1002","ICT04","2024-01-30","Practical","Present"),

    ("TG1002","ICT04","2024-02-06","Practical","Present"),
    ("TG1002","ICT04","2024-02-13","Practical","Absent"),
    ("TG1002","ICT04","2024-02-20","Practical","Present"),
    ("TG1002","ICT04","2024-03-26","Practical","Present"),
    ("TG1002","ICT04","2024-03-04","Practical","Present"),

    ("TG1002","ICT04","2024-03-11","Practical","Present"),
    ("TG1002","ICT04","2024-03-18","Practical","Present"),
    ("TG1002","ICT04","2024-03-26","Practical","Present"),
    ("TG1002","ICT04","2024-04-02","Practical","Present"),
    ("TG1002","ICT04","2024-04-09","Practical","Present"),

   
    ("TG1003","ICT04","2024-01-02","Practical","Present"),
    ("TG1003","ICT04","2024-01-09","Practical","Absent"),
    ("TG1003","ICT04","2024-01-16","Practical","Present"),
    ("TG1003","ICT04","2024-01-23","Practical","Present"),
    ("TG1003","ICT04","2024-01-30","Practical","Present"),

    ("TG1003","ICT04","2024-02-06","Practical","Present"),
    ("TG1003","ICT04","2024-02-13","Practical","Present"),
    ("TG1003","ICT04","2024-02-20","Practical","Present"),
    ("TG1003","ICT04","2024-03-26","Practical","Present"),
    ("TG1003","ICT04","2024-03-04","Practical","Present"),

    ("TG1003","ICT04","2024-03-11","Practical","Present"),
    ("TG1003","ICT04","2024-03-18","Practical","Present"),
    ("TG1003","ICT04","2024-03-26","Practical","Present"),
    ("TG1003","ICT04","2024-04-02","Practical","Present"),
    ("TG1003","ICT04","2024-04-09","Practical","Present"),

 
    ("TG1004","ICT04","2024-01-02","Practical","Present"),
    ("TG1004","ICT04","2024-01-09","Practical","Present"),
    ("TG1004","ICT04","2024-01-16","Practical","Present"),
    ("TG1004","ICT04","2024-01-23","Practical","Present"),
    ("TG1004","ICT04","2024-01-30","Practical","Present"),

    ("TG1004","ICT04","2024-02-06","Practical","Present"),
    ("TG1004","ICT04","2024-02-13","Practical","Present"),
    ("TG1004","ICT04","2024-02-20","Practical","Present"),
    ("TG1004","ICT04","2024-03-26","Practical","Present"),
    ("TG1004","ICT04","2024-03-04","Practical","Absent"),

    ("TG1004","ICT04","2024-03-11","Practical","Present"),
    ("TG1004","ICT04","2024-03-18","Practical","Present"),
    ("TG1004","ICT04","2024-03-26","Practical","Present"),
    ("TG1004","ICT04","2024-04-02","Practical","Present"),
    ("TG1004","ICT04","2024-04-09","Practical","Present"),

 
    ("TG1005","ICT04","2024-01-02","Practical","Present"),
    ("TG1005","ICT04","2024-01-09","Practical","Absent"),
    ("TG1005","ICT04","2024-01-16","Practical","Present"),
    ("TG1005","ICT04","2024-01-23","Practical","Present"),
    ("TG1005","ICT04","2024-01-30","Practical","Present"),

    ("TG1005","ICT04","2024-02-06","Practical","Present"),
    ("TG1005","ICT04","2024-02-13","Practical","Present"),
    ("TG1005","ICT04","2024-02-20","Practical","Present"),
    ("TG1005","ICT04","2024-03-26","Practical","Present"),
    ("TG1005","ICT04","2024-03-04","Practical","Present"),

    ("TG1005","ICT04","2024-03-11","Practical","Present"),
    ("TG1005","ICT04","2024-03-18","Practical","Absent"),
    ("TG1005","ICT04","2024-03-26","Practical","Present"),
    ("TG1005","ICT04","2024-04-02","Practical","Present"),
    ("TG1005","ICT04","2024-04-09","Practical","Present"),

    
   
    ("TG1006","ICT04","2024-01-02","Practical","Absent"),
    ("TG1006","ICT04","2024-01-09","Practical","Present"),
    ("TG1006","ICT04","2024-01-16","Practical","Present"),
    ("TG1006","ICT04","2024-01-23","Practical","Present"),
    ("TG1006","ICT04","2024-01-30","Practical","Present"),

    ("TG1006","ICT04","2024-02-06","Practical","Present"),
    ("TG1006","ICT04","2024-02-13","Practical","Present"),
    ("TG1006","ICT04","2024-02-20","Practical","Present"),
    ("TG1006","ICT04","2024-03-26","Practical","Present"),
    ("TG1006","ICT04","2024-03-04","Practical","Present"),

    ("TG1006","ICT04","2024-03-11","Practical","Present"),
    ("TG1006","ICT04","2024-03-18","Practical","Present"),
    ("TG1006","ICT04","2024-03-26","Practical","Present"),
    ("TG1006","ICT04","2024-04-02","Practical","Present"),
    ("TG1006","ICT04","2024-04-09","Practical","Present"),

 
    ("TG1007","ICT04","2024-01-02","Practical","Present"),
    ("TG1007","ICT04","2024-01-09","Practical","Present"),
    ("TG1007","ICT04","2024-01-16","Practical","Present"),
    ("TG1007","ICT04","2024-01-23","Practical","Present"),
    ("TG1007","ICT04","2024-01-30","Practical","Present"),

    ("TG1007","ICT04","2024-02-06","Practical","Present"),
    ("TG1007","ICT04","2024-02-13","Practical","Present"),
    ("TG1007","ICT04","2024-02-20","Practical","Present"),
    ("TG1007","ICT04","2024-03-26","Practical","Present"),
    ("TG1007","ICT04","2024-03-04","Practical","Present"),

    ("TG1007","ICT04","2024-03-11","Practical","Present"),
    ("TG1007","ICT04","2024-03-18","Practical","Present"),
    ("TG1007","ICT04","2024-03-26","Practical","Present"),
    ("TG1007","ICT04","2024-04-02","Practical","Present"),
    ("TG1007","ICT04","2024-04-09","Practical","Present"),


    ("TG1008","ICT04","2024-01-02","Practical","Present"),
    ("TG1008","ICT04","2024-01-09","Practical","Present"),
    ("TG1008","ICT04","2024-01-16","Practical","Present"),
    ("TG1008","ICT04","2024-01-23","Practical","Present"),
    ("TG1008","ICT04","2024-01-30","Practical","Present"),

    ("TG1008","ICT04","2024-02-06","Practical","Present"),
    ("TG1008","ICT04","2024-02-13","Practical","Present"),
    ("TG1008","ICT04","2024-02-20","Practical","Present"),
    ("TG1008","ICT04","2024-03-26","Practical","Present"),
    ("TG1008","ICT04","2024-03-04","Practical","Absent"),

    ("TG1008","ICT04","2024-03-11","Practical","Present"),
    ("TG1008","ICT04","2024-03-18","Practical","Present"),
    ("TG1008","ICT04","2024-03-26","Practical","Present"),
    ("TG1008","ICT04","2024-04-02","Practical","Present"),
    ("TG1008","ICT04","2024-04-09","Practical","Present"),

  
    ("TG1009","ICT04","2024-01-02","Practical","Present"),
    ("TG1009","ICT04","2024-01-09","Practical","Present"),
    ("TG1009","ICT04","2024-01-16","Practical","Present"),
    ("TG1009","ICT04","2024-01-23","Practical","Present"),
    ("TG1009","ICT04","2024-01-30","Practical","Present"),

    ("TG1009","ICT04","2024-02-06","Practical","Present"),
    ("TG1009","ICT04","2024-02-13","Practical","Present"),
    ("TG1009","ICT04","2024-02-20","Practical","Absent"),
    ("TG1009","ICT04","2024-03-26","Practical","Present"),
    ("TG1009","ICT04","2024-03-04","Practical","Present"),

    ("TG1009","ICT04","2024-03-11","Practical","Present"),
    ("TG1009","ICT04","2024-03-18","Practical","Present"),
    ("TG1009","ICT04","2024-03-26","Practical","Present"),
    ("TG1009","ICT04","2024-04-02","Practical","Present"),
    ("TG1009","ICT04","2024-04-09","Practical","Present"),

    ("TG1010","ICT04","2024-01-02","Practical","Absent"),
    ("TG1010","ICT04","2024-01-09","Practical","Absent"),
    ("TG1010","ICT04","2024-01-16","Practical","Absent"),
    ("TG1010","ICT04","2024-01-23","Practical","Absent"),
    ("TG1010","ICT04","2024-01-30","Practical","Present"),

    ("TG1010","ICT04","2024-02-06","Practical","Absent"),
    ("TG1010","ICT04","2024-02-13","Practical","Present"),
    ("TG1010","ICT04","2024-02-20","Practical","Absent"),
    ("TG1010","ICT04","2024-03-26","Practical","Present"),
    ("TG1010","ICT04","2024-03-04","Practical","Present"),

    ("TG1010","ICT04","2024-03-11","Practical","Absent"),
    ("TG1010","ICT04","2024-03-18","Practical","Present"),
    ("TG1010","ICT04","2024-03-26","Practical","Present"),
    ("TG1010","ICT04","2024-04-02","Practical","Present"),
    ("TG1010","ICT04","2024-04-09","Practical","Present"),



    -- Tuesday /////////////////////////////////////////////////////////////////// End

    --wensday
    ("TG1001","ICT05","2024-01-03","Theory","Present"),
    ("TG1001","ICT05","2024-01-10","Theory","Absent"),
    ("TG1001","ICT05","2024-01-17","Theory","Present"),
    ("TG1001","ICT05","2024-01-24","Theory","Present"),
    ("TG1001","ICT05","2024-01-31","Theory","Present"),

    ("TG1001","ICT05","2024-02-07","Theory","Present"),
    ("TG1001","ICT05","2024-02-14","Theory","Present"),
    ("TG1001","ICT05","2024-02-21","Theory","Present"),
    ("TG1001","ICT05","2024-03-28","Theory","Present"),
    ("TG1001","ICT05","2024-03-06","Theory","Absent"),

    ("TG1001","ICT05","2024-03-13","Theory","Present"),
    ("TG1001","ICT05","2024-03-20","Theory","Present"),
    ("TG1001","ICT05","2024-03-27","Theory","Present"),
    ("TG1001","ICT05","2024-04-03","Theory","Present"),
    ("TG1001","ICT05","2024-04-10","Theory","Present"),

 
    ("TG1002","ICT05","2024-01-03","Theory","Present"),
    ("TG1002","ICT05","2024-01-10","Theory","Present"),
    ("TG1002","ICT05","2024-01-17","Theory","Present"),
    ("TG1002","ICT05","2024-01-24","Theory","Present"),
    ("TG1002","ICT05","2024-01-31","Theory","Present"),

    ("TG1002","ICT05","2024-02-07","Theory","Present"),
    ("TG1002","ICT05","2024-02-14","Theory","Absent"),
    ("TG1002","ICT05","2024-02-21","Theory","Present"),
    ("TG1002","ICT05","2024-03-27","Theory","Present"),
    ("TG1002","ICT05","2024-03-05","Theory","Absent"),

    ("TG1002","ICT05","2024-03-12","Theory","Present"),
    ("TG1002","ICT05","2024-03-19","Theory","Absent"),
    ("TG1002","ICT05","2024-03-27","Theory","Present"),
    ("TG1002","ICT05","2024-04-03","Theory","Present"),
    ("TG1002","ICT05","2024-04-10","Theory","Present"),

   
    ("TG1003","ICT05","2024-01-03","Theory","Present"),
    ("TG1003","ICT05","2024-01-10","Theory","Absent"),
    ("TG1003","ICT05","2024-01-17","Theory","Present"),
    ("TG1003","ICT05","2024-01-24","Theory","Present"),
    ("TG1003","ICT05","2024-01-31","Theory","Present"),

    ("TG1003","ICT05","2024-02-07","Theory","Present"),
    ("TG1003","ICT05","2024-02-14","Theory","Present"),
    ("TG1003","ICT05","2024-02-21","Theory","Absent"),
    ("TG1003","ICT05","2024-03-27","Theory","Present"),
    ("TG1003","ICT05","2024-03-05","Theory","Present"),

    ("TG1003","ICT05","2024-03-12","Theory","Absent"),
    ("TG1003","ICT05","2024-03-19","Theory","Present"),
    ("TG1003","ICT05","2024-03-27","Theory","Present"),
    ("TG1003","ICT05","2024-04-03","Theory","Absent"),
    ("TG1003","ICT05","2024-04-10","Theory","Present"),

 
    ("TG1004","ICT05","2024-01-03","Theory","Absent"),
    ("TG1004","ICT05","2024-01-10","Theory","Absent"),
    ("TG1004","ICT05","2024-01-17","Theory","Absent"),
    ("TG1004","ICT05","2024-01-24","Theory","Present"),
    ("TG1004","ICT05","2024-01-31","Theory","Present"),

    ("TG1004","ICT05","2024-02-07","Theory","Present"),
    ("TG1004","ICT05","2024-02-14","Theory","Present"),
    ("TG1004","ICT05","2024-02-21","Theory","Present"),
    ("TG1004","ICT05","2024-03-27","Theory","Absent"),
    ("TG1004","ICT05","2024-03-05","Theory","Present"),

    ("TG1004","ICT05","2024-03-12","Theory","Present"),
    ("TG1004","ICT05","2024-03-19","Theory","Absent"),
    ("TG1004","ICT05","2024-03-27","Theory","Present"),
    ("TG1004","ICT05","2024-04-03","Theory","Present"),
    ("TG1004","ICT05","2024-04-10","Theory","Present"),

 
    ("TG1005","ICT05","2024-01-03","Theory","Present"),
    ("TG1005","ICT05","2024-01-10","Theory","Absent"),
    ("TG1005","ICT05","2024-01-17","Theory","Absent"),
    ("TG1005","ICT05","2024-01-24","Theory","Absent"),
    ("TG1005","ICT05","2024-01-31","Theory","Absent"),

    ("TG1005","ICT05","2024-02-07","Theory","Present"),
    ("TG1005","ICT05","2024-02-14","Theory","Present"),
    ("TG1005","ICT05","2024-02-21","Theory","Present"),
    ("TG1005","ICT05","2024-03-27","Theory","Present"),
    ("TG1005","ICT05","2024-03-05","Theory","Present"),

    ("TG1005","ICT05","2024-03-12","Theory","Present"),
    ("TG1005","ICT05","2024-03-19","Theory","Present"),
    ("TG1005","ICT05","2024-03-27","Theory","Absent"),
    ("TG1005","ICT05","2024-04-03","Theory","Present"),
    ("TG1005","ICT05","2024-04-10","Theory","Present"),

    
   
    ("TG1006","ICT05","2024-01-03","Theory","Present"),
    ("TG1006","ICT05","2024-01-10","Theory","Present"),
    ("TG1006","ICT05","2024-01-17","Theory","Absent"),
    ("TG1006","ICT05","2024-01-24","Theory","Present"),
    ("TG1006","ICT05","2024-01-31","Theory","Present"),

    ("TG1006","ICT05","2024-02-07","Theory","Present"),
    ("TG1006","ICT05","2024-02-14","Theory","Present"),
    ("TG1006","ICT05","2024-02-21","Theory","Absent"),
    ("TG1006","ICT05","2024-03-27","Theory","Present"),
    ("TG1006","ICT05","2024-03-05","Theory","Present"),

    ("TG1006","ICT05","2024-03-12","Theory","Present"),
    ("TG1006","ICT05","2024-03-19","Theory","Present"),
    ("TG1006","ICT05","2024-03-27","Theory","Absent"),
    ("TG1006","ICT05","2024-04-03","Theory","Present"),
    ("TG1006","ICT05","2024-04-10","Theory","Present"),

 
    ("TG1007","ICT05","2024-01-03","Theory","Absent"),
    ("TG1007","ICT05","2024-01-10","Theory","Absent"),
    ("TG1007","ICT05","2024-01-17","Theory","Absent"),
    ("TG1007","ICT05","2024-01-24","Theory","Present"),
    ("TG1007","ICT05","2024-01-31","Theory","Absent"),

    ("TG1007","ICT05","2024-02-07","Theory","Present"),
    ("TG1007","ICT05","2024-02-14","Theory","Present"),
    ("TG1007","ICT05","2024-02-21","Theory","Present"),
    ("TG1007","ICT05","2024-03-27","Theory","Absent"),
    ("TG1007","ICT05","2024-03-05","Theory","Absent"),

    ("TG1007","ICT05","2024-03-12","Theory","Absent"),
    ("TG1007","ICT05","2024-03-19","Theory","Present"),
    ("TG1007","ICT05","2024-03-27","Theory","Absent"),
    ("TG1007","ICT05","2024-04-03","Theory","Present"),
    ("TG1007","ICT05","2024-04-10","Theory","Absent"),


    ("TG1008","ICT05","2024-01-03","Theory","Present"),
    ("TG1008","ICT05","2024-01-10","Theory","Present"),
    ("TG1008","ICT05","2024-01-17","Theory","Absent"),
    ("TG1008","ICT05","2024-01-24","Theory","Present"),
    ("TG1008","ICT05","2024-01-31","Theory","Present"),

    ("TG1008","ICT05","2024-02-07","Theory","Present"),
    ("TG1008","ICT05","2024-02-14","Theory","Present"),
    ("TG1008","ICT05","2024-02-21","Theory","Absent"),
    ("TG1008","ICT05","2024-03-27","Theory","Present"),
    ("TG1008","ICT05","2024-03-05","Theory","Present"),

    ("TG1008","ICT05","2024-03-12","Theory","Present"),
    ("TG1008","ICT05","2024-03-19","Theory","Present"),
    ("TG1008","ICT05","2024-03-27","Theory","Absent"),
    ("TG1008","ICT05","2024-04-03","Theory","Present"),
    ("TG1008","ICT05","2024-04-10","Theory","Present"),

  
    ("TG1009","ICT05","2024-01-03","Theory","Absent"),
    ("TG1009","ICT05","2024-01-10","Theory","Present"),
    ("TG1009","ICT05","2024-01-17","Theory","Present"),
    ("TG1009","ICT05","2024-01-24","Theory","Present"),
    ("TG1009","ICT05","2024-01-31","Theory","Present"),

    ("TG1009","ICT05","2024-02-07","Theory","Absent"),
    ("TG1009","ICT05","2024-02-14","Theory","Present"),
    ("TG1009","ICT05","2024-02-21","Theory","Present"),
    ("TG1009","ICT05","2024-03-27","Theory","Present"),
    ("TG1009","ICT05","2024-03-05","Theory","Present"),

    ("TG1009","ICT05","2024-03-12","Theory","Present"),
    ("TG1009","ICT05","2024-03-19","Theory","Present"),
    ("TG1009","ICT05","2024-03-27","Theory","Present"),
    ("TG1009","ICT05","2024-04-03","Theory","Present"),
    ("TG1009","ICT05","2024-04-10","Theory","Present"),

    ("TG1010","ICT05","2024-01-03","Theory","Absent"),
    ("TG1010","ICT05","2024-01-10","Theory","Absent"),
    ("TG1010","ICT05","2024-01-17","Theory","Absent"),
    ("TG1010","ICT05","2024-01-24","Theory","Absent"),
    ("TG1010","ICT05","2024-01-31","Theory","Present"),

    ("TG1010","ICT05","2024-02-07","Theory","Absent"),
    ("TG1010","ICT05","2024-02-14","Theory","Present"),
    ("TG1010","ICT05","2024-02-21","Theory","Absent"),
    ("TG1010","ICT05","2024-03-27","Theory","Present"),
    ("TG1010","ICT05","2024-03-05","Theory","Present"),

    ("TG1010","ICT05","2024-03-12","Theory","Present"),
    ("TG1010","ICT05","2024-03-19","Theory","Absent"),
    ("TG1010","ICT05","2024-03-27","Theory","Absent"),
    ("TG1010","ICT05","2024-04-03","Theory","Present"),
    ("TG1010","ICT05","2024-04-10","Theory","Present"),


    -- thursday
    ("TG1001","ICT02","2024-01-04","Theory","Present"),
    ("TG1001","ICT02","2024-01-11","Theory","Present"),
    ("TG1001","ICT02","2024-01-18","Theory","Present"),
    ("TG1001","ICT02","2024-01-25","Theory","Present"),
    ("TG1001","ICT02","2024-02-01","Theory","Present"),

    ("TG1001","ICT02","2024-02-08","Theory","Present"),
    ("TG1001","ICT02","2024-02-15","Theory","Present"),
    ("TG1001","ICT02","2024-02-22","Theory","Present"),
    ("TG1001","ICT02","2024-03-29","Theory","Present"),
    ("TG1001","ICT02","2024-03-07","Theory","Present"),

    ("TG1001","ICT02","2024-03-14","Theory","Present"),
    ("TG1001","ICT02","2024-03-21","Theory","Present"),
    ("TG1001","ICT02","2024-03-28","Theory","Present"),
    ("TG1001","ICT02","2024-04-04","Theory","Present"),
    ("TG1001","ICT02","2024-04-11","Theory","Absent"),

 
    ("TG1002","ICT02","2024-01-04","Theory","Present"),
    ("TG1002","ICT02","2024-01-11","Theory","Present"),
    ("TG1002","ICT02","2024-01-18","Theory","Present"),
    ("TG1002","ICT02","2024-01-25","Theory","Present"),
    ("TG1002","ICT02","2024-02-01","Theory","Present"),

    ("TG1002","ICT02","2024-02-08","Theory","Present"),
    ("TG1002","ICT02","2024-02-15","Theory","Present"),
    ("TG1002","ICT02","2024-02-22","Theory","Present"),
    ("TG1002","ICT02","2024-03-29","Theory","Present"),
    ("TG1002","ICT02","2024-03-07","Theory","Present"),

    ("TG1002","ICT02","2024-03-14","Theory","Present"),
    ("TG1002","ICT02","2024-03-21","Theory","Present"),
    ("TG1002","ICT02","2024-03-28","Theory","Present"),
    ("TG1002","ICT02","2024-04-04","Theory","Present"),
    ("TG1002","ICT02","2024-04-11","Theory","Present"),

   
    ("TG1003","ICT02","2024-01-04","Theory","Present"),
    ("TG1003","ICT02","2024-01-11","Theory","Present"),
    ("TG1003","ICT02","2024-01-18","Theory","Present"),
    ("TG1003","ICT02","2024-01-25","Theory","Present"),
    ("TG1003","ICT02","2024-02-01","Theory","Absent"),

    ("TG1003","ICT02","2024-02-08","Theory","Present"),
    ("TG1003","ICT02","2024-02-15","Theory","Present"),
    ("TG1003","ICT02","2024-02-22","Theory","Present"),
    ("TG1003","ICT02","2024-03-29","Theory","Present"),
    ("TG1003","ICT02","2024-03-07","Theory","Present"),

    ("TG1003","ICT02","2024-03-14","Theory","Present"),
    ("TG1003","ICT02","2024-03-21","Theory","Present"),
    ("TG1003","ICT02","2024-03-28","Theory","Present"),
    ("TG1003","ICT02","2024-04-04","Theory","Present"),
    ("TG1003","ICT02","2024-04-11","Theory","Present"),

 
    ("TG1004","ICT02","2024-01-04","Theory","Present"),
    ("TG1004","ICT02","2024-01-11","Theory","Present"),
    ("TG1004","ICT02","2024-01-18","Theory","Present"),
    ("TG1004","ICT02","2024-01-25","Theory","Present"),
    ("TG1004","ICT02","2024-02-01","Theory","Present"),

    ("TG1004","ICT02","2024-02-08","Theory","Present"),
    ("TG1004","ICT02","2024-02-15","Theory","Present"),
    ("TG1004","ICT02","2024-02-22","Theory","Absent"),
    ("TG1004","ICT02","2024-03-29","Theory","Present"),
    ("TG1004","ICT02","2024-03-07","Theory","Present"),

    ("TG1004","ICT02","2024-03-14","Theory","Present"),
    ("TG1004","ICT02","2024-03-21","Theory","Present"),
    ("TG1004","ICT02","2024-03-28","Theory","Present"),
    ("TG1004","ICT02","2024-04-04","Theory","Present"),
    ("TG1004","ICT02","2024-04-11","Theory","Present"),

 
    ("TG1005","ICT02","2024-01-04","Theory","Present"),
    ("TG1005","ICT02","2024-01-11","Theory","Present"),
    ("TG1005","ICT02","2024-01-18","Theory","Present"),
    ("TG1005","ICT02","2024-01-25","Theory","Present"),
    ("TG1005","ICT02","2024-02-01","Theory","Present"),

    ("TG1005","ICT02","2024-02-08","Theory","Present"),
    ("TG1005","ICT02","2024-02-15","Theory","Present"),
    ("TG1005","ICT02","2024-02-22","Theory","Present"),
    ("TG1005","ICT02","2024-03-29","Theory","Present"),
    ("TG1005","ICT02","2024-03-07","Theory","Present"),

    ("TG1005","ICT02","2024-03-14","Theory","Present"),
    ("TG1005","ICT02","2024-03-21","Theory","Present"),
    ("TG1005","ICT02","2024-03-28","Theory","Present"),
    ("TG1005","ICT02","2024-04-04","Theory","Present"),
    ("TG1005","ICT02","2024-04-11","Theory","Present"),

    
   
    ("TG1006","ICT02","2024-01-04","Theory","Present"),
    ("TG1006","ICT02","2024-01-11","Theory","Present"),
    ("TG1006","ICT02","2024-01-18","Theory","Present"),
    ("TG1006","ICT02","2024-01-25","Theory","Present"),
    ("TG1006","ICT02","2024-02-01","Theory","Present"),

    ("TG1006","ICT02","2024-02-08","Theory","Present"),
    ("TG1006","ICT02","2024-02-15","Theory","Present"),
    ("TG1006","ICT02","2024-02-22","Theory","Present"),
    ("TG1006","ICT02","2024-03-29","Theory","Present"),
    ("TG1006","ICT02","2024-03-07","Theory","Present"),

    ("TG1006","ICT02","2024-03-14","Theory","Present"),
    ("TG1006","ICT02","2024-03-21","Theory","Present"),
    ("TG1006","ICT02","2024-03-28","Theory","Present"),
    ("TG1006","ICT02","2024-04-04","Theory","Present"),
    ("TG1006","ICT02","2024-04-11","Theory","Present"),

 
    ("TG1007","ICT02","2024-01-04","Theory","Present"),
    ("TG1007","ICT02","2024-01-11","Theory","Present"),
    ("TG1007","ICT02","2024-01-18","Theory","Present"),
    ("TG1007","ICT02","2024-01-25","Theory","Present"),
    ("TG1007","ICT02","2024-02-01","Theory","Present"),

    ("TG1007","ICT02","2024-02-08","Theory","Present"),
    ("TG1007","ICT02","2024-02-15","Theory","Present"),
    ("TG1007","ICT02","2024-02-22","Theory","Present"),
    ("TG1007","ICT02","2024-03-29","Theory","Present"),
    ("TG1007","ICT02","2024-03-07","Theory","Present"),

    ("TG1007","ICT02","2024-03-14","Theory","Present"),
    ("TG1007","ICT02","2024-03-21","Theory","Present"),
    ("TG1007","ICT02","2024-03-28","Theory","Present"),
    ("TG1007","ICT02","2024-04-04","Theory","Present"),
    ("TG1007","ICT02","2024-04-11","Theory","Present"),


    ("TG1008","ICT02","2024-01-04","Theory","Absent"),
    ("TG1008","ICT02","2024-01-11","Theory","Present"),
    ("TG1008","ICT02","2024-01-18","Theory","Present"),
    ("TG1008","ICT02","2024-01-25","Theory","Present"),
    ("TG1008","ICT02","2024-02-01","Theory","Present"),

    ("TG1008","ICT02","2024-02-08","Theory","Present"),
    ("TG1008","ICT02","2024-02-15","Theory","Present"),
    ("TG1008","ICT02","2024-02-22","Theory","Present"),
    ("TG1008","ICT02","2024-03-29","Theory","Present"),
    ("TG1008","ICT02","2024-03-07","Theory","Present"),

    ("TG1008","ICT02","2024-03-14","Theory","Present"),
    ("TG1008","ICT02","2024-03-21","Theory","Present"),
    ("TG1008","ICT02","2024-03-28","Theory","Present"),
    ("TG1008","ICT02","2024-04-04","Theory","Present"),
    ("TG1008","ICT02","2024-04-11","Theory","Present"),

  
    ("TG1009","ICT02","2024-01-04","Theory","Present"),
    ("TG1009","ICT02","2024-01-11","Theory","Present"),
    ("TG1009","ICT02","2024-01-18","Theory","Present"),
    ("TG1009","ICT02","2024-01-25","Theory","Present"),
    ("TG1009","ICT02","2024-02-01","Theory","Present"),

    ("TG1009","ICT02","2024-02-08","Theory","Present"),
    ("TG1009","ICT02","2024-02-15","Theory","Present"),
    ("TG1009","ICT02","2024-02-22","Theory","Present"),
    ("TG1009","ICT02","2024-03-29","Theory","Present"),
    ("TG1009","ICT02","2024-03-07","Theory","Present"),

    ("TG1009","ICT02","2024-03-14","Theory","Present"),
    ("TG1009","ICT02","2024-03-21","Theory","Present"),
    ("TG1009","ICT02","2024-03-28","Theory","Present"),
    ("TG1009","ICT02","2024-04-04","Theory","Absent"),
    ("TG1009","ICT02","2024-04-11","Theory","Present"),

    ("TG1010","ICT02","2024-01-04","Theory","Present"),
    ("TG1010","ICT02","2024-01-11","Theory","Present"),
    ("TG1010","ICT02","2024-01-18","Theory","Present"),
    ("TG1010","ICT02","2024-01-25","Theory","Present"),
    ("TG1010","ICT02","2024-02-01","Theory","Present"),

    ("TG1010","ICT02","2024-02-08","Theory","Present"),
    ("TG1010","ICT02","2024-02-15","Theory","Present"),
    ("TG1010","ICT02","2024-02-22","Theory","Present"),
    ("TG1010","ICT02","2024-03-29","Theory","Present"),
    ("TG1010","ICT02","2024-03-07","Theory","Present"),

    ("TG1010","ICT02","2024-03-14","Theory","Absent"),
    ("TG1010","ICT02","2024-03-21","Theory","Present"),
    ("TG1010","ICT02","2024-03-28","Theory","Present"),
    ("TG1010","ICT02","2024-04-04","Theory","Present"),
    ("TG1010","ICT02","2024-04-11","Theory","Present");

