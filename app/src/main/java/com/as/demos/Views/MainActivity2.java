package com.as.demos.Views;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int arrray[] = new int[]{10,2,40,10,9,10};
//        ArrayList<Integer> arrray = new ArrayList();
//        arrray.add(10);
//        arrray.add(2);
//        arrray.add(40);
//        arrray.add(10);
//        arrray.add(9);
//        arrray.add(10);


        for (int i = 0; i < arrray.length; i++ ) {
            int a = arrray[i];
            for (int j = 0 ; j < arrray.length; j++) {
                int b = arrray[j];
                int temp = 0;
                if (a < b) {
                    temp = arrray[i];
                    arrray[i] = arrray[j];
                    arrray[j] = temp;
                }
            }
            System.out.println(Arrays.toString(arrray));

        }

    }
}
