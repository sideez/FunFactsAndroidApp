/*
 * Copyright (c) 2015. Sideez Inc.
 */

package com.sideez.funfacts;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class FunFactsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare view variables and assign values from layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.newFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        showFactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Update the label with dynamically selected fact
                factLabel.setText(FactBook.getFact());

                // Set background color with dynamically selected color
                int color = ColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);

                // Set button text color to same as background color
                showFactButton.setTextColor(color);
            }
        });

    }
}
