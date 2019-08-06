package com.example.samplelibrary2;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

public class ServiceAppCall {

    public static void callService(Context context,String requestMessage){
        Intent i = new Intent();
        i.putExtra("message",requestMessage);
        i.setComponent(new ComponentName("com.example.pocserviceapp", "com.example.pocserviceapp.services.ServiceWithHandler"));
        context.startService(i);
    }

}
