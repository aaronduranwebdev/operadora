CREATE DATABASE  IF NOT EXISTS `operadora` /*!40100 DEFAULT CHARACTER SET utf8mb3 */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `operadora`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: operadora
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Table structure for table `t_clientes`
--

DROP TABLE IF EXISTS `t_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_clientes` (
  `dni` char(9) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `apellido1` varchar(45) DEFAULT NULL,
  `apellido2` varchar(45) DEFAULT NULL,
  `domicilio` varchar(45) DEFAULT NULL,
  `localidad` varchar(45) DEFAULT NULL,
  `provincia` varchar(3) DEFAULT NULL,
  `nacionalidad` char(2) DEFAULT NULL,
  PRIMARY KEY (`dni`),
  FULLTEXT KEY `idx_nombre_apellidos` (`nombre`,`apellido1`,`apellido2`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3 COMMENT='									';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_clientes`
--

LOCK TABLES `t_clientes` WRITE;
/*!40000 ALTER TABLE `t_clientes` DISABLE KEYS */;
INSERT INTO `t_clientes` VALUES ('07185140D','Javier','Mosquera','Regueiro','Vigo','Vigo','PO','ES'),('21242115M','Raúl','Rivas','Melón','Vigo','Vigo','PO','ES'),('31203797L','Francisco','Fernández','Martínez','Vigo','Vigo','PO','ES'),('32705281V','Rubén','Freiría','Iglesias','Vigo','Vigo','PO','ES'),('34824956N','Aarón','Durán','Novas','Vigo','Vigo','PO','ES'),('40281004T','Gabriel','González','Berges','Vigo','Vigo','PO','ES'),('45008413N','Alejandro','Fonterosa','Martínez','Vigo','Vigo','PO','ES'),('54996582V','Germán','Vaquero','Diego','Vigo','Vigo','PO','ES'),('55706824L','Mario','González','Amoedo','Vigo','Vigo','PO','ES'),('56831917K','Ciro','Sanjorge','Corrales','Vigo','Vigo','PO','ES'),('59630628T','Ander','Fernández','Pazos','Vigo','Vigo','PO','ES'),('64859386F','Gabriel','Rostron','Martínez','Vigo','Vigo','PO','ES'),('65576326Z','Iago','Pena','Lorenzo','Vigo','Vigo','PO','ES'),('75580371W','Víctor','Romero','González','Vigo','Vigo','PO','ES'),('78231349T','Mario','Ubeira','González','Vigo','Vigo','PO','ES'),('78778496T','David','García','Blanco','Vigo','Vigo','PO','ES'),('80598474B','Nicolás','Rodríguez','Rodríguez','Vigo','Vigo','PO','ES'),('91246021F','Andrés','Pereira','Lago','Vigo','Vigo','PO','ES'),('91288565R','Brigitte María','Macías','Padilha','Vigo','Vigo','PO','ES'),('91738289Y','Miguel','Giráldez','Varela','Vigo','Vigo','PO','ES'),('92226519S','Rodrigo','López','Blanco','Vigo','Vigo','PO','ES'),('93932038S','Rebeca','Noya','Fernández','Vigo','Vigo','PO','ES'),('96913983X','Lois','Iñarrea','Martínez','Vigo','Vigo','PO','ES'),('96986000Z','Anxo','Vilas','Miranda','Vigo','Vigo','PO','ES');
/*!40000 ALTER TABLE `t_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_clientes_telefonos`
--

DROP TABLE IF EXISTS `t_clientes_telefonos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_clientes_telefonos` (
  `cliente` int unsigned NOT NULL,
  `telefono` int unsigned NOT NULL,
  PRIMARY KEY (`cliente`,`telefono`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_clientes_telefonos`
--

LOCK TABLES `t_clientes_telefonos` WRITE;
/*!40000 ALTER TABLE `t_clientes_telefonos` DISABLE KEYS */;
/*!40000 ALTER TABLE `t_clientes_telefonos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_contratos`
--

DROP TABLE IF EXISTS `t_contratos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_contratos` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `cliente` char(9) NOT NULL,
  `iban` varchar(24) NOT NULL,
  `fijo` tinyint DEFAULT NULL,
  `precioFijo` double DEFAULT NULL,
  `internet` tinyint DEFAULT NULL,
  `precioInternet` double DEFAULT NULL,
  `movil` tinyint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_contrato_cliente_idx` (`cliente`),
  CONSTRAINT `fk_contrato_cliente` FOREIGN KEY (`cliente`) REFERENCES `t_clientes` (`dni`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=53 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_contratos`
--

LOCK TABLES `t_contratos` WRITE;
/*!40000 ALTER TABLE `t_contratos` DISABLE KEYS */;
INSERT INTO `t_contratos` VALUES (1,'34824956N','ES1234567890123456789012',1,5.99,1,10.99,1),(2,'65576326Z','ES1234567890123456789012',1,6.99,0,5.99,0),(4,'34824956N','ES1234567890123456789012',0,5.99,1,12.9,0),(5,'65576326Z','ES1234567890123456789012',0,5.99,1,15.99,0),(6,'34824956N','ES1234567890123456789012',1,15.99,1,15.99,0),(52,'34824956N','ES1242353453453453453453',1,4.99,1,4.99,1);
/*!40000 ALTER TABLE `t_contratos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `t_lineasmoviles`
--

DROP TABLE IF EXISTS `t_lineasmoviles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `t_lineasmoviles` (
  `id` int unsigned NOT NULL AUTO_INCREMENT,
  `contrato` int unsigned NOT NULL,
  `numTelefono` varchar(12) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `numTelefono_UNIQUE` (`numTelefono`),
  KEY `fk_movil_contrato_idx` (`contrato`),
  CONSTRAINT `fk_movil_contrato` FOREIGN KEY (`contrato`) REFERENCES `t_contratos` (`id`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `t_lineasmoviles`
--

LOCK TABLES `t_lineasmoviles` WRITE;
/*!40000 ALTER TABLE `t_lineasmoviles` DISABLE KEYS */;
INSERT INTO `t_lineasmoviles` VALUES (24,52,'691237140',9.99);
/*!40000 ALTER TABLE `t_lineasmoviles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'operadora'
--

--
-- Dumping routines for database 'operadora'
--
/*!50003 DROP FUNCTION IF EXISTS `verCantidadClientes` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` FUNCTION `verCantidadClientes`() RETURNS int
    READS SQL DATA
BEGIN
	DECLARE cantidadClientes INTEGER;
	SELECT
    COUNT(*) INTO cantidadClientes
    FROM t_clientes;
    RETURN cantidadClientes;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertarCliente` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarCliente`(IN dniCliente CHAR(9), IN nombre VARCHAR(45) , IN apellido1 VARCHAR(45) , IN apellido2 VARCHAR(45),
	IN domicilio VARCHAR(45), IN localidad VARCHAR(45), IN provincia VARCHAR(3),
    IN nacionalidad CHAR(2), OUT OK INTEGER, OUT dni CHAR(9), OUT mensaje VARCHAR(128))
    MODIFIES SQL DATA
BEGIN
	DECLARE EXIT HANDLER FOR 1062
    BEGIN
		SET mensaje = CONCAT('Error, ya existe el cliente con DNI: ', dniCliente);
        SET OK = 0;
    END;
	DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
		SET mensaje = CONCAT('Error al insertar el cliente con el DNI: ', dniCliente);
        SET OK = 0;
    END;
    SET OK = 1;
	INSERT INTO t_clientes (dni, nombre, apellido1, apellido2, domicilio, localidad, provincia, nacionalidad)
    VALUES (dniCliente, nombre, apellido1, apellido2, domicilio, localidad, provincia, nacionalidad);
    SET dni = dniCliente;
    SET mensaje = CONCAT('Se ha introducido el cliente con DNI ', dniCliente);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertarContrato` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarContrato`(IN dniCliente CHAR(9), IN iban VARCHAR(24), IN fijo TINYINT, IN precioFijo DOUBLE, IN internet TINYINT, 
	IN precioInternet DOUBLE, IN movil TINYINT, OUT OK INTEGER, OUT idContrato INT UNSIGNED, OUT mensaje VARCHAR(128))
    MODIFIES SQL DATA
BEGIN
	DECLARE EXIT HANDLER FOR 1452
    BEGIN
		SET mensaje = CONCAT('Error, no existe un cliente con DNI ', dniCliente);
        SET OK = 0;
	END;
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
		SET mensaje = CONCAT('Error al insertar el contrato para el cliente: ', dniCliente);
        SET OK = 0;
    END;
    SET OK = 1;
    INSERT INTO t_contratos (cliente, iban, fijo, precioFijo, internet, precioInternet, movil)
    VALUES (dniCliente, iban, fijo, precioFijo, internet, precioInternet, movil);
    SET idContrato = (SELECT LAST_INSERT_ID());
    SET mensaje = CONCAT('Se ha introducido el contrato ', idContrato, ' para el cliente con DNI ', dniCliente);
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!50003 DROP PROCEDURE IF EXISTS `insertarLineaMovil` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8mb4 */ ;
/*!50003 SET character_set_results = utf8mb4 */ ;
/*!50003 SET collation_connection  = utf8mb4_0900_ai_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = 'STRICT_TRANS_TABLES,NO_ENGINE_SUBSTITUTION' */ ;
DELIMITER ;;
CREATE DEFINER=`root`@`localhost` PROCEDURE `insertarLineaMovil`(IN idContrato INT UNSIGNED, IN numTelefono VARCHAR(12), IN precio DOUBLE, 
	OUT OK INTEGER, OUT idLineaMovil INT UNSIGNED, OUT mensaje VARCHAR(128))
    MODIFIES SQL DATA
BEGIN
	DECLARE EXIT HANDLER FOR 1452
    BEGIN
		SET mensaje = CONCAT('Error, no existe un contrato con ID ', idContrato);
        SET OK = 0;
    END;
    DECLARE EXIT HANDLER FOR SQLEXCEPTION
    BEGIN
		SET mensaje = CONCAT('Error al insertar la línea móvil para el contrato: ', idContrato);
        SET OK = 0;
    END;
    SET OK = 1;
    INSERT INTO t_lineasmoviles (contrato, numTelefono, precio)
    VALUES (idContrato, numTelefono, precio);
    SET idLineaMovil = (SELECT LAST_INSERT_ID());
    SET mensaje = CONCAT('Se ha introducido la línea móvil ', idLineaMovil, ' para el contrato ', idContrato);
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

-- Dump completed on 2022-05-25 18:02:12
