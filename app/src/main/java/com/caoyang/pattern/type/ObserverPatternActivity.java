package com.caoyang.pattern.type;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.caoyang.pattern.R;
import com.caoyang.pattern.observer.Boy01;
import com.caoyang.pattern.observer.Boy02;
import com.caoyang.pattern.observer.Boy03;
import com.caoyang.pattern.observer.Girl;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 观察者 模式
 */
public class ObserverPatternActivity extends AppCompatActivity {

    @BindView(R.id.boy01_update) TextView mBoy01;
    @BindView(R.id.boy02_update) TextView mBoy02;
    @BindView(R.id.boy03_update) TextView mBoy03;
    //一个美女
    private Girl girl = new Girl();
    //三个偷窥狂
    private Boy01 boy01 = new Boy01();
    private Boy02 boy02 = new Boy02();
    private Boy03 boy03 = new Boy03();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_observer_pattern);
        ButterKnife.bind(this);
        initFirst();
    }

    private void initFirst() {
        //三个偷窥狂做好准备
        girl.addObserver(boy01);
        girl.addObserver(boy02);
        girl.addObserver(boy03);
        //查看Android Monitor的Log

        //三个偷窥狂的更新回调
        boy01.setOnUpdateListener(new Boy01.OnUpdateListener() {
            @Override
            public void onUpdate(Object data) {
                mBoy01.setText(data.toString());
            }
        });
        //三个偷窥狂的更新回调
        boy02.setOnUpdateListener(new Boy02.OnUpdateListener() {
            @Override
            public void onUpdate(Object data) {
                mBoy02.setText(data.toString());
            }
        });
        //三个偷窥狂的更新回调
        boy03.setOnUpdateListener(new Boy03.OnUpdateListener() {
            @Override
            public void onUpdate(Object data) {
                mBoy03.setText(data.toString());
            }
        });
    }

    public void ActionClick(View v) {
        switch (v.getId()) {
            case R.id.btn_eat:
                //美女吃饭
                girl.haveEat();
                break;
            case R.id.btn_sleep:
                //美女睡觉
                girl.haveSleep();
                break;
        }
    }
}
