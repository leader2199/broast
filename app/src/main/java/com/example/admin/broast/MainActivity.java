package com.example.admin.broast;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    NetReceiver netReceiver= new NetReceiver();
    Button but;
    public static final String SEND="theleader";
    public static final String BRO="tonystark";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        but=this.findViewById(R.id.but);
        but.setOnClickListener(this);

    }



    @Override
    protected void onStart() {
        super.onStart();
        setBroast();
    }

    private void setBroast(){
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SEND);
        registerReceiver(netReceiver,intentFilter);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setAction(SEND);
        intent.putExtra(BRO,"Tony Stark");
        sendBroadcast(intent);
    }
}
