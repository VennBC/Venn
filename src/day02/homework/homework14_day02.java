package day02.homework;
import java.util.Scanner;
public class homework14_day02 {

    public static void main(String[] args) {
        int fastcall;
        System.out.print("请输入快捷键：");
        Scanner input = new Scanner(System.in);
        fastcall = input.nextInt();
        switch (fastcall){
            case 1:
                System.out.println("拨爸爸的号13754823698");
                System.out.println("正在拨打，请稍后");
                break;
            case 2:
                System.out.println("拨妈妈的号13752324698");
                System.out.println("正在拨打，请稍后");
                break;
            case 3:
                System.out.println("拨爷爷的号13751183698");
                System.out.println("正在拨打，请稍后");
                break;
            case 4:
                System.out.println("拨奶奶的号13723333698");
                System.out.println("正在拨打，请稍后");
                break;
            default:
                System.out.println("未配对，请重新输入。");
        }

    }
}
