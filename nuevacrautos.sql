-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: crautos
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `carros`
--

DROP TABLE IF EXISTS `carros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carros` (
  `carro_id` int NOT NULL AUTO_INCREMENT,
  `modelo` varchar(30) NOT NULL,
  `cilindraje` int NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `costo` int NOT NULL,
  `color` varchar(30) NOT NULL,
  `sistema_de_frenos` varchar(25) NOT NULL,
  `cantidad_puertas` varchar(25) NOT NULL,
  `transmision` varchar(25) NOT NULL,
  `categoria` varchar(25) NOT NULL,
  `cantidad_de_pasajeros` varchar(25) NOT NULL,
  `usuario_carro_id` int NOT NULL,
  `usuario_id` bigint NOT NULL,
  `apellido` varchar(255) DEFAULT NULL,
  `correo_eletronico` varchar(255) DEFAULT NULL,
  `edad` varchar(255) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `telefono` varchar(255) DEFAULT NULL,
  `tipo_usuario` bigint DEFAULT NULL,
  `imgpath` varchar(255) DEFAULT NULL,
  `c_uid` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`carro_id`,`usuario_carro_id`),
  KEY `fk_carros_usuarios_idx` (`usuario_carro_id`),
  CONSTRAINT `fk_carros_usuarios_idx` FOREIGN KEY (`usuario_carro_id`) REFERENCES `usuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carros`
--

