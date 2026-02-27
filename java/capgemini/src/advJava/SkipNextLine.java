package advJava;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.*;
public class SkipNextLine {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("src/advJava/data.txt");
        InputStreamReader isr = new InputStreamReader(fin);
        BufferedReader br = new BufferedReader(isr);
        FileOutputStream fout = new FileOutputStream("SkipNextLinedatacopy.txt");
//        int ch =0;
//        boolean flag = true;
        String line = br.readLine();
        while (line != null){
//            ch = fin.read();
//            if (ch=='\n') flag = !flag;
//            if (ch==-1) break;
//            if (flag) fout.write(ch);
            fout.write((line+"\n").getBytes());
            line = br.readLine();
            line = br.readLine();
        }

        fin.close();
        fout.close();
        System.out.println("file copied");
    }
}
