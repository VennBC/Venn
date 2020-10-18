package day04;

import java.util.Arrays;
import java.util.Scanner;

public class Homework13_day04 {

    public static void main(String[] args) {
        String[]list={"a","b","c","e","f","p","u","z"};
        String name;
        System.out.print("传入的字符是：");
        Scanner input = new Scanner(System.in);
        name = input.next();
        int index=0;
        String[] newSuccess = Arrays.copyOf(list,list.length+1);
        for (int i = 0; i < list.length; i++) {
            if(name.compareTo(list[i])>0){
                index=i;
            }

        }
        System.out.println("输入字母的下标为："+index);
        for (int i = newSuccess.length-1; i >index ; i--) {
            newSuccess[i]=newSuccess[i-1];

        }
        newSuccess[index]=name;
        System.out.print("输入后的字母序列是：");
        for (int i = 0; i < newSuccess.length; i++) {
            System.out.print(newSuccess[i]+"\t");

        }


    }
}
