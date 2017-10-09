package com.lee.asher.drawablestudy;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

    ExpandingCircleAnimationDrawable mCircle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv = (ImageView) findViewById(R.id.image);

        mCircle = new ExpandingCircleAnimationDrawable(200);
        iv.setImageDrawable(mCircle);
    }

    @Override
    protected void onResume() {
        super.onResume();
        mCircle.start();
    }

    @Override
    protected void onPause() {
        mCircle.stop();
        super.onPause();
    }
}
