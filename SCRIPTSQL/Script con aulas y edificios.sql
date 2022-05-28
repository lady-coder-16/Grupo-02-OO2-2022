CREATE DATABASE  IF NOT EXISTS `grupo-02-bdd-oo2-2022` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `grupo-02-bdd-oo2-2022`;
-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: localhost    Database: grupo-02-bdd-oo2-2022
-- ------------------------------------------------------
-- Server version	8.0.28

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
-- Dumping data for table `aula`
--

LOCK TABLES `aula` WRITE;
/*!40000 ALTER TABLE `aula` DISABLE KEYS */;
INSERT INTO `aula` VALUES (1,7,1),(2,6,1),(3,19,1),(4,21,1),(5,11,1),(6,1,2),(7,2,2),(8,7,3),(9,10,4),(10,19,2);
/*!40000 ALTER TABLE `aula` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `carrera`
--

LOCK TABLES `carrera` WRITE;
/*!40000 ALTER TABLE `carrera` DISABLE KEYS */;
INSERT INTO `carrera` VALUES (1,'Sistemas',1),(2,'Ferroviarias',1);
/*!40000 ALTER TABLE `carrera` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `departamento`
--

LOCK TABLES `departamento` WRITE;
/*!40000 ALTER TABLE `departamento` DISABLE KEYS */;
INSERT INTO `departamento` VALUES (1,'Desarrollo Productivo'),(2,'Humanidaes y arte'),(3,'Planificacion'),(4,'Salud Comunitaria');
/*!40000 ALTER TABLE `departamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `docente`
--

LOCK TABLES `docente` WRITE;
/*!40000 ALTER TABLE `docente` DISABLE KEYS */;
INSERT INTO `docente` VALUES (12345,3),(12346,4),(12347,5),(12348,6);
/*!40000 ALTER TABLE `docente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `edificio`
--

LOCK TABLES `edificio` WRITE;
/*!40000 ALTER TABLE `edificio` DISABLE KEYS */;
INSERT INTO `edificio` VALUES (1,'José Hernandez'),(2,'Scalabrini'),(3,'Ugarte'),(4,'Marechal'),(5,'Manzi'),(6,'Jaureche');
/*!40000 ALTER TABLE `edificio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `espacio`
--

LOCK TABLES `espacio` WRITE;
/*!40000 ALTER TABLE `espacio` DISABLE KEYS */;
INSERT INTO `espacio`VALUES(1,'2022-05-25',0,'m',1),(2,'2022-05-26',1,'t',1),(3,'2022-05-26',1,'m',7);
/*!40000 ALTER TABLE `espacio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `final`
--

LOCK TABLES `final` WRITE;
/*!40000 ALTER TABLE `final` DISABLE KEYS */;
/*!40000 ALTER TABLE `final` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `laboratorio`
--

LOCK TABLES `laboratorio` WRITE;
/*!40000 ALTER TABLE `laboratorio` DISABLE KEYS */;
INSERT INTO `laboratorio` VALUES (10,70,7),(15,70,8),(10,50,9),(30,30,10);
/*!40000 ALTER TABLE `laboratorio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `materia`
--

LOCK TABLES `materia` WRITE;
/*!40000 ALTER TABLE `materia` DISABLE KEYS */;
INSERT INTO `materia` VALUES (5,8604,'Matematica 2 - Plaul',1),(6,86042,'Matematica 2 - Loidi',1),(1,8600,'Programacion de Computadoras',1),(2,8601,'Organizacion de Computadoras',1),(3,8602,'Arquitectura de computadoras',1),(4,8603,'Matematica 1',1);
/*!40000 ALTER TABLE `materia` ENABLE KEYS */;
UNLOCK TABLES;



--
-- Dumping data for table `materiaxdocente`
--
LOCK TABLES `materiaxdocente` WRITE;
/*!40000 ALTER TABLE `materiaxdocente` DISABLE KEYS */;
INSERT INTO `materiaxdocente` VALUES (5,3),(6,4),(1,5),(2,5),(3,5),(4,6);
/*!40000 ALTER TABLE `materiaxdocente` ENABLE KEYS */;
UNLOCK TABLES;
--
-- Dumping data for table `nota_pedido`
--

LOCK TABLES `nota_pedido` WRITE;
/*!40000 ALTER TABLE `nota_pedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `nota_pedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'Leclerc',12345678,'Charles','dni'),(2,'Sainz',23456789,'Carlos','dni'),(3,'Plaul',21983746,'Vanesa','dni'),(4,'Loidi',93826155,'Laura','dni'),(5,'Perez',21345678,'Nicolas','dni'),(6,'Siciliano',84756352,'Gustavo','dni');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;


--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'ROLE_ADMIN',1,'ADMIN'),(2,'ROLE_AUDITOR',1,'AUDITOR');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `tradicional`
--

LOCK TABLES `tradicional` WRITE;
/*!40000 ALTER TABLE `tradicional` DISABLE KEYS */;
INSERT INTO `tradicional` VALUES (100,'Tiza',1,1),(50,'Tiza',1,2),(150,'Tiza',1,3),(50,'Fibron',0,4),(100,'Fibron',0,5),(150,'Fibron',0,6);
/*!40000 ALTER TABLE `tradicional` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('charles@gmail.com',1,'$2a$10$lpeTNBUGJfHxsJNOkAF5IuS5eLZUOuL8vlHMd/9O0rL5Cb3rp.uk6','admin',1,1),('carlos@gmail.com',1,'$2a$10$B9mfALrCwl7gNgksyajanuqhq2GpRAfcfTPN9iXrAAGN6BKB73hUy','auditor',2,2);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-21  1:48:29
