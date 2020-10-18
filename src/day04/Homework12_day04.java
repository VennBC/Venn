package day04;

import java.util.Scanner;
import java.util.Arrays;

public class Homework12_day04 {

    public static void main(String[] args) {
        int[]success={99,85,82,63,60};
        System.out.println(Arrays.toString(success));
        int nEw;
        System.out.print("请输入新增成绩：");
        Scanner input = new Scanner(System.in);
        nEw = input.nextInt();
        int[]newSuccess=Arrays.copyOf(success,success.length+1);
        int index=0;
        for (int i = 0; i < newSuccess.length; i++) {
            if(nEw>newSuccess[i]){
                index=i;
            }

        }
        System.out.println("输入成绩的下标为："+index);
        for (int i = newSuccess.length-1; i >index ; i--) {
            newSuccess[i]=newSuccess[i-1];

        }
        newSuccess[index]=nEw;
        for (int i = 0; i < newSuccess.length; i++) {
            System.out.print(newSuccess[i]+"\t");

        }








    }
}
