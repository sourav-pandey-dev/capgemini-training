package DAY4;

public class Q2min {
    static void main() {
        int[] arr = {9,8,5,9,1,8,6,4,6};
        int min = findMin(arr);
        System.out.println(min);
    }

    private static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int num : arr){
            min = (num<min)?num:min;
        }
        return min;
    }
}
