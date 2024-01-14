package com.ohgiraffers.practice;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        /*
         * 서울에서 패스트푸드의 늪에 빠진 람쥐가 몸무게를 잽니다.
         * 몸무게가 12kg 이상이면 비만이라고 출력되도록,
         * 아니면 정상이라고 출력되로록 작성하세요. (삼항 연산자 사용)
         *
         * 예) 7 입력
         *
         * ---- 출력 결과 ---
         * 정상!!!!!
         * */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String result = (num < 12)? "정상입니다" : "비만입니다";      // 삼항연산자
        System.out.println(result);

    }

}
