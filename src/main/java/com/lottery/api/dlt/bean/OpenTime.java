package com.lottery.api.dlt.bean;

public class OpenTime {
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


    public Integer getDate() {
        return date;
    }

    public void setDate(Integer date) {
        this.date = date;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getNanos() {
        return nanos;
    }

    public void setNanos(Integer nanos) {
        this.nanos = nanos;
    }

    public Integer getTimezoneOffset() {
        return timezoneOffset;
    }

    public void setTimezoneOffset(Integer timezoneOffset) {
        this.timezoneOffset = timezoneOffset;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getMinutes() {
        return minutes;
    }

    public void setMinutes(Integer minutes) {
        this.minutes = minutes;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }
}
