package advJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
public class CopyFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("src/advJava/data.txt");
        FileOutputStream fout = new FileOutputStream("datacopy.txt");
        int ch =0;
        while (ch!= -1){

            ch = fin.read();
            if (ch==-1) break;
            fout.write(ch);

        }

        fin.close();
        fout.close();
        System.out.println("file copied");
    }
}
