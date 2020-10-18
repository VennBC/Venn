package Day09;
import java.util.Random;
public class Colorball {


    public static final int START=1;
    public static final int END1=33;
    public static final int END2=16;


    Random random=new Random();

    public void show(){
        int b = random.nextInt(END2-START+1)+START;
        for (int i = 0; i <6 ; i++) {
            int a = random.nextInt(END1-START+1)+START;
            System.out.print(a);
            System.out.print("\t");
        }
        System.out.println(b);
    }
}
