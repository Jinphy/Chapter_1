package com.example.jinphy.chapter_1;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by jinphy on 2017/7/18.
 */

public class MyTextView extends TextView {
    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

        private static final String TAG = "MyTextView";
        @Override
        public boolean dispatchTouchEvent(MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    Log.e(TAG, "dispatchTouchEvent: ACTION_DOWN");
                    break;
                case MotionEvent.ACTION_MOVE:
                    Log.e(TAG, "dispatchTouchEvent: ACTION_MOVE");
                    break;
                case MotionEvent.ACTION_UP:
                    Log.e(TAG, "dispatchTouchEvent: ACTION_UP");
                    break;
                case MotionEvent.ACTION_CANCEL:
                    Log.e(TAG, "dispatchTouchEvent: ACTION_CANCEL");
                    break;

            }
            return super.dispatchTouchEvent(event);
        }

        @Override
        public boolean onTouchEvent(MotionEvent event) {
            switch (event.getAction()) {
                case MotionEvent.ACTION_DOWN:
                    Log.e(TAG, "onTouchEvent: ACTION_DOWN");
                    break;
                case MotionEvent.ACTION_MOVE:
                    Log.e(TAG, "onTouchEvent: ACTION_MOVE");
                    break;
                case MotionEvent.ACTION_UP:
                    Log.e(TAG, "onTouchEvent: ACTION_UP");
                    break;
                case MotionEvent.ACTION_CANCEL:
                    Log.e(TAG, "onTouchEvent: ACTION_CANCEL");
                    break;

            }
            return super.onTouchEvent(event);
        }
}