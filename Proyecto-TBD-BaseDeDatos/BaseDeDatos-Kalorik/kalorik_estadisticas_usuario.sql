-- MySQL dump 10.13  Distrib 8.0.15, for Win64 (x86_64)
--
-- Host: localhost    Database: kalorik
-- ------------------------------------------------------
-- Server version	8.0.15

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `estadisticas_usuario`
--

DROP TABLE IF EXISTS `estadisticas_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `estadisticas_usuario` (
  `id_usuario` int(11) DEFAULT NULL,
  `id_maquina` int(11) DEFAULT NULL,
  `tiempo` int(11) DEFAULT NULL,
  `calorias` int(11) DEFAULT NULL,
  `fecha` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estadisticas_usuario`
--

LOCK TABLES `estadisticas_usuario` WRITE;
/*!40000 ALTER TABLE `estadisticas_usuario` DISABLE KEYS */;
INSERT INTO `estadisticas_usuario` VALUES (1,47,14,547,'2019-07-18'),(3,12,11,591,'2019-11-17'),(1,19,50,116,'2019-01-28'),(1,14,13,397,'2019-07-05'),(2,46,47,937,'2019-02-06'),(1,28,5,505,'2019-02-15'),(2,20,19,705,'2019-05-10'),(2,48,14,71,'2019-08-13'),(3,30,5,828,'2019-02-24'),(3,44,59,248,'2019-04-13'),(3,39,27,732,'2019-08-21'),(2,47,29,47,'2019-08-22'),(2,23,0,515,'2019-11-11'),(3,26,2,857,'2019-03-20'),(1,30,13,603,'2019-02-01'),(2,25,40,219,'2019-01-07'),(3,29,37,494,'2019-06-13'),(1,39,38,339,'2019-03-05'),(3,44,51,262,'2019-04-08');
/*!40000 ALTER TABLE `estadisticas_usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-01 13:21:58
