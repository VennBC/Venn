package day02.homework;
import java.util.Scanner;
public class homework05_day02 {

    public static void main(String[] args) {
        double year;
        System.out.println("请输入年份：");
        Scanner input = new Scanner(System.in);
        year = input.nextDouble();
        if((year%100==0&&year/400==0)||(year%100!=0&&year/4==0)){
            System.out.println("闰年");
        }else{
            System.out.println("平年");
        }

    }
}
