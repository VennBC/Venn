package day1;

import com.sun.javaws.IconUtil;

        import java.util.Scanner;

public class homework1_day01 {
    public static void main(String[] args) {
        System.out.println("请输入4位会员卡号：");
        Scanner b = new Scanner(System.in);
        int a = b.nextInt();
        int a1 = a%10;
        int a2 = a%100/10;
        int a3 = a%1000/100;
        int a4 = a/1000;
        int c= a1+a2+a3+a4;
        System.out.println("会员卡号"+a+"各位之和: "+c);
        boolean d = c>20;
        System.out.println("是幸运用户吗?"+d);

    }




}
