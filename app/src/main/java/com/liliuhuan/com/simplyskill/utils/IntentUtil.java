package com.liliuhuan.com.simplyskill.utils;

import android.content.Context;
import android.content.Intent;

import com.liliuhuan.com.simplyskill.MainActivity;
import com.liliuhuan.com.simplyskill.immersive.ImmersiveActivity;

/**
 * Created by liliuhuan on 2017/9/2.
 */

public class IntentUtil {

    public static void startActivity(Context context, Class clazz ) {
        Intent intent = new Intent(context,clazz);
        context.startActivity(intent);
    }
}
