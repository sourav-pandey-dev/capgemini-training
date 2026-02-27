package Day15;

public class Main {
    static void main() {
//        int add1 = new add().add(5,6);
        add add1 = new add();
        System.out.println(add1.add(1,3));
        System.out.println(add1.add(5,3,4));
        System.out.println(add1.add(5.2f,5.6f));
    }
}
