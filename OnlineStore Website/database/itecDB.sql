DROP DATABASE IF EXISTS itecDB;
CREATE DATABASE itecDB;
USE itecDB;

CREATE TABLE Customer(
custID INT PRIMARY KEY NOT NULL,
custFullName VARCHAR(200),
custEmail VARCHAR(150),
custPassword VARCHAR(100)
);

CREATE TABLE ScheduleInfo(
schedInfoID INT PRIMARY KEY NOT NULL,
weeks VARCHAR(350),
shedInfoRow1 VARCHAR(350),
shedInfoRow2 VARCHAR(350),
shedInfoRow3 VARCHAR(350),
shedInfoRow4 VARCHAR(350),
shedInfoRow5 VARCHAR(350),
quotes VARCHAR(350),
colourScheme VARCHAR(350)
);

CREATE TABLE Orders(
orderID INT PRIMARY KEY NOT NULL,
orderDate DATETIME,

custID INT REFERENCES Customer(custID),
schedInfoID INT REFERENCES ScheduleInfo(schedInfoID)
);

CREATE TABLE Owners(
ownerID INT PRIMARY KEY NOT NULL,
ownerFullName VARCHAR(200),
ownerPassword VARCHAR(100),
ownerEmail VARCHAR(150),

orderID INT REFERENCES Orders(orderID)
);