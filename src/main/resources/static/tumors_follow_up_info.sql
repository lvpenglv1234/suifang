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

 Date: 26/07/2019 16:09:13
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tumors_follow_up_info
-- ----------------------------
DROP TABLE IF EXISTS `tumors_follow_up_info`;
CREATE TABLE `tumors_follow_up_info`  (
  `detailID` int(11) NOT NULL AUTO_INCREMENT,
  `followUpID` int(11) NULL DEFAULT NULL,
  `isResidenceVerification` bit(1) NULL DEFAULT NULL COMMENT '居住地核实',
  `unverifiedResidenceReasons` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '居住地未核实原因',
  `passiveSmokingPlaces` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '被动吸烟场所类别',
  `smokingAge` smallint(2) NULL DEFAULT NULL COMMENT '开始每天吸烟年龄',
  `quitSmokingAge` smallint(2) NULL DEFAULT NULL COMMENT '戒烟年龄',
  `smokingNum` smallint(6) NULL DEFAULT NULL COMMENT '日均吸烟数',
  `tumorsFamilyHistory` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '肿瘤家族史标识',
  `relationshipWithPatient` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '患者与本人关系',
  `tumorFamilyHistoryType` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '肿瘤家族史瘤别',
  `firstSymptomsDate` date NULL DEFAULT NULL COMMENT '首次出现症状日期',
  `firstVisitDate` date NULL DEFAULT NULL COMMENT '首次就诊日期',
  `tumorTreatmentHospital` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '肿瘤诊疗机构',
  `firstOperationHospital` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '首次手术机构名称',
  `firstOperationDate` date NULL DEFAULT NULL COMMENT '首次手术日期',
  `firstOperationType` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '首次手术性质',
  `reportCardNo` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '报告卡编号',
  `nextUnverifiedResidenceReasons` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '居住地未核实原因',
  `isMetastasis` bit(1) NULL DEFAULT NULL COMMENT '有无转移',
  `metastasisSite` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '转移部位',
  `isRecurrence` bit(1) NULL DEFAULT NULL COMMENT '有无复发',
  `recurrenceNumber` smallint(6) NULL DEFAULT NULL COMMENT '复发次数',
  `recurrenceDate` date NULL DEFAULT NULL COMMENT '复发日期',
  `therapeuticModalities` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '患者治疗方式',
  `patientStatus` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '患者目前疾病情况',
  `weight` decimal(5, 2) NULL DEFAULT NULL COMMENT '体重',
  `isSmoking` bit(1) NULL DEFAULT NULL COMMENT '是否吸烟',
  `guidanceContents` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '肿瘤患者指导内容',
  `karnofsky` int(11) NULL DEFAULT NULL COMMENT '卡氏评分值',
  `referralAgency` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '转诊机构及科别',
  `referralCauses` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '转诊原因',
  `turnover` smallint(6) NULL DEFAULT NULL COMMENT '转归',
  `createTime` datetime(0) NULL DEFAULT NULL COMMENT '创建时间',
  `lastModifierUser` varchar(25) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '最后修改人',
  `lastModificationTime` datetime(0) NULL DEFAULT NULL COMMENT '最后修改时间',
  `isDeleted` bit(1) NULL DEFAULT NULL COMMENT '是否删除',
  `deletedTime` datetime(0) NULL DEFAULT NULL COMMENT '删除时间',
  PRIMARY KEY (`detailID`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
