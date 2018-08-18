package com.senon.mvpretrofitrx.mvp.presenter;

import android.content.Context;

import com.senon.mvpretrofitrx.mvp.contract.NewsContract;
import com.senon.mvpretrofitrx.mvp.entity.NewsDetail;
import com.senon.mvpretrofitrx.mvp.model.NewsModel;
import com.senon.mvpretrofitrx.mvp.progress.ObserverResponseListener;
import com.senon.mvpretrofitrx.mvp.utils.ToastUtil;

import java.util.List;
import java.util.Map;

public class NewsPresenter extends NewsContract.Presenter {

    private NewsModel model;
    private Context context;

    public NewsPresenter(Context context) {
        this.model = new NewsModel();
        this.context = context;
    }


    @Override
    public void loadNews(final String id, boolean isDialog, boolean cancelable) {
            model.loadNews(context, id, isDialog, cancelable, getView().bindLifecycle(), new ObserverResponseListener() {
                @Override
                public void onNext(Object o) {
                    //这一步是必须的，判断view是否已经被销毁
                    if(getView() != null){
//                        getView().result((BaseResponse<List<Login>>) o.);
//                      List<Test.T1348647853363Bean> newsDetail =((Test)o).getT1348647853363();

                       List<NewsDetail>  newsDetails =((Map<String,List<NewsDetail>>) o).get(id);
                        getView().result(newsDetails);
                        getView().setMsg("请求成功");
                    }
                }

                @Override
                public void onError(String msg) {
                    if(getView() != null){
                        ToastUtil.showShortToast(msg);
                    }
                }
            });
    }
}
