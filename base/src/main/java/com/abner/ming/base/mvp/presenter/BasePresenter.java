package com.abner.ming.base.mvp.presenter;


import java.util.Map;

/**
 * author:AbnerMing
 * date:2019/4/18
 */
public interface BasePresenter {

    void get(int type, String url, Map<String, Object> map);

    void getNoHeader(int type, String url, Map<String, Object> map);

    void post(int type, String url, Map<String, Object> map);

    void postNoHeader(int type, String url, Map<String, Object> map);

    void put(int type, String url, Map<String, Object> map);

    void delete(int type, String url, Map<String, Object> map);

}
