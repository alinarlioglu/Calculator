package com.example.calculator;

import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorButton {
    private static final String TAG = "CalculatorButton";
    private String calBox, temporary;
    private TextView textView;
    private Button btnZero, btnOne, btnTwo, btnThree, btnFour, btnFive, btnSix, btnSeven, btnEight, btnNine, addition, minus, mul, div, equals, clear, square, power, sqrt, minusPower, cubeRoot;
    private int symbolIndex, beforeAddNo, afterAddNo, finalAnswer, squareRootNo, powerIndex, powerNumber, powerAnswer;
    private double son, beforeAdd;

    public CalculatorButton(TextView textView, Button btnZero, Button btnOne, Button btnTwo, Button btnThree, Button btnFour, Button btnFive, Button btnSix, Button btnSeven, Button btnEight, Button btnNine, Button addition, Button minus, Button mul, Button div, Button equals, Button clear, Button square, Button power, Button sqrt, Button minusPower, Button cubeRoot){
        this.textView = textView;
        this.btnZero = btnZero;
        this.btnOne = btnOne;
        this.btnTwo = btnTwo;
        this.btnThree = btnThree;
        this.btnFour = btnFour;
        this.btnFive = btnFive;
        this.btnSix = btnSix;
        this.btnSeven = btnSeven;
        this.btnEight = btnEight;
        this.btnNine = btnNine;
        this.addition = addition;
        this.minus =minus;
        this.mul = mul;
        this.div = div;
        this.equals = equals;
        this.clear = clear;
        this.square = square;
        this.minusPower = minusPower;
        this.power = power;
        this.sqrt = sqrt;
        this.cubeRoot = cubeRoot;

        calBox = "";
        powerIndex = 0;
        powerNumber = 0;
        powerAnswer = 0;
        symbolIndex = 0;
        beforeAddNo = 0;
        afterAddNo = 0;
        finalAnswer = 0;
    }

    public void cubeSqrt(){
        cubeRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "3(SQRT(";
                passToAnswerBox(calBox);
            }
        });
    }

    public void zeroPass(){
        btnZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "0";
                passToAnswerBox(calBox);
            }
        });
    }

    public void onePass(){
        btnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "1";
                passToAnswerBox(calBox);
            }
        });
    }

    public void twoPass(){
        btnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "2";
                passToAnswerBox(calBox);
            }
        });
    }

    public void threePass(){
        btnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "3";
                passToAnswerBox(calBox);
            }
        });
    }

    public void fourPass(){
        btnFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "4";
                passToAnswerBox(calBox);
            }
        });
    }

    public void fivePass(){
        btnFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "5";
                passToAnswerBox(calBox);
            }
        });
    }

    public void sixPass(){
        btnSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "6";
                passToAnswerBox(calBox);
            }
        });
    }

    public void sevenPass(){
        btnSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "7";
                passToAnswerBox(calBox);
            }
        });
    }

    public void eightPass(){
        btnEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "8";
                passToAnswerBox(calBox);
            }
        });
    }

    public void ninePass(){
        btnNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "9";
                passToAnswerBox(calBox);
            }
        });
    }

    public void add(){
        addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "+";
                passToAnswerBox(calBox);
            }
        });
    }

    public void subtract(){
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "-";
                passToAnswerBox(calBox);
            }
        });
    }

    public void multiply(){
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "*";
                passToAnswerBox(calBox);
            }
        });
    }

    public void powerOfNegative(){
        minusPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "^((negative)1)";
                passToAnswerBox(calBox);
            }
        });
    }

    public void divide(){
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "/";
                passToAnswerBox(calBox);
            }
        });
    }

    public void btnSqrt(){
        sqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "sqrt(";
                passToAnswerBox(calBox);
            }
        });
    }

    public void equal(){
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calBox.contains("3(SQRT(") && !(calBox.contains("+")) && !(calBox.contains("-")) && !(calBox.contains("*")) && !(calBox.contains("/"))){
                    symbolIndex = calBox.indexOf("(", 3);
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    for (int i=0;i<afterAddNo;++i){
                        if(i*i*i==afterAddNo){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                    }
                }
                if(calBox.contains("3(SQRT(") && (calBox.contains("+")) && !(calBox.contains("-")) && !(calBox.contains("*")) && !(calBox.contains("/"))){
                    symbolIndex = calBox.indexOf("(", 3);
                    powerIndex = calBox.indexOf("+");
                    beforeAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, powerIndex));
                    afterAddNo = Integer.parseInt(calBox.substring(powerIndex+1, calBox.length()));
                    finalAnswer = beforeAddNo + afterAddNo;

                    for (int i=0;i<afterAddNo;++i){
                        if(i*i*i==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                    }
                }
                if(calBox.contains("3(SQRT(") && !(calBox.contains("+")) && (calBox.contains("-")) && !(calBox.contains("*")) && !(calBox.contains("/"))){
                    symbolIndex = calBox.indexOf("(", 2);
                    powerIndex = calBox.indexOf("-");
                    beforeAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, powerIndex));
                    afterAddNo = Integer.parseInt(calBox.substring(powerIndex+1, calBox.length()));
                    finalAnswer = beforeAddNo - afterAddNo;

                    for (int i=0;i<afterAddNo;++i){
                        if(i*i*i==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                    }
                }
                if(calBox.contains("3(SQRT(") && !(calBox.contains("+")) && !(calBox.contains("-")) && (calBox.contains("*")) && !(calBox.contains("/"))){
                    symbolIndex = calBox.indexOf("(", 3);
                    powerIndex = calBox.indexOf("*");
                    beforeAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, powerIndex));
                    afterAddNo = Integer.parseInt(calBox.substring(powerIndex+1, calBox.length()));
                    finalAnswer = beforeAddNo * afterAddNo;

                    for (int i=0;i<afterAddNo;++i){
                        if(i*i*i==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                    }
                }
                if(calBox.contains("3(SQRT(") && !(calBox.contains("+")) && !(calBox.contains("-")) && !(calBox.contains("*")) && (calBox.contains("/"))){
                    symbolIndex = calBox.indexOf("(", 3);
                    powerIndex = calBox.indexOf("/");
                    beforeAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, powerIndex));
                    afterAddNo = Integer.parseInt(calBox.substring(powerIndex+1, calBox.length()));
                    System.out.println(afterAddNo);
                    finalAnswer = beforeAddNo / afterAddNo;

                    for (int i=0;i<afterAddNo;++i){
                        if(i*i*i==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                    }
                }
                if((calBox.contains("^")==false) && (calBox.contains("sqrt(")==false) && (calBox.contains("3(SQRT(")==false)) {
                    calculations();
                }
                if(calBox.contains("^((negative)1)") && !(calBox.contains("+")) && !(calBox.contains("-")) && !(calBox.contains("*")) && !(calBox.contains("/"))){
                    symbolIndex = calBox.indexOf("^");
                    beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
                    beforeAdd = (double) beforeAddNo;
                    son = 1 / beforeAdd;

                    clearAnswerBox();
                    calBox = "" + son;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("^") && !(calBox.contains("sqrt")) && !(calBox.contains("+")) && !(calBox.contains("-")) && !(calBox.contains("/")) && !(calBox.contains("*"))) {
                    symbolIndex = calBox.indexOf("^");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, calBox.length()));
                    beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }
                    clearAnswerBox();
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("^") && !(calBox.contains("sqrt")) && (calBox.contains("+")) && (calBox.indexOf("^")<(calBox.indexOf("+"))) && !(calBox.contains("-")) && !(calBox.contains("/")) && !(calBox.contains("*"))) {
                    symbolIndex = calBox.indexOf("^");
                    squareRootNo = calBox.indexOf("+");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, squareRootNo));
                    beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }

                    powerAnswer = Integer.parseInt(calBox.substring(squareRootNo+1, calBox.length()));
                    finalAnswer = finalAnswer + powerAnswer;

                    clearAnswerBox();
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("^") && !(calBox.contains("sqrt")) && (calBox.contains("+")) && (calBox.indexOf("^")>(calBox.indexOf("+"))) && !(calBox.contains("-")) && !(calBox.contains("/")) && !(calBox.contains("*"))) {
                    symbolIndex = calBox.indexOf("^");
                    squareRootNo = calBox.indexOf("+");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, calBox.length()));
                    beforeAddNo = Integer.parseInt(calBox.substring(squareRootNo+1, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }

                    powerAnswer = Integer.parseInt(calBox.substring(0, squareRootNo));
                    finalAnswer = finalAnswer + powerAnswer;

                    clearAnswerBox();
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("^") && !(calBox.contains("sqrt")) && !(calBox.contains("+")) && (calBox.contains("-")) && (calBox.indexOf("^")<(calBox.indexOf("-"))) && !(calBox.contains("/")) && !(calBox.contains("*"))) {
                    symbolIndex = calBox.indexOf("^");
                    squareRootNo = calBox.indexOf("-");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, squareRootNo));
                    beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }

                    powerAnswer = Integer.parseInt(calBox.substring(squareRootNo+1, calBox.length()));
                    finalAnswer = finalAnswer - powerAnswer;

                    clearAnswerBox();
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                    System.out.println("worked out the less than answer! " + calBox);
                }
                if(calBox.contains("^") && !(calBox.contains("sqrt")) && !(calBox.contains("+")) && (calBox.indexOf("^")>(calBox.indexOf("-"))) && (calBox.contains("-")) && !(calBox.contains("/")) && !(calBox.contains("*"))) {
                    symbolIndex = calBox.indexOf("^");
                    squareRootNo = calBox.indexOf("-");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, calBox.length()));
                    beforeAddNo = Integer.parseInt(calBox.substring(squareRootNo+1, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }

                    powerAnswer = Integer.parseInt(calBox.substring(0, squareRootNo));
                    finalAnswer = powerAnswer - finalAnswer;

                    clearAnswerBox();
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                    System.out.println("worked out the answer! " + calBox);
                }
                if(calBox.contains("^") && !(calBox.contains("sqrt")) && !(calBox.contains("+")) && !(calBox.contains("-")) && (calBox.indexOf("^")<(calBox.indexOf("*"))) && !(calBox.contains("/")) && (calBox.contains("*"))) {
                    symbolIndex = calBox.indexOf("^");
                    squareRootNo = calBox.indexOf("*");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, squareRootNo));
                    beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }

                    powerAnswer = Integer.parseInt(calBox.substring(squareRootNo+1, calBox.length()));
                    finalAnswer = finalAnswer * powerAnswer;

                    clearAnswerBox();
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("^") && !(calBox.contains("sqrt")) && !(calBox.contains("+")) && !(calBox.contains("-")) && !(calBox.contains("/")) && (calBox.contains("*")) && (calBox.indexOf("^")>(calBox.indexOf("*")))) {
                    symbolIndex = calBox.indexOf("^");
                    squareRootNo = calBox.indexOf("*");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, calBox.length()));
                    beforeAddNo = Integer.parseInt(calBox.substring(squareRootNo+1, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }

                    powerAnswer = Integer.parseInt(calBox.substring(0, squareRootNo));
                    finalAnswer = finalAnswer * powerAnswer;

                    clearAnswerBox();
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("^") && !(calBox.contains("sqrt")) && !(calBox.contains("+")) && !(calBox.contains("-")) && (calBox.indexOf("^")<(calBox.indexOf("/"))) && (calBox.contains("/")) && !(calBox.contains("*"))) {
                    symbolIndex = calBox.indexOf("^");
                    squareRootNo = calBox.indexOf("/");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, squareRootNo));
                    beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }

                    powerAnswer = Integer.parseInt(calBox.substring(squareRootNo+1, calBox.length()));
                    finalAnswer = finalAnswer / powerAnswer;

                    clearAnswerBox();
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("^") && !(calBox.contains("sqrt")) && !(calBox.contains("+")) && (calBox.indexOf("^")>(calBox.indexOf("/"))) && !(calBox.contains("-")) && (calBox.contains("/")) && !(calBox.contains("*"))) {
                    symbolIndex = calBox.indexOf("^");
                    squareRootNo = calBox.indexOf("/");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, calBox.length()));
                    beforeAddNo = Integer.parseInt(calBox.substring(squareRootNo+1, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }

                    powerAnswer = Integer.parseInt(calBox.substring(0, squareRootNo));
                    finalAnswer = powerAnswer / finalAnswer;

                    clearAnswerBox();
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("^") && (calBox.contains("sqrt")) && !(calBox.contains("+")) && !(calBox.contains("-")) && !(calBox.contains("/")) && !(calBox.contains("*"))) {
                    symbolIndex = calBox.indexOf("^");
                    powerIndex = calBox.indexOf("(");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex + 1, calBox.length()));
                    beforeAddNo = Integer.parseInt(calBox.substring(powerIndex+1, symbolIndex));
                    finalAnswer = 1;

                    for(int i=0;i<afterAddNo;++i){
                        finalAnswer = finalAnswer * beforeAddNo;
                    }

                    for(int i=0;i<finalAnswer;++i){
                        if((i*i)==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                        else if(i==(finalAnswer-1)){
                            clearAnswerBox();
                            calBox = "error - no sqrt detected";
                            passToAnswerBox(calBox);
                        }
                    }
                }
               /* if(calBox.contains("^2") && calBox.contains("+")){
                    symbolIndex = calBox.indexOf("+");
                    powerIndex = calBox.indexOf("^");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, powerIndex));
                    powerNumber = Integer.parseInt(calBox.substring(powerIndex+1, calBox.length()));
                    powerAnswer = fastPower(afterAddNo, powerNumber);

                    calBox = calBox.substring(0, symbolIndex+1) + powerAnswer;
                    calculations();
                }
                if(calBox.contains("^2") && calBox.contains("-")){
                    symbolIndex = calBox.indexOf("-");
                    powerIndex = calBox.indexOf("^");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, powerIndex));
                    powerNumber = Integer.parseInt(calBox.substring(powerIndex+1, calBox.length()));
                    powerAnswer = fastPower(afterAddNo, powerNumber);

                    calBox = calBox.substring(0, symbolIndex+1) + powerAnswer;
                    calculations();
                }
                if(calBox.contains("^2") && calBox.contains("*")){
                    symbolIndex = calBox.indexOf("*");
                    powerIndex = calBox.indexOf("^");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, powerIndex));
                    powerNumber = Integer.parseInt(calBox.substring(powerIndex+1, calBox.length()));
                    powerAnswer = fastPower(afterAddNo, powerNumber);

                    calBox = calBox.substring(0, symbolIndex+1) + powerAnswer;
                    calculations();
                }
                if(calBox.contains("^2") && calBox.contains("/")){
                    symbolIndex = calBox.indexOf("/");
                    powerIndex = calBox.indexOf("^");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, powerIndex));
                    powerNumber = Integer.parseInt(calBox.substring(powerIndex+1, calBox.length()));
                    powerAnswer = fastPower(afterAddNo, powerNumber);

                    calBox = calBox.substring(0, symbolIndex+1) + powerAnswer;
                    calculations();
                }*/
                if(calBox.contains("sqrt(") && calBox.contains("+") && !(calBox.contains("3("))){
                    powerIndex = calBox.indexOf("(");
                    symbolIndex = calBox.indexOf("+");
                    beforeAddNo = Integer.parseInt(calBox.substring(powerIndex+1, symbolIndex));
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    finalAnswer = beforeAddNo + afterAddNo;

                    for(int i=0;i<finalAnswer;++i){
                        if((i*i)==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                        else if(i==(finalAnswer-1)){
                            clearAnswerBox();
                            calBox = "error - no sqrt detected";
                            passToAnswerBox(calBox);
                        }
                    }
                }
                if(calBox.contains("sqrt(") && calBox.contains("-") && !(calBox.contains("3("))){
                    powerIndex = calBox.indexOf("(");
                    symbolIndex = calBox.indexOf("-");
                    beforeAddNo = Integer.parseInt(calBox.substring(powerIndex+1, symbolIndex));
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    finalAnswer = beforeAddNo - afterAddNo;

                    for(int i=0;i<finalAnswer;++i){
                        if((i*i)==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                        else if(i==(finalAnswer-1)){
                            clearAnswerBox();
                            calBox = "error - no sqrt detected";
                            passToAnswerBox(calBox);
                        }
                    }
                }
                if(calBox.contains("sqrt(") && calBox.contains("*") && !(calBox.contains("3("))){
                    powerIndex = calBox.indexOf("(");
                    symbolIndex = calBox.indexOf("*");
                    beforeAddNo = Integer.parseInt(calBox.substring(powerIndex+1, symbolIndex));
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    finalAnswer = beforeAddNo * afterAddNo;

                    for(int i=0;i<finalAnswer;++i){
                        if((i*i)==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                        else if(i==(finalAnswer-1)){
                            clearAnswerBox();
                            calBox = "error - no sqrt detected";
                            passToAnswerBox(calBox);
                        }
                    }
                }
                if(calBox.contains("sqrt(") && calBox.contains("/") && !(calBox.contains("3("))){
                    powerIndex = calBox.indexOf("(");
                    symbolIndex = calBox.indexOf("/");
                    beforeAddNo = Integer.parseInt(calBox.substring(powerIndex+1, symbolIndex));
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    finalAnswer = beforeAddNo / afterAddNo;

                    for(int i=0;i<finalAnswer;++i){
                        if((i*i)==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                        else if(i==(finalAnswer-1)){
                            clearAnswerBox();
                            calBox = "error - no sqrt detected";
                            passToAnswerBox(calBox);
                        }
                    }
                }
                if(calBox.contains("sqrt(") && !(calBox.contains("+")) && !(calBox.contains("-")) && !(calBox.contains("*")) && !(calBox.contains("/")) && !(calBox.contains("3("))){
                    symbolIndex = calBox.indexOf("(");
                    finalAnswer = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    for(int i=0;i<finalAnswer;++i){
                        if((i*i)==finalAnswer){
                            clearAnswerBox();
                            calBox = "" + i;
                            passToAnswerBox(calBox);
                            break;
                        }
                        else if(i==(finalAnswer-1)){
                            clearAnswerBox();
                            calBox = "error - no sqrt detected";
                            passToAnswerBox(calBox);
                        }
                    }
                }
            }
        });
    }

    public int fastPower(int x, int k){
        if(k==0){
            return 1;
        }
        int y=fastPower(x,k/2);
        if(k%2==0){
            return y*y;
        }
        return y*y*x;
    }

    public void calculations(){
        if(calBox.contains("+")){
            symbolIndex = calBox.indexOf("+");
            beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
            afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
            finalAnswer = beforeAddNo + afterAddNo;

            clearAnswerBox();
            calBox = "" + finalAnswer;
            passToAnswerBox(calBox);
        }
        if(calBox.contains("-")){
            symbolIndex = calBox.indexOf("-");
            beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
            afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
            finalAnswer = beforeAddNo - afterAddNo;

            clearAnswerBox();
            calBox = "" + finalAnswer;
            passToAnswerBox(calBox);
        }
        if(calBox.contains("*")){
            symbolIndex = calBox.indexOf("*");
            beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
            afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
            finalAnswer = beforeAddNo * afterAddNo;

            clearAnswerBox();
            calBox = "" + finalAnswer;
            passToAnswerBox(calBox);
        }
        if(calBox.contains("/")){
            symbolIndex = calBox.indexOf("/");
            beforeAddNo = Integer.parseInt(calBox.substring(0, symbolIndex));
            afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
            finalAnswer = beforeAddNo / afterAddNo;

            clearAnswerBox();
            calBox = "" + finalAnswer;
            passToAnswerBox(calBox);
        }
    }

    public void clearBox(){
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearAnswerBox();
            }
        });
    }

    public void squared(){
        square.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((calBox.contains("+")==false) && (calBox.contains("-")==false) && (calBox.contains("*")==false) && (calBox.contains("/")==false)){
                    squareRootNo = Integer.parseInt(calBox);
                    finalAnswer = squareRootNo * squareRootNo;
                    calBox = "" + finalAnswer;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("+")){
                    symbolIndex = calBox.indexOf("+");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    afterAddNo = afterAddNo * afterAddNo;
                    temporary = calBox.substring(0, symbolIndex+1);
                    calBox = "" + temporary + afterAddNo;
                    System.out.println(calBox);
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("-")){
                    symbolIndex = calBox.indexOf("-");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    afterAddNo = afterAddNo * afterAddNo;
                    temporary = calBox.substring(0, symbolIndex+1);
                    calBox = temporary + afterAddNo;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("*")){
                    symbolIndex = calBox.indexOf("*");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    afterAddNo = afterAddNo * afterAddNo;
                    temporary = calBox.substring(0, symbolIndex+1);
                    calBox = temporary + afterAddNo;
                    passToAnswerBox(calBox);
                }
                if(calBox.contains("/")){
                    symbolIndex = calBox.indexOf("/");
                    afterAddNo = Integer.parseInt(calBox.substring(symbolIndex+1, calBox.length()));
                    afterAddNo = afterAddNo * afterAddNo;
                    temporary = calBox.substring(0, symbolIndex+1);
                    calBox = temporary + afterAddNo;
                    passToAnswerBox(calBox);
                }
            }
        });
    }

    public void btnPower(){
        power.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calBox = calBox + "^";
                passToAnswerBox(calBox);
                System.out.println("power is working: " + calBox);
            }
        });
    }

    public void passToAnswerBox(String addToBox){
        textView.setText(addToBox);
    }

    public void clearAnswerBox(){
        calBox = "";
        textView.setText(calBox);
    }
}
