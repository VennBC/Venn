package day02.homework;

import java.util.Scanner;

public class homework13_day02 {

    public static void main(String[] args) {
        System.out.print("请输入会员积分：");
        int score;
        int discount;
        Scanner input = new Scanner(System.in);
        score = input.nextInt();
        if(score>=8000){
            discount=6;
        }else if(score>=4000&&score<8000){
            discount=7;
        }else if(score>=2000&&score<4000){
            discount=8;
        }else {
            discount=9;
        }
        System.out.println("该会员的享受的折扣为："+discount+"折");

    }
}
