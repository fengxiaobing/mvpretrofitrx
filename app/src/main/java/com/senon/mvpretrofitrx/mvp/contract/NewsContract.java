package com.senon.mvpretrofitrx.mvp.contract;

import com.senon.mvpretrofitrx.mvp.base.BasePresenter;
import com.senon.mvpretrofitrx.mvp.base.BaseResponse;
import com.senon.mvpretrofitrx.mvp.base.BaseView;
import com.senon.mvpretrofitrx.mvp.entity.Login;
import com.senon.mvpretrofitrx.mvp.entity.NewsDetail;

import java.util.HashMap;
import java.util.List;

import io.reactivex.ObservableTransformer;

/**
 * LoginContract  V 、P契约类
 */
public interface NewsContract {

    interface View extends BaseView {

        void result(List<NewsDetail> data);


        void setMsg(String msg);

        <T> ObservableTransformer<T, T> bindLifecycle();

    }

    abstract class Presenter extends BasePresenter<View> {

        //请求1
        public abstract void loadNews(String id, boolean isDialog, boolean cancelable);

    }
}
