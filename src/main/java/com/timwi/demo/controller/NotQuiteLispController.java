package com.timwi.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.timwi.demo.service.NotQuiteLispSrv;

@RestController
@CrossOrigin
@RequestMapping("/floor")
public class NotQuiteLispController {

	@Autowired
	NotQuiteLispSrv notQuiteLispSrv;

	@PostMapping
	public String getFloor(@NonNull String number) throws Exception {

		try {
			var result = notQuiteLispSrv.getLisp(number);
			return String.valueOf(result);
		} catch (Exception e) {

			return "Une Erreur Serveur a eu lieu, veuillez reesayer plus tard!!";
		}

	}

}
