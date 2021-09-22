
DROP TABLE IF EXISTS `project`;
CREATE TABLE `project` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `number` varchar(64) COMMENT '项目编号',
    `name` varchar(255) NOT NULL COMMENT '项目名称',
    `manager` bigint NOT NULL COMMENT '项目经理ID',
    `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `product`;
CREATE TABLE `product` (
     `id` bigint NOT NULL AUTO_INCREMENT,
     `number` varchar(64) COMMENT '产品编号',
     `name` varchar(255) COMMENT '产品名',
     `project` bigint NOT NULL COMMENT '所属项目',
     `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
      PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL COMMENT '权限名称',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL COMMENT '角色名称',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(11) NOT NULL COMMENT '角色ID',
  `user_id` varchar(255) NOT NULL COMMENT '系统用户ID',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态\n0: 未删除\n1: 已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(11) NOT NULL COMMENT '用户ID',
  `permission_id` varchar(255) NOT NULL COMMENT '权限ID',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `auth`;
CREATE TABLE `auth` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `user_id` bigint NOT NULL COMMENT '用户ID',
  `credential` varchar(255) NOT NULL COMMENT '凭据',
  `type` varchar(45) NOT NULL COMMENT '凭据类型',
  `salt` varchar(255) NOT NULL COMMENT '盐值',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=59 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `number` varchar(10) COMMENT '员工编号',
    `name` varchar(64) NOT NULL COMMENT '员工姓名',
    `state` tinyint NOT NULL COMMENT '员工状态: 0:上班，1:请假，2:离职，3:出差',
    `department_id` bigint NOT NULL COMMENT '所在部门编号',
    `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `name` varchar(64) NOT NULL COMMENT '部门名称',
    `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `task`;
CREATE TABLE `task` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `name` varchar(64) NOT NULL COMMENT '任务名',
    `details` varchar(255) COMMENT '任务内容',
    `cost` tinyint NOT NULL COMMENT '任务工时',
    `project_id` bigint DEFAULT NULL COMMENT '项目ID',
    `product_id` bigint DEFAULT NULL COMMENT '产品ID',
    `in_report` bigint NOT NULL COMMENT '报告ID',
    `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
     PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `report`;
CREATE TABLE `report` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `author_id` bigint COMMENT '编写人员ID',
    `on_day` date COMMENT '日志日期',
    `committed` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '提交时间',
    `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8;