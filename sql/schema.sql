# 注意，如果使用mysql数据库,请使用utf8mb4编码而不是utf8
use `daily_report`;

DROP TABLE IF EXISTS `project`;
create TABLE `project` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `number` varchar(64) COMMENT '项目编号',
    `name` varchar(255) NOT NULL COMMENT '项目名称',
    `manager_number` varchar(64) NOT NULL COMMENT '项目经理编号',
    `manager_name` varchar(64) NOT NULL COMMENT '项目经理',
    `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '项目状态',
    `remark` varchar(255) NULL DEFAULT NULL COMMENT '备注',
    `parent_number` varchar(64) DEFAULT NULL COMMENT '父项目编号',
    `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `number`(`number`) USING BTREE COMMENT '普通索引'
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `product`;
create TABLE `product` (
     `number` bigint NOT NULL AUTO_INCREMENT COMMENT '产品编号',
     `model` varchar(64) NULL DEFAULT NULL COMMENT '产品型号',
     `name` varchar(255) COMMENT '产品名',
     `in_line` varchar(255) COMMENT '产品线名',
     `status` tinyint(2) NOT NULL DEFAULT '0' COMMENT '产品状态',
     `remark` varchar(255) NULL DEFAULT NULL COMMENT '备注',
     `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
      PRIMARY KEY (`number`) USING BTREE,
     INDEX `in_line`(`in_line`) USING BTREE COMMENT '产品线索引',
      INDEX `model`(`model`) USING BTREE COMMENT '型号索引'
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `permission`;
create TABLE `permission` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL COMMENT '权限名称',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `role`;
create TABLE `role` (
  `id` bigint(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL COMMENT '角色名称',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `user`;
create TABLE `user` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `work_code` varchar(10) COMMENT '员工编号',
    `name` varchar(64) NOT NULL COMMENT '员工姓名',
    `state` tinyint NOT NULL COMMENT '员工状态: 0:上班，1:请假，2:离职，3:出差',
    `department_id` bigint NULL DEFAULT NULL COMMENT '所在部门编号',
    `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
    PRIMARY KEY (`id`) USING BTREE,
    UNIQUE INDEX `work_code`(`work_code`) USING BTREE COMMENT '普通索引'
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `user_role`;
create TABLE `user_role` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `role_id` bigint NOT NULL COMMENT '角色ID',
  `user_id` varchar(64) NOT NULL COMMENT '员工编号',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态\n0: 未删除\n1: 已删除',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `role_permission`;
create TABLE `role_permission` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `role_id` bigint NOT NULL COMMENT '用户ID',
  `permission_id` bigint NOT NULL COMMENT '权限ID',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
   PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `report`;
create TABLE `report` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `work_code` varchar(10) COMMENT '员工编号',
    `author_name` varchar(64) COMMENT '员工姓名',
    `department` varchar(64) COMMENT '所属部门',
    `department_id` varchar(8) COMMENT '所属部门ID',
    `on_day` date COMMENT '日志日期',
    `status` tinyint NOT NULL DEFAULT 0 COMMENT '状态0：保存 1：提交',
    `committed` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '提交时间',
    `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
    PRIMARY KEY (`id`) USING BTREE,
    INDEX `work_code`(`work_code`) USING BTREE COMMENT '普通索引'
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4;


DROP TABLE IF EXISTS `task`;
create TABLE `task` (
    `id` bigint NOT NULL AUTO_INCREMENT,
    `name` varchar(64) NOT NULL COMMENT '任务名',
    `details` varchar(255) COMMENT '任务内容',
    `cost` float NOT NULL COMMENT '任务工时',
    `project_id` varchar(64) DEFAULT NULL COMMENT '项目ID',
    `product_id` varchar(64) DEFAULT NULL COMMENT '产品ID',
    `in_report` bigint NOT NULL COMMENT '报告ID',
    `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `pmo`;
create TABLE `pmo` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `member_number` varchar(64) NOT NULL COMMENT 'pmo成员编号',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `dm`;
create TABLE `dm` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `manager_number` varchar(64) NOT NULL COMMENT '部门经理编号',
  `department_id` bigint NULL DEFAULT NULL COMMENT '所在部门编号',
  `deleted` tinyint(2) NOT NULL DEFAULT '0' COMMENT '删除状态',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=64 DEFAULT CHARSET=utf8mb4;