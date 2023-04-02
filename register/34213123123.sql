SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin`  (
  `id` int(11) NOT NULL,
  `name` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `pass` varchar(26) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES (1, '11', '11');

-- ----------------------------
-- Table structure for guy
-- ----------------------------
DROP TABLE IF EXISTS `guy`;
CREATE TABLE `guy`  (
  `user_id` int(11) NOT NULL AUTO_INCREMENT,
  `learn` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '线上或则线下',
  `ation` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '你当前的资格',
  `vaccine` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '一共三针',
  `own` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '关于自己',
  `expect` varchar(25) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT 'kk\r\n',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 12 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of guy
-- ----------------------------
INSERT INTO `guy` VALUES (1, '线上', 'Stmp', '三针', '我叫小神龙，今年1988', '赢家');
INSERT INTO `guy` VALUES (2, '线下', 'Stmp', '1针', '我叫小王', '赢家');
INSERT INTO `guy` VALUES (11, NULL, 'Diploma', 'Two stitches', 'is kuang', 'i  two');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(255) NOT NULL AUTO_INCREMENT,
  `ic` int(255) NOT NULL,
  `date` date NULL DEFAULT NULL,
  `program` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`, `ic`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 15, '2022-12-01', 'xxxxx');
INSERT INTO `user` VALUES (4, 9, '2022-12-28', 'xxxx');
INSERT INTO `user` VALUES (6, 13, '2022-12-29', 'xxxx');

SET FOREIGN_KEY_CHECKS = 1;
