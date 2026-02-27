package test;

import java.io.*;

//how to work with an abstract class
public class main {
    static void main() {
        //    call the read line methods
//    Reader rd = new Reader(); //cannot intantiate
        InputStream input = System.in;
        InputStreamReader in = new InputStreamReader(input);
        BufferedReader br = new BufferedReader(in);
        //create a child class
        try {
            FileReader fr = new FileReader("sourav");
        } catch (Exception e) {
            System.out.println("file not found");
        }
    }




}
