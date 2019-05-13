package com.lottery.api.dlt.bean;

/**
 * 中奖追加
 */
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


    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getSendPrize() {
        return sendPrize;
    }

    public void setSendPrize(String sendPrize) {
        this.sendPrize = sendPrize;
    }

    public String getAllmoney() {
        return allmoney;
    }

    public void setAllmoney(String allmoney) {
        this.allmoney = allmoney;
    }
}
