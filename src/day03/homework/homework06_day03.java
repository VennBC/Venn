package day03.homework;

import java.util.Scanner;

public class homework06_day03 {

    public static void main(String[] args) {
        int sum=0;
        int innum=0;


        while (sum<=20){
            innum+=1;
            sum+=innum;
        }
        System.out.println("答案为："+innum);

    }
}
