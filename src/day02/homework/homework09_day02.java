package day02.homework;

import java.util.Scanner;

public class homework09_day02 {
    public static void main(String[] args) {
        int score;
        System.out.println("请输入成绩：");
        Scanner input = new Scanner(System.in);
        score = input.nextInt();
        if(score>=60){
            if(score>=90){
                System.out.println("此同学成绩评级为A");
            }else{
                System.out.println("此同学成绩评级为B");
            }
        }else{
            System.out.println("此同学成绩评级为C");
        }

    }
}
