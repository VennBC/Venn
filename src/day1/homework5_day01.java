package day1;

import java.util.Scanner;
public class homework5_day01 {
    public static void main(String[] args) {
        int a;
        Scanner b = new Scanner(System.in);
        a = b.nextInt();
        int d = a/7;
        int c = a%7;
        System.out.println(a+"\tdays"+"\tare\t"+d+"weeks\t"+c+"days");
    }

}
