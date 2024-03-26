
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
INSERT INTO Course (courceCode, cName, credit, weeek, theory, practical, lecturerId) VALUES
('ICT01', 'Data Structures and Algorithms', 3, 15, 1, 0, 'LEC001'),
('ICT02', 'Object Oriented Programming', 2, 15, 1, 0, 'LEC002'),
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
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1001', 'ICT02'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1002', 'ICT02'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1003', 'ICT02'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1004', 'ICT02'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1005', 'ICT02'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1006', 'ICT02'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1007', 'ICT02'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1008', 'ICT02'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1009', 'ICT02'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1010', 'ICT02'),

-- Object Oriented Programming Practicum
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1001', 'ICT03'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1002', 'ICT03'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1003', 'ICT03'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1004', 'ICT03'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1005', 'ICT03'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1006', 'ICT03'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1007', 'ICT03'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1008', 'ICT03'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1009', 'ICT03'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1010', 'ICT03'),

-- Object Oriented Analysis and Design
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1001', 'ICT04'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1002', 'ICT04'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1003', 'ICT04'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1004', 'ICT04'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1005', 'ICT04'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1006', 'ICT04'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1007', 'ICT04'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1008', 'ICT04'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1009', 'ICT04'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1010', 'ICT04'),

-- E-Commerce Implementation, Management and Security
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1001', 'ICT05'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1002', 'ICT05'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1003', 'ICT05'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1004', 'ICT05'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1005', 'ICT05'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1006', 'ICT05'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1007', 'ICT05'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1008', 'ICT05'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1009', 'ICT05'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1010', 'ICT05'),

-- Business Economics
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1001', 'TCS2112'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1002', 'TCS2112'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1003', 'TCS2112'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1004', 'TCS2112'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1005', 'TCS2112'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1006', 'TCS2112'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1007', 'TCS2112'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1009', 'TCS2112'),
(80, 85, 75, 0, 67, 0, 78, 86, 'TG1010', 'TCS2112'),




