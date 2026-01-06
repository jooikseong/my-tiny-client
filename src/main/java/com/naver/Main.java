package com.naver;

import com.naver.TinyCalculator;

public class Main {
    public static void main(String[] args) {
        TinyCalculator tinyCalculator = new TinyCalculator();
        System.out.println(tinyCalculator.add(1,2));
        System.out.println(tinyCalculator.sayHello("Tiny"));
    }
}
