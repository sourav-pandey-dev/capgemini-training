package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringAlgoTest {
@Test
    void testShift2Char(){
    StringAlgo obj = new StringAlgo();
    String input = "Hello";
    String expected = "lloHe";
    String actual = obj.Shift2Char(input);
    assertEquals(expected, actual);
}
@Test
    void testShift2Char2(){
    StringAlgo obj = new StringAlgo();
    String input = "Hello";
    String expected = "lloHe";
    String actual = obj.Shift2Char(input);
    assertEquals(expected, actual);
}
}