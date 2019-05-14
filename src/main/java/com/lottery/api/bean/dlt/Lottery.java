package com.lottery.api.bean.dlt;

import lombok.Data;

@Data
public class Lottery {
    private String term;//期数，"19051"
    private String openTime_fmt1;//日期 ，"20190506"
    private String totlSaleNews;
    private String drawNews;
    private String numSequence;//出球顺序，16 11 29 20 15-08 04（本期使用：第1套摇奖球）
    private String openTime_fmt;
    private Integer isAP;
    private String pool;//奖池剩余金额
    private String totalSales;//销售金额
    private String number_pool;
    private String ispool;
    private String totalSales2;
    private String number;//开奖号码 "11 15 16 20 29-04 08"
    private String fTime;
    private String verify;
    private OpenTime openTime;
    private String sTime;
    private String lType;
    private String numSequence_pool;
    private Integer status;
//    "openTime_fmt1": "20190506",
//            "totlSaleNews": "",
//            "drawNews": "74811",
//            "numSequence": "16 11 29 20 15-08 04（本期使用：第1套摇奖球）",
//            "openTime_fmt": "2019年05月06日 20:30",
//            "isAP": 0,
//            "pool": "5,344,151,471.31",
//            "totalSales": "271,425,230",
//            "number_pool": "",
//            "ispool": 0,
//            "totalSales2": "",
//            "number": "11 15 16 20 29-04 08",
//            "fTime": "2019-05-06 20:25:00",
//            "verify": 2,
//            "term": "19051",
//            "openTime": {
//        "date": 6,
//                "hours": 20,
//                "seconds": 0,
//                "month": 4,
//                "nanos": 0,
//                "timezoneOffset": -480,
//                "year": 119,
//                "minutes": 30,
//                "time": 1557145800000,
//                "day": 1
//    },
//            "sTime": "2019-05-04 20:25:00",
//            "lType": 4,
//            "numSequence_pool": "",
//            "status": 0
}
