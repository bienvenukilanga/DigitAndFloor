package com.timwi.demo.controller;

import java.io.File;
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

		var result= readingDigitsSrv.getInputBis(new BigInteger(number));
		return String.valueOf("le resultat est "+result);

	}

}
