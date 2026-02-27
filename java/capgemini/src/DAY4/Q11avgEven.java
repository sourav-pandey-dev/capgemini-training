package DAY4;

public class Q11avgEven {
    static void main() {
        int[] arr = {9,8,5,9,1,8,6,4,6};
        int avg = findAvgEven(arr);
        System.out.println(avg);
    }

    private static int findAvgEven(int[] arr) {
        int avg = 0;
        for(int i =0;i<arr.length;i++){
            if (i % 2 == 0) {
                avg +=arr[i];
            }
        }
        int len =  arr.length/2;
        avg = avg/len;
        return avg;
    }
}
