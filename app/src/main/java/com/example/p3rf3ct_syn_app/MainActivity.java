package com.example.p3rf3ct_syn_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.p3rf3ct_syn_app.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'p3rf3ct_syn_app' library on application startup.
    static {
        System.loadLibrary("p3rf3ct_syn_app");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'p3rf3ct_syn_app' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}