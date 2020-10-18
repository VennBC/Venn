package Day06;

import java.util.Scanner;

public class PetShop {


    public static void main(String[] args) {

        int health;
        int intimate=0;
        String name;
        String variety;
        String gender;




        System.out.println("欢迎您来到宠物店！");
        System.out.print("请输入要领养的宠物的名字：");
        Scanner input = new Scanner(System.in);
        String name1 = input.next();
        System.out.print("请选择领养的宠物类型：(1,狗狗，2，企鹅)");
        int choose1 = input.nextInt();
        if (choose1 == 1) {
            name=name1;
            System.out.print("请选择狗狗的品种：" +
                    "(1,聪明的拉布拉多犬 2. 酷酷的雪娜瑞)");
            int choose2 =input.nextInt();
            if(choose2==1){
               variety="聪明的拉布拉多犬";
            }else{
                variety="酷酷的雪娜瑞";
            }
            System.out.print("请输入狗狗的健康值(1~100之间)：");
            int choose3=input.nextInt();
            if(choose3>100||choose3<0){
                System.out.println("健康值因该在0~100之间，默认值为60。");
                health=60;
            }else{
                health=choose3;
            }
            Dog dog= new Dog( health,  intimate, name);
            dog.variety=variety;
            dog.show();

        }else{
            name=name1;
            System.out.print("请选择企鹅的性别：" +
                    "(1,Q仔 2. Q妹)");
            int choose2 =input.nextInt();
            if(choose2==1){
                gender="雄";
            }else{
                gender=" 雌";
            }
            System.out.print("请输入企鹅的健康值(1~100之间)：");
            int choose3=input.nextInt();
            if(choose3>100||choose3<0){
                System.out.println("健康值因该在0~100之间，默认值为60。");
                health=60;
            }else{
                health=choose3;
            }
            Penguin penguin= new Penguin(health,  intimate,  name);
            penguin.gender=gender;
            penguin.show();
        }

    }
}
