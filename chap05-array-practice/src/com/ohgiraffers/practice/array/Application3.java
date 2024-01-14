package com.ohgiraffers.practice.array;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 문자열을 하나 입력받아 문자 자료형 배열로 바꾼 뒤
         * 검색할 문자를 하나 입력 받아
         * 입력받은 검색할 문자가 배열에 몇 개 있는지를 출력하세요.
         *
         * -- 입력 예시 --
         * 문자열을 하나 입력하세요 : helloworld
         * 검색할 문자를 입력하세요 : l
         *
         * -- 출력 예시 --
         * 입력하신 문자열 helloworld에서 찾으시는 문자 l은 3개 입니다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println("문자열 하나를 입력하세요");
        String str1 = sc.nextLine();

        System.out.println("검색할 문자를 입력하세요");
        char ch = sc.next().charAt(0);
        int j = 0;

        for (int i = 0; i < str1.length(); i++){
            if(str1.charAt(i) == ch) {              //  str1.charAt("i" 만큼 돌렸을 때), ch와 같다면.
                j++;
            }
        }
        System.out.println("입력하신 문자열 " + str1 + "에서 찾으시는 문자 " + ch +"는 " + j + " 개 입니다");


    }

}
