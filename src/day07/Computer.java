package day07;

import java.util.Random;

public class Computer {
    protected String computername;
    protected int computeremark;
    protected String code;
    public static final int START=1;
    public static final int END=3;
    Random random=new Random();


    public Computer(String name, int mark) {
        this.computername = name;
        this.computeremark = mark;
    }

   public  void show(){
        int a = random.nextInt(END-START+1)+START;
        switch (a){
            case 1:
                System.out.print("石头");
                code="石头";
                break;
            case 2:
                System.out.print("剪刀");
                code="剪刀";
                break;
            case 3:
                System.out.print("布");
                code="布";
                break;
        }
   }

}

