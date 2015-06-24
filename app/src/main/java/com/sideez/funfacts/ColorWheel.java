package com.sideez.funfacts;

import android.graphics.Color;

import java.util.Random;

/**
 * Created by sideez on 2015-06-23.
 */
public class ColorWheel {

    // Member variable
    private static String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };

    // Get fact method
    public static int getColor() {
        int color;

        // Randomly select a color
        Random randomGenerator = new Random();
        color = Color.parseColor(mColors[(randomGenerator.nextInt(mColors.length))]);

        return color;
    }
}
