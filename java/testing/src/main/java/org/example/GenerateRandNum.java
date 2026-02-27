package org.example;

import java.util.Arrays;

public class GenerateRandNum {
 public int[] getTenRandoms(){
     int[] arr = new int[10];
     for(int i=0;i<10;i++){
//         arr[i] =(int) Math.floor(Math.random()*10) +1;
         arr[i] = i+1;
     }
     return arr;
 }

    static void main() {
        GenerateRandNum gen = new GenerateRandNum();
        int[] result = gen.getTenRandoms();
        System.out.println(Arrays.toString(result));
    }

}
