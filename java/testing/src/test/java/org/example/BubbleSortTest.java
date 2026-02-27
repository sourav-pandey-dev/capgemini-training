package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void testBubble(){
        BubbleSort obj = new BubbleSort();
        int[] input = {9, 8, 7, 6, 5, 4, 87, 53, 56, 836};
        int[] expected = {4,5,6,7,8,9,53,56,87,836};
        int[] actual = obj.bubbleSort(input);
        assertArrayEquals(expected, actual);
    }
    @Test
    void testNullInput() {

        BubbleSort obj = new BubbleSort();

        assertThrows(NullPointerException.class, () -> {
            obj.bubbleSort(null);
        });
    }

}