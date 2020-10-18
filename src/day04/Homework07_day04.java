package day04;

import java.util.Scanner;

public class Homework07_day04 {

    public static void main(String[] args) {
        int choose1;
        int choose2;
        double sum=0;
        int discount =0;
        Scanner input = new Scanner(System.in);
        System.out.println("请选择您游玩的类型：");
        System.out.println("1.牌类");
        System.out.println("2.休闲竞技类");
        choose1 = input.nextInt();
        System.out.print("请输入您的游戏时长：");
        choose2 =input.nextInt();
        if(choose1==1){
            if(choose2<=10){
                discount=8;
                sum=10*choose2*0.8;
            }else{
                discount=5;
                sum=10*choose2*0.5;
            }
        }else{
            if(choose2<=10){
                discount=8;
                sum=20*choose2*0.8;
            }else{
                discount=5;
                sum=20*choose2*0.5;
            }
        }
        System.out.println("您玩的是休闲竞技类游戏，时长是："+choose2+"小时，可以享受"+discount+"折优惠");
        System.out.println("您需要支付"+sum+"个游戏币");


    }
}
