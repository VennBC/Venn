package day07;

import java.util.Scanner;

public class Thefingerguessinggame {

    public static void main(String[] args) {

        String username;
        String computername = "null";
        int usermark = 0;
        int computeremark = 0;
        int key = 1;


        Scanner input = new Scanner(System.in);


        do {
            System.out.println("————————————————欢迎进入游戏世界————————————————");
            System.out.println("\t\t\t**********************");
            System.out.println("\t\t\t** 猜拳，开始");
            System.out.println("\t\t\t**********************");
            System.out.println("出拳规则：1.石头2.剪刀3.布");
            System.out.print("请选择对方角色（1，星熊2.陈3.诗怀雅）");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    computername = "星熊";
                    break;
                case 2:
                    computername = "陈";
                    break;
                case 3:
                    computername = "诗怀雅";
                    break;
            }
            Computer computer = new Computer(computername, computeremark);
            System.out.print("请输入您的姓名：");
            username = input.next();
            User user = new User(username, usermark);
            System.out.println();
            System.out.println(username + "\tvs\t" + computername + "对战");
            System.out.print("要开始吗？(y/n)");
            String choose2 = input.next();
            if (choose2.equals("y")) {
                System.out.print("请出拳：1.石头2.剪刀3.布");
                int choose3 = input.nextInt();
                switch (choose3) {
                    case 1:
                        System.out.print("你出拳：");
                        user.show1();
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("你出拳：");
                        user.show2();
                        System.out.println();
                        break;

                    case 3:
                        System.out.print("你出拳：");
                        user.show3();
                        System.out.println();
                        break;
                }
                System.out.print(computer.computername + "出拳:\t");
                computer.show();
                System.out.println();
                System.out.print("结果：");
                if (user.code.equals(computer.code)) {
                    System.out.print("平局！");
                    System.out.println();
                } else if ((user.code == "石头" && computer.code == "剪刀") || (user.code == "剪刀" &&
                        computer.code == "布") || (user.code == "布" && computer.code == "石头")) {
                    System.out.print("恭喜，你赢了");
                    usermark+=1;
                } else if ((user.code == "剪刀" && computer.code == "石头") || (user.code == "布" &&
                        computer.code == "剪刀") || (user.code == "石头" && computer.code == "剪刀")) {
                    System.out.print("您输了，真蔡！");
                    computeremark+=1;
                }
                System.out.print("是否进行下一轮？(y/n)");
                String choose4 = input.next();
                if (choose4.equals("y")) {
                    continue;
                } else {
                    System.out.println("您的得分为："+user.usermark);
                    System.out.println(computer.computername+"的得分为："+computer.computeremark);
                    break;
                }

            } else {
                key = 2;
                break;

            }
        } while (key == 1);


    }
}

