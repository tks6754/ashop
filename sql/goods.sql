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
`name` varchar(128) NOT NULL COMMENT '名称',
`subtitle` varchar(128) NOT NULL COMMENT '副标题',
`main_img` varchar(255) NOT NULL COMMENT '主图',
`main_video` varchar(255) NOT NULL COMMENT '主视频',
`item_code` varchar(128) NOT NULL COMMENT 'seller_id+item_code商家id和商家编码,商家系统的商品唯一码',
`market_price` decimal(16,4) NOT NULL COMMENT '市场价',
`cost_price` decimal(16,4) NOT NULL COMMENT '成本价',
`sale_price` decimal(16,4) NOT NULL COMMENT '售价',
`brand_id` bigint(11) NOT NULL COMMENT '品牌id',
`brand_name` varchar(32) NOT NULL COMMENT '品牌名',
`category_id` bigint(11) NOT NULL COMMENT '所属类目id',
`category_name` varchar(32) NOT NULL COMMENT '所属类目名称',
`shop_id` bigint(11) NOT NULL COMMENT '店铺id',
`item_pattern` tinyint(2) NOT NULL COMMENT '商品形态 1:实物商品 2:虚拟商品 3:服务商品',
`item_type` tinyint(2) NOT NULL COMMENT '商品类型 1:前端商品 2:后端商品 3:组合商品 4:扩展的商品类型',
`flag` bigint(11) NOT NULL COMMENT '标记位，进行二进制打标操作',
`feature` varchar(2048) DEFAULT NULL COMMENT '扩展字段,json格式',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='spu';


DROP TABLE IF EXISTS `item_sku`;
CREATE TABLE `item_sku` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`sku_name` varchar(64) DEFAULT NULL COMMENT '任务名',
`sku_img` varchar(255) DEFAULT NULL COMMENT 'sku图',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='item_sku';



DROP TABLE IF EXISTS `category`;
CREATE TABLE `category` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`category_name` varchar(64) DEFAULT NULL COMMENT '类目名称',
`level` tinyint(2) NOT NULL COMMENT '类目层级',
`parent_id` bigint(11) UNSIGNED NOT NULL COMMENT '父类目id',
`cate_type` tinyint(2) NOT NULL COMMENT '类目类型 1:前台 2:后台',
`picture_url` varchar(255) DEFAULT NULL COMMENT '图片链接',
`back_category` varchar(255) DEFAULT NULL COMMENT '后台类目集合',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='类目';


DROP TABLE IF EXISTS `category_property`;
CREATE TABLE `category_property` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`category_id` bigint(11) UNSIGNED NOT NULL COMMENT '父类目id',
`property_name` varchar(64) NOT NULL COMMENT '属性名',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='类目属性';


DROP TABLE IF EXISTS `property`;
CREATE TABLE `property` (
 `id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
 `spu_id` bigint(11) UNSIGNED NOT NULL COMMENT '商品id',
 `property_name` varchar(64) NOT NULL COMMENT '属性名',
 `property_value` varchar(128) NOT NULL COMMENT '属性值',

 `biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
 `version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
 `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
 `is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='类目属性';


DROP TABLE IF EXISTS `brand`;
CREATE TABLE `brand` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`brand_name` varchar(64) DEFAULT NULL COMMENT '品牌名称',
`picture_url` varchar(255) DEFAULT NULL COMMENT '图片链接',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='品牌';

DROP TABLE IF EXISTS `spu_image`;
CREATE TABLE `spu_image` (
 `id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
 `spu_id` bigint(11) UNSIGNED NOT NULL COMMENT 'spu id',
 `image_url` varchar(255) DEFAULT NULL COMMENT '图片链接',
 `img_type` tinyint(4) NOT NULL COMMENT '图片类型 1:图 2:视频',
 `seq_num` tinyint(4) NOT NULL DEFAULT 0 COMMENT '图片顺序 默认为0不排序，起始排序从1开始',

 `biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
 `version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
 `gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
 `gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
 `is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='商品图片';



SET FOREIGN_KEY_CHECKS = 1;
