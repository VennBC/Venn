package day03.homework;

import java.util.Scanner;

public class homework03_day03 {

    public static void main(String[] args) {
        String open = "123";
        String choose = "234";
        int code = 1;
        int cout;
        int a1 = 245;
        int a2 = 365;
        int a3 = 965;
        double sum = 0;

        System.out.println("MyShopping管理系统 > 购物结算");
        while (open.equals("123")) {
            System.out.println("************************");
            System.out.println("请选择购买的商品编号：");
            System.out.println("1.T恤" + "\t2.网球鞋" + "\t\t3.网球拍");
            System.out.println("************************");
            System.out.print("请输入购买的商品编号：");
            Scanner input = new Scanner(System.in);
            code = input.nextInt();
            System.out.print("请输入购买的数量：");
            cout = input.nextInt();

            switch (code) {
                case 1:
                    System.out.println("T恤  ￥245" + "\t数量：" + cout + "合计：" + "￥" + (a1 * cout));
                    sum += a1 * cout;
                    break;
                case 2:
                    System.out.println("网球鞋  ￥365" + "\t数量：" + cout + "\t\t合计：" + "￥" + (a2 * cout));
                    sum += a2 * cout;
                    break;
                case 3:
                    System.out.println("网球拍  ￥965" + "\t数量：" + cout + "\t\t合计：" + "￥" + (a3 * cout));
                    sum += a3 * cout;
                    break;
                default:
                    System.out.println("未有此商品，请重新输入。");
                    continue;
            }
            System.out.println("是否继续(y/n)?");
            choose = input.next();
            if (choose.equals("y")) {
                continue;
            } else {
                System.out.println("折扣：0.8");
                System.out.println("应付金额：" + (sum * 0.8));
                sum=sum * 0.8;
                System.out.print("实付金额：");
                double real = input.nextDouble();
                System.out.println("找零：" + (real - sum));
                break;
            }


        }
    }

}

