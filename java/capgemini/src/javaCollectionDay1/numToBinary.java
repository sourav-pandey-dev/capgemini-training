package javaCollectionDay1;

import java.util.Scanner;

public class numToBinary {
    static void main() {
        System.out.println("enter the number of try:");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i =0;i<t;i++){
            System.out.println("enter the decimal number");
            int decimal = sc.nextInt();
            System.out.println(convert(decimal));
        }
    }

    private static String convert(int num) {
        StringBuilder sb = new StringBuilder();
        while(num!=0){
            int rem = num%2;
            num = num/2;
            sb.append(rem);
        }
        return sb.reverse().toString();
    }
}
