package day03.homework;

import java.util.Scanner;

public class homework09_day03 {

    public static void main(String[] args) {
        //初始化用户名和密码
        String userName="Yomiko";
        String password="946783";
        //添加判断符
        int code = 1;
        //定义输入的用户名和密码
        String yourName;
        String yourPassword;
        Scanner input = new Scanner(System.in);
        for (int i=0;i<3;i++){
            //扫描器接收输入的用户名和密码
            System.out.print("请输入你的用户名:");
            yourName = input.next();
            System.out.print("请输入你的密码:");
            yourPassword = input.next();
            //判断密码和用户名是否正确
            if(yourName.equals(userName)&&yourPassword.equals(password)){
                System.out.println("欢迎进入MyShopping系统！");
                code+=1;
            }else{
                //打印剩余次数
                System.out.println("输入错误，你还有"+(3-i)+"次机会");
            }

        }
        if(code==1){
            //若错误已达三次，修改密码
            System.out.println("对不起，您的三次均错误。");
            System.out.print("请修改密码为(6位):");
            password= input.next();
            System.out.println("修改成功，当前密码为："+password);
        }



    }
}
