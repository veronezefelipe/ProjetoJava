-- MySQL dump 10.13  Distrib 8.0.31, for Win64 (x86_64)
--
-- Host: localhost    Database: veco
-- ------------------------------------------------------
-- Server version	8.0.31

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
-- Table structure for table `predefinition`
--

DROP TABLE IF EXISTS `predefinition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `predefinition` (
  `idpredefinition` int NOT NULL AUTO_INCREMENT,
  `qtdquestions` int DEFAULT NULL,
  `difficult` varchar(45) DEFAULT NULL,
  `theme` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpredefinition`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `predefinition`
--

LOCK TABLES `predefinition` WRITE;
/*!40000 ALTER TABLE `predefinition` DISABLE KEYS */;
INSERT INTO `predefinition` VALUES (1,2,'Hard','Fabio'),(2,1,'Hard','Fabio'),(11,4,'Hard','Fabio');
/*!40000 ALTER TABLE `predefinition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `questions`
--

DROP TABLE IF EXISTS `questions`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `questions` (
  `idquestion` int NOT NULL AUTO_INCREMENT,
  `question` varchar(255) DEFAULT NULL,
  `theme` varchar(45) DEFAULT NULL,
  `difficult` varchar(45) DEFAULT NULL,
  `alternative1` varchar(45) DEFAULT NULL,
  `alternative2` varchar(45) DEFAULT NULL,
  `alternative3` varchar(45) DEFAULT NULL,
  `alternative4` varchar(45) DEFAULT NULL,
  `rightAnswer` int DEFAULT NULL,
  PRIMARY KEY (`idquestion`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `questions`
--

LOCK TABLES `questions` WRITE;
/*!40000 ALTER TABLE `questions` DISABLE KEYS */;
INSERT INTO `questions` VALUES (1,'Qual a cor do cavalo branco do Fabio?','Fabio','Hard','Preto','Vermelho','Azul','Cinza',1),(2,'Quem é mais calvo?','Fabio','Hard','Fabio Veroneze','Teco','Fabio Pinheiro','Fabricio',3),(3,'Quao legal é o Fabio?','Fabio','Hard','Nada','Muito','Muitao','Pouco',3),(4,'Qual nome da cachorrinha do Fabio?','Fabio','Hard','Doroteia','Tereza','Fabiola','Fabiana',2);
/*!40000 ALTER TABLE `questions` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ranking`
--

DROP TABLE IF EXISTS `ranking`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ranking` (
  `idranking` int NOT NULL AUTO_INCREMENT,
  `nick` varchar(255) DEFAULT NULL,
  `score` int DEFAULT NULL,
  PRIMARY KEY (`idranking`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ranking`
--

LOCK TABLES `ranking` WRITE;
/*!40000 ALTER TABLE `ranking` DISABLE KEYS */;
INSERT INTO `ranking` VALUES (18,'Teco',1),(19,'Matheus',1),(20,'Jonathan',1),(27,NULL,2),(28,'Vero',1),(29,NULL,2),(30,NULL,2),(31,NULL,1);
/*!40000 ALTER TABLE `ranking` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-14 23:10:28
