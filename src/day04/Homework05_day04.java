package day04;

import java.util.Scanner;

public class Homework05_day04 {

    public static void main(String[] args) {
        int num;
        System.out.println("请选择您喜爱的游戏：");
        System.out.println("");
        System.out.println("*****************");
        System.out.println("\t1.斗地主");
        System.out.println("\t2.斗牛");
        System.out.println("\t3.泡泡龙");
        System.out.println("\t4.连连看");
        System.out.println("*****************");
        System.out.print("请选择，输入数字：");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        switch (num){
            case 1:
                System.out.println("您已进入斗地主房间！");
                break;
            case 2:
                System.out.println("您已进入斗牛房间！");
                break;
            case 3:
                System.out.println("您已进入泡泡龙房间！");
                break;
            case 4:
                System.out.println("您已进入连连看房间！");
                break;
        }


    }
}
