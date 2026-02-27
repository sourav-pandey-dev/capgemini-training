package JavaCollectionDay6;

public class LinkedListWithMinMax {

    static class Node {
        int d;
        Node n;

        Node(int d) {
            this.d = d;
            this.n = null;
        }
    }

    private Node h1;
    private Node h2;
    private Node h3;

    public void push(int v) {
        Node n1 = new Node(v);
        n1.n = h1;
        h1 = n1;

        int min = (h2 == null) ? v : (v < h2.d ? v : h2.d);
        Node n2 = new Node(min);
        n2.n = h2;
        h2 = n2;

        int max = (h3 == null) ? v : (v > h3.d ? v : h3.d);
        Node n3 = new Node(max);
        n3.n = h3;
        h3 = n3;
    }

    public void pop() {
        if (h1 == null) return;
        h1 = h1.n;
        h2 = h2.n;
        h3 = h3.n;
    }

    public int getMin() {
        return (h2 != null) ? h2.d : -1;
    }

    public int getMax() {
        return (h3 != null) ? h3.d : -1;
    }

    public void display() {
        Node t1 = h1;
        Node t2 = h2;
        Node t3 = h3;
        while (t1 != null) {
            System.out.println(t1.d + " " + t2.d + " " + t3.d);
            t1 = t1.n;
            t2 = t2.n;
            t3 = t3.n;
        }
    }

    public static void main(String[] args) {
        LinkedListWithMinMax list = new LinkedListWithMinMax();
        list.push(10);
        list.push(5);
        list.push(20);
        list.push(2);
        list.display();
        System.out.println("Min: " + list.getMin());
        System.out.println("Max: " + list.getMax());
        list.pop();
        list.display();
    }
}