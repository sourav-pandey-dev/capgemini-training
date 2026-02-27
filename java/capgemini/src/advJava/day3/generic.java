package advJava.day3;

public class generic {

}
class stkGeneral<T>{
    Object a[] = new Object[10];
    int top =-1;
    public void push(T x)
    {
        a[++top] = x;
    }
    T pop(T x)
    {
        return (T) a[top--];
    }
}