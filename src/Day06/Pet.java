package Day06;

public  class  Pet {

    private int health;
    private int intimate;
    private String name;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getIntimate() {
        return intimate;
    }

    public void setIntimate(int intimate) {
        this.intimate = intimate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pet(int health, int intimate, String name) {
        this.health = health;
        this.intimate = intimate;
        this.name = name;
    }
    public Pet(){
        this.health=100;
        this.intimate=0;
    }

    public  String variety;
    public String gender;

    public String getVariety() {
        return variety;
    }

    public String getGender() {
        return gender;
    }

    public void eat(){
        System.out.println("吃！");

    }
}
