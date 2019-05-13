package com.lottery.api.dlt.bean;

import java.util.List;

public class DLT {

    private List<DetailsAdd> detailsAdd;
    private List<String> eventName;//当前前50期期数列表
    private List<Detail> details;
    private List<String> codeNumber;
    private Lottery lottery;

    public List<DetailsAdd> getDetailsAdd() {
        return detailsAdd;
    }

    public void setDetailsAdd(List<DetailsAdd> detailsAdd) {
        this.detailsAdd = detailsAdd;
    }

    public List<String> getEventName() {
        return eventName;
    }

    public void setEventName(List<String> eventName) {
        this.eventName = eventName;
    }

    public List<Detail> getDetails() {
        return details;
    }

    public void setDetails(List<Detail> details) {
        this.details = details;
    }

    public List<String> getCodeNumber() {
        return codeNumber;
    }

    public void setCodeNumber(List<String> codeNumber) {
        this.codeNumber = codeNumber;
    }

    public Lottery getLottery() {
        return lottery;
    }

    public void setLottery(Lottery lottery) {
        this.lottery = lottery;
    }
}
