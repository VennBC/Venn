package day02.homework;
import java.util.Scanner;
public class homework02_day02 {
    public static void main(String[] args) {
        System.out.println("你是男人吗？");
        String yourAnswer;
        Scanner input = new Scanner(System.in);
        yourAnswer = input.next();
        switch (yourAnswer){
            case "ture":
                System.out.println("原来你是男人呀，呵呵");
                break;
            case "false":
                System.out.println("你的性别难道是女?");
                break;
            default:
                System.out.println("666");
        }

    }
}
