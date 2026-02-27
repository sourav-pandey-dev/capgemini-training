package DAY4;

public class Q7Evensum {
    static void main() {
        int[] arr = {9,8,5,9,1,8,6,4,6};
        int evenSum = findEvenSum(arr);
        System.out.println(evenSum);
    }

    private static int findEvenSum(int[] arr) {
        int evenSum = 0;
        for(int i =0;i<arr.length;i++){
            if(i%2==0){
                evenSum += arr[i];
            }
        }
        return evenSum;
    }
}

