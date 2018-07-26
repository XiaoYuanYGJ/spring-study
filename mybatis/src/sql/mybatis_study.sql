/*
Navicat MySQL Data Transfer

Source Server         : admin
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : mybatis_study

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2018-07-02 14:54:36
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `et_student`
-- ----------------------------
DROP TABLE IF EXISTS `et_student`;
CREATE TABLE `et_student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(60) DEFAULT NULL,
  `sex` tinyint(4) DEFAULT NULL,
  `student_kz` int(11) DEFAULT NULL,
  `text` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of et_student
-- ----------------------------
INSERT INTO `et_student` VALUES ('1', '张三', '2', '1001', null);
INSERT INTO `et_student` VALUES ('2', '李四', '1', '1002', null);
INSERT INTO `et_student` VALUES ('3', '王五', '2', '1010', '1111');
INSERT INTO `et_student` VALUES ('4', '小明', '1', '1011', '222');
INSERT INTO `et_student` VALUES ('5', '小小', '2', '1012', '333');

-- ----------------------------
-- Table structure for `et_student_cj`
-- ----------------------------
DROP TABLE IF EXISTS `et_student_cj`;
CREATE TABLE `et_student_cj` (
  `cj_id` int(11) NOT NULL AUTO_INCREMENT,
  `student_id` int(11) DEFAULT NULL,
  `kc_id` int(11) DEFAULT NULL,
  `pingfen` decimal(16,2) DEFAULT NULL,
  `text` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`cj_id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of et_student_cj
-- ----------------------------
INSERT INTO `et_student_cj` VALUES ('1', '1', '1', '60.00', '语文');
INSERT INTO `et_student_cj` VALUES ('2', '1', '2', '80.00', '数学');
INSERT INTO `et_student_cj` VALUES ('3', '2', '1', '90.00', '语文');
INSERT INTO `et_student_cj` VALUES ('4', '2', '3', '120.00', '英语');
INSERT INTO `et_student_cj` VALUES ('5', '3', '4', '200.00', '理综');
INSERT INTO `et_student_cj` VALUES ('6', '3', '5', '250.00', '文综');
INSERT INTO `et_student_cj` VALUES ('7', '4', '1', '80.00', null);
INSERT INTO `et_student_cj` VALUES ('8', '4', '2', '50.00', null);
INSERT INTO `et_student_cj` VALUES ('9', '5', '2', '50.00', null);
INSERT INTO `et_student_cj` VALUES ('10', '5', '5', '150.00', null);

-- ----------------------------
-- Table structure for `et_student_kc`
-- ----------------------------
DROP TABLE IF EXISTS `et_student_kc`;
CREATE TABLE `et_student_kc` (
  `kc_id` int(11) NOT NULL AUTO_INCREMENT,
  `kc_name` varchar(60) DEFAULT NULL,
  `text` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`kc_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of et_student_kc
-- ----------------------------
INSERT INTO `et_student_kc` VALUES ('1', '语文', '语文');
INSERT INTO `et_student_kc` VALUES ('2', '数学', '数学');
INSERT INTO `et_student_kc` VALUES ('3', '英语', '英语');
INSERT INTO `et_student_kc` VALUES ('4', '理综', '理综');
INSERT INTO `et_student_kc` VALUES ('5', '文综', '文综');

-- ----------------------------
-- Table structure for `et_student_sex_1`
-- ----------------------------
DROP TABLE IF EXISTS `et_student_sex_1`;
CREATE TABLE `et_student_sex_1` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `xin` varchar(60) DEFAULT NULL,
  `gan` varchar(60) DEFAULT NULL,
  `pi` varchar(60) DEFAULT NULL,
  `fei` varchar(60) DEFAULT NULL,
  `shen` varchar(60) DEFAULT NULL,
  `zigong` varchar(60) DEFAULT NULL,
  `text` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of et_student_sex_1
-- ----------------------------
INSERT INTO `et_student_sex_1` VALUES ('1', '1', '2018-06-26 19:51:20', '健康', '健康', '健康', '健康', '异常', '异常', null);
INSERT INTO `et_student_sex_1` VALUES ('2', '1', '2018-06-30 19:53:42', '健康', '健康', '异常', '异常', '健康', '健康', null);
INSERT INTO `et_student_sex_1` VALUES ('3', '3', '2018-06-26 19:54:56', '健康', '健康', '健康', '健康', '健康', '健康', null);
INSERT INTO `et_student_sex_1` VALUES ('4', '3', '2018-06-30 19:55:20', '健康', '健康', '健康', '异常', '异常', '异常', null);
INSERT INTO `et_student_sex_1` VALUES ('5', '5', '2018-06-25 19:55:51', '健康', '健康', '健康', '健康', '健康', '异常', null);
INSERT INTO `et_student_sex_1` VALUES ('6', '5', '2018-06-30 19:56:12', '健康', '健康', '健康', '健康', '健康', '健康', null);

-- ----------------------------
-- Table structure for `et_student_sex_2`
-- ----------------------------
DROP TABLE IF EXISTS `et_student_sex_2`;
CREATE TABLE `et_student_sex_2` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) DEFAULT NULL,
  `date` datetime DEFAULT NULL,
  `xin` varchar(60) DEFAULT NULL,
  `gan` varchar(60) DEFAULT NULL,
  `pi` varchar(60) DEFAULT NULL,
  `fei` varchar(60) DEFAULT NULL,
  `shen` varchar(60) DEFAULT NULL,
  `qianliexian` varchar(60) DEFAULT NULL,
  `text` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of et_student_sex_2
-- ----------------------------
INSERT INTO `et_student_sex_2` VALUES ('1', '2', '2018-06-25 19:56:47', '健康', '健康', '健康', '健康', '健康', '异常', null);
INSERT INTO `et_student_sex_2` VALUES ('2', '2', '2018-06-30 19:57:01', '健康', '健康', '异常', '健康', '健康', '健康', null);
INSERT INTO `et_student_sex_2` VALUES ('3', '4', '2018-06-25 19:57:19', '异常', '健康', '异常', '健康', '健康', '健康', null);
INSERT INTO `et_student_sex_2` VALUES ('4', '4', '2018-06-25 19:57:34', '健康', '健康', '健康', '健康', '健康', '健康', null);

-- ----------------------------
-- Table structure for `et_student_xsz`
-- ----------------------------
DROP TABLE IF EXISTS `et_student_xsz`;
CREATE TABLE `et_student_xsz` (
  `xsz_id` int(11) NOT NULL AUTO_INCREMENT,
  `stu_id` int(11) DEFAULT NULL,
  `jiguan` varchar(60) DEFAULT NULL,
  `startDate` datetime DEFAULT NULL,
  `endDate` datetime DEFAULT NULL,
  `text` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`xsz_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of et_student_xsz
-- ----------------------------
INSERT INTO `et_student_xsz` VALUES ('1', '1', '中国', '2018-06-20 19:42:05', '2019-03-01 18:42:11', '111');
INSERT INTO `et_student_xsz` VALUES ('2', '2', '中国', '2018-06-20 19:43:21', '2018-11-22 19:43:29', '22222');
INSERT INTO `et_student_xsz` VALUES ('3', '3', '中国', '2018-06-20 19:43:43', '2019-01-23 19:43:47', '3333');
INSERT INTO `et_student_xsz` VALUES ('4', '4', '英国', '2018-06-20 19:44:33', '2018-11-01 19:44:44', '444444');
INSERT INTO `et_student_xsz` VALUES ('5', '5', '法国', '2018-06-20 19:45:23', '2018-11-01 19:45:28', '55555');
