package com.demotxt.myapp.bottomsheet;

import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private LinearLayout bottomsheetlayout;
    private BottomSheetBehavior bottomsheetbehavior;
    private ImageView imgshare;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bottomsheetlayout = (LinearLayout) findViewById(R.id.bottomsheet);
        imgshare = (ImageView) findViewById(R.id.shareimg);
        bottomsheetbehavior = BottomSheetBehavior.from(bottomsheetlayout);
        // state hidden
        bottomsheetbehavior.setState(BottomSheetBehavior.STATE_HIDDEN);
        // state Collapsed
        //bottomsheetbehavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
        //state expanded
        //bottomsheetbehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
        imgshare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show Bottomsheet
                bottomsheetbehavior.setState(BottomSheetBehavior.STATE_EXPANDED);
            }
        });


    }
}
