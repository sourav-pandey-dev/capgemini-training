package DAY4;

public class Q13firsthalfsum {
    static void main() {
            int[] arr = {9,8,5,9,1,8,6,4,6};
            int oddSum = findOddSum(arr);
            System.out.println(oddSum);
        }

        private static int findOddSum(int[] arr) {
            int Sum = 0;
            for(int i =0;i<arr.length/2;i++){
                    Sum += arr[i];
            }
            return Sum;
        }
    }
