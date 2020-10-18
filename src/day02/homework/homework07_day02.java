package day02.homework;

import java.util.Scanner;

public class homework07_day02 {

    public static void main(String[] args) {
        String answer;
        System.out.println("你爱我吗？");
        System.out.print("你的回答是：");
        Scanner input = new Scanner(System.in);
        answer = input.next();
        if(answer.equals("yes")){
            System.out.println("你是爱我的");
        }else if(answer.equals("no")){
            System.out.println("原来你不爱我");
        }else{
            System.out.println("你到底是爱还是不爱，自己也不清楚");
        }

    }
}
