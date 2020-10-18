package day03.homework;

public class homework01_day02 {

    public static void main(String[] args) {

        int num = 0;
        int total = 0;
        while (num<=100){
            System.out.println("此时num为："+num);
            total+= num;
            num+=2;
        }
        System.out.println("100以内（包括100）的偶数之和为"+total);

    }
}
