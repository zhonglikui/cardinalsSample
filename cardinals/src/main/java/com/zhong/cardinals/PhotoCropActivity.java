package com.zhong.cardinals;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.zhong.cardinals.util.Logger;

/**
 * @deprecated
 */
public class PhotoCropActivity extends AppCompatActivity {
    public static String PARAM_PATH = "path";
    String resultPath = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        resultPath = getIntent().getStringExtra(PARAM_PATH);
        Logger.d("�ü��󷵻ص�path:" + resultPath);
        Intent intent = new Intent();
        intent.putExtra(PARAM_PATH, resultPath);
        setResult(RESULT_OK, intent);
        finish();
    }


}
