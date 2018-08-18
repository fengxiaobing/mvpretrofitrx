package com.senon.mvpretrofitrx.mvp.contract;

import com.senon.mvpretrofitrx.mvp.base.BasePresenter;
import com.senon.mvpretrofitrx.mvp.base.BaseResponse;
import com.senon.mvpretrofitrx.mvp.base.BaseView;
import com.senon.mvpretrofitrx.mvp.entity.Login;

import java.util.HashMap;
import java.util.List;

import io.reactivex.ObservableTransformer;

/**
 * LoginContract  V 、P契约类
 */
public interface LoginContract {

    interface View extends BaseView {

        void result(BaseResponse<List<Login>> data);

        void logoutResult(BaseResponse<List<Login>> data);

        void setMsg(String msg);

        <T> ObservableTransformer<T, T> bindLifecycle();

    }

    abstract class Presenter extends BasePresenter<View> {

        //请求1
        public abstract void login(HashMap<String, String> map, boolean isDialog, boolean cancelable);

        //请求2
        public abstract void logout(HashMap<String, String> map, boolean isDialog, boolean cancelable);
    }
}
