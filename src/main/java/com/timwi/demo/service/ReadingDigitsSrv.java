package com.timwi.demo.service;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component
public class ReadingDigitsSrv {
	
	public  int getInputBis(BigInteger input) {

		//var nombre = String.valueOf(input).split("");
		String result = "";
		int count = 1;
		String response="";

		for (int j = 0; j <= 39; j++) {
			var nombre = String.valueOf(input).split("");
			count = 1;

			for (int i = 0; i < nombre.length; i++) {
				if (i + 1 < nombre.length) {

					if (i + 1 >= 0 && nombre[i].equals(nombre[i + 1])) {
						count++;
					} else {
						result = result + String.valueOf(count) + nombre[i];
						count = 1;

					}
				} else {
					if (nombre[i].equals(nombre[i - 1])) {
						result = result + String.valueOf(count) + nombre[i];
					} else {
						result = result + String.valueOf(count) + nombre[i];
						count = 1;

					}
				}

			}
			input = new BigInteger(result);
			//System.out.println(j);
			//System.out.println(result.length());
			//System.out.println(result);
			response =result;
			result = "";
		}

		return response.length();

	}
	
	private int countNumber(String number) {
		 int max =5;
		if(max ==5) {
			return number.length();
		}
		
		
		
		return 0;
		
		
	}

}
