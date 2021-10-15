package com.example.scratchpad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("Calculated Version: " + calculator("-", 39, 15));
        add();
        addNum(5, 10);

        int a, b;
        a = 20;
        b = 50;

        addNum(a, b);
    }

    public void add() {
        int a, b, c;
        a = 10;
        b = 20;
        c = a + b;
        System.out.println(c);
    }

    public void addNum(int firstNumber, int secondNumber) {
        int equals = firstNumber + secondNumber;
        System.out.println(equals);
    }

    public int calculator(String operator, int firstNumber, int secondNumber) {
        int output;
        switch(operator) {
            case "+":
                output = add(firstNumber, secondNumber);
                break;
            case "-":
                output = subtract(firstNumber, secondNumber);
                break;
            case "x":
                output = multiply(firstNumber, secondNumber);
                break;
            case "*":
                output = multiply(firstNumber, secondNumber);
                break;
            case "/":
                output =  divide(firstNumber, secondNumber);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + operator);
        }
        return output;
    }

    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }
}