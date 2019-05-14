package com.lottery.api.bean.dlt;

import lombok.Data;

/**
 * 中奖详情
 */
@Data
public class Detail {
    public static final String[] TYPES=new String[]{"1","2"};//中奖详情类型 1.基本 2.追加
    public static final String BASIC_TYPE=TYPES[0];//中奖详情类型-基本
    public static final String APPEND_TYPE=TYPES[1];//中奖详情类型-追加
    private String term;//期数
    private String money;//单注金额
    private String level;//中奖类型名称
    private String piece;//追加注数
    private Integer num;//中奖类型编号
    private String sendPrize;
    private String allmoney;//应派奖金合计
    private String type;//中奖详情类型 1.基本 2.追加
//    {
//        "money": "10,000,000",
//            "level": "一等奖",
//            "piece": "1",
//            "num": 401,
//            "sendPrize": "",
//            "allmoney": "10,000,000"
//    },
}
