/*
Navicat MySQL Data Transfer

Source Server         : mua
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : cml

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-07-20 17:01:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `cml_nation`
-- ----------------------------
DROP TABLE IF EXISTS `cml_nation`;
CREATE TABLE `cml_nation` (
  `nation_id` bigint(20) NOT NULL AUTO_INCREMENT,
  `nation_name` varchar(50) NOT NULL COMMENT '国家名称',
  `nation_desc` varchar(250) DEFAULT '' COMMENT '国家图片',
  `nation_pic` varchar(250) DEFAULT NULL COMMENT '国家图片',
  PRIMARY KEY (`nation_id`),
  UNIQUE KEY `nationName` (`nation_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of cml_nation
-- ----------------------------
INSERT INTO `cml_nation` VALUES ('1', '13233', '684654', '151');
INSERT INTO `cml_nation` VALUES ('2', 'china', '1111', '666');
INSERT INTO `cml_nation` VALUES ('4', '中国', '就是人有点', 'https://static.oschina.net/uploads/user/1330/2661831_100.jpg?t=1469412620000');
INSERT INTO `cml_nation` VALUES ('5', '日本', '南京大屠杀', '去屎吧');

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
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contact
-- ----------------------------
INSERT INTO `contact` VALUES ('1', '13122@gmail.com', '0', '18607149219', 'mua', '1');
INSERT INTO `contact` VALUES ('0', 'ly999@gmail.com', '0', '13766894597', 'Dada', '2');

-- ----------------------------
-- Table structure for `hf_member`
-- ----------------------------
DROP TABLE IF EXISTS `hf_member`;
CREATE TABLE `hf_member` (
  `member_id` bigint(20) unsigned NOT NULL COMMENT '会员ID',
  `member_nick` varchar(50) NOT NULL COMMENT '会员昵称',
  `member_desc` varchar(250) DEFAULT '' COMMENT '会员描述',
  `member_level` enum('5','4','3','2','1','0') DEFAULT '0' COMMENT '会员等级',
  `member_sex` enum('-1','1','0') DEFAULT '-1' COMMENT '会员性别',
  `member_phone` varchar(20) NOT NULL COMMENT '会员电话',
  `member_id_card` varchar(20) DEFAULT '' COMMENT '会员身份证信息',
  `member_head_image` varchar(250) DEFAULT '' COMMENT '会员头像',
  `member_create_time` date NOT NULL COMMENT '会员创建时间',
  `member_password` varchar(50) NOT NULL COMMENT '会员密码',
  PRIMARY KEY (`member_id`),
  UNIQUE KEY `member_phone` (`member_phone`),
  UNIQUE KEY `member_id` (`member_id`),
  UNIQUE KEY `member_id_card` (`member_id_card`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of hf_member
-- ----------------------------
INSERT INTO `hf_member` VALUES ('116017', 'archer', null, null, null, '18607149218', null, null, '2017-07-20', '123456');
INSERT INTO `hf_member` VALUES ('140051', '女王', null, null, null, '18725689362', null, null, '2017-07-20', '111111');
INSERT INTO `hf_member` VALUES ('143844', '女王大人', null, null, null, '18725689361', null, null, '2017-07-20', '111111');
INSERT INTO `hf_member` VALUES ('167611', 'archer', null, null, null, '18607149219', null, null, '2017-07-20', '123456');
INSERT INTO `hf_member` VALUES ('170319', 'archer', null, null, null, '18607149216', null, null, '2017-07-20', '123456');
INSERT INTO `hf_member` VALUES ('179649', 'goddess', null, null, null, '18725689363', null, null, '2017-07-20', '111111');
INSERT INTO `hf_member` VALUES ('188231', '666', null, null, null, '18607149217', null, null, '2017-07-20', '123456');
INSERT INTO `hf_member` VALUES ('192099', '鑫爷', null, null, null, '18607149213', null, null, '2017-07-20', '123456');
INSERT INTO `hf_member` VALUES ('194175', 'archer', null, null, null, '18607149215', null, null, '2017-07-20', '123456');
