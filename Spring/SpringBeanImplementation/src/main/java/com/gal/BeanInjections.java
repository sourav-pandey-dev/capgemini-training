package com.gal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.gal")
public class BeanInjections {

    @Bean("dirToSearch")
    public String dirToSearch() {
        return "src/main/java/com/gal";
    }
}
///System
