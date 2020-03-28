-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Jul 11, 2018 at 06:42 AM
-- Server version: 5.7.21
-- PHP Version: 5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `oop`
--

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
CREATE TABLE IF NOT EXISTS `course` (
  `CourseId` varchar(30) NOT NULL,
  `CourseName` varchar(50) NOT NULL,
  `CourseDetails` varchar(200) NOT NULL,
  `Fees` varchar(20) NOT NULL,
  PRIMARY KEY (`CourseId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `course`
--

INSERT INTO `course` (`CourseId`, `CourseName`, `CourseDetails`, `Fees`) VALUES
('ENC16', 'Diploma in English', 'Spoken practises will be given everytime and Grammer,Formal Writting wil also be taught', '20000'),
('IT1090', 'ics', 'efgrthtrh', '25000'),
('ITC15', 'Diploma in IT', 'Fundamental IT will be taught first and Practise of some Programming language will be taught which will be a good start for IT industry', '25500'),
('MS124', 'Short course in MS Office', 'MS office will be introduce and given more practises on it.', '25000'),
('SP456', 'Spoken English For Professionals', 'More speaking practices,Pronunciation ', '40000');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

DROP TABLE IF EXISTS `marks`;
CREATE TABLE IF NOT EXISTS `marks` (
  `MarksId` varchar(50) NOT NULL,
  `StudentId` varchar(30) NOT NULL,
  `SubjectName` varchar(50) NOT NULL,
  `Assignment` int(11) NOT NULL,
  `MidMarks` int(11) NOT NULL,
  `FinalMarks` int(11) NOT NULL,
  PRIMARY KEY (`MarksId`),
  KEY `StudentId` (`StudentId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` (`MarksId`, `StudentId`, `SubjectName`, `Assignment`, `MidMarks`, `FinalMarks`) VALUES
('Basics of ITIT17101448', 'IT17101448', 'Basics of IT', 20, 30, 43),
('Communication skillsEN17091176', 'EN17091176', 'Communication skills', 9, 12, 31),
('Formal Writting EN17091176', 'EN17091176', 'Formal Writting ', 10, 21, 36),
('Grammar for EnglishEN17091176', 'EN17091176', 'Grammar for English', 12, 21, 40),
('Introduction to  MS Office MS18123478', ' MS18123478', 'Introduction to MS Office', 12, 10, 40),
('Introduction to C++IT17101448', 'IT17101448', 'Introduction to C++', 13, 22, 42),
('Introduction to CIT17101448', 'IT17101448', 'Introduction to C', 15, 22, 40),
('Introduction to Programming LanguageIT17101448', 'IT17101448', 'Introduction to Programming Language', 12, 21, 35),
('Operating SystemsIT17101448', 'IT17101448', 'Operating Systems', 16, 25, 45);

-- --------------------------------------------------------

--
-- Table structure for table `register`
--

DROP TABLE IF EXISTS `register`;
CREATE TABLE IF NOT EXISTS `register` (
  `name` varchar(30) NOT NULL,
  `StudentRegNo` varchar(10) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `nic` varchar(10) DEFAULT NULL,
  `contactNo` varchar(10) DEFAULT NULL,
  `password` varchar(30) DEFAULT NULL,
  `course` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`StudentRegNo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `register`
--

INSERT INTO `register` (`name`, `StudentRegNo`, `email`, `nic`, `contactNo`, `password`, `course`) VALUES
('Sivarathihan.S', 'EN17091176', 'srathihan@gmail.com', '971236785V', '0779775477', 'siva234', 'Diploma in English'),
('Shobana.P', 'IT17101448', 'shobanap05@gmail.com', '975643096V', '0779657420', 'shobana20', 'Diploma in IT'),
('perera', 'IT17109478', 'hilt@gmail.com', '951523658V', '0776354678', 'Hilton@1', 'Diploma in IT'),
('Keerthana.S', 'IT17121456', 'keerthanas23@gmail.com', '96806543V', '0778965432', 'keeribavi23', 'Web Development'),
('Lojini R.P', 'IT17131216', 'pavilojini29@gmail.com', '967110647V', '0771123456', 'pavithu2929', 'Diploma in IT'),
('nimalasena', 'IT4567893', 'nimal@gmail.com', '956743237V', '0771057878', 'Hilton@1', 'Diploma in IT'),
('Bhargavi.R', 'MS18123478', 'bhargavi2000@gmail.com', '207869543V', '0776949290', 'bhargavi20', 'Short course in MS Office'),
('Hilton.J.B', 'SP17905632', 'hilton9505@gmail.com', '956789043V', '0776785432', 'hilton05', 'Spoken English For Professionals'),
('Manoj Kumar.D', 'WA17123478', 'manojkumar20@gmail.com', '976543208V', '0773913678', 'manoj20', 'Web Development'),
('Rahul Raj.R', 'WA18123454', 'rahulraj16@gmail.com', '978063452V', '0750054123', 'rahulraj16', 'Web Development');

-- --------------------------------------------------------

--
-- Table structure for table `scholarship`
--

DROP TABLE IF EXISTS `scholarship`;
CREATE TABLE IF NOT EXISTS `scholarship` (
  `ScholId` varchar(40) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `RegNum` varchar(30) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `StudyProgram` varchar(50) NOT NULL,
  `gpa` double NOT NULL,
  `NIC` varchar(30) NOT NULL,
  `RequestStatus` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`ScholId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `scholarship`
--

INSERT INTO `scholarship` (`ScholId`, `Name`, `RegNum`, `Email`, `StudyProgram`, `gpa`, `NIC`, `RequestStatus`) VALUES
('ScholIT17131216', 'Lojini R.P', 'IT17131216', 'pavilojini29@gmail.com', 'Diploma in IT', 4, '967110647v', NULL),
('ScholIT17221586', 'divya', 'IT17221586', 'divya32@gmail.com', 'Diploma in IT', 4, '965845145V', 'Accepted'),
('ScholITerg', 'ergergerger', 'ITerg', 'ergerg', 'Web Development', 4, 'reg', NULL),
('ScholSP17905632', 'Hilton.J.B', 'SP17905632', 'hilton9505@gmail.com', 'Spoken English For Professionals', 3.7, 'hilton9505@gmail.com', NULL),
('ScholWA17123478', 'Manoj Kumar.D', 'WA17123478', 'manojkumar20@gmail.com', 'Web Development', 3.7, '976543208V', NULL);

-- --------------------------------------------------------

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
CREATE TABLE IF NOT EXISTS `subject` (
  `SubjectId` varchar(30) NOT NULL,
  `SubjectName` varchar(50) NOT NULL,
  `CourseId` varchar(30) NOT NULL,
  `CourseName` varchar(30) NOT NULL,
  `Credits` varchar(20) NOT NULL,
  PRIMARY KEY (`SubjectId`),
  KEY `CourseId` (`CourseId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `subject`
--

INSERT INTO `subject` (`SubjectId`, `SubjectName`, `CourseId`, `CourseName`, `Credits`) VALUES
('ENCSU16', 'Grammar for English', 'ENC16', 'Diploma in English', '4'),
('ENCSU17', 'Formal Writting', 'ENC16', 'Diploma in English', '4'),
('ENCSU18', 'Communication skills', 'ENC16', 'Diploma in English', '4'),
('ITCSU12', 'Basics of IT', 'ITC15', 'Diploma in IT', '2'),
('ITCSU14', 'Introduction to C', 'ITC15', 'Diploma in IT', '4'),
('ITCSU15', 'Introduction to C++', 'ITC15', 'Diploma in IT', '4'),
('ITCSU16', 'Operating Systems', 'ITC15', 'Diploma in IT', '4'),
('ITCU13', 'Introduction to Programming Language', 'ITC15', 'Diploma in IT', '3'),
('MSSU18', 'Introduction to MS Office', 'MS124', 'MS Office', '2');

-- --------------------------------------------------------

--
-- Table structure for table `transcript`
--

DROP TABLE IF EXISTS `transcript`;
CREATE TABLE IF NOT EXISTS `transcript` (
  `TransId` varchar(40) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `RegNum` varchar(30) NOT NULL,
  `Email` varchar(30) NOT NULL,
  `NIC` varchar(30) NOT NULL,
  `PhoneNum` varchar(20) NOT NULL,
  `StudyProgram` varchar(30) NOT NULL,
  `Address` varchar(50) NOT NULL,
  `RequestStatus` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`TransId`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transcript`
--

INSERT INTO `transcript` (`TransId`, `Name`, `RegNum`, `Email`, `NIC`, `PhoneNum`, `StudyProgram`, `Address`, `RequestStatus`) VALUES
('TransIT17101448', 'Shobana.P', 'IT17101448', 'shobanap05@gmail.com', '970483729v', '0779747577', 'Diploma in IT', '6.pererlane,colombo-06.', NULL),
('TransIT17131216', 'Lojini R.P', 'IT17131216', 'pavilojini29@gmail.com', '967110647v', '0771123456', 'Diploma in IT', '71 pamankada rd,colombo-o6.', NULL),
('TransIT1724358', 'nimal', 'IT1724358', 'nimal@gmail.com', '975829202V', '0771057979', 'Diploma in IT', 'ttghashdjasd', NULL),
('TransMS18123478', 'Bhargavi.R', 'MS18123478', 'bhargavi2000@gmail.com', '207869543V', '0776949290', 'Short course in MS Office', '71/5a daya rd,dehiwala.', NULL),
('TransWA18123454', 'Rahul Raj.R', 'WA18123454', 'rahulraj16@gmail.com', '978063452V', '0750054123', 'Web Development', '2,grero place,wattala', NULL);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `subject`
--
ALTER TABLE `subject`
  ADD CONSTRAINT `subject_ibfk_1` FOREIGN KEY (`CourseId`) REFERENCES `course` (`CourseId`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
