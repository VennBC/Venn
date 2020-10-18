package day1;

import java.util.Scanner;
public class homework7_day01 {
    public static void main(String[] args) {
        int a;
        System.out.println("请输入一个4位正整数：");
        Scanner b = new Scanner(System.in);
        a = b.nextInt();


        int a1 = a%10;
        int a2 = a%100/10;
        int a3 = a%1000/100;
        int a4 = a/1000;
        a1 = (a1+5)%10;
        a2 = (a2+5)%10;
        a3 = (a3+5)%10;
        a4 = (a4+5)%10;

        a = a4 + a3*10 + a2*100 + a1*1000;
        System.out.println("加密后的数字为："+a);

    }
}
