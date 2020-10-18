package day02.homework;
import java.util.Scanner;
public class homework04_day02 {
    public static void main(String[] args) {
        int number;
        System.out.println("请输入数字：");
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number%2==0){
            System.out.println("这个数是偶数");
        }else{
            System.out.println("这个数是奇数");
        }


    }
}
