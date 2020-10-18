package day04;

import java.util.Scanner;

public class Homework08_day04 {
    public static void main(String[] args) {
        int point;
        int sum=0;
        double a;
        Scanner input = new Scanner(System.in);

        for (int i = 1; i < 5; i++) {
            System.out.print("请输入第"+i+"个游戏的点击率：");
            point=input.nextInt();
            if(point>100){
                sum+=1;
            }




        }
        a = (double) sum/4;
        a =a*100;
        System.out.println("点击率大于100的游戏数是："+sum);
        System.out.println("点击率大于100的游戏所占比例是："+a+"%");


    }
}


