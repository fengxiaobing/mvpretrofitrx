package com.senon.mvpretrofitrx.mvp.model;

import android.content.Context;

import com.senon.mvpretrofitrx.mvp.api.Api;
import com.senon.mvpretrofitrx.mvp.base.BaseModel;
import com.senon.mvpretrofitrx.mvp.progress.ObserverResponseListener;

import java.util.HashMap;

import io.reactivex.ObservableTransformer;

public class NewsModel<T> extends BaseModel {

    public void loadNews(Context context, String id, boolean isDialog, boolean cancelable,
                      ObservableTransformer<T,T> transformer, ObserverResponseListener observerListener){

        //当不需要指定是否由dialog时，可以调用这个方法
//        subscribe(context, Api.getApiService().login(map), observerListener);
        subscribe(context, Api.getApiService().loadNews(id), observerListener,transformer,isDialog,cancelable);
    }

}
