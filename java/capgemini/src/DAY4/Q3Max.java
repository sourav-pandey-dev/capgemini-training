package DAY4;

public class Q3Max {
    static void main() {
        int[] arr = {9,8,5,9,1,8,6,4,6};
        int max = findMax(arr);
        System.out.println(max);
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int num : arr){
            if(num>max){
                max =num;
            }
        }
        return max;
    }
}
