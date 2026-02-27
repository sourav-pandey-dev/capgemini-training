package advJava;

import java.util.HashSet;
import java.util.Scanner;

public class numberOfNum {
    public int findnum(int num){
        HashSet<Integer> set = new HashSet<>();
        int cond = num;
        int count = 1;
        set.add(num);
        num = findSqSum(num);
        while(num!= cond){
            if(set.contains(num)) return -1;
            set.add(num);
            num = findSqSum(num);
            count++;
        }
        return count;
    }

    private  int findSqSum(int num) {
        int sum = 0;
        while(num!=0){
            int rem = num%10;
            sum+= rem*rem;
            num =num/10;
        }
        return sum;
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        numberOfNum n1 = new numberOfNum();

        System.out.println(n1.findnum(num));
    }
}
