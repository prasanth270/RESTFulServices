package com.prasanth.controllers;

import com.prasanth.modal.Demo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by batman on 7/10/17.
 */
@RestController
@RequestMapping("/demo")
public class DemoController {

    private static final String template = "Hello, %s!";
    private final AtomicInteger counter = new AtomicInteger();

    @RequestMapping("/getdemo")
    public Demo getDemo(@RequestParam(name = "query", defaultValue = "default") String query){

        return new Demo(counter.incrementAndGet(), String.format(template, query));
    }
}
