package DAY4;

public class Q6avg {
    static void main() {
        int[] arr = {9,8,5,9,1,8,6,4,6};
        int avg = findAvg(arr);
        System.out.println(avg);
    }

    private static int findAvg(int[] arr) {
        int avg = 0;
        for(int num : arr){
            avg+=num;
        }
        avg = avg/ arr.length;
        return avg;
    }
}
