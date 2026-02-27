package org.example;

import java.util.Arrays;


public class salarysum {
    public int salary(int[] sal){
        int sum = Arrays.stream(sal).sum();
        return sum;
    }
}
