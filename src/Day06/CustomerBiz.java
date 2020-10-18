package Day06;

import java.util.Arrays;
import java.util.Scanner;

public class CustomerBiz {

    String answer;
    int key = 1;
    int i = 0;
    Customer[] customer=new Customer[3];


    String[] names = new String[5];
    Scanner input = new Scanner(System.in);

    public void addName(String name) {
        names[i] = name;
        System.out.print("继续输入吗？(y/n):");
        answer = input.next();

        if (answer.equals("n")) {
            showNames();
        } else {
            i = i + 1;
        }

    }

    public void showNames() {
        System.out.println("*********************");
        System.out.println("\t客户姓名列表：");
        System.out.println("*********************");
        key = 2;
        for (String name : names) {
            if (name == null) {
                break;
            }
            System.out.print(name + "\t");
            key = 2;

        }


    }

    public boolean editName(String oldName, String newName) {
        System.out.println("******修改结果******");
        for (int j = 0; j < names.length; j++) {
            if (oldName.equals(names[j])) {
                names[j] = newName;
                System.out.println("找到并修改成功！");
                showNames();
                break;
            } else {
                System.out.println("对不起，未能找到客户姓名");
                break;

            }

        }
        return true;
    }

    public void sortNames(String[] names){
        System.out.println("*****排序前*****");
        for (int j = 0; j < names.length; j++) {
            System.out.print(names[j]+"\t");
        }
        Arrays.sort(names);
        System.out.println();
        System.out.println("*****排序后*****");
        for (int j = 0; j < names.length; j++) {
            System.out.print(names[j]+"\t");
        }



    }

    public void addCustomer (Customer cust){
        for (int j = 0; j < customer.length ; j++) {
            System.out.print("请输入用户姓名：");
            System.out.print("请输入用户年龄：");
            System.out.print("请输入用户是否拥有会员卡");


        }

    }

    public void showCustomers(){
        for (int j = 0; j < customer.length; j++) {
            System.out.println(customer[j]);
        }
    }




}
