package day1;

import java.util.Scanner;
public class homework6_day01 {
    public static void main(String[] args) {
        double a;
        System.out.println("请输入圆的半径：");
        Scanner b = new Scanner(System.in);
        a = b.nextDouble();
        double c=2*3.14*a;
        double d= 3.14*a*a;
        System.out.println("该圆的半径为：R="+a);
        System.out.println("该圆的周长为：C=2*3.14*"+a +"\t"+c);
        System.out.println("该圆的面积为：S=3.14*"+a+"*"+a +"\t"+d);


    }

}
