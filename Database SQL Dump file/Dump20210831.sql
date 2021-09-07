-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: bankapp
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `account`
--

DROP TABLE IF EXISTS `account`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `account` (
  `account_number` int NOT NULL AUTO_INCREMENT,
  `balance` float DEFAULT NULL,
  `loan_amount` float DEFAULT NULL,
  `monthly_install` float DEFAULT NULL,
  `date_opened` varchar(45) DEFAULT NULL,
  `date_closed` varchar(45) DEFAULT NULL,
  `trn` int DEFAULT NULL,
  `worker_id` int DEFAULT NULL,
  PRIMARY KEY (`account_number`),
  KEY `customer_trn_idx` (`trn`),
  KEY `worker_id_link_idx` (`worker_id`),
  CONSTRAINT `customer_trn` FOREIGN KEY (`trn`) REFERENCES `customer` (`trn`),
  CONSTRAINT `worker_id_link` FOREIGN KEY (`worker_id`) REFERENCES `worker` (`worker_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customer` (
  `trn` int NOT NULL AUTO_INCREMENT,
  `f_name` varchar(45) DEFAULT NULL,
  `l_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `telephone_number` varchar(45) DEFAULT NULL,
  `dob` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`trn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `customeraddress`
--

DROP TABLE IF EXISTS `customeraddress`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `customeraddress` (
  `address_id` int NOT NULL AUTO_INCREMENT,
  `street` varchar(45) DEFAULT NULL,
  `community_parish` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `customer_trn` int DEFAULT NULL,
  PRIMARY KEY (`address_id`),
  KEY `customer_trn_idx` (`customer_trn`),
  CONSTRAINT `customer_trn_link` FOREIGN KEY (`customer_trn`) REFERENCES `customer` (`trn`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `worker`
--

DROP TABLE IF EXISTS `worker`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `worker` (
  `worker_id` int NOT NULL AUTO_INCREMENT,
  `f_name` varchar(45) DEFAULT NULL,
  `l_name` varchar(45) DEFAULT NULL,
  `telephone` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `account_number` int DEFAULT NULL,
  PRIMARY KEY (`worker_id`),
  KEY `account_number_link_idx` (`account_number`),
  CONSTRAINT `account_num_link` FOREIGN KEY (`account_number`) REFERENCES `account` (`account_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Table structure for table `workerlog`
--

DROP TABLE IF EXISTS `workerlog`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `workerlog` (
  `workerlog_id` int NOT NULL AUTO_INCREMENT,
  `message` varchar(45) DEFAULT NULL,
  `date` varchar(45) DEFAULT NULL,
  `worker_id` int DEFAULT NULL,
  PRIMARY KEY (`workerlog_id`),
  KEY `worker_link_idx` (`worker_id`),
  CONSTRAINT `worker_link` FOREIGN KEY (`worker_id`) REFERENCES `worker` (`worker_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-09-01  0:06:51
