/*
Navicat MySQL Data Transfer

Source Server         : 本地数据库
Source Server Version : 50627
Source Host           : localhost:3306
Source Database       : shirodemo

Target Server Type    : MYSQL
Target Server Version : 50627
File Encoding         : 65001

Date: 2017-07-07 16:00:52
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'zhangsan', '123456', '12');
INSERT INTO `user` VALUES ('2', 'lisi', '123456', '12');
INSERT INTO `user` VALUES ('3', 'wangwu', '123456', '13');
INSERT INTO `user` VALUES ('4', 'baige', '123456', '13');
INSERT INTO `user` VALUES ('5', 'wuli', '123456', '13');
