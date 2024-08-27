DROP DATABASE libary;

CREATE DATABASE IF NOT EXISTS libary;

USE libary;

-- Question A
CREATE TABLE BOOK (
	BookID INT,
    BookName VARCHAR(30) NOT NULL,
    Copies INT NOT NULL,
    Subject VARCHAR(20) NOT NULL,
    BookPrice DECIMAL(10, 2),
    TotalCopiesBorrowed INT NOT NULL,
    PRIMARY KEY (BookID)
);

CREATE TABLE Borrower (
	BorrowerNo VARCHAR(10),
    FullName VARCHAR(60) NOT NULL,
    JoinedDATE DATE NOT NULL,
    PRIMARY KEY (BorrowerNo)
);

CREATE TABLE Lend (
	BorrowerNo VARCHAR(10),
    BookID INT,
    DateBorrowed DATE NOT NULL,
    CopiesBorrowed INT NOT NULL,
    PRIMARY KEY (BorrowerNo, BookID, DateBorrowed),
    FOREIGN KEY (BorrowerNo) REFERENCES Borrower(BorrowerNo),
    FOREIGN KEY (BookID) REFERENCES Book(BookID)
);

-- Insert data into BOOK table
INSERT INTO BOOK (BookID, BookName, Copies, Subject, BookPrice, TotalCopiesBorrowed)
VALUES 
(1, 'Introduction to Computing', 10, 'Computing', 45.99, 50),
(2, 'Advanced Computing Techniques', 8, 'Computing', 60.50, 30),
(3, 'Design Fundamentals', 5, 'Design', 35.00, 20),
(4, 'Graphic Design for Beginners', 7, 'Design', 40.75, 15),
(5, 'Learning Python', 15, 'Computing', 50.99, 70),
(6, 'Modern Language Arts', 12, 'Language', 38.90, 40),
(7, 'The Art of Communication', 9, 'Language', 22.50, 25);

-- Insert data into Borrower table
INSERT INTO Borrower (BorrowerNo, FullName, JoinedDATE)
VALUES 
('B001', 'Alice Johnson', '2023-05-12'),
('B002', 'Bob Smith', '2023-06-23'),
('B003', 'Charlie Brown', '2023-07-10'),
('B004', 'David Wilson', '2023-08-01'),
('B005', 'Eva Green', '2023-09-15');

-- Insert data into Lend table
INSERT INTO Lend (BorrowerNo, BookID, DateBorrowed, CopiesBorrowed)
VALUES 
('B001', 1, '2024-07-01', 1),
('B001', 3, '2024-07-05', 1),
( 'B001', 2, '2024-07-01', 1),
('B002', 2, '2024-07-08', 1),
('B003', 5, '2024-07-10', 2),
('B003', 7, '2024-07-15', 1),
('B004', 6, '2024-07-20', 3),
('B005', 4, '2024-07-22', 1);

-- Question B
SELECT BookName FROM Book WHERE Subject = 'Computing';

-- Question C
SELECT b.FullName FROM Borrower b JOIN Lend L ON b.BorrowerNo = L.BorrowerNo
JOIN Book BK ON L.BookID = BK.BookID 
WHERE BK.Subject IN ('COmputing', 'Design', 'Language')
GROUP BY b.FullName 
HAVING COUNT(BK.Subject) = 3;

-- Question D
SELECT Subject, SUM(TotalCopiesBorrowed - Copies) AS TotalBooks FROM BOOK GROUP BY Subject;

