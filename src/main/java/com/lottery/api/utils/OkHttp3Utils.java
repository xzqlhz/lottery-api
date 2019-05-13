package com.lottery.api.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections4.MapUtils;
import okhttp3.*;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

public class OkHttp3Utils {

    private static OkHttpClient okHttpClient = null;

    public static OkHttpClient getOkHttpClient() {
        if (okHttpClient == null) {
            synchronized (OkHttpClient.class) {
                if (okHttpClient == null) {
                    okHttpClient = new OkHttpClient();
                }
            }
        }
        return okHttpClient;
    }

    private static final String DEFAULT_ENCODE = "UTF-8";//默认编码格式

    /**
     * content-type
     */
    private static final MediaType APPLICATION_JSON = MediaType.parse("application/json;charset=utf-8");
    private static final MediaType TEXT_HTML = MediaType.parse("text/html;charset=utf-8");

    public static JSONObject GetBackJSON(String url, Map<String, String> headers, JSONObject parameters) {
        String result = Get(url, headers, parameters);
        JSONObject data;
        try{
            data = JSONObject.parseObject(result);
        }catch (Exception e){
            data = new JSONObject();
            e.printStackTrace();
        }
        return data;
    }

    public static JSONArray GetBackJSONArray(String url, Map<String, String> headers, JSONObject parameters) {
        String result = Get(url, headers, parameters);
        JSONArray data;
        try{
            data = JSONArray.parseArray(result);
        }catch (Exception e){
            data = new JSONArray();
            e.printStackTrace();
        }
        return data;
    }

    public static String Get(String url, Map<String, String> headers, JSONObject parameters) {
        StringBuffer stringBuffer = new StringBuffer(url);
        stringBuffer.append("?");
        if (parameters != null) {
            for (String parameter : parameters.keySet()) {
                try {
                    stringBuffer.append(parameter);
                    stringBuffer.append("=");
                    stringBuffer.append(URLEncoder.encode(parameters.getString(parameter), DEFAULT_ENCODE));
                    stringBuffer.append("&");
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        Request.Builder request = map2RequestHeaders(headers).url(stringBuffer.toString().substring(0, stringBuffer.length() - 1));
        Response response;
        String result = null;
        try {
            response = getOkHttpClient().newCall(request.build()).execute();
            result = response.body().string();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static String Post2FormData(String url, JSONObject parameters, Map<String, String> headers) {
        FormBody.Builder build = new FormBody.Builder();
        if (parameters != null) {
            for (String parameter : parameters.keySet()) {
                try {
                    build.add(parameter, URLEncoder.encode(parameters.getString(parameter), DEFAULT_ENCODE));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return Post(url, headers, build.build());
    }

    public static String Post2RawApplicationJson(String url, Map<String, String> headers, JSONObject parameters) {
        return Post2Raw(url, headers, parameters, APPLICATION_JSON);
    }

    private static String Post2Raw(String url, Map<String, String> headers, JSONObject parameters, MediaType mediaType) {
        RequestBody requestBody = RequestBody.create(mediaType, parameters.toJSONString());
        return Post(url, headers, requestBody);
    }

    private static String Post(String url, Map<String, String> headers, RequestBody requestBody) {
        Request.Builder requestBuilder = map2RequestHeaders(headers);
        Request request;
        Response response;
        String result = null;
        try {
            requestBuilder.url(url).post(requestBody);
            request = requestBuilder.build();
            response = getOkHttpClient().newCall(request).execute();
            result = response.body().string();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 获取请求头
     *
     * @param headers
     * @return
     */
    private static Request.Builder map2RequestHeaders(Map<String, String> headers) {
        Request.Builder request = new Request.Builder();
        if (MapUtils.isNotEmpty(headers)) {
            for (String headerName : headers.keySet()) {
                try {
                    request.header(headerName, URLEncoder.encode(headers.get(headerName), DEFAULT_ENCODE));
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        }
        return request;
    }

}
