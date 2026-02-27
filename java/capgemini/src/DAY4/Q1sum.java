package DAY4;

public class Q1sum {
    static void main() {
        int [] arr = {1,2,3,4,5,6};
        int sum = findSum(arr);
        System.out.println(sum);
    }

    private static int findSum(int[] arr) {
        int result = 0;
        for(int num : arr){
            result +=num;
        }
        return result;
    }
}
