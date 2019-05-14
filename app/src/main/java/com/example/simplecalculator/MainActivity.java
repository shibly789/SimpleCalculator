package com.example.simplecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bmul,bdiv,bclr,beql;
    private TextView result;
    //double num1,num2;
    // boolean add,sub,mul,div;
    private String firstValue, secondValue;
    private String operator;
    private boolean hasOperator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btn1);
        b2 = findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);
        b0 = findViewById(R.id.btn0);
        badd = findViewById(R.id.btnadd);
        bsub = findViewById(R.id.btnsub);
        bmul = findViewById(R.id.btnmul);
        bdiv = findViewById(R.id.btndiv);
        bclr = findViewById(R.id.btnclr);
        beql = findViewById(R.id.btnequal);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        b0.setOnClickListener(this);
        badd.setOnClickListener(this);
        bsub.setOnClickListener(this);
        bmul.setOnClickListener(this);
        bdiv.setOnClickListener(this);
        bclr.setOnClickListener(this);
        beql.setOnClickListener(this);


        result = findViewById(R.id.tv);

        resetValues();

//        b1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"1");
//            }
//        });
//
//        b2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"2");
//            }
//        });
//
//        b3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"3");
//            }
//        });
//
//        b4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"4");
//            }
//        });
//
//        b5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"5");
//            }
//        });
//
//        b6.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"6");
//            }
//        });
//
//        b7.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"7");
//            }
//        });
//
//        b8.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"8");
//            }
//        });
//
//        b9.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"9");
//            }
//        });
//
//        b0.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                result.setText(result.getText()+"0");
//            }
//        });
//
//        badd.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                num1 = Double.parseDouble(result.getText()+"");
//                add = true;
//                result.setText(null);
//            }
//        });
//
//        bsub.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                num1 = Double.parseDouble(result.getText()+"");
//                sub = true;
//                result.setText(null);
//            }
//        });
//
//        bmul.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                num1 = Double.parseDouble(result.getText()+"");
//                mul = true;
//                result.setText(null);
//            }
//        });
//
//        bdiv.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                num1 = Double.parseDouble(result.getText()+"");
//                div = true;
//                result.setText(null);
//            }
//        });
//
//        beql.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                num2 = Double.parseDouble(result.getText()+"");
//                if(add==true){
//                    result.setText(num1+num2+"");
//                    add=false;
//                }
//
//                if(sub==true){
//                    result.setText(num1-num2+"");
//                    sub=false;
//                }
//
//                if(mul==true){
//                    result.setText(num1*num2+"");
//                    mul=false;
//                }
//
//                if(div==true){
//                    result.setText(num1/num2+"");
//                    div=false;
//                }
//            }
//        });
        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(null);
            }
        });

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn0:
                appendNumberAfterClick("0");
                break;
            case R.id.btn1:
                appendNumberAfterClick("1");
                break;
            case R.id.btn2:
                appendNumberAfterClick("2");
                break;
            case R.id.btn3:
                appendNumberAfterClick("3");
                break;
            case R.id.btn4:
                appendNumberAfterClick("4");
                break;
            case R.id.btn5:
                appendNumberAfterClick("5");
                break;
            case R.id.btn6:
                appendNumberAfterClick("6");
                break;
            case R.id.btn7:
                appendNumberAfterClick("7");
                break;
            case R.id.btn8:
                appendNumberAfterClick("8");
                break;
            case R.id.btn9:
                appendNumberAfterClick("9");
                break;
            case R.id.btnadd:
                clickOperator("+");
                break;
            case R.id.btnsub:
                clickOperator("-");
                break;
            case R.id.btnmul:
                clickOperator("*");
                break;
            case R.id.btndiv:
                clickOperator("/");
                break;
            case R.id.btnclr:
                result.setText("");
                resetValues();
                break;
            case R.id.btnequal:
                if(!firstValue.equals("") && !secondValue.equals("") && !operator.equals("")){
                    calculate(operator);
                    resetValues();
                } else{
                    Toast.makeText(this, "Something went wrong! do a proper way", Toast.LENGTH_SHORT).show();
                }
                break;

        }
    }

    private void resetValues() {
        firstValue = "";
        secondValue = "";
        operator = "";
        hasOperator = false;
    }


    private void appendNumberAfterClick(String number){
        if(hasOperator){
            secondValue += number;
            result.setText(secondValue);
        } else{
            firstValue += number;
            result.setText(firstValue);
        }
    }

    private void clickOperator(String op){
        if(!firstValue.equals("") && !secondValue.equals("")){
            calculate(op);
        } else if(!firstValue.equals("")){
            operator = op;
            hasOperator = true;
        } else{
            Toast.makeText(this, "Type a number first!", Toast.LENGTH_SHORT).show();
        }
    }


    // when click the calculate button/operator button after added to operand
    private void calculate(String operator){
        switch (operator){
            case "+":
                result.setText(String.valueOf(Double.parseDouble(firstValue) + Double.parseDouble(secondValue)));
                break;
            case "-":
                result.setText(String.valueOf(Double.parseDouble(firstValue) - Double.parseDouble(secondValue)));
                break;
            case "*":
                result.setText(String.valueOf(Double.parseDouble(firstValue) * Double.parseDouble(secondValue)));
                break;
            case "/":
                if(!secondValue.equals("0")) {
                    result.setText(String.valueOf(Double.parseDouble(firstValue) / Double.parseDouble(secondValue)));
                } else{
                    result.setText("Cannot divided by zero");
                }
                break;
        }
    }



}
