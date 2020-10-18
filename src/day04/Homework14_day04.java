package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Homework14_day04 {

    public static void main(String[] args) {
        int[]price=new int[4];
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <5 ; i++) {
            System.out.print("第"+i+"家店的价格：");

            price[i]= input.nextInt();

        }
        System.out.println(Arrays.toString(price));
        System.out.print("最低价格是：");
        System.out.print(price[4]);

    }
}
