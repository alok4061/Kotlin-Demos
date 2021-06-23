package com.as.demos.Views;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.as.demos.R;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaDemos extends AppCompatActivity {
    private String blockCharacterSet = "\\";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.java_demos);
        EditText edit = findViewById(R.id.editDemo);
//        edit.setFilters(new InputFilter[] { filter });
        setEditTextInhibitInputSpeChar(edit);
        Button text = findViewById(R.id.showeditDemo);
        getOccur();
        stringSwap();
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(edit.getText().toString());
            }
        });



    }
    private InputFilter filter = new InputFilter() {

        @Override
        public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {


            if (source != null && blockCharacterSet.contains(("" + source))) {
                return "";
            }
            return null;
        }
    };

    public static void setEditTextInhibitInputSpeChar(EditText editText){

        InputFilter filter=new InputFilter() {
            @Override
            public CharSequence filter(CharSequence source, int start, int end, Spanned dest, int dstart, int dend) {
                String speChat="[<>/'\\\\'\']";
                Pattern pattern = Pattern.compile(speChat);
                Matcher matcher = pattern.matcher(source.toString());
                if(matcher.find())return "";
                else return null;
            }
        };
        editText.setFilters(new InputFilter[]{filter});
    }
    private void getOccur(){
        HashMap<String,Integer> data = new HashMap<>();
        String abd[] = {"b","b","b","d","d","d","c","d","d"};
        int completeValue = Integer.MAX_VALUE;
        String minOccur="";
        int lenght = abd.length/2;
        for (int i=0;i < abd.length;i++){
            if (data.containsKey(abd[i])){
                int value = data.get(abd[i])+1;
                data.put(abd[i],value);
            }else {
                data.put(abd[i],1);
            }
        }


//        for (Map.Entry<String,Integer> mapss: data.entrySet()){
//            if (completeValue >= mapss.getValue()){
//                completeValue = mapss.getValue();
//                minOccur = mapss.getKey()+completeValue;
//            }
//        }

        for (Map.Entry<String,Integer> mapss: data.entrySet()){
            if (lenght < mapss.getValue()){
                completeValue = mapss.getValue();
                minOccur = mapss.getKey()+completeValue;
            }else {
                minOccur = mapss.getKey()+-1;
            }
        }
        System.out.println(data);
        System.out.println(minOccur);
    }

     private void stringSwap(){
        String str = "user_name_hj";
        StringBuilder ans = new StringBuilder();
        boolean flag = false;
        for (int i = 0; i<str.length(); i++){
            char val = str.charAt(i);
            if (val == '_'){
                flag = true;
                String temp = "_"+str.charAt(i+1);
                ans.append(temp.replace(temp,str.toUpperCase().charAt(i+1)+""));
            }else if(flag){
                flag = false;
            }else if (val >= 'A' && val <= 'Z' ){
                String temp = String.valueOf(val);
                ans.append(temp.replace(temp,"_"+temp.toLowerCase()));
            }
            else {
                ans.append(val);
            }
        }
        System.out.println(ans.toString());
     }


}
