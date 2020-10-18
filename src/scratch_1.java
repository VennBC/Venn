import java.util.Scanner;

class Scratch {
    public static void main(String[] args) {

        System.out.println("STB的成绩是");
        Scanner a = new Scanner(System.in);
        System.out.println("JAVA的成绩是");
        Scanner b = new Scanner(System.in);
        System.out.println("STB的成绩是");
        Scanner c = new Scanner(System.in);
        System.out.println("");
        int score_STB = a.nextInt();
        int score_JAVA = b.nextInt();
        int score_SQL = c.nextInt();
        int d = score_STB-score_SQL;
        double e =(score_STB + score_JAVA + score_SQL)/3;

        System.out.println("-----------------------");
        System.out.println("STB"+"\tJAVA"+"\t\tSTB");
        System.out.println("score_STB"+"\tscore_JAVA"+"\t\tscore_SQL");
        System.out.println("-----------------------");
        System.out.println("JAVA和SQL成绩差:"+ d);
        System.out.println("3门课的平均分:"+ e);
        
    }
}