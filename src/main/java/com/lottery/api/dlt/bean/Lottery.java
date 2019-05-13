package com.lottery.api.dlt.bean;

public class Lottery {
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
    private String term;// 期数 ，"19051"
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


    public String getOpenTime_fmt1() {
        return openTime_fmt1;
    }

    public void setOpenTime_fmt1(String openTime_fmt1) {
        this.openTime_fmt1 = openTime_fmt1;
    }

    public String getTotlSaleNews() {
        return totlSaleNews;
    }

    public void setTotlSaleNews(String totlSaleNews) {
        this.totlSaleNews = totlSaleNews;
    }

    public String getDrawNews() {
        return drawNews;
    }

    public void setDrawNews(String drawNews) {
        this.drawNews = drawNews;
    }

    public String getNumSequence() {
        return numSequence;
    }

    public void setNumSequence(String numSequence) {
        this.numSequence = numSequence;
    }

    public String getOpenTime_fmt() {
        return openTime_fmt;
    }

    public void setOpenTime_fmt(String openTime_fmt) {
        this.openTime_fmt = openTime_fmt;
    }

    public Integer getIsAP() {
        return isAP;
    }

    public void setIsAP(Integer isAP) {
        this.isAP = isAP;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(String totalSales) {
        this.totalSales = totalSales;
    }

    public String getNumber_pool() {
        return number_pool;
    }

    public void setNumber_pool(String number_pool) {
        this.number_pool = number_pool;
    }

    public String getIspool() {
        return ispool;
    }

    public void setIspool(String ispool) {
        this.ispool = ispool;
    }

    public String getTotalSales2() {
        return totalSales2;
    }

    public void setTotalSales2(String totalSales2) {
        this.totalSales2 = totalSales2;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getfTime() {
        return fTime;
    }

    public void setfTime(String fTime) {
        this.fTime = fTime;
    }

    public String getVerify() {
        return verify;
    }

    public void setVerify(String verify) {
        this.verify = verify;
    }

    public String getTerm() {
        return term;
    }

    public void setTerm(String term) {
        this.term = term;
    }

    public OpenTime getOpenTime() {
        return openTime;
    }

    public void setOpenTime(OpenTime openTime) {
        this.openTime = openTime;
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }

    public String getlType() {
        return lType;
    }

    public void setlType(String lType) {
        this.lType = lType;
    }

    public String getNumSequence_pool() {
        return numSequence_pool;
    }

    public void setNumSequence_pool(String numSequence_pool) {
        this.numSequence_pool = numSequence_pool;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
