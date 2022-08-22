/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sbtask2.t2.Restapi;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author admin
 */
    @RestController
public class GreetingController {

	private static final String t= "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@GetMapping("/greetings")
	public RepresentationClass rc(@RequestParam(value = "name", defaultValue = "World") String name) {
		return new RepresentationClass (counter.incrementAndGet(), String.format(t, name));
	}
}
    
