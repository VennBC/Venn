package day02.homework;

import java.util.Scanner;
public class homewok06_day02 {
    public static void main(String[] args) {
        int youpassword01;
        int youpassword02;
        int password01 = 6655101;
        int password02 = 4562178;

        System.out.println("请输入你的一道密码");
        Scanner input1 = new Scanner(System.in);
        youpassword01 = input1.nextInt();
        if(youpassword01==password01){
            System.out.println("一级密码通过");
            System.out.println("请输入二级密码：");
        }else{
            System.out.println("一级密码错误，禁止访问");
        }
        Scanner input2 = new Scanner(System.in);
        youpassword02 = input2.nextInt();
        if (youpassword02==password02){
            System.out.println("二级密码通过，欢迎进入。");
        }else{
            System.out.println("二级密码错误，禁止访问");
        }
    }
}
