package advJava;

import java.util.Scanner;

public class Readrollno {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter roll number ");
        int rollno = sc.nextInt();
        String name =sc.nextLine();
        if(name.isBlank()){
            System.out.println("enter name");
            name = sc.nextLine();
        }
        System.out.println("Information:");
        System.out.println("roll no : " + rollno);
        System.out.println("name : " + name);
    }
}
