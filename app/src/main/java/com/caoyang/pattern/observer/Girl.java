package com.caoyang.pattern.observer;

import com.orhanobut.logger.Logger;

import java.util.Observable;

/**
 * 被观察者
 */
public class Girl extends Observable {

    //吃饭中
    public void haveEat() {
        Logger.d("美女：吃饭");
        notifyAllObservers("美女在吃饭");
    }

    public void haveSleep() {
        Logger.d("美女：睡觉");
        notifyAllObservers("美女在睡觉");
    }


    /**
     * 唤醒所有观察者
     */
    private void notifyAllObservers() {
        super.setChanged();//父类方法
        super.notifyObservers();//父类方法
    }

    /**
     * 唤醒所有观察者
     */
    private void notifyAllObservers(Object data) {
        super.setChanged();//父类方法
        super.notifyObservers(data);//父类方法
    }
}
