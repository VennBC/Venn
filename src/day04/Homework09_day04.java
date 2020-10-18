package day04;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Homework09_day04 {

    public static void main(String[] args) {
        int num;
        int usernum;
        int userage;
        int usercode;
        System.out.print("请输入要录入用户的数量：");
        Scanner input = new Scanner(System.in);
        num = input.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.print("请输入用户编号(<四位整>):");
            usernum = input.nextInt();
            System.out.print("请输入用户年龄：");
            userage = input.nextInt();
            System.out.print("请输入会员积分：");
            usercode = input.nextInt();
            if(userage<=10){
                System.out.println("很抱歉，您的年龄不适合van游戏");
            }else {
                System.out.println("您录入的会员信息是：");
                System.out.println("用户编号："+usernum+"年龄："+userage+"积分："+usercode);
            }







        }
    }
}
