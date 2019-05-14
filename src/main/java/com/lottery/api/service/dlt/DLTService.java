package com.lottery.api.service.dlt;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lottery.api.utils.OkHttp3Utils;
import org.springframework.stereotype.Service;

/**
 * 大乐透
 */
@Service
public class DLTService {

    private final static String host = "http://www.lottery.gov.cn/api/lottery_kj_detail_new.jspx";

    /**
     * 获取某期开奖信息,包含[开奖号码]
     *
     * @param _ltype
     * @param _term
     */
    public JSONArray lottery_kj_detail_new(String _ltype, String _term) {
        JSONObject parameters = new JSONObject();
        parameters.put("_ltype", _ltype);
        parameters.put("_term", _term);
        return OkHttp3Utils.GetBackJSONArray(host, null, parameters);
    }

}
