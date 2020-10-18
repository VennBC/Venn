package day02.homework;

import java.util.Scanner;

public class homework01_day02 {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        switch (choice){
            case 0:
                System.out.println("石头");
                break;
            case 1:
                System.out.println("剪刀");
                break;
            case 2:
                System.out.println("布");
                break;
            default:
                System.out.println("错误");
        }

    }
}
