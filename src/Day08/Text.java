package Day08;

public class Text {

    public static void main(String[] args) {
        Computer computer=new Computer() {
            @Override
            public String getMemory1() {
                return "Inter";
            }

            @Override
            public String getType() {
                return "2048GB";
            }

            @Override
            public String getMainfrequency() {
                return "3.8GHz";
            }

            @Override
            public String getMemory2() {
                return "16GB";
            }
        };

        System.out.println("计算机的信息如下：");
        System.out.println("CPU的品牌是"+computer.getType()+"主频是："
                +computer.getMainfrequency());
        System.out.println("硬盘的容量是："+computer.getMemory1());
        System.out.println("内存容量是："+computer.getMemory2());

    }
}
