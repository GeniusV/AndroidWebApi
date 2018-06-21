-- MySQL dump 10.13  Distrib 5.7.19, for macos10.12 (x86_64)
--
-- Host: 127.0.0.1    Database: android_api
-- ------------------------------------------------------
-- Server version	5.7.19

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
-- Table structure for table `claxx`
--

DROP TABLE IF EXISTS `claxx`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `claxx` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `major_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_kk5xteyrgrf6h322kv87tb9lg` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `claxx`
--

LOCK TABLES `claxx` WRITE;
/*!40000 ALTER TABLE `claxx` DISABLE KEYS */;
INSERT INTO `claxx` VALUES (1,'15级1班',1),(2,'15级2班',1);
/*!40000 ALTER TABLE `claxx` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `collage`
--

DROP TABLE IF EXISTS `collage`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `collage` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_b25g0hulm6orhq4wmj529f2x` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `collage`
--

LOCK TABLES `collage` WRITE;
/*!40000 ALTER TABLE `collage` DISABLE KEYS */;
INSERT INTO `collage` VALUES (1,'信息技术学院');
/*!40000 ALTER TABLE `collage` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `course`
--

DROP TABLE IF EXISTS `course`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `course` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `collage_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_4xqvdpkafb91tt3hsb67ga3fj` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `course`
--

LOCK TABLES `course` WRITE;
/*!40000 ALTER TABLE `course` DISABLE KEYS */;
INSERT INTO `course` VALUES (1,'移动应用开发',1);
/*!40000 ALTER TABLE `course` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hibernate_sequence`
--

DROP TABLE IF EXISTS `hibernate_sequence`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hibernate_sequence`
--

LOCK TABLES `hibernate_sequence` WRITE;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` VALUES (100),(100),(100),(100),(100),(100),(100),(100);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `major`
--

DROP TABLE IF EXISTS `major`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `major` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `collage_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_oi0ctjbjvktdcfxws9w2exiwb` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `major`
--

LOCK TABLES `major` WRITE;
/*!40000 ALTER TABLE `major` DISABLE KEYS */;
INSERT INTO `major` VALUES (1,'软件工程',1);
/*!40000 ALTER TABLE `major` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `score`
--

DROP TABLE IF EXISTS `score`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `score` (
  `id` bigint(20) NOT NULL,
  `value` int(11) DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL,
  `student_id` bigint(20) DEFAULT NULL,
  `term_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `score`
--

LOCK TABLES `score` WRITE;
/*!40000 ALTER TABLE `score` DISABLE KEYS */;
INSERT INTO `score` VALUES (1,0,1,1,1),(2,20,1,2,1),(3,23,1,3,1),(4,50,1,4,1),(5,14,1,5,1),(6,23,1,6,1),(7,26,1,7,1),(8,33,1,8,1),(9,88,1,9,1),(10,59,1,10,1),(11,99,1,11,1),(12,42,1,12,1),(13,49,1,13,1),(14,48,1,14,1),(15,96,1,15,1),(16,59,1,16,1),(17,74,1,17,1),(18,14,1,18,1),(19,74,1,19,1),(20,67,1,20,1),(21,55,1,21,1),(22,69,1,22,1),(23,28,1,23,1),(24,36,1,24,1),(25,100,1,25,1),(26,1,1,26,1),(27,8,1,27,1),(28,84,1,28,1),(29,15,1,29,1),(30,40,1,30,1),(31,49,1,31,1),(32,6,1,32,1),(33,65,1,33,1),(34,68,1,34,1),(35,43,1,35,1),(36,20,1,36,1),(37,61,1,37,1),(38,12,1,38,1),(39,96,1,39,1),(40,7,1,40,1),(41,27,1,41,1),(42,20,1,42,1),(43,58,1,43,1),(44,0,1,44,1),(45,42,1,45,1),(46,72,1,46,1),(47,21,1,47,1),(48,24,1,48,1),(49,83,1,49,1),(50,100,1,50,1),(51,74,1,51,1),(52,55,1,52,1),(53,100,1,53,1),(54,92,1,54,1),(55,13,1,55,1),(56,58,1,56,1),(57,63,1,57,1),(58,57,1,58,1),(59,0,1,59,1),(60,63,1,60,1),(61,53,1,61,1),(62,58,1,62,1),(63,45,1,63,1),(64,16,1,64,1),(65,20,1,65,1),(66,56,1,66,1),(67,83,1,67,1),(68,28,1,68,1),(69,53,1,69,1),(70,17,1,70,1),(71,90,1,71,1),(72,31,1,72,1),(73,38,1,73,1),(74,58,1,74,1),(75,61,1,75,1),(76,54,1,76,1),(77,27,1,77,1),(78,81,1,78,1),(79,10,1,79,1),(80,20,1,80,1),(81,11,1,81,1),(82,26,1,82,1),(83,21,1,83,1),(84,80,1,84,1),(85,43,1,85,1),(86,38,1,86,1),(87,12,1,87,1),(88,12,1,88,1),(89,76,1,89,1),(90,54,1,90,1),(91,61,1,91,1),(92,49,1,92,1),(93,52,1,93,1),(94,65,1,94,1),(95,67,1,95,1),(96,15,1,96,1),(97,75,1,97,1),(98,71,1,98,1),(99,5,1,99,1),(100,73,1,100,1);
/*!40000 ALTER TABLE `score` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `claxx_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_7pb8owoegbhhcrpopw4o1ykcr` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (1,'茹冰海','123456',1),(2,'向锦恺','123456',1),(3,'单冬易','123456',1),(4,'国幻梅','123456',1),(5,'瞿梦蕊','123456',1),(6,'平香之','123456',1),(7,'郑幻梅','123456',1),(8,'姚雨灵','123456',1),(9,'宫沛凝','123456',1),(10,'顾山蝶','123456',1),(11,'温均严','123456',1),(12,'冀少戈','123456',1),(13,'敖语蝶','123456',1),(14,'隋丹彤','123456',1),(15,'谭代芙','123456',1),(16,'鲍金霞','123456',1),(17,'邵亦玉','123456',1),(18,'揭俊源','123456',1),(19,'柯冬萱','123456',1),(20,'于楚娟','123456',1),(21,'普夏山','123456',1),(22,'余安青','123456',1),(23,'鞠好渔','123456',1),(24,'冯凝安','123456',1),(25,'叶冬萱','123456',1),(26,'宾向露','123456',1),(27,'车念梦','123456',1),(28,'戈峻松','123456',1),(29,'劳元槐','123456',1),(30,'关锦楷','123456',1),(31,'尚幼菱','123456',1),(32,'郝盼晴','123456',1),(33,'昝夏山','123456',1),(34,'向依玉','123456',1),(35,'牟盼晴','123456',1),(36,'费亦巧','123456',1),(37,'吴俞乐','123456',1),(38,'朴依霜','123456',1),(39,'伊玉琴','123456',1),(40,'植曼卉','123456',1),(41,'朱科峰','123456',1),(42,'祁安春','123456',1),(43,'陆绮波','123456',1),(44,'孔碧春','123456',1),(45,'柯盼旋','123456',1),(46,'鄢盼芙','123456',1),(47,'阚小之','123456',1),(48,'萧念之','123456',1),(49,'原文俊','123456',1),(50,'卫谷梦','123456',1),(51,'汪可儿','123456',2),(52,'傅健雅','123456',2),(53,'仝弈欣','123456',2),(54,'兰婧怡','123456',2),(55,'杭海之','123456',2),(56,'欧阳妙梦','123456',2),(57,'阴傲菡','123456',2),(58,'敖照东','123456',2),(59,'查晓筠','123456',2),(60,'伍曼卉','123456',2),(61,'娄柔廷','123456',2),(62,'焦安莲','123456',2),(63,'桑智虎','123456',2),(64,'滕迎荷','123456',2),(65,'满亦凝','123456',2),(66,'潘亦玉','123456',2),(67,'鞠海之','123456',2),(68,'余冰香','123456',2),(69,'游诗筠','123456',2),(70,'彭俊源','123456',2),(71,'耿嘉韵','123456',2),(72,'井冬莲','123456',2),(73,'甄东周','123456',2),(74,'扈觅松','123456',2),(75,'邹妙梦','123456',2),(76,'祝谷兰','123456',2),(77,'费乐斌','123456',2),(78,'房剑锋','123456',2),(79,'班思希','123456',2),(80,'穆春柔','123456',2),(81,'吕傲霜','123456',2),(82,'时香巧','123456',2),(83,'唐问春','123456',2),(84,'封汉熙','123456',2),(85,'巫水彤','123456',2),(86,'安家乐','123456',2),(87,'逯乐蓉','123456',2),(88,'漆金美','123456',2),(89,'赫飞兰','123456',2),(90,'狄南蓉','123456',2),(91,'浦含桃','123456',2),(92,'芦婧怡','123456',2),(93,'伍敬旭','123456',2),(94,'那桐汉','123456',2),(95,'尧含巧','123456',2),(96,'沈睿明','123456',2),(97,'龙钦渔','123456',2),(98,'裴痴梅','123456',2),(99,'邝飞兰','123456',2),(100,'荣千亦','123456',2);
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `teacher` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_5syf9tb34xn2g3cmjekoybhet` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `teacher`
--

LOCK TABLES `teacher` WRITE;
/*!40000 ALTER TABLE `teacher` DISABLE KEYS */;
INSERT INTO `teacher` VALUES (1,'Sir','123456');
/*!40000 ALTER TABLE `teacher` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `term`
--

DROP TABLE IF EXISTS `term`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `term` (
  `id` bigint(20) NOT NULL,
  `value` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_mlbmwd3fhivrjpwdejm5c1t5p` (`value`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `term`
--

LOCK TABLES `term` WRITE;
/*!40000 ALTER TABLE `term` DISABLE KEYS */;
INSERT INTO `term` VALUES (1,'2018年第二学期');
/*!40000 ALTER TABLE `term` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-06-10 15:36:19
