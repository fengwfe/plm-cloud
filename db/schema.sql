drop table if exists `User`;


CREATE TABLE `User` (
  `id` int unsigned NOT NULL AUTO_INCREMENT COMMENT 'PK',
  `classId` int NOT NULL COMMENT 'Class id',
  `subClassId` int NOT NULL COMMENT 'Subclass id ',
  `loginId` varchar(256) NOT NULL COMMENT '登录Id',
  `loginPwd` varchar(256) NOT NULL COMMENT '登录密码',
  `firstName` varchar(256) DEFAULT NULL COMMENT '名',
  `lastName` varchar(256) DEFAULT NULL COMMENT '姓',
  `avatar` varchar(512) DEFAULT NULL COMMENT '用户头像',
  `workPhone` varchar(256) DEFAULT NULL COMMENT '工作电话',
  `homePhone` varchar(256) DEFAULT NULL COMMENT '家庭电话',
  `mobile` varchar(256) DEFAULT NULL COMMENT '手机',
  `email` varchar(256) DEFAULT NULL COMMENT '邮箱',
  `enabled` varchar(5) NOT NULL DEFAULT 'N' COMMENT '账号是否启用',
  `dateUpdated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最新更新时间',
  `dateCreated` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `version` int unsigned NOT NULL DEFAULT '1' COMMENT '乐观锁',
  `deleted` varchar(5) NOT NULL DEFAULT 'N' COMMENT '是否已经软删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `loginId_UNIQUE` (`loginId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;