LOCK TABLES `carros` WRITE;
/*!40000 ALTER TABLE `carros` DISABLE KEYS */;
INSERT INTO `carros` VALUES (1,'Bmw',1800,'gas',67000,'morado','automatico','puertas 2','manual','particular','2 pasajeros',9,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/bmw.jpg',NULL),(2,'Toyota',2500,'gasolina',56000,'azul','manual','puertas 2','manual','todoterreno','4 pasajeros',10,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/toyota.jpg',NULL),(3,'Honda',1200,'gas',45000,'rojo','manual','puertas 3','manual','particular','4 pasajeros',11,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/honda.jpg',NULL),(4,'Nissan',3500,'electrica',30000,'naranja','manual','puertas 4','automatico','coupe','4 pasajeros',3,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/nissan.jpg',NULL),(5,'Suzuki',1500,'bio',25000,'blanco','manual','puertas 4','manual','sedan','4 pasajeros',4,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/suzuki.jpg',NULL),(6,'Ford',6000,'gasolina',80000,'verde','manual','puertas 2','automatico','particular','2 pasajeros',5,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/ford.jpg',NULL),(7,'Renauld',4500,'gas',32000,'negro','automatico','puertas 6','manual','sedan','4 pasajeros',6,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/renault.jpg',NULL),(8,'mini',2000,'electrica',16000,'plateado','automatico','puertas 4','automatico','particular','2 pasajeros',7,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/mini.jpg',NULL),(9,'Land Rover',3000,'gas',19000,'rojovino','manual','puertas 2','automatico','sedan','4 pasajeros',8,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/landrover.jpg',NULL),(10,'Volvo',2300,'bio',28000,'crema','manual','puertas 4','manual','coupe','3 pasajeros',9,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/volvo.jpg',NULL),(11,'Subaru',3000,'gasolina',45000,'celeste','manual','puertas 4','manual','coupe','5 pasajeros',10,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/subaru.jpg',NULL),(12,'Citroën',1700,'solar',15000,'negromate','manual','puertas 2','automatico','convertible','8 pasajeros',11,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/citroen.jpg',NULL),(13,'Volkswagen',2600,'electrica',30000,'rosado','manual','puertas 2','manual','particular','6 pasajeros',3,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/volkswagen.jpg',NULL),(14,'Byd',2000,'gas',23000,'amarillo','manual','puertas 4','automatico','sedan','4 pasajeros',4,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/byd.jpg',NULL),(15,'hyundai',1200,'gasolina',20000,'gris','manual','puertas 4','manual','convertible','3 pasajeros',5,0,NULL,NULL,NULL,NULL,NULL,NULL,'images/hyundai.jpg',NULL);
/*!40000 ALTER TABLE `carros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comentarios`
--

DROP TABLE IF EXISTS `comentarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comentarios` (
  `comentarios_id` int NOT NULL AUTO_INCREMENT,
  `fecha_comentario` date NOT NULL,
  `nombre_comentario` varchar(30) NOT NULL,
  `cuerpo_comentario` varchar(250) NOT NULL,
  `usuario_comentarios_id` int NOT NULL,
  PRIMARY KEY (`comentarios_id`,`usuario_comentarios_id`),
  KEY `fk_comentarios_usuarios_idx` (`usuario_comentarios_id`),
  CONSTRAINT `fk_comentarios_usuarios_idx` FOREIGN KEY (`usuario_comentarios_id`) REFERENCES `usuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comentarios`
--

LOCK TABLES `comentarios` WRITE;
/*!40000 ALTER TABLE `comentarios` DISABLE KEYS */;
INSERT INTO `comentarios` VALUES (1,'2023-05-12','Pagina','La pagina es facil de usar',3),(2,'2022-05-12','Compra','Hice una compra y estoy satisfecho',4),(3,'2023-06-22','Recomendacion','Recomiendo el uso de la pagina',5),(4,'2023-08-25','Soporte','El servicio al cliente es excelente',6),(5,'2023-05-19','Precios','Los precios de las motos estan muy elevados',7);
/*!40000 ALTER TABLE `comentarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dinero`
--

DROP TABLE IF EXISTS `dinero`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dinero` (
  `dinero_id` int NOT NULL AUTO_INCREMENT,
  `dinero_usuario_id` int NOT NULL,
  `dinero` int NOT NULL,
  `dineroacumulado` int DEFAULT NULL,
  PRIMARY KEY (`dinero_id`,`dinero_usuario_id`),
  KEY `fk_dinero_usuarios_idx` (`dinero_usuario_id`),
  CONSTRAINT `fk_dinero_usuarios_idx` FOREIGN KEY (`dinero_usuario_id`) REFERENCES `usuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dinero`
--

LOCK TABLES `dinero` WRITE;
/*!40000 ALTER TABLE `dinero` DISABLE KEYS */;
/*!40000 ALTER TABLE `dinero` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `motos`
--

DROP TABLE IF EXISTS `motos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `motos` (
  `moto_id` int NOT NULL AUTO_INCREMENT,
  `modelo` varchar(11) NOT NULL,
  `cilindraje` int NOT NULL,
  `color` varchar(30) NOT NULL,
  `tipo` varchar(25) NOT NULL,
  `transmision` varchar(40) NOT NULL,
  `costo` int NOT NULL,
  `usuario_moto_id` int NOT NULL,
  `imgpath` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`moto_id`,`usuario_moto_id`),
  KEY `fk_motos_usuarios_idx` (`usuario_moto_id`),
  CONSTRAINT `fk_motos_usuarios_idx` FOREIGN KEY (`usuario_moto_id`) REFERENCES `usuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `motos`
--

LOCK TABLES `motos` WRITE;
/*!40000 ALTER TABLE `motos` DISABLE KEYS */;
INSERT INTO `motos` VALUES (1,'BMW',500,'verde','gas','manual',18000,3,'images/bmwmoto.jpg'),(2,'Yamaha',250,'rojo','gasolina','manual',150001,4,'images/yamahamoto.jpg'),(3,'Honda',400,'naraja','gas','automatico',20000,5,'images/hondamoto.jpg'),(4,'Freedom',150,'azul','electrica','manual',10000,6,'images/freedommoto.jpg'),(5,'Kawazaki',1200,'morado','bio','automatico',25000,7,'images/kawasakimoto.jpeg'),(6,'KTM',1050,'rosado','gasolina','manual',12000,8,'images/ktmmoto.jpg');
/*!40000 ALTER TABLE `motos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `noticias`
--

DROP TABLE IF EXISTS `noticias`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `noticias` (
  `noticia_id` int NOT NULL AUTO_INCREMENT,
  `fecha_noticia` date NOT NULL,
  `nombre_noticia` varchar(30) NOT NULL,
  `cuerpo_noticia` varchar(250) NOT NULL,
  `usuario_noticias_id` int NOT NULL,
  PRIMARY KEY (`noticia_id`,`usuario_noticias_id`),
  KEY `fk_noticias_usuarios_idx` (`usuario_noticias_id`),
  CONSTRAINT `fk_noticias_usuarios_idx` FOREIGN KEY (`usuario_noticias_id`) REFERENCES `usuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `noticias`
--

LOCK TABLES `noticias` WRITE;
/*!40000 ALTER TABLE `noticias` DISABLE KEYS */;
INSERT INTO `noticias` VALUES (1,'2023-05-12','resistencia','los nuevos vehiculos incluyen mejores materiales',1),(2,'2023-06-13','motor','las motos mas nuevas tienen menor cilindraje pero dan mejor rendimiento',1),(3,'2023-07-14','carroceria','se esta implementando una nueva aleacion para las carrocerias',2),(4,'2023-08-15','productos','proximamente se estara vendiendo mercaderia de crautos',2),(5,'2023-09-16','general','la aplicacion estara en mantenimiento durante esta fecha',1),(6,'2023-10-17','vehiculos','nuevos vehiculos todos los dias',2);
/*!40000 ALTER TABLE `noticias` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `review`
--

DROP TABLE IF EXISTS `review`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `review` (
  `review_id` int NOT NULL AUTO_INCREMENT,
  `tipo_review` varchar(50) NOT NULL,
  `fecha_review` date NOT NULL,
  `nombre_de_review` varchar(5000) DEFAULT NULL,
  `usuario_review_id` int NOT NULL,
  `author` varchar(255) DEFAULT NULL,
  `content` text,
  `created_at` datetime(6) DEFAULT NULL,
  `rating` int DEFAULT NULL,
  `carro_id` bigint DEFAULT NULL,
  PRIMARY KEY (`review_id`,`usuario_review_id`),
  KEY `fk_review_usuarios_idx` (`usuario_review_id`),
  CONSTRAINT `fk_review_usuarios_idx` FOREIGN KEY (`usuario_review_id`) REFERENCES `usuario` (`usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `review`
--

LOCK TABLES `review` WRITE;
/*!40000 ALTER TABLE `review` DISABLE KEYS */;
INSERT INTO `review` VALUES (1,'BMW M5','2023-05-12','El BMW M5 dispone, además del sistema M xDrive, orientado a la máxima tracción y dinamismo, de una suspensión que satisface cualquier exigencia de confort deportivo en los trayectos largos. En combinación con el potente motor M de 8 cilindros de 441 kW (600 CV), se genera un dinamismo marcado por la fuerza y la agilidad.',8,NULL,NULL,NULL,NULL,NULL),(2,'Ram Limited Tungsten','2023-08-02','Las características estándar incluyen una suspensión neumática, volante con calefacción, asientos delanteros con calefacción y ventilación, y un sistema de infotainment Uconnect con una pantalla táctil de 8.4 pulgadas, compatibloe tanto con Apple CarPlay como con Android Auto.',9,NULL,NULL,NULL,NULL,NULL),(3,'Suzuki Hayabusa','2023-12-22','Concretando las características de esta moto, decirte que tiene una cilindrada de 1340.00 cc y una potencia total de 197.00 cv (143.8 kw) a 9500 rpm en un motor de cuatro cilindros en línea, 4 tiempos con arranque arranque eléctrico. Sin más, tienes aquí los detalles y ficha técnica de esta genial moto FICHA TÉCNICA SUZUKI HAYABUSA 2018',10,NULL,NULL,NULL,NULL,NULL),(4,'Audi R8','2023-05-05','El Audi R8 2023 cuenta con un enorme motor V-10 montado detrás de su cabina de alta tecnología. Comparte motor y mecánica con el estridente Lamborghini Huracán, pero la personalidad más dócil y el aspecto del R8 hacen una declaración más sutil.',11,NULL,NULL,NULL,NULL,NULL),(5,'Toyota Corolla','2023-02-11','El Corolla se ha ganado una reputación de confiabilidad y durabilidad, y ha sido un popular vehículo para aquellos que buscan un automóvil práctico y económico. A lo largo de los años, el Corolla ha evolucionado para ofrecer tecnología y características de seguridad avanzadas, pero ha mantenido su reputación como un vehículo confiable y accesible.',3,NULL,NULL,NULL,NULL,NULL),(6,'Ford Mustang','2023-01-20','El Mustang se ha destacado por su diseño musculoso y agresivo, su rendimiento deportivo y su facilidad de personalización. Ha sido producido en una variedad de modelos y ediciones especiales, desde el clásico Mustang Fastback hasta el moderno Mustang GT. El Mustang ha sido un símbolo de la cultura automotriz estadounidense y ha sido destacado en películas, programas de televisión y canciones populares.',4,NULL,NULL,NULL,NULL,NULL),(7,'Tesla Model S','2023-05-12','El Model S tiene una impresionante autonomía de batería, que permite viajes largos sin necesidad de recargar, y puede acelerar de 0 a 100 km/h en cuestión de segundos, lo que lo convierte en un automóvil deportivo muy rápido. También cuenta con una gran pantalla táctil central que controla muchas de las funciones del vehículo, y está equipado con tecnología de conducción autónoma avanzada. El Model S ha sido reconocido como uno de los automóviles más innovadores y avanzados del mercado actual.',5,NULL,NULL,NULL,NULL,NULL),(8,'Volkswagen Golf','2023-05-16','El Volkswagen Golf es un automóvil compacto fabricado por el fabricante alemán de automóviles Volkswagen. Fue introducido por primera vez en 1974 y ha sido uno de los modelos más vendidos de Volkswagen. El Golf se ha destacado por su diseño elegante y deportivo, su rendimiento eficiente y su amplia gama de opciones de motores, que incluyen motores diésel y gasolina, así como motores eléctricos. El Golf ha sido aclamado por su manejo preciso y sensible, su seguridad y su confort de conducción.',6,NULL,NULL,NULL,NULL,NULL),(9,'Jeep Wrangler','2023-04-24','El Jeep Wrangler es un vehículo deportivo utilitario todoterreno fabricado por la marca estadounidense Jeep, propiedad de la compañía Fiat Chrysler Automobiles. El Wrangler se introdujo por primera vez en 1986 y ha sido popular por su capacidad todoterreno y su diseño icónico. El Wrangler es conocido por su capacidad de conducción en todo terreno, con tracción en las cuatro ruedas, una suspensión resistente y una carrocería resistente. También se ha destacado por su capacidad de personalización, con una amplia variedad de opciones de accesorios disponibles para los entusiastas de los deportes todo terreno. El Wrangler está disponible en una variedad de modelos y ediciones especiales, incluyendo versiones de techo duro y suave, y ha sido utilizado tanto como un vehículo de uso diario como para actividades al aire libre.',7,NULL,NULL,NULL,NULL,NULL),(10,'Audi A4','2023-06-19','El Audi A4 es un automóvil compacto de lujo fabricado por el fabricante alemán de automóviles Audi. Fue introducido por primera vez en 1994 y se ha convertido en uno de los modelos más populares de la marca. El A4 se ha destacado por su diseño elegante y deportivo, su tecnología avanzada y su rendimiento eficiente. El A4 está disponible en varias opciones de motor, incluyendo motores a gasolina y diésel, y ofrece una experiencia de conducción deportiva y ágil.',8,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `review` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_usuario` (
  `tipo_usuario_id` int NOT NULL AUTO_INCREMENT,
  `tipo` varchar(50) NOT NULL,
  PRIMARY KEY (`tipo_usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
INSERT INTO `tipo_usuario` VALUES (1,'Empleado'),(2,'Usuario');
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `usuario_id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `edad` varchar(11) NOT NULL,
  `telefono` int NOT NULL,
  `correo_eletronico` varchar(60) NOT NULL,
  `tipo_usuario` int NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `permissions` varchar(255) DEFAULT NULL,
  `roles` varchar(255) DEFAULT NULL,
  `Active` int DEFAULT NULL,
  PRIMARY KEY (`usuario_id`,`tipo_usuario`),
  KEY `fk_usuarios_tipo_usuario_idx` (`tipo_usuario`),
  CONSTRAINT `fk_usuarios_tipo_usuario_idx` FOREIGN KEY (`tipo_usuario`) REFERENCES `tipo_usuario` (`tipo_usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'Carlos','Leon','21',86556430,'CarlosGonzales@hotmail.com',1,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','Admin','Admin',1),(2,'Daniel','Chaves','22',88245693,'Daniel@hotmail.com',1,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','Admin','Admin',1),(3,'Ronald','Gomez','20',22365648,'Ronald@hotmail.com',2,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','User','User',1),(4,'Mathias','Guzman','34',87256933,'Matiasguzman@hotmail.com',2,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','User','User',1),(5,'Roy','Chavarria','45',78569836,'Roy@hotmail.com',2,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','User','User',1),(6,'Alex','Marin','20',89632654,'Alex@hotmail.com',2,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','User','User',1),(7,'Mauricio','Elizondo','23',60364525,'Mauricio@hotmail.com',2,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','User','User',1),(8,'Josue','Espinoza','26',60364525,'Josue@hotmail.com',2,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','User','User',1),(9,'Martin','Castaño','28',70265896,'Martin@hotmail.com',2,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','User','User',1),(10,'Kevin','Umaña','27',65236458,'Kevin@hotmail.com',2,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','User','User',1),(11,'Salin','Gutierrez','22',88576430,'Salin@hotmail.com',2,'prueba@crautos.com','$2a$10$o4pARtqK/KyymM1lfJ.awuriak24N.XoeddPh9vkna8OIB3dEL7Xe','User','User',1);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'crautos'
--

--
-- Dumping routines for database 'crautos'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-19 17:50:49
