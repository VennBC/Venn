package day02.homework;
import java.util.Scanner;
public class homework01_if_day02 {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        if(choice==0){
            System.out.println("石头");
        }else if(choice==1){
            System.out.println("剪刀");
        }else if(choice==2){
            System.out.println("布");
        }else{
            System.out.println("错误");
        }
    }
}
