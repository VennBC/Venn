package day02.homework;

import java.util.Scanner;

public class homework11_day02 {

    public static void main(String[] args) {
        int number;

        System.out.print("请输入会员号(4位整数)：");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number<1000||number>=10000){
            System.out.println("会员号码有误，请重新输入。");
        }
        System.out.print("\n");
        String birthday;
        System.out.print("请输入会员生日（<月/日>两位数）：");
        Scanner input1 = new Scanner(System.in);
        birthday = input1.next();
        System.out.print("\n");
        int score;
        System.out.print("请输入会员积分：");
        Scanner input2 = new Scanner(System.in);
        score = input2.nextInt();
        System.out.print("\n");
        System.out.println("已录入的会员信息是：");
        System.out.println(number+"\t"+birthday+"\t"+score);



    }
}
