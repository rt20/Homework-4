package com.javaprogram;

import java.util.*;

public class Calculator {
    public static void main(String[] args) {

        char operator;
        Double angka1, angka2, result;

        // Scanner class
        Scanner input = new Scanner(System.in);

        // pilih operator
        System.out.println("Pilih operator: +, -, *, atau /");
        operator = input.next().charAt(0);

        // input angka pertama
        System.out.println("Angka Pertama");
        angka1 = input.nextDouble();

        // input angka kedua
        System.out.println("Angka Kedua");
        angka2 = input.nextDouble();

        switch (operator) {


            case '+':
                result = angka1 + angka2;
                System.out.println(angka1 + " + " + angka2 + " = " + result);
                break;


            case '-':
                result = angka1 - angka2;
                System.out.println(angka1 + " - " + angka2 + " = " + result);
                break;


            case '*':
                result = angka1 * angka2;
                System.out.println(angka1 + " * " + angka2 + " = " + result);
                break;


            case '/':
                result = angka1 / angka2;
                System.out.println(angka1 + " / " + angka2 + " = " + result);
                break;

            default:
                System.out.println("Operator Salah");
                break;
        }

        input.close();
    }
}
