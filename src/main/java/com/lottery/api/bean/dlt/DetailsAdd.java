package com.lottery.api.bean.dlt;

import lombok.Data;

/**
 * 中奖追加
 */
@Data
public class DetailsAdd {
    private String money;//单注金额
    private String level;//中奖类型名称
    private String piece;//追加注数
    private Integer num;//中奖类型编号
    private String sendPrize;
    private String allmoney;//应派奖金合计
//    {
//        "money": "400,759",
//            "level": "二等奖追加",
//            "piece": "55",
//            "num": 4021,
//            "sendPrize": "",
//            "allmoney": "22,041,745"
//    }
}
