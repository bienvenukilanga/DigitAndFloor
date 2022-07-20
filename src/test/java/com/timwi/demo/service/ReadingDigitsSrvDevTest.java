package com.timwi.demo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ReadingDigitsSrvDevTest {
	
	@Autowired
	ReadingDigitsSrv readingDigitsSrv;
	
	@Test
	public void getNumberAndReturnTheNumberLength() {

		int expectResult = 107312;

		try {
			var result = readingDigitsSrv.getInputBis(new BigInteger("11"));

			assertEquals(expectResult, result);
		} catch (Exception e) {
			fail(e);
		}
	}

}
