package advJava;

public class arrayIndexOutOfBound {
    static void main() {
        int[] arr = new int[7];
        try {
            System.out.println(arr[10]);
        }
        catch (Exception e){
            System.out.println("enter the correct index");
        }
    }
}
