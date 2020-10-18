package day02.homework;

import java.util.Scanner;

public class homework12_day02 {

    public static void main(String[] args) {
        double cost;
        String id;
        System.out.println("请输入是否为会员是(yes)/否(其他字符)：");

        Scanner input1 = new Scanner(System.in);
        id = input1.next();
        System.out.println("请输入你的消费金额；");
        Scanner input = new Scanner(System.in);
        cost = input.nextDouble();
        if(id.equals("yes")){
            if(cost>=200){
                cost = cost*0.75;

            }else {
                cost  = cost*0.8;
            }
        }else {
            cost = cost*0.9;
        }
        System.out.print("实际支付："+cost+"元");

    }
}
