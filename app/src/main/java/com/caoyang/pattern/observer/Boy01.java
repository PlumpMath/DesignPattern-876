package com.caoyang.pattern.observer;

import com.orhanobut.logger.Logger;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Boy01 implements Observer {
    private OnUpdateListener onUpdateListener;//提供接口方便外部使用

    public interface OnUpdateListener {
        void onUpdate(Object data);
    }

    public void setOnUpdateListener(OnUpdateListener onUpdateListener) {
        this.onUpdateListener = onUpdateListener;
    }

    /**
     * @param observable 被观察者
     * @param data       数据
     */
    @Override
    public void update(Observable observable, Object data) {
        Logger.d("Boy01  观察到活动"+"    具体活动为   " + data.toString());
        if (onUpdateListener!=null){
            onUpdateListener.onUpdate(data);
        }
    }
}
