package com.lottery.api.test;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lottery.api.ApiApplication;
import com.lottery.api.bean.dlt.DLT;
import com.lottery.api.service.dlt.DLTService;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ApiApplication.class)
public class Test {

    @Autowired
    private DLTService dltService;


    @org.junit.Test
    public void test() {
        JSONArray jsonArray = dltService.lottery_kj_detail_new("4", "");
        if (jsonArray.size() > 0) {
            JSONObject jsonObject = jsonArray.getJSONObject(0);
            DLT dlt = JSONObject.parseObject(jsonObject.toJSONString(), DLT.class);
            this.dltService.saveDLT(dlt);
        }
    }
}
