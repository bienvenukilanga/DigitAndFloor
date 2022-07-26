package com.timwi.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;


@SpringBootTest
public class NotQuiteLispSrvDevTest {

	@Autowired
	NotQuiteLispSrv notQuiteLispSrv;

	@Test
	public void getNumberAndReturnTheFloor() {

		int expectResult = 10;

		try {
			var result = notQuiteLispSrv.getLisp("(Kkk)+((((((((((");

			assertEquals(expectResult, result);
		} catch (Exception e) {
			fail(e);
		}
	}

}
