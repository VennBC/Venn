package Day06;

public class Dog extends Pet{
    public Dog(int health, int intimate, String name){
        super( health,  intimate,  name);

    }


    @Override
    public String getVariety() {
        return super.getVariety();
    }

    public Dog() {
    }

    public void show(){
        System.out.println("宠物的自白：");
        System.out.print("我的名字叫"+getName()+"，健康值是"+getHealth()+"和主人的亲密度是("
                +getIntimate()+"),"+"我是一只"+variety);

    }
    public void eat(){
        System.out.println("狗吃肉");
    }
    public void play(){

    }

}
