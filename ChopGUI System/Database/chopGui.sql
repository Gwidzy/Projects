DROP DATABASE IF EXISTS chopGui;
CREATE DATABASE chopGui;
USE chopGui;

CREATE TABLE Employee(
employeeID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
empID VARCHAR(40),
empRole VARCHAR(40),
empName VARCHAR(40),
empSurN VARCHAR(40),
empConNum VARCHAR(12),
empEmail VARCHAR(50)
);

CREATE TABLE Clients(
clientID INT PRIMARY KEY,
clientName VARCHAR(40),
clientContact VARCHAR(40),
clientConNum VARCHAR(12),
clientEmail VARCHAR(45),
vatRegNo VARCHAR(20)
);

CREATE TABLE Project(
projID INT PRIMARY KEY auto_increment,
projName VARCHAR(40),
-- projDesc VARCHAR(255),
projStartDate DATE,
projEndDate DATE,
-- projProofPay TINYINT,
-- projLocation VARCHAR(100),
clientName VARCHAR(40),
clientContact VARCHAR(40),
vatRegNo VARCHAR(20),
clientConNum VARCHAR(12),
clientEmail VARCHAR(45),
empID VARCHAR(40) REFERENCES Employee(empID)
);

CREATE TABLE BackUpDeletedItemsProjects(
BackUpDeletedItemsProjectsID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
projID INT REFERENCES Project(projID),
projName VARCHAR(40) NOT NULL,
projStartDate DATE,
projEndDate DATE,
clientName VARCHAR(40),
clientContact VARCHAR(40),
vatRegNo VARCHAR(20),
clientConNum VARCHAR(12),
clientEmail VARCHAR(45),
empID VARCHAR(40)    
);
CREATE TABLE BackUpDeletedItemsEmployee(
BackUpDeletedItemsEmployeeID INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
empID VARCHAR(40),
empRole VARCHAR(40),
empName VARCHAR(40),
empSurN VARCHAR(40),
empConNum VARCHAR(12),
empEmail VARCHAR(50)
);

CREATE TABLE Login(
loginID INT PRIMARY KEY,
userName VARCHAR(50),
pass VARCHAR(50)
);


INSERT INTO Employee(empID,empRole,empName,empSurN,empConNum,empEmail)
VALUES  (1, "Admin", "Martin","Oliphant", "0794000966", "martin@test.com"),
		(2, "Worker", "Test","Testing", "1234567890", "admin@test.com");

INSERT INTO Project(projName,projStartDate,projEndDate,clientName,clientContact,vatRegNo,clientConNum,clientEmail,empID)
VALUES 	( "Sundowns Stadium Restoration","2021/07/18", "2021/08/15","Sundown Stadium","Piet","123456","0714549826","client@gmail.com",001),
		( "Cape Town Stadium Restoration","2021/06/10", "2021/10/16","Cape Town Stadium","Basson","4567890","0123456789","basson@gmail.com",001);

INSERT INTO Clients(clientID,clientName,clientContact,clientConNum,vatRegNo,clientEmail)
VALUES (456, "Sundown Stadium", "Piet","0714549826", "123456", "client@gmail.com");

INSERT INTO Login(loginID,userName,pass)
VALUES (069, "admin", "123");

SELECT Employee.empID, projName FROM Employee 
JOIN Project ON Employee.empID = Project.empID 
WHERE Employee.empID = 001;

SELECT Employee.empID, projName FROM Employee 
JOIN Project ON Employee.empID = Project.empID 
WHERE Employee.empID = 1;


UPDATE Project 
SET projName =  "Test", projStartDate = "2021-07-08", projEndDate = "2021-07-09", clientName = "test",clientContact="test", clientEmail="test@test.com", empID =1
WHERE projID = 1;
 -- SELECT * FROM Employee;
 SELECT * FROM Project
-- SELECT * FROM Clients;
-- SELECT  FROM Login;