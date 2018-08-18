package com.senon.mvpretrofitrx.mvp.api;

import com.senon.mvpretrofitrx.mvp.base.BaseResponse;
import com.senon.mvpretrofitrx.mvp.entity.Login;
import com.senon.mvpretrofitrx.mvp.entity.NewsDetail;
import com.senon.mvpretrofitrx.mvp.model.Test;

import java.util.List;
import java.util.Map;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.QueryMap;

/**
 * api service
 */
public interface ApiService {

    @POST("query")
//    @POST("province-count")
    Observable<BaseResponse<List<Login>>> login(@QueryMap Map<String, String> map);

    @POST("query")
    Observable<BaseResponse<List<Login>>> logout(@QueryMap Map<String, String> map);

    @GET("nc/article/headline/{id}/0-40.html")
    Observable<Map<String, List<NewsDetail>>> loadNews(@Path("id") String id);
//    @GET("nc/article/headline/{id}/0-40.html")
//    Observable<Test> loadNews(@Path("id") String id);

//    // 登录的请求
//    @POST("loginManage/login")
//    Observable<BaseResponse<Login>> login(@QueryMap Map<String, String> map);

//    //上传图片
//    @POST("file/up")
//    @Multipart
//    Observable<BaseResponse<List<UploadFile>>> upload(@Part List<MultipartBody.Part> parts);


}
