package Day05;

import java.util.Scanner;

public class Menu {
    StartSMS startSMS=new StartSMS();
    Scanner input=new Scanner(System.in);
    int choose;
    String name;
    String gender;


    public void showLoginMenu(){
        System.out.println("欢迎使用我行我素购物管理系统");
        System.out.println("\t\t1.登录系统");
        System.out.println("\t\t2.退出");
        System.out.println("***************************");
        System.out.print("请选择，输入数字：");
        choose=input.nextInt();
        switch (choose){
            case 1:
                if(startSMS.write()==1){
                    showMainMenu();
                };
                break;
            case 2:
                break;
        }


    }
    public void showMainMenu(){
        System.out.println("我行我素购物管理系统主菜单");
        System.out.println("***************************");
        System.out.println("\t\t1.客户信息管理");
        System.out.println("\t\t2.真情回馈");
        System.out.println("***************************");
        System.out.print("请选择，输入数字或按0返回上一级菜单：");
        choose=input.nextInt();
        switch (choose){
            case 1:
                showCustMenu();
                break;
            case 2:
                showSendGMenu();
                break;
            case 0:
                showLoginMenu();
                break;
        }


        }

    public void showSendGMenu(){
        System.out.println("我行我素购物管理系统主菜单>真情回馈");
        System.out.println("***************************");
        System.out.println("\t\t1.幸运大作战");
        System.out.println("\t\t2.幸运抽奖");
        System.out.println("\t\t3.生日祝福");
        System.out.println("***************************");
        System.out.print("请选择，输入数字或按0返回上一级菜单：");
        choose=input.nextInt();
        switch (choose){
            case 1:
                System.out.println("执行幸运大作战");;
                break;
            case 2:
                System.out.println("执行幸运抽奖");
                break;
            case 3:
                System.out.println("执行生日祝福");
            case 0:
                showMainMenu();
                break;

        }




    }
    public void showCustMenu(){
        System.out.println("客户姓名："+name);
        System.out.println("性别："+gender);
        System.out.print("按0返回上一级菜单：");
        choose=input.nextInt();
        switch (choose){
            case 0:
                showMainMenu();
                break;

        }


    }
}
