package Day11;


import java.io.*;

public class FileWithDataOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        DataOutputStream dos = null;


        try {
            File file = new File("data.bin");
            fos = new FileOutputStream(file,true);
            dos = new DataOutputStream(fos);

        } catch (Exception ex){
            ex.printStackTrace();
        }finally {
            if(dos!=null)
                try{
                    dos.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
        }
    }
}
