package advJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
public class SkipNextChar {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("src/advJava/data.txt");
        InputStreamReader isr = new InputStreamReader(fin);
        BufferedReader br = new BufferedReader(isr);
        FileOutputStream fout = new FileOutputStream("datacopybyskippingnextchar.txt");
        int ch =0;
//        int count =0;
        while (ch!= -1){

            ch = fin.read();
            if (ch==-1) break;
//            if (count%2==0) {
//                fout.write(ch);
//            }
//            count++;
            fout.write(ch);
            fin.read();
        }

        fin.close();
        fout.close();
        System.out.println("file copied");
    }
}
