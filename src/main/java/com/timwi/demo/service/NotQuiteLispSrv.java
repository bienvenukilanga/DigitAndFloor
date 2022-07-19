package com.timwi.demo.service;

import java.util.Arrays;

import org.springframework.stereotype.Component;


@Component
public class NotQuiteLispSrv {

	public int getLisp(String santa) throws Exception {

		try {
			var tab = santa.split("");
			int etage = 0;

			var cleanArray = Arrays.stream(tab).filter(t -> t.equals("(") || t.equals(")")).toArray();

			for (Object t : cleanArray) {
				if (t.equals("(")) {
					etage = etage + 1;
				} else {
					etage = etage - 1;

				}

			}

			return etage;

		} catch (Exception e) {

			throw new Exception(e);
		}

	}

}
