package day02.homework;

import java.util.Scanner;

public class homework08_day02 {

    public static void main(String[] args) {
        int a;
        System.out.println("请输入一个三位数：");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();

        int a1 = a%10;
        int a2 = a/10%10;
        int a3 = a/100;
        int flower = a1*a1*a1+a2*a2*a2+a3*a3*a3;
        if(a==flower){
            System.out.println("这是一个水仙花数");
        }else{
            System.out.println("这不是一个水仙花数");
        }

    }
}
