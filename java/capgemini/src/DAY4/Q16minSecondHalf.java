package DAY4;

public class Q16minSecondHalf {
        static void main() {
            int[] arr = {9,8,5,9,1,8,6,4,6};
            int oddSum = findOddSum(arr);
            System.out.println(oddSum);
        }

        private static int findOddSum(int[] arr) {
            int min = Integer.MAX_VALUE;
            for(int i =arr.length/2;i<arr.length;i++){
                min = (arr[i]<min)?arr[i]:min;
            }
            return min;
        }
    }