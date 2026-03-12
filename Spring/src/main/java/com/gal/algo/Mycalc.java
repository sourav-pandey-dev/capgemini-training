package com.gal.algo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Mycalc implements Calc {

	@Override
	public int add(int a, int b) {
				return a+b;
	}
	@PostConstruct
	public void onInit() {
		System.out.println("initilizing a constructor");
	}
	@PreDestroy
	public void onDestroy() {
		System.out.println("Destroying the objects");
		
	}
		
}
