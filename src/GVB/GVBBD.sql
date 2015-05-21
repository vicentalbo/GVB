CREATE DATABASE  IF NOT EXISTS `gvbbdd` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `gvbbdd`;
-- MySQL dump 10.13  Distrib 5.6.23, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: gvbbdd
-- ------------------------------------------------------
-- Server version	5.6.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `empleados`
--

DROP TABLE IF EXISTS `empleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empleados` (
  `Nombre` varchar(45) DEFAULT NULL,
  `DNI` varchar(9) NOT NULL,
  `Telef` varchar(45) DEFAULT NULL,
  `edad` int(11) NOT NULL DEFAULT '0',
  `Fnac` varchar(50) NOT NULL DEFAULT '00-00-0000',
  `Fcontr` varchar(50) NOT NULL DEFAULT '00-00-0000',
  `Email` varchar(45) DEFAULT NULL,
  `usuario` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `estado` tinyint(1) DEFAULT NULL,
  `tipo` varchar(45) NOT NULL DEFAULT 'user',
  `avatar` varchar(150) DEFAULT NULL,
  `sueldof` float DEFAULT '0',
  `sueldoh` float DEFAULT '0',
  `Antig` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empleados`
--

LOCK TABLES `empleados` WRITE;
/*!40000 ALTER TABLE `empleados` DISABLE KEYS */;
INSERT INTO `empleados` VALUES ('Prova','11122211P','111111111',23,'11/10/1990','10/2/2014','asd@gmail.com','asd','81dc9bdb52d04dc20036dbd8313ed055',0,'user','src/GVB/img/Avatar/user-defec.png',1000,14000,1),('UFhHOCnP','1hn6cvx51','unnlynrt0',49,'3/7/1965','9/8/2007','1hn@gmail.com','1hn','81dc9bdb52d04dc20036dbd8313ed055',0,'user','src/GVB/img/Avatar/user-defec.png',1200,20160,6),('Santiago','41424344M','659000325',40,'11/2/1975','20/10/2013','vinche777@gmail.com','vinche777','81dc9bdb52d04dc20036dbd8313ed055',1,'user','src/GVB/img/Avatar/w1krc.png',1257,3449210,0),('Yolandaqq','44445522M','654301248',34,'11/11/1980','10/10/2010','yy@gmail.com','yy','81dc9bdb52d04dc20036dbd8313ed055',0,'user','src/GVB/img/Avatar/user-defec.png',1200,16800,3),('ProvaAa','44558899P','123456789',23,'10/10/1990','9/9/2013','ppsd@gmail.com','ppsd','81dc9bdb52d04dc20036dbd8313ed055',0,'user','src/GVB/img/Avatar/user-defec.png',1000,14000,0),('Paco','45454545P','654321301',35,'11/12/1979','13/11/2011','Paco@gmail.com','Paco','81dc9bdb52d04dc20036dbd8313ed055',0,'user','src/GVB/img/Avatar/user-defec.png',1230,17220,2),('Pepe','48484848A','666555444',38,'1/2/1970','1/2/2010','pepe@gmail.com','pepe','81dc9bdb52d04dc20036dbd8313ed055',0,'user','src/GVB/img/Avatar/user-defec.png',1000,14000,5),('Vicent','48607270J','659032587',21,'12/4/1990','12/4/2015','vicent.albo@gmail.com','vv','81dc9bdb52d04dc20036dbd8313ed055',1,'Admin','src/GVB/img/Avatar/TOTIA.png',1200,16800,0),('JrPwyiON','rwy1iwhj1','rwy1iwhj1',62,'7/7/1952','19/8/1972','rwy@gmail.com','rwy','81dc9bdb52d04dc20036dbd8313ed055',0,'user','src/GVB/img/Avatar/user-defec.png',1200,23520,41),('WsaKermK','sa42erm9c','sa42erm9c',59,'4/11/1955','7/6/2007','sa4@gmail.com','sa4','ec6a6536ca304edf844d1d248a4f08dc',0,'user','src/GVB/img/Avatar/user-defec.png',1200,20160,6),('uEGesbso','uesbs5oc0','uesbs5oc0',58,'5/11/1956','6/1/2007','ues@gmail.com','ues','81dc9bdb52d04dc20036dbd8313ed055',0,'user','src/GVB/img/Avatar/user-defec.png',1200,20160,8);
/*!40000 ALTER TABLE `empleados` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `gvbbdd`.`empleados_AFTER_INSERT` AFTER INSERT ON `empleados` FOR EACH ROW
BEGIN
insert into logempleados( fecha, usuario, DNI, oldNombre, nuevoNombre )
values( Now(), USER(), new.DNI, null , new.nombre );
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `gvbbdd`.`empleados_AFTER_UPDATE` AFTER UPDATE ON `empleados` FOR EACH ROW
BEGIN
insert into logempleado_cambio( fecha, usuario, DNI, oldNombre, nuevoNombre, oldTelef, nuevoTelef, oldFnac, nuevoFnac, oldFcontr, nuevoFcontr, oldEmail, nuevoEmail, oldTipo, nuevoTipo )
values( Now(), USER(), new.DNI, old.Nombre , new.Nombre, old.Telef, new.Telef, old.Fnac, new.Fnac, old.Fcontr, new.Fcontr, old.Email, new.Email, old.tipo, new.tipo );
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`root`@`localhost`*/ /*!50003 TRIGGER `gvbbdd`.`empleados_AFTER_DELETE` AFTER DELETE ON `empleados` FOR EACH ROW
BEGIN
insert into logempleado_delete( fecha, usuario, DNI, oldNombre, nuevoNombre )
values( Now(), USER(), old.DNI, old.Nombre, null );
END */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `logempleado_cambio`
--

DROP TABLE IF EXISTS `logempleado_cambio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logempleado_cambio` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `DNI` varchar(9) NOT NULL,
  `oldNombre` varchar(45) DEFAULT NULL,
  `nuevoNombre` varchar(45) DEFAULT NULL,
  `oldTelef` varchar(45) DEFAULT NULL,
  `nuevoTelef` varchar(45) DEFAULT NULL,
  `oldFnac` varchar(50) DEFAULT NULL,
  `nuevoFnac` varchar(50) DEFAULT NULL,
  `oldFcontr` varchar(50) DEFAULT NULL,
  `nuevoFcontr` varchar(50) DEFAULT NULL,
  `oldEmail` varchar(45) DEFAULT NULL,
  `nuevoEmail` varchar(45) DEFAULT NULL,
  `oldTipo` varchar(45) DEFAULT NULL,
  `nuevoTipo` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=47 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logempleado_cambio`
--

LOCK TABLES `logempleado_cambio` WRITE;
/*!40000 ALTER TABLE `logempleado_cambio` DISABLE KEYS */;
INSERT INTO `logempleado_cambio` VALUES (2,'2015-04-23 19:59:25','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1994','12-04-1990','12/4/2015','12/4/2015','vv@gmail.com','vv@gmail.com','Admin','Admin'),(3,'2015-04-27 11:51:05','root@localhost','48484848A','Pepe','Pepe','666555444','666555444','1/2/1970','1/2/1970','1/2/2010','1/2/2010','pepe@pepe.com','pepe@pepe.com','user','user'),(4,'2015-04-29 17:42:25','root@localhost','48525252A','Yolanda','Yolandaqq','654321025','654321025','4/4/1980','4/4/1980','5/4/2014','5/4/2014','yy@dd.com','yy@dd.com','user','user'),(5,'2015-04-29 17:45:09','root@localhost','44445522M','Yolanda','Yolandaqq','654301248','654301248','11/11/1980','11/11/1980','10/10/2010','10/10/2010','yy@ll.com','yy@ll.com','user','user'),(6,'2015-04-30 19:43:11','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12-04-1990','12-04-1990','12/4/2015','12/4/2015','vv@gmail.com','vv@gmail.com','Admin','Admin'),(7,'2015-05-04 20:39:25','root@localhost','1hn6cvx51','UFhHOCnP','UFhHOCnP','unnlynrt0','unnlynrt0','3/7/1965','3/7/1965','9/8/2007','9/8/2007','1hn@1hn.com','1hn@gmail.com','user','user'),(8,'2015-05-04 20:39:25','root@localhost','44445522M','Yolandaqq','Yolandaqq','654301248','654301248','11/11/1980','11/11/1980','10/10/2010','10/10/2010','yy@ll.com','yy@gmail.com','user','user'),(9,'2015-05-04 20:39:25','root@localhost','48484848A','Pepe','Pepe','666555444','666555444','1/2/1970','1/2/1970','1/2/2010','1/2/2010','pepe@pepe.com','pepe@gmail.com','user','user'),(10,'2015-05-04 20:39:25','root@localhost','rwy1iwhj1','JrPwyiON','JrPwyiON','rwy1iwhj1','rwy1iwhj1','7/7/1952','7/7/1952','19/8/1972','19/8/1972','rwy@rwy.com','rwy@gmail.com','user','user'),(11,'2015-05-04 20:39:25','root@localhost','sa42erm9c','WsaKermK','WsaKermK','sa42erm9c','sa42erm9c','4/11/1955','4/11/1955','7/6/2007','7/6/2007','sa4@sa4.com','sa4@gmail.com','user','user'),(12,'2015-05-04 20:39:25','root@localhost','uesbs5oc0','uEGesbso','uEGesbso','uesbs5oc0','uesbs5oc0','5/11/1956','5/11/1956','6/1/2007','6/1/2007','ues@ues.com','ues@gmail.com','user','user'),(13,'2015-05-05 17:38:42','root@localhost','11122211P','Prova','Prova','111111111','111111111','11/10/1990','11/10/1990','10/2/2014','10/2/2014','asd@gmail.com','asd@gmail.com','user','user'),(14,'2015-05-05 17:39:07','root@localhost','1hn6cvx51','UFhHOCnP','UFhHOCnP','unnlynrt0','unnlynrt0','3/7/1965','3/7/1965','9/8/2007','9/8/2007','1hn@gmail.com','1hn@gmail.com','user','user'),(15,'2015-05-05 17:39:27','root@localhost','44445522M','Yolandaqq','Yolandaqq','654301248','654301248','11/11/1980','11/11/1980','10/10/2010','10/10/2010','yy@gmail.com','yy@gmail.com','user','user'),(16,'2015-05-05 17:49:42','root@localhost','11122211P','Prova','Prova','111111111','111111111','11/10/1990','11/10/1990','10/2/2014','10/2/2014','asd@gmail.com','asd@gmail.com','user','user'),(17,'2015-05-05 17:49:54','root@localhost','1hn6cvx51','UFhHOCnP','UFhHOCnP','unnlynrt0','unnlynrt0','3/7/1965','3/7/1965','9/8/2007','9/8/2007','1hn@gmail.com','1hn@gmail.com','user','user'),(18,'2015-05-05 17:50:05','root@localhost','44445522M','Yolandaqq','Yolandaqq','654301248','654301248','11/11/1980','11/11/1980','10/10/2010','10/10/2010','yy@gmail.com','yy@gmail.com','user','user'),(19,'2015-05-05 17:50:31','root@localhost','45454545P','Paco','Paco','654321301','654321301','11/12/1979','11/12/1979','13/11/2011','13/11/2011','Paco@gmail.com','Paco@gmail.com','user','user'),(20,'2015-05-05 17:50:41','root@localhost','48484848A','Pepe','Pepe','666555444','666555444','1/2/1970','1/2/1970','1/2/2010','1/2/2010','pepe@gmail.com','pepe@gmail.com','user','user'),(21,'2015-05-05 17:50:47','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12-04-1990','12/4/1990','12/4/2015','12/4/2015','vv@gmail.com','vv@gmail.com','Admin','Admin'),(22,'2015-05-05 17:55:24','root@localhost','11122211P','Prova','Prova','111111111','111111111','11/10/1990','11/10/1990','10/2/2014','10/2/2014','asd@gmail.com','asd@gmail.com','user','user'),(23,'2015-05-05 17:55:36','root@localhost','1hn6cvx51','UFhHOCnP','UFhHOCnP','unnlynrt0','unnlynrt0','3/7/1965','3/7/1965','9/8/2007','9/8/2007','1hn@gmail.com','1hn@gmail.com','user','user'),(24,'2015-05-05 17:55:42','root@localhost','44445522M','Yolandaqq','Yolandaqq','654301248','654301248','11/11/1980','11/11/1980','10/10/2010','10/10/2010','yy@gmail.com','yy@gmail.com','user','user'),(25,'2015-05-05 17:55:50','root@localhost','44558899P','ProvaAa','ProvaAa','123456789','123456789','10/10/1990','10/10/1990','9/9/2013','9/9/2013','ppsd@gmail.com','ppsd@gmail.com','user','user'),(26,'2015-05-05 17:55:57','root@localhost','48484848A','Pepe','Pepe','666555444','666555444','1/2/1970','1/2/1970','1/2/2010','1/2/2010','pepe@gmail.com','pepe@gmail.com','user','user'),(27,'2015-05-05 17:56:02','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vv@gmail.com','vv@gmail.com','Admin','user'),(28,'2015-05-05 17:56:08','root@localhost','rwy1iwhj1','JrPwyiON','JrPwyiON','rwy1iwhj1','rwy1iwhj1','7/7/1952','7/7/1952','19/8/1972','19/8/1972','rwy@gmail.com','rwy@gmail.com','user','user'),(29,'2015-05-05 17:56:16','root@localhost','sa42erm9c','WsaKermK','WsaKermK','sa42erm9c','sa42erm9c','4/11/1955','4/11/1955','7/6/2007','7/6/2007','sa4@gmail.com','sa4@gmail.com','user','user'),(30,'2015-05-05 17:56:21','root@localhost','sa42erm9c','WsaKermK','WsaKermK','sa42erm9c','sa42erm9c','4/11/1955','4/11/1955','7/6/2007','7/6/2007','sa4@gmail.com','sa4@gmail.com','user','user'),(31,'2015-05-05 17:57:16','root@localhost','45454545P','Paco','Paco','654321301','654321301','11/12/1979','11/12/1979','13/11/2011','13/11/2011','Paco@gmail.com','Paco@gmail.com','user','user'),(32,'2015-05-05 17:57:16','root@localhost','uesbs5oc0','uEGesbso','uEGesbso','uesbs5oc0','uesbs5oc0','5/11/1956','5/11/1956','6/1/2007','6/1/2007','ues@gmail.com','ues@gmail.com','user','user'),(33,'2015-05-05 17:57:16','root@localhost','44558899P','ProvaAa','ProvaAa','123456789','123456789','10/10/1990','10/10/1990','9/9/2013','9/9/2013','ppsd@gmail.com','ppsd@gmail.com','user','user'),(34,'2015-05-05 19:04:59','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vv@gmail.com','vv@gmail.com','user','user'),(35,'2015-05-06 18:52:25','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vv@gmail.com','vv@gmail.com','user','Admin'),(36,'2015-05-06 18:53:28','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vv@gmail.com','vv@gmail.com','Admin','Admin'),(37,'2015-05-06 18:54:38','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vv@gmail.com','vv@gmail.com','Admin','Admin'),(38,'2015-05-10 17:55:55','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vv@gmail.com','vicent.albo@gmail.com','Admin','Admin'),(39,'2015-05-10 18:14:46','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vicent.albo@gmail.com','vicent.albo@gmail.com','Admin','Admin'),(40,'2015-05-10 18:21:20','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vicent.albo@gmail.com','vicent.albo@gmail.com','Admin','Admin'),(41,'2015-05-10 18:22:08','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vicent.albo@gmail.com','vicent.albo@gmail.com','Admin','Admin'),(42,'2015-05-10 18:25:36','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vicent.albo@gmail.com','vicent.albo@gmail.com','Admin','Admin'),(43,'2015-05-10 18:27:02','root@localhost','48607270J','Vicent','Vicent','659032587','659032587','12/4/1990','12/4/1990','12/4/2015','12/4/2015','vicent.albo@gmail.com','vicent.albo@gmail.com','Admin','Admin'),(44,'2015-05-10 18:35:17','root@localhost','41424344M','Santiago','Santiago','659000325','659000325','11/2/1975','11/2/1975','20/10/2013','20/10/2013','vinche777@gmail.com','vinche777@gmail.com','user','user'),(45,'2015-05-10 18:35:41','root@localhost','41424344M','Santiago','Santiago','659000325','659000325','11/2/1975','11/2/1975','20/10/2013','20/10/2013','vinche777@gmail.com','vinche777@gmail.com','user','user'),(46,'2015-05-10 18:43:25','root@localhost','41424344M','Santiago','Santiago','659000325','659000325','11/2/1975','11/2/1975','20/10/2013','20/10/2013','vinche777@gmail.com','vinche777@gmail.com','user','user');
/*!40000 ALTER TABLE `logempleado_cambio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logempleado_delete`
--

DROP TABLE IF EXISTS `logempleado_delete`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logempleado_delete` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `DNI` varchar(9) NOT NULL,
  `oldNombre` varchar(45) DEFAULT NULL,
  `nuevoNombre` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logempleado_delete`
--

LOCK TABLES `logempleado_delete` WRITE;
/*!40000 ALTER TABLE `logempleado_delete` DISABLE KEYS */;
INSERT INTO `logempleado_delete` VALUES (1,'2015-04-23 19:37:15','root@localhost','48785263A','Test2',NULL),(2,'2015-04-29 17:36:42','root@localhost','45484548M','Yolanda',NULL),(3,'2015-04-29 17:44:19','root@localhost','48525252A','Yolandaqq',NULL);
/*!40000 ALTER TABLE `logempleado_delete` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `logempleados`
--

DROP TABLE IF EXISTS `logempleados`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `logempleados` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `fecha` datetime NOT NULL,
  `usuario` varchar(45) NOT NULL,
  `DNI` varchar(9) NOT NULL,
  `oldNombre` varchar(45) DEFAULT 'null',
  `nuevoNombre` varchar(45) DEFAULT 'null',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `logempleados`
--

LOCK TABLES `logempleados` WRITE;
/*!40000 ALTER TABLE `logempleados` DISABLE KEYS */;
INSERT INTO `logempleados` VALUES (1,'2015-04-23 19:15:39','root@localhost','48785263A',NULL,'Test'),(2,'2015-04-29 17:35:26','root@localhost','45484548M',NULL,'Yolanda'),(3,'2015-04-29 17:37:33','root@localhost','48525252A',NULL,'Yolanda'),(4,'2015-04-29 17:45:02','root@localhost','44445522M',NULL,'Yolanda'),(5,'2015-05-04 21:02:30','root@localhost','11122211P',NULL,'Prova'),(6,'2015-05-05 17:42:34','root@localhost','44558899P',NULL,'ProvaAa'),(7,'2015-05-10 18:32:47','root@localhost','41424344M',NULL,'Santiago');
/*!40000 ALTER TABLE `logempleados` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'gvbbdd'
--
/*!50003 DROP PROCEDURE IF EXISTS `calcular_mediaEdad` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `calcular_mediaEdad`(OUT media float)
BEGIN
SELECT AVG(edad) into media FROM empleados;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `Usuarios_Activos` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `Usuarios_Activos`(OUT num Int)
BEGIN
SELECT SUM(estado) into num FROM empleados WHERE estado=1;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-05-10 18:52:53
