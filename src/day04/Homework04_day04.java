package day04;

public class Homework04_day04 {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 9 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println("");

        }
        for (int i = 10; i >= 1; i--) {
            for (int j = 10; j >= -(9 - i); j--) {
                System.out.print(" ");
            }
            for (int k = 10; k >= (i+1)/2; k--) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
