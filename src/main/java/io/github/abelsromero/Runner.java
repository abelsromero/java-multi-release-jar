package io.github.abelsromero;

import io.github.abelsromero.multis.StringTools;

public class Runner {


    public static void main(String[] args) {
        final StringTools strings = new StringTools();

        String a = "aaa";
        String b = "aaa";
        String result = strings.concat(a, b);

        System.out.println("Result: " + result );
    }
}
