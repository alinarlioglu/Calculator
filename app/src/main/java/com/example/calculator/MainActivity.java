package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CalculatorButton calculatorButton = new CalculatorButton((TextView) findViewById(R.id.answerBox), (Button) findViewById(R.id.zero), (Button) findViewById(R.id.one)
        , (Button) findViewById(R.id.two), (Button) findViewById(R.id.three), (Button) findViewById(R.id.four), (Button) findViewById(R.id.five),
                (Button) findViewById(R.id.six), (Button) findViewById(R.id.seven), (Button) findViewById(R.id.eight),
                (Button) findViewById(R.id.nine), (Button) findViewById(R.id.add), (Button) findViewById(R.id.minus), (Button) findViewById(R.id.mult), (Button) findViewById(R.id.divide),
                (Button) findViewById(R.id.equals), (Button) findViewById(R.id.clear), (Button) findViewById(R.id.square), (Button) findViewById(R.id.power), (Button) findViewById(R.id.sqrt), (Button) findViewById(R.id.minusPower), (Button) findViewById(R.id.cubeRoot));

        calculatorButton.zeroPass();
        calculatorButton.onePass();
        calculatorButton.twoPass();
        calculatorButton.threePass();
        calculatorButton.fourPass();
        calculatorButton.fivePass();
        calculatorButton.sixPass();
        calculatorButton.sevenPass();
        calculatorButton.eightPass();
        calculatorButton.ninePass();
        calculatorButton.add();
        calculatorButton.subtract();
        calculatorButton.multiply();
        calculatorButton.divide();
        calculatorButton.equal();
        calculatorButton.clearBox();
        calculatorButton.squared();
        calculatorButton.btnPower();
        calculatorButton.btnSqrt();
        calculatorButton.powerOfNegative();
        calculatorButton.cubeSqrt();
    }
}
