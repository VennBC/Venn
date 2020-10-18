package day02.homework;

import java.util.Scanner;

public class homework17 {

    public static void main(String[] args) {
        int number;
        System.out.print("请输入一个四位数：");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        int a1 = number%10;
        int a2 = number/10%10;
        int a3 = number/100%10;
        int a4 = number/1000;

        number = a4+a3*10+a2*100+a1*1000;
        System.out.println("反转之后的数为："+number);
    }
}
