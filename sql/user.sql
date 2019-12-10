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
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
`id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '账号id',
`email` varchar(64) NOT NULL DEFAULT '' COMMENT '邮箱',
`phone` varchar(16) NOT NULL DEFAULT '' COMMENT '手机号',
`username` varchar(32) NOT NULL DEFAULT '' COMMENT '用户名',
`password` varchar(32) NOT NULL DEFAULT '' COMMENT '密码',
`create_ip_at` varchar(12) NOT NULL DEFAULT '' COMMENT '创建ip',
`last_login_at` int(11) NOT NULL DEFAULT '0' COMMENT '最后一次登录时间',
`last_login_ip_at` varchar(12) NOT NULL DEFAULT '' COMMENT '最后一次登录ip',
`login_times` int(11) NOT NULL DEFAULT '0' COMMENT '登录次数',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='账户';


DROP TABLE IF EXISTS `platform_account`;
CREATE TABLE `platform_account` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`uid` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '账号id',
`platform_id` varchar(60) NOT NULL DEFAULT '' COMMENT '平台id',
`platform_token` varchar(60) NOT NULL DEFAULT '' COMMENT '平台access_token',
`type` tinyint(1) NOT NULL DEFAULT '0' COMMENT '平台类型 0:未知,1:facebook,2:google,3:wechat,4:qq,5:weibo,6:twitter',
`nickname` varchar(60) NOT NULL DEFAULT '' COMMENT '昵称',
`avatar` varchar(255) NOT NULL DEFAULT '' COMMENT '头像',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='类目';


DROP TABLE IF EXISTS `account_user`;
CREATE TABLE `account_user` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`uid` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '账号id',
`nickname` varchar(30) NOT NULL DEFAULT '' COMMENT '昵称',
`avatar` varchar(255) NOT NULL DEFAULT '' COMMENT '头像(相对路径)',
`gender` enum('male','female','unknow') NOT NULL DEFAULT 'unknow' COMMENT '性别',
`role` tinyint(1) unsigned NOT NULL DEFAULT '0' COMMENT '角色 0:普通用户 1:vip',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='用户表';


-- ----------------------------
-- ----------------------------


DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`uid` bigint(11) unsigned NOT NULL DEFAULT '0' COMMENT '账号id',
`email` varchar(30) NOT NULL DEFAULT '' COMMENT '员工邮箱',
`phone` varchar(15) NOT NULL DEFAULT '' COMMENT '员工手机号',
`name` varchar(30) NOT NULL DEFAULT '' COMMENT '员工姓名',
`nickname` varchar(30) NOT NULL DEFAULT '' COMMENT '员工昵称',
`avatar` varchar(255) NOT NULL DEFAULT '' COMMENT '员工头像(相对路径)',
`gender` enum('male','female','unknow') NOT NULL DEFAULT 'unknow' COMMENT '员工性别',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='员工表';






DROP TABLE IF EXISTS `auth_menu`;
CREATE TABLE `auth_menu` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`parent_id` bigint(11) unsigned NOT NULL DEFAULT '0' COMMENT '父菜单id',
`menu_name` varchar(255) NOT NULL DEFAULT '0' COMMENT '菜单名称',
`menu_desc` varchar(255) NOT NULL DEFAULT '0' COMMENT '菜描述',
`menu_uri` varchar(255) NOT NULL DEFAULT '0' COMMENT '菜单uri',
`is_show` enum('yes','no') NOT NULL DEFAULT 'no' COMMENT '是否展示菜单',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='系统menu';



DROP TABLE IF EXISTS `auth_item`;
CREATE TABLE `auth_item` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`menu_id` bigint(11) NOT NULL COMMENT '系统menu id',
`req_url` varchar(255) NOT NULL COMMENT '请求地址',
`req_method` varchar(8) NOT NULL COMMENT '请求方法',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='页面接口权限';



DROP TABLE IF EXISTS `auth_role`;
CREATE TABLE `auth_role` (
`id` bigint(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增id',
`name` varchar(255) NOT NULL DEFAULT '0' COMMENT '角色名称',
`desc` varchar(255) NOT NULL DEFAULT '0' COMMENT '角描述',
`auth_item_set` text COMMENT '权限集合 多个值,号隔开',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='品牌';



DROP TABLE IF EXISTS `auth_role_staff`;
CREATE TABLE `auth_role_staff` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`staff_id` int(11) unsigned NOT NULL DEFAULT '0' COMMENT '员工id',
`role_set` text COMMENT '角色集合 多个值,号隔开',
`create_by` int(11) NOT NULL DEFAULT '0' COMMENT '创建人staff_id',
`update_by` int(11) NOT NULL DEFAULT '0' COMMENT '修改人staff_id',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
 PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='权限角色与员工关系';





DROP TABLE IF EXISTS `sku_attr_key`;
CREATE TABLE `sku_attr_key` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`spu_id` bigint(11) NOT NULL COMMENT 'spu id',
`attr_name` varchar(64) DEFAULT NULL COMMENT '属性名',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='sku属性';



DROP TABLE IF EXISTS `sku_attr_val`;
CREATE TABLE `sku_attr_val` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`spu_id` bigint(11) NOT NULL COMMENT 'spu id',
`attr_key_id` bigint(11) NOT NULL COMMENT 'sku属性id',
`attr_value` varchar(64) DEFAULT NULL COMMENT '属性名',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='sku属性值';



DROP TABLE IF EXISTS `item_sku`;
CREATE TABLE `item_sku` (
`id` bigint(11) UNSIGNED NOT NULL AUTO_INCREMENT,
`sku_name` varchar(64) NOT NULL COMMENT 'sku名',
`sku_attr_code` varchar(32) NOT NULL COMMENT 'sku属性code唯一码 十进制占位表示',
`sku_img` varchar(255) DEFAULT NULL COMMENT 'sku图',
`qty` int(8) NOT NULL DEFAULT 0 COMMENT '库存数',
`market_price` decimal(16,4) NOT NULL COMMENT '市场价',
`sale_price` decimal(16,4) NOT NULL DEFAULT 0 COMMENT '售价',
`cost_price` decimal(16,4) NOT NULL DEFAULT 0 COMMENT '成本价',

`biz_type` varchar(8) NOT NULL COMMENT '所属业务平台',
`version` int(10) NOT NULL DEFAULT 0 COMMENT '版本',
`gmt_create` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`gmt_modified` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
`is_deleted` tinyint(2) DEFAULT 0 COMMENT '逻辑删除 0:未删除 1:已删除',
PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='item_sku';



SET FOREIGN_KEY_CHECKS = 1;
