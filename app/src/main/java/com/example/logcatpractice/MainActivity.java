package com.example.logcatpractice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.logcatpractice.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.middleButton.setOnClickListener(v -> {
            Log.i("인풋 텍스트", binding.textInput.getText().toString());
        });

        binding.topLeft.setOnClickListener(v -> {
            Log.i("버튼1", "첫번째 버튼!");
        });

        binding.topRight.setOnClickListener(v -> {
            Log.i("버튼2", "두번째 버튼!");
        });

        binding.bottomLeft.setOnClickListener(v -> {
            Log.i("버튼3", "세번째 버튼!");
        });

        binding.bottomRight.setOnClickListener(v -> {
            Log.i("버튼4", "네번째 버튼!");
        });
    }
}