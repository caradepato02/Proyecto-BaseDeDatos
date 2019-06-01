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
-- Table structure for table `maquinas`
--

DROP TABLE IF EXISTS `maquinas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `maquinas` (
  `id_maquina` int(11) NOT NULL AUTO_INCREMENT,
  `tipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id_maquina`),
  UNIQUE KEY `id_maquina_UNIQUE` (`id_maquina`)
) ENGINE=InnoDB AUTO_INCREMENT=50 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maquinas`
--

LOCK TABLES `maquinas` WRITE;
/*!40000 ALTER TABLE `maquinas` DISABLE KEYS */;
INSERT INTO `maquinas` VALUES (1,'Bicicleta'),(2,'Banco press'),(3,'Banco press'),(4,'Banco press'),(5,'Cinta de correr'),(6,'Prensa de pierna'),(7,'Cinta de correr'),(8,'Maquina de remo'),(9,'Maquina de remo'),(10,'Banco press'),(11,'Prensa de pierna'),(12,'Cinta de correr'),(13,'Bicicleta'),(14,'Cinta de correr'),(15,'Prensa de pierna'),(16,'Cinta de correr'),(17,'Banco press'),(18,'Banco press'),(19,'Maquina de remo'),(20,'Maquina de remo'),(21,'Cinta de correr'),(22,'Maquina de remo'),(23,'Prensa de pierna'),(24,'Cinta de correr'),(25,'Banco press'),(26,'Bicicleta'),(27,'Maquina de remo'),(28,'Bicicleta'),(29,'Bicicleta'),(30,'Banco press'),(31,'Prensa de pierna'),(32,'Banco press'),(33,'Bicicleta'),(34,'Cinta de correr'),(35,'Banco press'),(36,'Bicicleta'),(37,'Bicicleta'),(38,'Cinta de correr'),(39,'Banco press'),(40,'Banco press'),(41,'Banco press'),(42,'Prensa de pierna'),(43,'Banco press'),(44,'Maquina de remo'),(45,'Prensa de pierna'),(46,'Prensa de pierna'),(47,'Bicicleta'),(48,'Bicicleta'),(49,'Banco press');
/*!40000 ALTER TABLE `maquinas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-01 13:21:59
