package com.haobi.eventbusdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.greenrobot.eventbus.EventBus;

public class SecondActivity extends AppCompatActivity {

    private Button bt_message;
    private TextView tv_messgae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tv_messgae = (TextView)findViewById(R.id.tv_message);
        bt_message = (Button)findViewById(R.id.bt_message);
        bt_message.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EventBus.getDefault().post(new MessageEvent("您已收到SecondActivity发送的事件！"));
                finish();//发送事件并将SecondActivity finish掉
            }
        });
    }
}
