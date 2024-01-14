package com.ohgiraffers.practice.looping;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /* 1부터 입력 받은 정수까지의 짝수의 합을 출력하세요.
         *
         * -- 입력 예시 --
         * 정수를 입력하세요 : 10
         *
         * -- 출력 예시 --
         * 1부터 10까지 짝수의 합 : 30
         * */

        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();

        int i = 0;

        for (int j = 0; j <= p; j++) {

            i += j++;

        } System.out.println("1부터 입력받은 정수 짝수의 합 : " + i);


    }

}
