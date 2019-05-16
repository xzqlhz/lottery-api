package com.lottery.api.bean.dlt;

import lombok.Data;

import java.util.List;

@Data
public class DLT {
    private List<DetailsAdd> detailsAdd;//中奖追加详情
    private List<String> eventName;//当前前50期期数列表
    private List<Detail> details;//中奖详情
    private List<String> codeNumber;//中奖号码
    private Lottery lottery;//本期详情
}
