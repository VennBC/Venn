package Day06;

import java.util.Arrays;
import java.util.Scanner;

public class TextCustomer {


    public static void main(String[] args) {
        CustomerBiz customerBiz = new CustomerBiz();
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < customerBiz.names.length; i++) {
            System.out.print("请输入客户姓名:");
            String name = input.next();
            customerBiz.addName(name);
            if (customerBiz.key == 2) {
                break;
            }
        }
        String oldName;
        String newName;
        System.out.println();
        System.out.print("请输入要修改的客户姓名：");
        oldName = input.next();
        System.out.print("请输入新的客户姓名：");
        newName = input.next();

        customerBiz.editName(oldName, newName);



        customerBiz.sortNames(customerBiz.names);


    }


}




