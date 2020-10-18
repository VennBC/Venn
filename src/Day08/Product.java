package Day08;

public abstract class Product {

    private int pid;
    private String pname;
    private  int price;
    private  int count;


    public Product(int pid, String pname, int price, int count) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.count = count;

    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }




}
