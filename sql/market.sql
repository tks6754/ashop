/*
 Navicat Premium Data Transfer

 Source Server         : locat-root
 Source Server Type    : MySQL
 Source Server Version : 50727
 Source Host           : localhost:3306
 Source Schema         : sb_demo

 Target Server Type    : MySQL
 Target Server Version : 50727
 File Encoding         : 65001

 Date: 08/11/2019 15:04:25
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `shop`;
CREATE TABLE `shop` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`shop_name` varchar(128) NOT NULL COMMENT '店铺名',
`shop_img` varchar(255) NOT NULL COMMENT '店铺图',
`biz_type` varchar(128) NOT NULL COMMENT '店铺隔离符',



`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='店铺';




SET FOREIGN_KEY_CHECKS = 1;
