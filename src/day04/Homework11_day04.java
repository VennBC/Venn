package day04;

import java.util.Scanner;

public class Homework11_day04 {


    public static void main(String[] args) {
        System.out.println("请输入会员的消费记录：");


        Scanner input = new Scanner(System.in);

        String[]price=new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("请输入第"+i+"笔购物金额：");
            price[i] = input.next();
        }
        System.out.println("序号"+"\t\t\t金额（元）");
        for (int j = 0; j <5 ; j++) {
            System.out.println(j+"\t\t\t"+price[j]);

        }

    }
}
