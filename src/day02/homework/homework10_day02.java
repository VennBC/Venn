package day02.homework;

import java.util.Scanner;

public class homework10_day02 {

    public static void main(String[] args) {
        String date;
        System.out.print("请输入星期:");
        Scanner input = new Scanner(System.in);
        date = input.next();
        switch (date){
            case "星期一":
                System.out.println("今天吃红烧肉");
                break;
            case "星期二":
                System.out.println("今天吃鱼香肉丝");
                break;
            case "星期三":
                System.out.println("今天吃红烧肉");
                break;
            case "星期四":
                System.out.println("今天吃鱼香肉丝");
                break;
            case "星期五":
                System.out.println("今天吃红烧肉");
                break;
            case "星期六":
                System.out.println("今天吃鱼香肉丝");
                break;
            case "星期日":
                System.out.println("今天吃面条");
                break;

        }

    }
}
