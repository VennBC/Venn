package day02.homework;
import com.sun.javaws.IconUtil;

import java.util.Scanner;
public class homework15_day02 {

    public static void main(String[] args) {
        double cost;
        System.out.print("请输入消费金额：");
        Scanner input = new Scanner(System.in);
        cost = input.nextDouble();
        System.out.println("是否参加优惠换购活动：");
        System.out.println("1，满50元加2元换购百事饮料一瓶。");
        System.out.println("2，满100元加3元换购500ml可乐一瓶。");
        System.out.println("3，满100元加10元换购5公斤面粉。");
        System.out.println("4，满200元加10元换购一个苏泊尔炒菜锅。");
        System.out.println("5，满200元加20元换购欧兰雅爽肤水一瓶。");
        System.out.println("0，不换购。");
        System.out.print("请选择：");
        int choose;
        Scanner input1 = new Scanner(System.in);
        choose = input1.nextInt();

        switch (choose){
            case 1:
                if(cost>=50){
                    cost= cost+2;
                    System.out.println("成功换购百事饮料一瓶。");
                }else{
                    System.out.println("不满足条件");
                }
                break;
            case 2:
                if(cost>=100){
                    cost= cost+3;
                    System.out.println("成功换购00ml可乐一瓶。");
                }else{
                    System.out.println("不满足条件");
                }
                break;
            case 3:
                if(cost>=100){
                    cost= cost+10;
                    System.out.println("成功换购5公斤面粉。");
                }else{
                    System.out.println("不满足条件");
                }
                break;
            case 4:
                if(cost>=200){
                    cost= cost+10;
                    System.out.println("成功换购一个苏泊尔炒菜锅。");
                }else{
                    System.out.println("不满足条件");
                }
                break;
            case 5:
                if(cost>=50){
                    cost= cost+20;
                    System.out.println("成功换购欧兰雅爽肤水一瓶。");
                }else{
                    System.out.println("不满足条件");
                }
                break;
            case 0:
                break;
            default:
                System.out.println("没有此选项");
        }
        System.out.println("本次消费金额为："+cost);




    }

}
