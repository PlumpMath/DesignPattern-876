package com.caoyang.pattern.builder;

import com.caoyang.pattern.builder.base.BMWModel;
import com.caoyang.pattern.builder.base.CarModel;

import java.util.ArrayList;

/**
 * Author：艹羊
 * Created Time:2016/09/12 10:05
 */
public class BMWBuilder extends CarBuilder {
    private BMWModel bmw = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmw.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmw;
    }
}
