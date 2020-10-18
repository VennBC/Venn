package day03.homework;

import java.util.Scanner;

public class homework02_day03 {

    public static void main(String[] args) {
        String open ="123";
        String choose = "234";
        int code = 1;

        System.out.println("MyShopping管理系统 > 购物结算");
        while (open.equals("123")){
            System.out.println("************************");
            System.out.println("请选择购买的商品编号：");
            System.out.println("1.T恤"+"\t2.网球鞋"+"\t\t3.网球拍");
            System.out.println("************************");
            System.out.print("请输入购买的商品编号：");
            Scanner input = new Scanner(System.in);
            code= input.nextInt();
            switch (code){
                case 1:
                    System.out.println("T恤  ￥245");
                    break;
                case 2:
                    System.out.println("网球鞋  ￥365");
                    break;
                case 3:
                    System.out.println("网球拍  ￥965");
                    break;
                default:
                    System.out.println("未有此商品，请重新输入。");
                    continue;
            }
            System.out.println("是否继续(y/n)?");
            choose = input.next();
            if(choose.equals("y")){
                continue;
            }else{
                break;
            }

        }
        System.out.println("程序结束");

    }
}
