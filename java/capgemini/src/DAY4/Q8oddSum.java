package DAY4;



public class Q8oddSum {
    static void main() {
        int[] arr = {9,8,5,9,1,8,6,4,6};
        int oddSum = findOddSum(arr);
        System.out.println(oddSum);
    }

    private static int findOddSum(int[] arr) {
        int oddSum = 0;
        for(int i =0;i<arr.length;i++){
            if(i%2!=0){
                oddSum += arr[i];
            }
        }
        return oddSum;
    }
}


