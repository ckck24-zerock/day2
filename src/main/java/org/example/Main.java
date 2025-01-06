package org.example;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //오직 br.readLine()만 사용

        String str = br.readLine();

        //소수 처리
        double value1 = Double.parseDouble(str); //문자열을 Double로 처리

        //정수
        int value2 = Integer.parseInt(str);






    }
}