package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;

class numberOfNumTest {
    @ParameterizedTest
    @CsvSource({
            "16, 8",
            "2, -1",
            "25, -1",
            "1,1"
    })
    void testFindNum(int input, int expected){
        numberOfNum obj = new numberOfNum();
        int result = obj.findnum(input);
        assertEquals(expected,result);
    }

//    @ParameterizedTest
//    @CsvSource({
//            "16, 8",
//            "2, -1",
//            "25, -1"
//
//    })
//    void testFindNum(int input, int expected) {
//
//        numberOfNum obj = new numberOfNum();
//
//        int result = obj.findnum(input);
//
//        assertEquals(expected, result);
//    }
}