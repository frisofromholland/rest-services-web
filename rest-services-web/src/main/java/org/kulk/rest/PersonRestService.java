package org.kulk.rest;


import java.util.concurrent.atomic.AtomicLong;

import org.kulk.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


/**
 * User: frisokulk
 * Date: 4/11/17
 * Time: 4:22 PM
 */
@RestController
public class PersonRestService {


    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();


    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
	return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

}
