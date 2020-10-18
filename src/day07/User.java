package day07;

public class User {

    protected String username;
    protected int usermark;
    protected String code;

    public User(String name, int mark) {
        this.username = name;
        this.usermark= mark;
    }

    public  void show1(){
        System.out.print("石头");
        code="石头";
    }
    public  void show2(){
        System.out.print("剪刀");
        code="剪刀";

    }
    public  void show3(){
        System.out.print("布");
        code="布";
    }

}
