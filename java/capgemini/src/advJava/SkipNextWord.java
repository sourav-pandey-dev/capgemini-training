package advJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
public class SkipNextWord{
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("src/advJava/data.txt");
        InputStreamReader isr = new InputStreamReader(fin);
        BufferedReader br = new BufferedReader(isr);
        FileOutputStream fout = new FileOutputStream("SkipNextWorddatacopy.txt");
        int ch =0;
        boolean flag = true;
        while (ch!= -1){
            ch = fin.read();
            if (ch==' ') flag = !flag;
            if (ch==-1) break;
            if (flag) fout.write(ch);


        }

        fin.close();
        fout.close();
        System.out.println("file copied");
    }
}
