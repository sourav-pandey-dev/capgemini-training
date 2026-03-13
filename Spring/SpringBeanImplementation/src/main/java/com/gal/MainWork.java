package com.gal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainWork {
    public static void main(String[] args) {

    	ApplicationContext context = new AnnotationConfigApplicationContext(BeanInjections.class);

        WordCounter wordCounter = context.getBean(WordCounter.class);
        
        System.out.println(wordCounter.wordCount());
    }
}