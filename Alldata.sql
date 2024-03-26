
-- Admin table
INSERT INTO "admin" (adminId,aName,phoneNumber,email,gender,pwd)
VALUES ('admin001','admin',753383838,'admin@gmail.com','male','admin123');



-- lecturer table
INSERT INTO "admin" (lecturerId,lName,phoneNumber,email,gender,pwd,courceCode)
VALUES  ('LEC001','Smith',1234567890,'smith@example.com','Male','pass123','ICT01'),
        ('LEC002','Johnson',9876543210,'johnson@example.com','Female','abc@123','ICT02'),
        ('LEC003','Brown',5555555555,'brown@example.com','Male','securePwd','ICT03'),
        ('LEC004','Garcia',3333333333,'garcia@example.com','Female','p@ssw0rd','CS104'),

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
