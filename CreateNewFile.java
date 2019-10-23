package day13;

import javax.swing.*;

public class RemoveVowels {
//write a method that would replace every vowel in the string with X.
//    hint you have to use .char

    public static void main(String[] args) {
//        iWantToCallSomeMethod(a);
//        RemoveWovelsSlow();
        String input = "TechnoStudy";
        int N = input.length();

        //input TechnoStudy
        //output TXchXStXdX
        char x = input.charAt(4);
//        System.out.println("A" + "B");
        iWantToCallSomeMethod(input);
    }


    static void RemoveWovelsSena(String a) {
        for (int i = 0; i <= a.length(); i++) {
            if (a.contains("e") || a.contains("o") || a.contains("u") || a.contains("y")) {
                System.out.println("X");
            }
            System.out.println(i);
        }
    }

    static void RemoveWovelsTahsin() {
        String input = "TechnoStudy";
        input = input.replaceAll("[AaEeIiOoUu]", "X");
        System.out.println(input);
    }

    private static void RemoveWovelsSlow() {
        String input = "TechnoStudy";
        input = input.replaceAll("a", "X");
        System.out.println(input);
    }

    private static void verySimpleApproach() {
        String input = "TechnoStudy";
        String result = null;
        char e = 'e';
        char a = 'a';
        char u = 'u';

        result = input.replace(e, 'X');
        result = input.replace(a, 'X');
        result = input.replace(u, 'X');
    }

    private static void iWantToCallSomeMethod(String s) {

    }

}
