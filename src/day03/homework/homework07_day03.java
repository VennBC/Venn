package day03.homework;

public class homework07_day03 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            if ( i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("1~10之间的偶数和为：" + sum);

    }
}
