package com.ohgiraffers.practice.looping;

public class Application1 {

    public static void main(String[] args) {

        /* 1부터 10까지 합계를 구하고 결과를 출력하세요.
         *
         * -- 출력 예시 --
         * 1부터 10까지의 합 : 55
         * */

        int i = 0;

        for (int j = 1; j <= 10; j++) {
            i += j;

        } System.out.println("1부터 10까지의 합 : " + i);

    }

}
