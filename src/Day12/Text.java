package Day12;



import javax.print.attribute.standard.PagesPerMinute;
import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        startMenu startMenu= new startMenu();

        Scanner input = new Scanner(System.in);
        int choose1;

        int key=1;
        do {
            startMenu.show();
            System.out.println("请选择：");
            choose1=input.nextInt();
            switch (choose1){
                case 6:
                    key=2;
                    break;

            }
        }while (key==2);






    }
}
