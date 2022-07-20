package com.timwi.demo.service;

import java.math.BigInteger;

import org.springframework.stereotype.Component;

@Component
public class ReadingDigitsSrv {

	public int getInputBis(BigInteger input) throws Exception {

		String result = "";
		int count = 1;
		String response = "";
		try {
			for (int j = 0; j <= 39; j++) {
				//transformation de l'input recu en String pour tableau de string
				var nombre = String.valueOf(input).split("");
				count = 1;

				// on boucle sur le tableau precedement creer pour obtenir le nombre qui sera l input de  n+1
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

				response = result;
				result = "";
			}

			// on retourne la taille du tableau après 40 iteration 
			// algorithm a ameliorer pour des meilleurs performance
			return response.length();
			
		} catch (Exception e) {
			throw new Exception(e);
		}

		

	}

}
