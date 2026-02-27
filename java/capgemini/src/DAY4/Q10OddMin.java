package DAY4;

public class Q10OddMin {
    static void main() {
        int[] arr = {9,8,5,9,1,8,6,4,6};
        int oddMin = findOddMin(arr);
        System.out.println(oddMin);
    }

    private static int findOddMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(i%2!=0 && arr[i]<min){
                min= arr[i];
            }
        }
        return min;
    }
}
