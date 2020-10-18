package day04;

import java.util.Scanner;

public class Homework06_day04 {

    public static void main(String[] args) {

        int choose ;
        int sum=0;
        String answer;
        Scanner input = new Scanner(System.in);


        for (int i =1; i <=5 ; i++) {
            System.out.print("您在玩第"+i+"局游戏,成绩为：");
            choose = input.nextInt();
            if(choose>80){
                sum += 1;
            }
            if(i<5){
                System.out.print("继续玩下一局吗？（yes/no）");
            }
            answer = input.next();
            if(answer.equals("no")){
                System.out.println("您已经中途退出游戏。");
                break;
            }else{
                System.out.println("进入下一局");
            }


        }
        System.out.println("游戏结束");
        if(sum>=4){
            System.out.println("恭喜，通过一级");
        }else if(sum==3){
            System.out.println("恭喜，通过二级");
        }else{
            System.out.println("对不起，您未能晋级/");
        }

    }
}
