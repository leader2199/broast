package com.example.admin.broast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class NetReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if(intent.getAction().equals(MainActivity.SEND)){
        String str =  intent.getExtras().getString(MainActivity.BRO);

        Toast.makeText(context,str,Toast.LENGTH_SHORT).show();}
        
    }
}
