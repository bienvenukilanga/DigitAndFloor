package com.timwi.demo.controller;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timwi.demo.service.ReadingDigitsSrv;

@RestController
@CrossOrigin
@RequestMapping("/digit")
public class ReadingDigitsController {

	@Autowired
	ReadingDigitsSrv readingDigitsSrv;

	@PostMapping
	public String getDigit(String number) {

		int result;
		try {
			result = readingDigitsSrv.getInputBis(new BigInteger(number));
			return String.valueOf("le resultat est " + result);
		} catch (Exception e) {
			return "une erreur Serveur est survenue, veuillez reesayer plus tard";

		}
	}
}
