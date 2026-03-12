package com.gal.algo;

import java.util.Random;

import org.springframework.stereotype.Component;
//@Component(value = "SixDigitOtpGenerator")
public class SixDigitOtpGenerator implements OtpGenerator {

	@Override
	public String getOtp() {
		return" " + new Random().nextInt(1000000);
	}

}