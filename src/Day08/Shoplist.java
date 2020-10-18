package Day08;

import java.util.Scanner;

public class Shoplist {

    public static void main(String[] args) {
        int sum=0;


        String[] name = new String[3];
        int[] price = new int[3];
        int[] count = new int[3];
        Product[] product = new Product[3];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < product.length; i++) {
            System.out.println("**********正在录入商品信息**********");
            System.out.println("商品编号为：" + i);
            product[i].setCount(i);
            System.out.print("商品名称为：");
            name[i] = input.next();
            product[i].setPname(name[i]);
            System.out.println();
            System.out.print("商品价格为：");
            price[i] = input.nextInt();
            product[i].setPrice(price[i]);
            System.out.println();
            System.out.println("商品数量为：");
            count[i] = input.nextInt();
            product[i].setCount(count[i]);
            System.out.println("编号" + "\t名称" + "\t价格" + "\t数量 ");


        }
        for (int i = 0; i <product.length ; i++) {
            System.out.println(product[i].getCount()+"\t"+product[i].getPname()+"\t"+
                    product[i].getPrice()+"\t"+product[i].getCount());
            sum+=product[i].getPrice()*product[i].getCount();

        }
        System.out.println();
        System.out.println("总计："+sum+"元");

    }
}

