package day03.homework;

import java.util.Scanner;

public class homework04_day03 {

    public static void main(String[] args) {

        int code = 1;
        int key = 1;
        //显示主页面
        System.out.println("************************");
        System.out.println("欢迎使用MyShopping管理系统：");
        System.out.println("\t\t1，客户信息管理");
        System.out.println("\t\t2，购物结算");
        System.out.println("\t\t3，真情回馈");
        System.out.println("\t\t4，注销");
        System.out.println("************************");
        while (key == 1) {
            //用户输入选项
            System.out.print("请选择：输入数字：");
            Scanner input = new Scanner(System.in);
            code = input.nextInt();
            //判断用户输入的数字是否在范围内
            while (code != 1 && code != 2 && code != 3 && code != 4) {
                System.out.println("输入有误，请重新输入数字：");
                code = input.nextInt();

            }
            //根据用户所选执行相应程序
            switch (code) {
                case 1:
                    System.out.println("执行客户信息管理");
                    break;
                case 2:
                    System.out.println("执行购物结算");
                    break;
                case 3:
                    System.out.println("执行真情回馈");
                    break;
                case 4:
                    System.out.println("执行注销");
                    break;
            }
            //若执行通过，跳出循环
            if (code == 1 || code == 2 || code == 3 || code == 4) {
                break;
            }
        }
        System.out.println("程序结束");


    }

}
