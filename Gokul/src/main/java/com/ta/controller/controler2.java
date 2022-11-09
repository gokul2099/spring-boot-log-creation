package com.ta.controller;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api1/")
public class controler2 {
	@RequestMapping(value = "log1", method = RequestMethod.GET)
	public ResponseEntity<?> log(@RequestParam Map<String, String> requestParams) throws Exception {

		Logger log = LogManager.getLogger("Gokul1");
		try {
			System.out.println(requestParams);
			log.debug("testAPI started: " + requestParams);
			log.info("testAPI started: " + requestParams);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(requestParams);

		return new ResponseEntity<>(requestParams, HttpStatus.OK);
	}
}


