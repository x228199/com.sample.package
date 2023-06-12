package com.demo.utils;

import java.util.Random;

public class CustomUtils {

	public static String getRandom15digitNumber() {
		Random random = new Random();

		int num1, num2,num5;

		num1 = random.nextInt(900) + 100;
		num2 = random.nextInt(643) + 100;
		//num3 = random.nextInt(9000) + 100;
		//num4 = random.nextInt(900) + 100;
		num5 = random.nextInt(10) + 10;

		String serialNumber = ""+num1 + num2 +num5 ;
	
		return serialNumber;
	}
}
