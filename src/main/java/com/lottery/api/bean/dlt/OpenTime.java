package com.lottery.api.bean.dlt;

import lombok.Data;

@Data
public class OpenTime {
    private String term;//期数，"19051"
    //year-month-date hours:minutes seconds nanos
    private Integer year;//年
    private Integer month;//月份 n-1,如现在5月，则month=4
    private Integer date;//日
    private Integer hours;//时
    private Integer minutes;//分
    private Integer seconds;//秒
    private Integer nanos;//毫秒
    private Long time;//时间戳
    private Integer day;//周几
    private Integer timezoneOffset;//时间偏移量

//    "openTime": {
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
//    }
}
