package day03.homework;

import java.util.Scanner;

public class homework05_day03 {

    public static void main(String[] args) {
        int year;
        double old = 0;
        double sum = 0;
        double young = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("请输入第" + (i + 1) + "位客人的年龄：");
            year = input.nextInt();
            sum += 1;
            if (year > 30) {
                old += 1;
            } else {
                young += 1;
            }

        }
        double oldn = (old / sum) * 100;
        double youngn = (young / sum) * 100;
        System.out.println("30岁以下的比例是：" + youngn + "%");
        System.out.println("30岁以上的比例是：" + oldn + "%");


    }
}
