package day02.homework;
import java.util.Scanner;
public class homework03_day02 {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        number = input.nextInt();
        if(number>=1000){
            System.out.println("输入的数>=1000");
        }else if(number<1000){
            System.out.println("输入的数<1000");
        }
    }
}
