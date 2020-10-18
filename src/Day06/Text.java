package Day06;

public class Text {

    public static void main(String[] args) {
        Master master=new Master();
        Dog dog=new Dog(20,0,"Wang");

        master.feed(dog);
        dog.getHealth();
        System.out.println(dog.getHealth());
        Penguin penguin= new Penguin(20,0,"Empire");
        master.feed(penguin);

    }
}
