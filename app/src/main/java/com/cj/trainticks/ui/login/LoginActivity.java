package com.cj.trainticks.ui.login;

import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;

import com.cj.trainticks.ui.main.MainActivity;
import com.cj.trainticks.R;
import com.cj.trainticks.ui.register.RegisterActivity;
import com.uits.baseproject.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    private AppCompatButton mBtnLogin, mBtnRegister;


    @Override
    public void onInit() {
        mBtnLogin = findViewById(R.id.mBTNLogin);
        mBtnRegister = findViewById(R.id.mBTNRegister);
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_login;
    }

    @Override
    public void onEvent() {
        onInit();
        onClick();
    }

    private void onClick() {
        mBtnRegister.setOnClickListener(v -> {
            startActivity(new Intent(this, RegisterActivity.class));
        });
        mBtnLogin.setOnClickListener(v -> {
            startActivity(new Intent(this, MainActivity.class));
        });

    }
}