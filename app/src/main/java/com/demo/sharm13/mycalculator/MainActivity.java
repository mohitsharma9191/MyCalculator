package com.demo.sharm13.mycalculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

    EditText etNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         etNumber = (EditText)findViewById(R.id.etNumber);
    }

    public void btNum1Click(View view) {

        etNumber.setText(etNumber.getText()+"1");
    }

    public void btNum2Click(View view) {
        etNumber.setText(etNumber.getText()+"2");
    }

    public void btNum3Click(View view) {
        etNumber.setText(etNumber.getText()+"3");
    }

    public void btNum4Click(View view) {
        etNumber.setText(etNumber.getText()+"4");
    }

    public void btNum5Click(View view) {
        etNumber.setText(etNumber.getText()+"5");
    }

    public void btNum6Click(View view) {
        etNumber.setText(etNumber.getText()+"6");
    }

    public void btNum7Click(View view) {
        etNumber.setText(etNumber.getText()+"7");
    }

    public void btNum8Click(View view) {
        etNumber.setText(etNumber.getText()+"8");
    }

    public void btNum9Click(View view) {
        etNumber.setText(etNumber.getText()+"9");
    }

    public void btNum0Click(View view) {
        etNumber.setText(etNumber.getText()+"0");
    }

    public void btNumPMClick(View view) {
        int number = Integer.parseInt(etNumber.getText().toString());
        if(number > 0){
            etNumber.setText("-" + etNumber.getText());
        }

    }

    public void btNumDotClick(View view) {
        etNumber.setText(etNumber.getText()+".");
    }
}
