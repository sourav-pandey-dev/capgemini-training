package day2;

import java.util.Scanner;

public class Binary {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        if(num>0){sb.append('0');}
        else{sb.append('1');}
        while(num!=0){
            int rem = num%2;
            num = num/2;
            if(rem == 0) {sb.append('0');}
            else {sb.append('1');}
        }
        String ans = sb.toString();
        System.out.println(ans);

    }
}
