package com.example.basiccalculator;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    double op1 = 0, op2 = 0 ;
    boolean Add, Sub, Mul, Div, Deci, Mod, Pow, Sqrt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView displayer = findViewById(R.id.displayer);
        Button button_0 = findViewById(R.id.button_0);
        Button button_1 = findViewById(R.id.button_1);
        Button button_2 = findViewById(R.id.button_2);
        Button button_3 = findViewById(R.id.button_3);
        Button button_4 = findViewById(R.id.button_4);
        Button button_5 = findViewById(R.id.button_5);
        Button button_6 = findViewById(R.id.button_6);
        Button button_7 = findViewById(R.id.button_7);
        Button button_8 = findViewById(R.id.button_8);
        Button button_9 = findViewById(R.id.button_9);
        Button button_dot = findViewById(R.id.button_dot);
        Button button_add = findViewById(R.id.button_add);
        Button button_eq = findViewById(R.id.button_eq);
        Button button_sub = findViewById(R.id.button_sub);
        Button button_mul = findViewById(R.id.button_mul);
        Button button_div = findViewById(R.id.button_div);
        Button button_mod = findViewById(R.id.button_mod);
        Button button_pow = findViewById(R.id.button_pow);
        Button button_sqrt = findViewById(R.id.button_sqrt);
        Button button_clr = findViewById(R.id.button_clr);

        button_0.setOnClickListener(v -> displayer.setText(String.format("%s0", displayer.getText())));
        button_1.setOnClickListener(v -> displayer.setText(String.format("%s1", displayer.getText())));
        button_2.setOnClickListener(v -> displayer.setText(String.format("%s2", displayer.getText())));
        button_3.setOnClickListener(v -> displayer.setText(String.format("%s3", displayer.getText())));
        button_4.setOnClickListener(v -> displayer.setText(String.format("%s4", displayer.getText())));
        button_5.setOnClickListener(v -> displayer.setText(String.format("%s5", displayer.getText())));
        button_6.setOnClickListener(v -> displayer.setText(String.format("%s6", displayer.getText())));
        button_7.setOnClickListener(v -> displayer.setText(String.format("%s7", displayer.getText())));
        button_8.setOnClickListener(v -> displayer.setText(String.format("%s8", displayer.getText())));
        button_9.setOnClickListener(v -> displayer.setText(String.format("%s9", displayer.getText())));
        button_add.setOnClickListener(v -> {
            if (displayer.getText().length() != 0) {
                op1 = Float.parseFloat(displayer.getText().toString());
                Add = true;
                Deci = false;
                displayer.setText(null);
            }
        });
        button_sub.setOnClickListener(v -> {
            if (displayer.getText().length() != 0) {
                op1 = Float.parseFloat(displayer.getText().toString());
                Sub = true;
                Deci = false;
                displayer.setText(null);
            }
        });
        button_mul.setOnClickListener(v -> {
            if (displayer.getText().length() != 0) {
                op1 = Float.parseFloat(displayer.getText().toString());
                Mul = true;
                Deci = false;
                displayer.setText(null);
            }
        });
        button_div.setOnClickListener(v -> {
            if (displayer.getText().length() != 0) {
                op1 = Float.parseFloat(displayer.getText().toString());
                Div = true;
                Deci = false;
                displayer.setText(null);
            }
        });
        button_mod.setOnClickListener(v -> {
            if (displayer.getText().length() != 0) {
                op1 = Float.parseFloat(displayer.getText().toString());
                Mod = true;
                Deci = false;
                displayer.setText(null);
            }
        });
        button_pow.setOnClickListener(v -> {
            if (displayer.getText().length() != 0) {
                op1 = Float.parseFloat(displayer.getText().toString());
                Pow = true;
                Deci = false;
                displayer.setText(null);
            }
        });
        button_sqrt.setOnClickListener(v -> {
            if (displayer.getText().length() == 0) {
                Sqrt = true;
                Deci = false;
                displayer.setText(null);
            }
            else displayer.setText(R.string.snterr);
        });
        button_clr.setOnClickListener(v -> {
            displayer.setText("");
            op1 = 0.0;
            op2 = 0.0;
        });
        button_dot.setOnClickListener(v -> {
            if (!(Deci)){
                displayer.setText(String.format("%s.", displayer.getText()));
                Deci = true;
            }
        });
        button_eq.setOnClickListener(v -> {
            if (Add || Sub || Mul || Div || Mod || Pow || Sqrt) {
                op2 = Float.parseFloat(displayer.getText().toString());
            }

            if (Add) {

                displayer.setText(String.format("%s", op1 + op2));
                Add = false;
            }

            if (Sub) {

                displayer.setText(String.format("%s", op1 - op2));
                Sub = false;
            }

            if (Mul) {
                displayer.setText(String.format("%s", op1 * op2));
                Mul = false;
            }

            if (Div) {
                displayer.setText(String.format("%s", op1 / op2));
                Div = false;
            }
            if (Mod) {
                displayer.setText(String.format("%s", op1 % op2));
                Mod = false;
            }
            if (Pow) {
                displayer.setText(String.format("%s", Math.pow(op1,op2)));
                Pow = false;
            }
            if (Sqrt) {
                displayer.setText(String.format("%s", Math.sqrt(op2)));
                Sqrt = false;
            }
        });
    }
}