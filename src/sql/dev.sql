/*
Navicat MySQL Data Transfer

Source Server         : _localhost
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : dev

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2017-08-21 22:50:05
*/

SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id`     INT(11)      NOT NULL AUTO_INCREMENT,
  `name`   VARCHAR(255) NOT NULL,
  `pwd`    VARCHAR(255) NOT NULL,
  `age`    INT(11)               DEFAULT NULL,
  `gender` INT(11)      NOT NULL,
  PRIMARY KEY (`id`)
)
  ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'Lane001', '123', '18', '1');
