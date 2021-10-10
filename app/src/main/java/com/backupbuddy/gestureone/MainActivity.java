package com.backupbuddy.gestureone;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;
import androidx.core.view.MotionEventCompat;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private GestureDetectorCompat detector;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        detector = new GestureDetectorCompat(this, onSwipeListener);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return detector.onTouchEvent(event);
    }

    OnSwipeListener onSwipeListener = new OnSwipeListener() {
        @Override
        public boolean onSwipe(Direction direction) {
            if(direction == Direction.left) {
                new CustomToast(MainActivity.this,"Left Swipe").ShowToast();
                return true;
            }
            else if(direction == Direction.up) {
                new CustomToast(MainActivity.this,"Upward Swipe").ShowToast();
                return true;
            }
            else if(direction == Direction.down) {
                new CustomToast(MainActivity.this,"Downward Swipe").ShowToast();
                return true;
            }
            else if(direction == Direction.right) {
                new CustomToast(MainActivity.this,"Right Swipe").ShowToast();
                return true;
            }
            return super.onSwipe(direction);
        }
    };
}