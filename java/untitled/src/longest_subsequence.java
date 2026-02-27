import java.util.*;

public class longest_subsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int ls = calc_ls(arr);
        System.out.println(ls);
    }
    public static int calc_ls(int[] arr){
        Arrays.sort(arr);
        int count =1;
        int prev = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] == prev) continue;

            count++;
            prev = arr[i];
        }
        return count;
    }
}
