package org.example;

import java.util.Arrays;
import java.util.Optional;

public class seniorMost {
    public String findSenio(String[] date){
        Optional<String> min = Arrays.stream(date).min(String::compareTo);
        return min.orElse(null);
    }
}
