package day03.homework;

import java.util.Scanner;

public class himework08_day03 {

    public static void main(String[] args) {
        int number;
        int code=0;
        //完成3次会员信息的录入
        for (int i=0;i<3;i++){
            //保证3次录入信息合法
            while (code<3){
                System.out.print("请输入会员号(4位整数)：");
                Scanner input = new Scanner(System.in);
                //判断会员号的合法性
                if (input.hasNextInt()){
                    number = input.nextInt();
                    //如果合法，判断是否为四位
                    if(number<1000||number>=10000){
                        System.out.println("会员号码有误，请重新输入。");
                        continue;
                    }
                    //录入会员数据

                    System.out.print("\n");
                    String birthday;
                    System.out.print("请输入会员生日（<月/日>两位数）：");
                    Scanner input1 = new Scanner(System.in);
                    birthday = input1.next();
                    System.out.print("\n");
                    int score;
                    System.out.print("请输入会员积分：");
                    Scanner input2 = new Scanner(System.in);
                    score = input2.nextInt();
                    System.out.print("\n");
                    System.out.println("已录入的会员信息是：");
                    System.out.println(number+"\t"+birthday+"\t"+score);
                    code+=1;
                }else{
                    //如果不合法,重新输入。
                    System.out.println("会员号码有误，请重新输入。");
                    continue;
                }
            }
            }




    }
}
