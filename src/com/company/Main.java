package com.company;

import java.util.function.BinaryOperator;

public class Main {

    public static void main(String[] args) {
        int value = 13;
        int bitIndex = 2;
        System.out.println(Integer.toBinaryString(value) );
        System.out.println(Integer.toBinaryString ((int)Math.pow(2, (bitIndex-1))));
        System.out.println(Integer.toBinaryString(value ^ ((int)Math.pow(2, (bitIndex-1)))));
        System.out.println(value ^ ((int)Math.pow(2, (bitIndex-1))));

    }
}
