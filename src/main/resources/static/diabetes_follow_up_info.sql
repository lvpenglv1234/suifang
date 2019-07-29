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

 Date: 26/07/2019 15:53:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for diabetes_follow_up_info
-- ----------------------------
DROP TABLE IF EXISTS `diabetes_follow_up_info`;
CREATE TABLE `diabetes_follow_up_info`  (
  `detailID` int(11) NOT NULL AUTO_INCREMENT,
  `followUpID` int(11) NULL DEFAULT NULL,
  `regularActivities` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '规律活动',
  `activityFrequency` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '活动频次',
  `eachDuration` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '每次持续时间',
  `dietaryStatus` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '饮食情况',
  `diabetesSymptoms` smallint(6) NULL DEFAULT NULL COMMENT '糖尿病症状',
  `diabetesSymptomsSupplement` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '糖尿病症状补充信息',
  `hypoglycemicReaction` smallint(2) NULL DEFAULT NULL COMMENT '低血糖反应',
  `systolicPressure` smallint(6) NULL DEFAULT NULL COMMENT '收缩压',
  `diastolicPressure` smallint(6) NULL DEFAULT NULL COMMENT '舒张压',
  `height` decimal(5, 2) NULL DEFAULT NULL COMMENT '身高',
  `weight` decimal(5, 2) NULL DEFAULT NULL COMMENT '体重',
  `targetWeight` decimal(5, 2) NULL DEFAULT NULL COMMENT '目标体重',
  `constitutionalIndex` decimal(5, 2) NULL DEFAULT NULL COMMENT '体质指数',
  `targetConstitutionalIndex` decimal(5, 2) NULL DEFAULT NULL COMMENT '目标体质指数',
  `footDorsalArtery` smallint(2) NULL DEFAULT NULL COMMENT '足背动脉搏动',
  `otherSigns` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '其他体征',
  `dailySmoking` smallint(6) NULL DEFAULT NULL COMMENT '日吸烟量',
  `targetDailySmoking` smallint(6) NULL DEFAULT NULL COMMENT '目标日吸烟量',
  `dailyAlcohol` smallint(6) NULL DEFAULT NULL COMMENT '日饮酒量',
  `targetDailyAlcohol` smallint(6) NULL DEFAULT NULL COMMENT '目标日饮酒量',
  `weeklyExercisesNumber` smallint(6) NULL DEFAULT NULL COMMENT '周运动次数',
  `targetWeeklyExercisesNumber` smallint(6) NULL DEFAULT NULL COMMENT '目标周运动次数',
  `exerciseDuration` smallint(6) NULL DEFAULT NULL COMMENT '每次运动时长',
  `targetExerciseDuration` smallint(6) NULL DEFAULT NULL COMMENT '目标运动时长',
  `saltUptake` smallint(6) NULL DEFAULT NULL COMMENT '主食',
  `targetSaltUptake` smallint(6) NULL DEFAULT NULL COMMENT '目标主食',
  `psychologicalAdjustment` smallint(6) NULL DEFAULT NULL COMMENT '心理调整',
  `complianceBehavior` smallint(6) NULL DEFAULT NULL COMMENT '遵医行为',
  `fastingBloodSugar` decimal(5, 2) NULL DEFAULT NULL COMMENT '空腹血糖',
  `glycosylatedHemoglobin` decimal(5, 2) NULL DEFAULT NULL COMMENT '糖化血红蛋白',
  `inspectionDate` datetime(0) NULL DEFAULT NULL COMMENT '检查日期',
  `supplementaryExamination` decimal(5, 2) NULL DEFAULT NULL COMMENT '辅助检查',
  `medicationCompliance` smallint(6) NULL DEFAULT NULL COMMENT '服药依从性',
  `adverseDrugReactions` smallint(6) NULL DEFAULT NULL COMMENT '药物不良反应',
  `diabetesMedicinesInfo` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '糖尿病药品信息',
  `drugName` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '药品名称',
  `eachDose` decimal(5, 2) NULL DEFAULT NULL COMMENT '每次剂量',
  `doseUnit` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '剂量单位',
  `insulinPerDose` decimal(5, 2) NULL DEFAULT NULL COMMENT '胰岛素每次剂量',
  `insulinDoseUnit` varchar(10) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL COMMENT '剂量单位',
  `diabetesFollowUpType` smallint(6) NULL DEFAULT NULL COMMENT '糖尿病随访分类',
  `diabetesFollowUpTypeSupplement` smallint(6) NULL DEFAULT NULL COMMENT '糖尿病随访分类补充信息',
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
