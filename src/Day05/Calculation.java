package Day05;

import java.util.Scanner;

public class Calculation {

    int achievement;
    int javaachievement;
    int cachievement;
    int DBachievement;

    public void calculation(){
        int total;
        double avg;
        Scanner input=new Scanner(System.in);
        System.out.print("请输入Java成绩：");
        javaachievement=input.nextInt();
        System.out.print("请输入C#成绩：");
        cachievement=input.nextInt();
        System.out.print("请输入DB成绩：");
        DBachievement=input.nextInt();

        total=javaachievement+cachievement+DBachievement;
        System.out.println("总成绩为"+total);
        avg=(javaachievement+cachievement+DBachievement)/3;
        System.out.print("平均成绩是："+avg);

    }

    public static void main(String[] args) {
        Calculation calculation=new Calculation();
        calculation.calculation();
    }
}
