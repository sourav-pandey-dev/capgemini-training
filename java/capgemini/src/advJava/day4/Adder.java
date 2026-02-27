package advJava.day4;

public class Adder extends Thread{
    int[] row1 = new int[4];
    int[] row2 = new int[4];
    int i;
    int[][] result =new int[5][4];
    public Adder(int[] row1,int[] row2, int i,int [][] result){
        this.row1 = row1;
        this.row2 = row2;
        this.i = i;
        this.result = result;
    }
    @Override
    public void run() {
        result[i] = add(row1,row2);
    }
    public int[] add(int[]row1,int[] row2){
        int [] temp = new int[4];
        for(int j = 0;j<4;j++){
            temp[j] = row1[j] + row2[j];
        }
        return  temp;
    }
}
