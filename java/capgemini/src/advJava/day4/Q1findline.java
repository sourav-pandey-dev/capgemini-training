package advJava.day4;

import java.util.Scanner;

public class Q1findline {
    static void main() {
        String qs = "this is line. Line contains few words. Line is in java";
        String tgt = "line";
        int len = tgt.length();
        for(int i =0;i+len<qs.length();i++){
            if(qs.substring(i,i+len).equalsIgnoreCase(tgt)) {
                System.out.println(i);
            }
        }
    }
}
