package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            reverse();
        }
    }

    private static void reverse(){
        System.out.println("Введите слово");
        String st = scanner.nextLine();
        StringBuffer stringBuffer = new StringBuffer(st);
        System.out.println(stringBuffer.reverse());



    }
}
