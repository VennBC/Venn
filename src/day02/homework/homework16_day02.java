package day02.homework;

import java.util.Scanner;

public class homework16_day02 {

    public static void main(String[] args) {
        int month;
        System.out.print("请输入月份：");
        Scanner input = new Scanner(System.in);
        month = input.nextInt();
        if(month==1||month==2||month==12){
            System.out.println("在冬季");
        }else if(month==3||month==4||month==5){
            System.out.println("在春季");
        }else if(month==6||month==7||month==8){
            System.out.println("在秋季");
        }else if(month==9||month==10||month==11){
            System.out.println("在冬季");
        }


    }
}
