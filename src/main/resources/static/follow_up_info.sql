/*
 Navicat MySQL Data Transfer

 Source Server         : .
 Source Server Type    : MySQL
 Source Server Version : 80015
 Source Host           : localhost:3306
 Source Schema         : suifang

 Target Server Type    : MySQL
 Target Server Version : 80015
 File Encoding         : 65001

 Date: 26/07/2019 16:08:23
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for follow_up_info
-- ----------------------------
DROP TABLE IF EXISTS `follow_up_info`;
CREATE TABLE `follow_up_info`  (
  `followUpID` int(11) NOT NULL AUTO_INCREMENT,
  `userNo` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '随访人证件号',
  `managementStatus` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '管理状态',
  `followUpMode` smallint(2) NOT NULL COMMENT '随访方式',
  `nextFollowUpTime` datetime(0) NULL DEFAULT NULL COMMENT '下次随访日期',
  `advise` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '随访建议',
  `followUpTime` datetime(0) NULL DEFAULT NULL COMMENT '随访日期',
  `jurisdictionalAgency` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '管辖机构',
  `createTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `lastModifierUser` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '最后修改人',
  `lastModificationTime` datetime(0) NULL DEFAULT NULL COMMENT '最后修改时间',
  `isDeleted` bit(1) NULL DEFAULT NULL COMMENT '是否删除',
  `deletedTime` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`followUpID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
