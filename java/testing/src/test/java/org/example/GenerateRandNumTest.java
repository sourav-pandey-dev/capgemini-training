package org.example;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class GenerateRandNumTest {
    GenerateRandNum gen = new GenerateRandNum();
    int[] result = gen.getTenRandoms();
    @Test
    void test1(){
        int input = result.length;
        int expected = 10;
        assertEquals(input,expected);
    }
    @Test
    void test2(){
        Boolean expected = true;
        Boolean input = true;
        for(int num : result) {
            if (num < 1 || num > 10) {
                input = false;
            }
            assertEquals(expected, input);
        }
    }
    @Test
    void test3(){
        assertTrue(Arrays.stream(result).allMatch(x->x>=1 && x<=10));

    }
    @Test
    void test4(){
        assertFalse(Arrays.stream(result).anyMatch(x-> x<1 || x>10));
    }

    @Test
    void test5(){
        int[] newresult = gen.getTenRandoms();
        assertFalse(Arrays.equals(result, newresult));
    }
}