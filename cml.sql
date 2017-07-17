/*
Navicat MySQL Data Transfer

Source Server         : mua
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : cml

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-17 14:46:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `contact`
-- ----------------------------
DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `emailType` enum('2','1','0') DEFAULT '0',
  `email` varchar(50) DEFAULT '' COMMENT '联系人邮箱',
  `numberType` enum('3','2','1','0') DEFAULT '0' COMMENT '手机号类型',
  `number` varchar(20) NOT NULL DEFAULT '' COMMENT '联系人手机号',
  `name` varchar(50) NOT NULL DEFAULT '' COMMENT '联系人姓名',
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  UNIQUE KEY `NAME` (`name`),
  UNIQUE KEY `number` (`number`),
  UNIQUE KEY `email` (`email`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contact
-- ----------------------------
INSERT INTO `contact` VALUES ('1', '13122@gmail.com', '0', '18607149219', 'mua', '1');
INSERT INTO `contact` VALUES ('0', 'ly999@gmail.com', '0', '13766894597', 'Dada', '2');
