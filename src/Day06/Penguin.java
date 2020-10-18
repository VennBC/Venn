package Day06;

public class Penguin extends  Pet{




    public Penguin(int health, int intimate, String name){
        super( health,  intimate,  name);

    }

    @Override
    public String getGender() {
        return super.getGender();
    }

    public void show(){
        System.out.println("宠物的自白：");
        System.out.print("我的名字叫"+getName()+"，健康值是"+getHealth()+"和主人的亲密度是("
                +getIntimate()+"),"+"我的性别是"+gender);
    }
    public void eat(){
        System.out.println("吃鱼！");
    }
}
