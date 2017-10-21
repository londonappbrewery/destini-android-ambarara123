package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView storyTextView;
    Button buttonTop;
    Button buttonBottom;
    int mStoryIndex = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        storyTextView = (TextView) findViewById(R.id.storyTextView);
        buttonTop = (Button) findViewById(R.id.buttonTop);
        buttonBottom = (Button) findViewById(R.id.buttonBottom);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        buttonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex ==1) {
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonBottom.setText(R.string.T3_Ans2);
                    mStoryIndex = 3;
                }else if (mStoryIndex == 3){
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(view.GONE);
                    buttonBottom.setVisibility(view.GONE);
                }else if (mStoryIndex == 2){
                    storyTextView.setText(R.string.T3_Story);
                    buttonTop.setText(R.string.T3_Ans1);
                    buttonTop.setText(R.string.T3_Ans1);
                    mStoryIndex= 4;
                }else if (mStoryIndex == 4){
                    storyTextView.setText(R.string.T6_End);
                    buttonTop.setVisibility(view.GONE);
                    buttonBottom.setVisibility(view.GONE);
                }


            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        buttonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (mStoryIndex == 1) {
                    storyTextView.setText(R.string.T2_Story);
                    buttonBottom.setText(R.string.T2_Ans2);
                    buttonTop.setText(R.string.T2_Ans1);
                    mStoryIndex = 2;
                } else if (mStoryIndex == 3){
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(view.GONE);
                    buttonBottom.setVisibility(view.GONE);
                }else if (mStoryIndex==2){
                    storyTextView.setText(R.string.T4_End);
                    buttonTop.setVisibility(view.GONE);
                    buttonBottom.setVisibility(view.GONE);
                }else if(mStoryIndex == 4){
                    storyTextView.setText(R.string.T5_End);
                    buttonTop.setVisibility(view.GONE);
                    buttonBottom.setVisibility(view.GONE);
                }
            }
        });


    }
}
