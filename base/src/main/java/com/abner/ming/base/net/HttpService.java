package com.abner.ming.base.net;


import java.util.Map;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.DELETE;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * author:AbnerMing
 * date:2019/4/18
 */
public interface HttpService {

    //get请求带请求头的方法
    @GET
    Observable<ResponseBody> get(@Url String url,@HeaderMap Map<String, Object> headMap,@QueryMap Map<String, Object> map);

    //get请求不带请求头的方法
    @GET
    Observable<ResponseBody> getNoHeader(@Url String url,@QueryMap Map<String, Object> map);

    //post请求带请求头的方法
    @FormUrlEncoded
    @POST
    Observable<ResponseBody> post(@Url String url,@HeaderMap Map<String, Object> headMap,@FieldMap Map<String, Object> map);

    //post请求不带请求头的方法
    @FormUrlEncoded
    @POST
    Observable<ResponseBody> postNoHeader(@Url String url, @QueryMap Map<String, Object> map);

    //put请求带请求头的方法
    @FormUrlEncoded
    @PUT
    Observable<ResponseBody> put(@Url String url,@HeaderMap Map<String, Object> headMap,@FieldMap Map<String, Object> map);

    //delete请求带请求头的方法
    @FormUrlEncoded
    @DELETE
    Observable<ResponseBody> delete(@Url String url,@HeaderMap Map<String, Object> headMap,@FieldMap Map<String, Object> map);



}
