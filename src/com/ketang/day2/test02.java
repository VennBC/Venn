package com.ketang.day2;
import com.sun.xml.internal.ws.addressing.WsaActionUtil;

import java.util.Scanner;
public class test02 {
    public static void main(String[] args) {

        int score;
        System.out.println("请输入小明的成绩：");
        Scanner input = new Scanner(System.in);
        score = input.nextInt();
        if(score==100){
            System.out.println("买车！");

        }else if(score<100&&score>=90){
            System.out.println("买MP4！");

        }else if(score<90&&score>=60){
            System.out.println("买书！");
        }else{
            System.out.println("吃肉！");
        }

    }
}
