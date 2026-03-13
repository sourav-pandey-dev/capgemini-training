package com.gal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gal.algo.Mycalc;
import com.gal.algo.PasswordHasher;
import com.gal.algo.UserVerifier;

public class MainBeans {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

		context.scan("com.gal");
		context.refresh();
		PasswordHasher bean = context.getBean(PasswordHasher.class);
		PasswordHasher bean2 = context.getBean(PasswordHasher.class);

		System.out.println(bean);
		System.out.println(bean2);
		System.out.println(bean.hash("hello"));

		StringBuilder bean3 = context.getBean(StringBuilder.class);
		System.out.println(bean3);

		Mycalc bean4 = context.getBean(Mycalc.class);
		int sum = bean4.add(4, 5);
	
		System.out.println(sum);
		String[] beans = context.getBeanDefinitionNames();
		for (String beanName : beans) {
			System.out.println(beanName);
		}

		Object bean5 = context.getBean("calcNameBean");
		Object bean6 = context.getBean("getCalc");
		Object beans7 = context.getBean("getDataSource");
		System.out.println(beans7);
		UserVerifier verifier = context.getBean(UserVerifier.class);
        verifier.verifyUser();
    	context.close();
//		ClassPathXmlApplicationContext xmlContext = new ClassPathXmlApplicationContext("beans.xml");
//		xmlContext.refresh();
//		StringBuilder bean7 = xmlContext.getBean(StringBuilder.class);
//		System.out.println(bean7);
//		xmlContext.close();
	}
}
