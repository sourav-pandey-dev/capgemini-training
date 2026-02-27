package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class Q1findlineTest {
@ParameterizedTest
    @MethodSource("source")
    void testLine(String input){

}
    static Stream<String> source(){
        return Stream.of("this is line. Line contains few words. Line is in java","this is not a line","line is a very good thing");
    }
}