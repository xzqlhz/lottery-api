package com.lottery.api;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lottery.api.context.ApplicationContextHolder;
import com.lottery.api.dlt.bean.DLT;
import com.lottery.api.dlt.service.DLTService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApiApplication.class)
@EnableZuulProxy
@SpringBootApplication
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

    private DLTService dltService;


    @Before
    public void before() {
       dltService= ApplicationContextHolder.getBean(DLTService.class);
    }

    @Test
    public void  test(){
        DLTService dltService= ApplicationContextHolder.getBean(DLTService.class);
        JSONArray jsonArray=dltService.lottery_kj_detail_new("4","");
        if(jsonArray.size()>0){
            JSONObject jsonObject=jsonArray.getJSONObject(0);
            DLT dlt=JSONObject.parseObject(jsonObject.toJSONString(),DLT.class);
            System.out.println(dlt);
        }
    }

}
