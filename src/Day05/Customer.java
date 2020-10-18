package Day05;

public class Customer {

    String name;
    String gender;
    int cardCode;
    String cardType;

    public void show(){
        System.out.println("客户的姓名为："+name+"客户的性别为："+gender);
    }
    public void card(){
        System.out.println("积分："+cardCode+"卡类型："+cardType);
        if(cardType.equals("金卡")&&cardCode>1000){
            System.out.println("回馈积分500分！");
        }else if(cardType.equals("普卡")&&cardCode>1000){
            System.out.println("回馈积分500分！");
        }else{
            System.out.println("您积分不足，未能获得回馈积分。");
        }
    }
    public static void main(String[] args) {
        Customer person1=new Customer();
        person1.name="Frank";
        person1.gender ="man";
        person1.show();
    }

}
