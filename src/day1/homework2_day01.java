package day1;

public class homework2_day01 {
    public static void main(String[] args) {
        int a = 245;
        int b = 570;
        int c = 320;
        int a1 =2,b1=1,c1=1;
        int a2 = a*a1;
        int b2 = b*b1;
        int c2 = c*c1;
        int all = a1+b1+c1;
        int real = 1500;
        int m = real- all;

        System.out.println("*****消费单******");
        System.out.println("购买物品"+"\t单价"+"\t个数"+"\t金额");
        System.out.println("T恤 "+"\t"+a+"￥"+"\t"+a1+"\t"+a2);
        System.out.println("网球鞋"+"\t"+b+"￥"+"\t"+b1+"\t"+b2);
        System.out.println("网球拍"+"\t"+c+"￥"+"\t"+c1+"\t"+c2);
        System.out.println("折扣："+"\t\t\t8折");
        System.out.println("消费总金额：￥"+all);
        System.out.println("实际消费：￥"+real);
        System.out.println("找钱：￥"+m);
        System.out.println("本次所获得的积分为： 33");






    }


}
