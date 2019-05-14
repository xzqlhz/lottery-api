package com.lottery.api.bean;

import lombok.Data;

@Data
public class ForeignInterface {
    //接口英文名称
    private String nameEn;
    //接口中文名称
    private String nameZh;
    //请求地址
    private String requestUrl;
    //请求头
    private String requestHeader;
    //请求参数
    private String requestParameters;
    //本地请求地址
    private String localUrl;
    //本地检测地址
    private String checkUrl;
}