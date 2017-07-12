package com.prasanth.controllers;

import com.prasanth.modal.Demo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.xml.ws.Response;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by batman on 7/10/17.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final String template = "Hello, %s!";
    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping(method = RequestMethod.GET, value = "/demos")
    Demo getDemo(@RequestParam(name = "query", defaultValue = "default") String query){

        return new Demo(counter.incrementAndGet(), String.format(template, query));
    }

    /*
    localhost:8080/demo/1
    {
    "id": 4,
    "name": "Hello, default!"
    }
     */

    @RequestMapping(method = RequestMethod.POST, value = "{newID}")
    Demo postDemo(@PathVariable Long newID, @RequestBody Demo demo) {

        return demo;
    }

    /*
    Status Created - 201
     */
    @RequestMapping(method = RequestMethod.GET, value = "/sample")
    ResponseEntity sample() {

        return new ResponseEntity<String>(HttpStatus.CREATED);
    }


}
