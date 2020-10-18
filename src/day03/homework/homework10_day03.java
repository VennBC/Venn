package day03.homework;

public class homework10_day03 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 101; i = i + 2) {
            sum = sum + i;
        }
        System.out.println("100以内奇数的和为：" + sum);
    }
}