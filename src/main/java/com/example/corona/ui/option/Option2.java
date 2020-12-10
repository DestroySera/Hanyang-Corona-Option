package com.example.corona.ui.option;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.corona.R;
import com.kyleduo.switchbutton.SwitchButton;

public class Option2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option2);

        // 스위치 버튼 상태에 따라 문자열을 출력할 텍스트뷰입니다.
        final TextView optionState = (TextView)findViewById(R.id.textView);


        // 스위치 버튼입니다.
        SwitchButton switchButton = (SwitchButton) findViewById(R.id.sb_use_listener);
        switchButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {


                // 스위치 버튼이 체크되었는지 검사하여 텍스트뷰에 각 경우에 맞게 출력합니다.
                if (isChecked){

                    optionState.setText("푸시 알람 비활성화");

                }else{

                    optionState.setText("푸시 알람 활성화");
                }
            }
        });
    }
}