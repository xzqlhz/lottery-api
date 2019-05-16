package com.lottery.api.service.dlt;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.lottery.api.bean.dlt.DLT;
import com.lottery.api.bean.dlt.Detail;
import com.lottery.api.bean.dlt.Lottery;
import com.lottery.api.bean.dlt.OpenTime;
import com.lottery.api.mapper.dlt.DLTMapper;
import com.lottery.api.mapper.dlt.DetailMapper;
import com.lottery.api.mapper.dlt.LotteryMapper;
import com.lottery.api.mapper.dlt.OpenTimeMapper;
import com.lottery.api.utils.OkHttp3Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 大乐透
 */
@Service
public class DLTService {

    private final static String host = "http://www.lottery.gov.cn/api/lottery_kj_detail_new.jspx";
    @Autowired
    private LotteryMapper lotteryMapper;
    @Autowired
    private OpenTimeMapper openTimeMapper;
    @Autowired
    private DetailMapper detailMapper;

    @Autowired
    private DLTMapper dltMapper;

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

    public  void saveDLT(DLT dlt){
        this.dltMapper.saveObject(dlt);
    }

//    @Transactional
//    public void saveDLT(DLT dlt) {
//        Lottery lottery = dlt.getLottery();
//        OpenTime openTime = lottery.getOpenTime();
//        List<Detail> detailList = dlt.getDetails();
//        for (Detail detail : detailList) {
//            detail.setTerm(lottery.getTerm());
//            detail.setType(Detail.BASIC_TYPE);
//        }
//        List<DetailsAdd> detailsAddList = dlt.getDetailsAdd();
//        for (DetailsAdd detailsAdd : detailsAddList) {
//            Detail detail = new Detail();
//            BeanUtils.copyProperties(detailsAdd, detail);
//            detail.setTerm(lottery.getTerm());
//            detail.setType(Detail.APPEND_TYPE);
//            detailList.add(detail);
//        }
//        openTime.setTerm(lottery.getTerm());
//        saveLottery(lottery);
//        batchSaveDetail(detailList);
//        saveOpenTime(openTime);
//    }

    private void saveLottery(Lottery lottery) {
        this.lotteryMapper.insert(lottery);
    }

    private void batchSaveDetail(List<Detail> details) {
        this.detailMapper.batchInsert(details);
    }

    private void saveOpenTime(OpenTime openTime) {
        this.openTimeMapper.insert(openTime);
    }

}
