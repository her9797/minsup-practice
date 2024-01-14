package com.ohgiraffers.practice.conditional;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

        /* 람쥐가 축제 아르바이트를 시작했습니다.
         * 맥주를 판매하려면 성인인지 확인을 해야 해요.
         *
         * '나이가 어떻게 되세요?'를 출력하고 나이(정수)를 입력받아,
         * 성인이면 '판매 가능합니다.'를 출력하고,
         * 미성년자이면 '판매 불가능합니다. 음료 코너에서 골라주세요.'를 출력하세요.
         *
         * -- 입력 예시 --
         * 성인이십니까? 21
         *
         * -- 출력 예시 --
         * 판매 가능합니다.
         * */

        System.out.println("나이가 어떻게 되세요?");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if (num < 20){
            System.out.println("판매 불가능합니다. 음료 코너에서 골라주세요");
        } else if (20 <= num) {
            System.out.println("판매 가능합니다.");
        }

    }

}
