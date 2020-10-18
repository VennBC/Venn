package Day05;

import java.util.Scanner;

public class StartSMS {
    String name="JadeBird";
    String password="0000";
    String yourName;
    String yourPassword;


    Scanner input=new Scanner(System.in);
    public int write(){
        System.out.print("请输入用户名：");
        yourName=input.next();
        System.out.println("请输入密码：");
        yourPassword=input.next();
        if(yourPassword.equals(password)&&yourName.equals(name)){
            System.out.println("@@登录成功：JadeBird@@");
            return 1;
        }else{
            System.out.println("@@您没有权限进入系统，请重新登录。@@");
            return 2;

        }


    }

}
