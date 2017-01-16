/*
Navicat MySQL Data Transfer

Source Server         : root_localhost
Source Server Version : 50534
Source Host           : localhost:3306
Source Database       : iblog

Target Server Type    : MYSQL
Target Server Version : 50534
File Encoding         : 65001

Date: 2017-01-16 20:48:33
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `t_blog`
-- ----------------------------
DROP TABLE IF EXISTS `t_blog`;
CREATE TABLE `t_blog` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `title` varchar(255) NOT NULL COMMENT '标题',
  `summary` varchar(255) DEFAULT NULL,
  `original` bit(1) NOT NULL DEFAULT b'1' COMMENT '原创',
  `top1` bit(1) NOT NULL DEFAULT b'0' COMMENT '置顶',
  `reward` bit(1) NOT NULL DEFAULT b'1' COMMENT '打赏',
  `published` bit(1) NOT NULL DEFAULT b'0' COMMENT '发布',
  `published_time` timestamp NULL DEFAULT NULL COMMENT '发布时间',
  `read_num` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '阅读数',
  `favor_num` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '收藏数',
  `vote_num` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '点赞数',
  `comment_num` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '评论数',
  `share_num` int(10) unsigned NOT NULL DEFAULT '0' COMMENT '分享数',
  `edit_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='博客表基本信息';

-- ----------------------------
-- Records of t_blog
-- ----------------------------

-- ----------------------------
-- Table structure for `t_blog_content`
-- ----------------------------
DROP TABLE IF EXISTS `t_blog_content`;
CREATE TABLE `t_blog_content` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `format` varchar(10) NOT NULL COMMENT '格式',
  `content` text COMMENT '内容',
  `edit_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '编辑时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='博客内容表';

-- ----------------------------
-- Records of t_blog_content
-- ----------------------------
INSERT INTO `t_blog_content` VALUES ('1', 'md', '测试内容', '2016-12-13 22:28:38');

-- ----------------------------
-- Table structure for `t_blog_tag`
-- ----------------------------
DROP TABLE IF EXISTS `t_blog_tag`;
CREATE TABLE `t_blog_tag` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `blog_id` int(11) NOT NULL COMMENT '博客主键',
  `tag_id` int(11) NOT NULL COMMENT '标签主键',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='博客标签关系表';

-- ----------------------------
-- Records of t_blog_tag
-- ----------------------------

-- ----------------------------
-- Table structure for `t_code`
-- ----------------------------
DROP TABLE IF EXISTS `t_code`;
CREATE TABLE `t_code` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `code` varchar(30) NOT NULL COMMENT '编码',
  `value` varchar(50) NOT NULL COMMENT '字典值',
  `type` varchar(30) NOT NULL COMMENT '类别',
  `type_name` varchar(50) NOT NULL COMMENT '类别名称',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除',
  `updated_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '添加时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='系统参数表';

-- ----------------------------
-- Records of t_code
-- ----------------------------
INSERT INTO `t_code` VALUES ('5', 'LOGIN_NAME', 'test', 'ACCOUNT', '登陆账号', '', '2016-11-01 22:27:18');
INSERT INTO `t_code` VALUES ('6', 'PASSWORD', '123456', 'ACCOUNT', '登陆账号', '', '2016-11-01 22:27:49');
INSERT INTO `t_code` VALUES ('7', 'TITLE', 'Test\'s Blog', 'BLOG_METADATA', '博客元信息', '', '2016-11-01 22:28:44');
INSERT INTO `t_code` VALUES ('8', 'AUTHOR', 'Test', 'BLOG_METADATA', '博客元信息', '', '2016-11-02 21:20:27');
INSERT INTO `t_code` VALUES ('9', 'SUBTITLE', '技术人总是孤独的', 'BLOG_METADATA', '博客元信息', '', '2016-11-08 20:50:44');
INSERT INTO `t_code` VALUES ('10', 'LIBS_CDN', '//cdn.bootcss.com', 'BLOG_METADATA', '博客元信息', '', '2016-11-08 20:52:03');
INSERT INTO `t_code` VALUES ('11', 'KEYWORDS', 'TEST', 'BLOG_METADATA', '博客元信息', '', '2016-11-08 22:20:37');

-- ----------------------------
-- Table structure for `t_comment`
-- ----------------------------
DROP TABLE IF EXISTS `t_comment`;
CREATE TABLE `t_comment` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `blog_id` int(11) NOT NULL COMMENT '博客主键',
  `comment_id` int(11) NOT NULL COMMENT '回复评论主键',
  `name` varchar(100) NOT NULL COMMENT '评论人名称',
  `name_no` char(18) NOT NULL COMMENT '评论人编号',
  `content` varchar(255) NOT NULL COMMENT '评论内容',
  `created_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '评论时间',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='博客评论表';

-- ----------------------------
-- Records of t_comment
-- ----------------------------

-- ----------------------------
-- Table structure for `t_tag`
-- ----------------------------
DROP TABLE IF EXISTS `t_tag`;
CREATE TABLE `t_tag` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(100) NOT NULL COMMENT '名称',
  `deleted` bit(1) NOT NULL DEFAULT b'0' COMMENT '删除',
  `updated_time` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '删除时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='博客标签表';

-- ----------------------------
-- Records of t_tag
-- ----------------------------
