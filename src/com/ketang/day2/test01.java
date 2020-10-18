package com.ketang.day2;
import java.util.Random;
import java.util.Scanner;
public class test01 {
    public static void main(String[] args) {
        System.out.println("我行我素的购物管理系统>   幸运抽奖");
        Scanner input = new Scanner(System.in);
        int yourNumber = input.nextInt();
        int luckyNumber = 2345;
        int yourkey = yourNumber/100%10;
        int mykey = luckyNumber/100%10;
        if(yourkey == mykey){
            System.out.println("恭喜中奖");
        }else {
            System.out.println("谢谢惠顾");
        }

    }

}
