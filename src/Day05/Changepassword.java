package Day05;

import java.util.Scanner;

public class Changepassword {

    String name;
    int password;
    public void change(){
        String getname;
        int getPassword;
        name="admin1";
        password=111111;
        Scanner input=new Scanner(System.in);
        while(1<2){
            System.out.print("请输入用户名：");
            getname=input.next();
            System.out.print("请输入密码：");
            getPassword=input.nextInt();
            if(getname.equals(name)&&password==getPassword){
                System.out.print("请输入新密码：");
                password=input.nextInt();
                System.out.println("修改密码成功，您的密码为："+password);
                break;
            }else{
                System.out.println("用户名和密码不匹配！您没有权限更新管理员信息。");
                break;
            }



        }
    }

    public static void main(String[] args) {
        Changepassword changepassword=new Changepassword();
        changepassword.change();
    }
}
