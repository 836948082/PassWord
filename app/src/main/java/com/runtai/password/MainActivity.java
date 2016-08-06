package com.runtai.password;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private PwdInputView mpwd1;
    private PwdInputView mpwd2;
    private PwdInputView mpwd3;
    private PwdInputView mpwd4;
    private TextView tv_showPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mpwd1 = (PwdInputView) findViewById(R.id.pwd_input_view1);
        mpwd2 = (PwdInputView) findViewById(R.id.pwd_input_view2);
        mpwd3 = (PwdInputView) findViewById(R.id.pwd_input_view3);
        mpwd4 = (PwdInputView) findViewById(R.id.pwd_input_view4);
        tv_showPwd = (TextView) findViewById(R.id.tv_showpwd);

        //设置监听内部输入的字符
        mpwd4.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                tv_showPwd.setText(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        //设置是否显示密码
        mpwd1.setDisplayPasswords(false);
        mpwd2.setDisplayPasswords(true);
        mpwd3.setDisplayPasswords(true,"密");
        mpwd4.setDisplayPasswords(true,R.drawable.icon_pwd);

        //设置未输入时默认显示的文字 默认空白
        mpwd1.setPwdInputViewType(PwdInputView.ViewType.UNDERLINE);
        mpwd2.setPwdInputViewType(PwdInputView.ViewType.BIASLINE);

        //设置方框的圆角度数
        mpwd2.setRadiusBg(20);
        mpwd3.setRadiusBg(0);

    }
}
