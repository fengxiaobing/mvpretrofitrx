package com.senon.mvpretrofitrx.mvp.progress;


/**
 * 请求监听
 */

public interface ObserverResponseListener<T> {
    /**
     * 响应成功
     * @param t
     */
    void onNext(T t);

    /**
     * 响应失败
     * @param msg
     */
    void onError(String msg);
}
