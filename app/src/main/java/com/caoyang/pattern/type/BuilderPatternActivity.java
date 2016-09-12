package com.caoyang.pattern.type;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.caoyang.pattern.builder.BMWBuilder;
import com.caoyang.pattern.builder.BenzBuilder;
import com.caoyang.pattern.builder.Director;
import com.caoyang.pattern.builder.base.BMWModel;
import com.caoyang.pattern.builder.base.BenzModel;

import java.util.ArrayList;

/**
 * 建造者 模式
 */
public class BuilderPatternActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    private void method01() {
        // 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
        // 说要这样一个模型，这样一个顺序，然后我就来制造
        BenzModel benzModel = new BenzModel();
        ArrayList<String> sequence = new ArrayList<>();
        sequence.add("engine boom");//客户要求，run的时候时候先发动引擎
        sequence.add("start");//启动起来
        sequence.add("stop");//开了一段就停下来
        //然后我们把这个顺序给奔驰车
        benzModel.setSequence(sequence);
        benzModel.run();
    }


    private void method02() {
         /*
         * 客户告诉牛叉公司，我要这样一个模型，然后牛叉公司就告诉我老大
         * 说要这样一个模型，这样一个顺序，然后我就来制造
         */
        ArrayList<String> sequence = new ArrayList<String>();  //存放run的顺序
        sequence.add("engine boom");  //客户要求，run的时候时候先发动引擎
        sequence.add("start");  //启动起来
        sequence.add("stop");  //开了一段就停下来

        //要一个奔驰车：
        BenzBuilder benzBuilder = new BenzBuilder();
        //把顺序给这个builder类，制造出这样一个车出来
        benzBuilder.setSequence(sequence);
        //制造出一个奔驰车
        BenzModel benz = (BenzModel) benzBuilder.getCarModel();
        // 奔驰车跑一下看看
        benz.run();

        //按照同样的顺序，我再要一个宝马
        BMWBuilder bmwBuilder = new BMWBuilder();
        bmwBuilder.setSequence(sequence);
        BMWModel bmw = (BMWModel) bmwBuilder.getCarModel();
        bmw.run();
    }

    private void method03() {
        Director director = new Director();
        //1W辆A类型的奔驰车
        for (int i = 0; i < 10000; i++) {
            director.getABenzModel().run();
        }
        //100W辆B类型的奔驰车
        for (int i = 0; i < 1000000; i++) {
            director.getBBenzModel().run();
        }
        //1000W量C类型的宝马车
        for (int i = 0; i < 10000000; i++) {
            director.getCBMWModel().run();
        }
    }
}
