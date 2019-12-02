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
DROP TABLE IF EXISTS `item`;
CREATE TABLE `item` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,


`item_code` varchar(128) NOT NULL COMMENT 'seller_id+item_code商家id和商家编码,商家系统的商品唯一码',
`brand_id` bigint(11) NOT NULL COMMENT '品牌id',
`brand_name` varchar(32) NOT NULL COMMENT '品牌名',
`category_id` bigint(11) NOT NULL COMMENT '所属类目id',
`category_name` varchar(32) NOT NULL COMMENT '所属类目名称',
`shop_id` bigint(11) NOT NULL COMMENT '店铺id',
`item_pattern` tinyint(2) NOT NULL COMMENT '商品形态 1:实物商品 2:虚拟商品 3:服务商品',
`item_type` tinyint(2) NOT NULL COMMENT '商品类型 1:前端商品 2:后端商品 3:组合商品 4:扩展的商品类型',
`flag` bigint(11) NOT NULL COMMENT '标记位，进行二进制打标操作',
`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`feature` varchar(2048) DEFAULT NULL COMMENT '扩展字段,json格式',

`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='spu';


DROP TABLE IF EXISTS `item`;
CREATE TABLE `item_sku` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`job_name` varchar(64) DEFAULT NULL COMMENT '任务名',
`job_group` varchar(64) DEFAULT NULL COMMENT '任务分组',
`job_class` varchar(255) DEFAULT NULL COMMENT '任务执行时调用哪个类的方法 包名+类名',
`task_result` tinyint(2) DEFAULT NULL COMMENT '运行结果 1：成功 0：失败',
`task_message` varchar(255) DEFAULT NULL COMMENT '运行信息',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='item_sku';



SET FOREIGN_KEY_CHECKS = 1;
