package Day06;

public class Master{
    public  void feed(Pet pet){
        if(pet.getHealth()!=0){
            pet.eat();
        }else{
            System.out.println("不能再吃了，要死了！");
        }
    }



}
