package com.caoyang.pattern.builder;

import com.caoyang.pattern.builder.base.CarModel;

import java.util.ArrayList;

/**
 * Author：艹羊
 * Created Time:2016/09/12 10:03
 */
public abstract class CarBuilder {
    //建造一个模型，你要给我一个顺序要，就是组装顺序
    public abstract void setSequence(ArrayList<String> sequence);

    //设置完毕顺序后，就可以直接拿到这个车辆模型
    public abstract CarModel getCarModel();
}
