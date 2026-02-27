package org.example;

import java.util.Scanner;

public class StringAlgo {
    /**
     *
     * @param str: non null string of length min 2
     * @return returns first 2 chars shifted to the last of the string
     * @throws For null input : nullPointerException for input < len
     *           StringIndexOutOfBoundsException
     */
        String Shift2Char(String str){
            String s = str.substring(0,2);
            String t = str.substring(2);
            StringBuilder sb = new StringBuilder(t+s);
            return sb.toString();
    }
static void main() {
            Scanner sc = new Scanner(System.in);
            System.out.println("enter the string");
            String qs = sc.nextLine();
            StringAlgo st = new StringAlgo();
            String answer = st.Shift2Char(qs);
            System.out.println(answer);
    }
}
