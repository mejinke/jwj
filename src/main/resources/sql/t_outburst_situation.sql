/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50716
Source Host           : localhost:3306
Source Database       : bocom_pac

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2017-11-21 16:02:41
*/

SET FOREIGN_KEY_CHECKS=0;

CREATE DATABASE IF NOT EXISTS bocom_pac DEFAULT CHARSET utf8 COLLATE utf8_general_ci;

use bocom_pac;
-- ----------------------------
-- Table structure for t_outburst_situation
-- ----------------------------
DROP TABLE IF EXISTS `t_outburst_situation`;
CREATE TABLE `t_outburst_situation` (
  `id` varchar(32) NOT NULL,
  `situation_title` varchar(1024) DEFAULT NULL COMMENT '情况标题',
  `situation_details` varchar(4000) DEFAULT NULL COMMENT '详情',
  `situation_time` datetime DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '时间',
  `situation_status` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL COMMENT '上报人',
  `user_contact` varchar(255) DEFAULT NULL COMMENT '上报人联系方式',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_outburst_situation
-- ----------------------------
INSERT INTO `t_outburst_situation` VALUES ('10', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('11', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('12', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('13', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('14', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('15', '1231231231', 'sdsdfdsf', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('17', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('18', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('19', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('20', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('21', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('22', 'asd', 'fg', '2017-11-20 11:34:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('3', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 15:23:09', '2', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('4', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 15:23:09', '2', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('5', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 15:23:10', '2', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('6', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 15:23:10', '2', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('7', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 15:23:10', '2', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('8', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('9', '1怎么，而已', '123123123123123天天啊啊', '2017-11-20 11:55:32', '1', '测试', '15651819950');
INSERT INTO `t_outburst_situation` VALUES ('e1ef813f3f904757b3eec1a0f2b5b36c', 'asd', 'fg', '2017-11-22 11:34:32', '1', '测试', '15651819950');
