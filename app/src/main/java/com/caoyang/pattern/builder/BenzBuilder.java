package com.caoyang.pattern.builder;

import com.caoyang.pattern.builder.base.BenzModel;
import com.caoyang.pattern.builder.base.CarModel;

import java.util.ArrayList;

/**
 * Author：艹羊
 * Created Time:2016/09/12 10:04
 */
public class BenzBuilder extends CarBuilder {

    private BenzModel benz = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benz.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return benz;
    }
}
