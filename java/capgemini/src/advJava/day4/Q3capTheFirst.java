package advJava.day4;

import java.util.Scanner;

public class Q3capTheFirst {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string");
        String st = sc.nextLine();
        String[] str = st.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(String s : str){
            char ch =  Character.toUpperCase(s.charAt(0));
            sb.append(ch).append(s.substring(1,s.length())).append(" ");
        }
        System.out.println(sb.toString());
    }
}
