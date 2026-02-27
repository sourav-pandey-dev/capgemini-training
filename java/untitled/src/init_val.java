import java.util.Scanner;

public class init_val {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int a = sc.nextInt();
        int t = sc.nextInt();

        int u = v - (a*t);

        System.out.println(u);
    }
}
