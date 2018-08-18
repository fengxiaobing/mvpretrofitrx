package com.senon.mvpretrofitrx.mvp.activity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.senon.mvpretrofitrx.R;
import com.senon.mvpretrofitrx.mvp.base.BaseActivity;
import com.senon.mvpretrofitrx.mvp.base.BaseResponse;
import com.senon.mvpretrofitrx.mvp.contract.NewsContract;
import com.senon.mvpretrofitrx.mvp.entity.Login;
import com.senon.mvpretrofitrx.mvp.entity.NewsDetail;
import com.senon.mvpretrofitrx.mvp.presenter.NewsPresenter;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.ObservableTransformer;

public class NewsActivity extends BaseActivity<NewsContract.View, NewsContract.Presenter> implements NewsContract.View {


    @BindView(R.id.btn)
    Button btn;

    @Override
    public int getLayoutId() {
        return R.layout.activity_news;
    }

    @Override
    public NewsContract.Presenter createPresenter() {
        return new NewsPresenter(this);
    }

    @Override
    public NewsContract.View createView() {
        return this;
    }

    @Override
    public void init() {

    }

    @Override
    public void result(List<NewsDetail> data) {
        Log.e("","");
        Toast.makeText(this, "加载成功", Toast.LENGTH_SHORT).show();
    }


    @Override
    public void setMsg(String msg) {

    }

    @Override
    public <T> ObservableTransformer<T, T> bindLifecycle() {
        return this.bindToLifecycle();
    }


    @OnClick(R.id.btn)
    public void onViewClicked() {
        getPresenter().loadNews("T1348647853363",true,true);
    }
}
