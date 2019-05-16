/*
SQLyog Ultimate v10.00 Beta1
MySQL - 5.6.36 : Database - zwakeji
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zwakeji` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `dlt_detail` */

DROP TABLE IF EXISTS `dlt_detail`;

CREATE TABLE `dlt_detail` (
  `term` varchar(20) NOT NULL COMMENT '期数',
  `money` varchar(36) NOT NULL COMMENT '单注金额',
  `level` varchar(20) NOT NULL COMMENT '中奖类型名称',
  `piece` varchar(20) NOT NULL COMMENT '追加注数',
  `num` varchar(20) NOT NULL COMMENT '中奖类型编号',
  `allmoney` varchar(36) NOT NULL COMMENT '应派奖金合计',
  `type` char(1) NOT NULL COMMENT '中奖详情类型 1.基本 2.追加',
  PRIMARY KEY (`term`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='大乐透-中奖详情';

/*Data for the table `dlt_detail` */

/*Table structure for table `dlt_lottery` */

DROP TABLE IF EXISTS `dlt_lottery`;

CREATE TABLE `dlt_lottery` (
  `term` varchar(20) NOT NULL COMMENT '期数',
  `openTime_fmt1` varchar(20) NOT NULL COMMENT '开奖日期 20190506',
  `openTime_fmt` varchar(36) NOT NULL COMMENT '开奖时间 2019年05月06日 20:30',
  `numSequence` varchar(36) NOT NULL COMMENT '出球顺序 16 11 29 20 15-08 04',
  `pool` varchar(36) NOT NULL COMMENT '奖池剩余金额',
  `totalSales` varchar(36) NOT NULL COMMENT '本期销售金额',
  `number` varchar(36) NOT NULL COMMENT '开奖号码 11 15 16 20 29-04 08',
  `sTime` varchar(36) NOT NULL COMMENT '本期开始时间 2019-05-04 20:25:00',
  `fTime` varchar(36) NOT NULL COMMENT '本期结束时间 2019-05-06 20:25:00',
  `totlSaleNews` varchar(256) DEFAULT NULL,
  `drawNews` varchar(20) DEFAULT NULL,
  `isAP` int(10) DEFAULT NULL,
  `number_pool` varchar(256) DEFAULT NULL,
  `ispool` int(10) DEFAULT NULL,
  `totalSales2` varchar(256) DEFAULT NULL,
  `verify` int(10) DEFAULT NULL,
  `lType` int(10) DEFAULT NULL,
  `numSequence_pool` varchar(256) DEFAULT NULL,
  `status` int(10) DEFAULT NULL,
  PRIMARY KEY (`term`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='大乐透-开奖详情';

/*Data for the table `dlt_lottery` */

/*Table structure for table `dlt_open_time` */

DROP TABLE IF EXISTS `dlt_open_time`;

CREATE TABLE `dlt_open_time` (
  `term` varchar(20) NOT NULL COMMENT '期数',
  `year` int(10) NOT NULL COMMENT '年',
  `month` int(10) NOT NULL COMMENT '月',
  `date` int(10) NOT NULL COMMENT '日',
  `hours` int(10) NOT NULL COMMENT '时',
  `minutes` int(10) NOT NULL COMMENT '分',
  `seconds` int(10) NOT NULL COMMENT '秒',
  `nanos` int(10) NOT NULL COMMENT '毫秒',
  `time` bigint(20) NOT NULL COMMENT '时间戳',
  `day` int(10) NOT NULL COMMENT '周几',
  `timezoneOffset` int(11) NOT NULL COMMENT '时间偏移量',
  PRIMARY KEY (`term`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='大乐透-开奖时间';

/*Data for the table `dlt_open_time` */

/*Table structure for table `foreign_interface` */

DROP TABLE IF EXISTS `foreign_interface`;

CREATE TABLE `foreign_interface` (
  `name_en` varchar(64) NOT NULL COMMENT '接口英文名称',
  `name_zh` varchar(64) NOT NULL COMMENT '接口中文名称',
  `request_url` varchar(2024) NOT NULL COMMENT '请求地址',
  `request_header` varchar(2024) DEFAULT NULL COMMENT '请求头',
  `request_parameters` varchar(1024) DEFAULT NULL COMMENT '请求参数',
  `local_url` varchar(512) DEFAULT NULL COMMENT '本地请求地址',
  `check_url` varchar(512) DEFAULT NULL COMMENT '本地检测地址',
  PRIMARY KEY (`name_en`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='接口信息';

/*Data for the table `foreign_interface` */

insert  into `foreign_interface`(`name_en`,`name_zh`,`request_url`,`request_header`,`request_parameters`,`local_url`,`check_url`) values ('DLT-DETAIL','大乐透-某期详情查询','http://www.lottery.gov.cn/api/lottery_kj_detail_new.jspx',NULL,'{String:_ltype,String:_term}',NULL,NULL);

/*Table structure for table `user_info` */

DROP TABLE IF EXISTS `user_info`;

CREATE TABLE `user_info` (
  `id` int(11) NOT NULL,
  `name` varchar(16) DEFAULT NULL,
  `full_name` varchar(36) DEFAULT NULL,
  `sex` char(1) DEFAULT NULL,
  `age` int(3) DEFAULT NULL,
  `phone` varchar(11) DEFAULT NULL,
  `address` varchar(512) DEFAULT NULL,
  `email` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `user_info` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
