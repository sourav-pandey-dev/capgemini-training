package DAY4;

public class Array {
    static void main() {
        int[] arr = new int[3];
        arr[0] = 1;
        arr[1] = 5;
        arr[2] = 3;

        char[] ch = new char[3];
        ch[0] = 's';
        ch[1] = 'o';
        ch[2] = 'u';

        String str[] = {"sourav","pandey","works", "at", "capgemini"};
//        str[0] = "sourav";
//        str[1] = "pandey";
//        System.out.println(arr[0]);
//        System.out.println(ch[0]);
//        System.out.println(arr[1]);
//        System.out.println(str[2]);
//        for(int i : arr){
//            System.out.println(i);


//        }
        dispEven(str);
        for(String Str : retArr()){
            System.out.println(Str);
        }
    }

    private static String[] retArr() {
        String[] arr = {"hey","how","are","you"};
        return arr;
    }

    private static void dispEven(String[] str) {
        for(int i =0;i< str.length;i++){
            if(i%2==0){
                System.out.println(str[i]);
            }
        }
    }
}
