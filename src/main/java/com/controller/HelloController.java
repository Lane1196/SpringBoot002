package com.controller;

import com.util.Logs;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Wzj on 2017/3/13 0013.
 */
@RestController
public class HelloController {

    public static final String word = "word";

    static {
        System.out.println("HomeController init...");
    }

    @RequestMapping("/")
    public String index() {
        Logs.info(word);
        return "index";
    }

    @RequestMapping("/hello1")
    public String say1() {
        Logs.info(word);
        return "Spring boot!" + word;
    }

    @RequestMapping("/hello2")
    public String say2() {
        Logs.warn(word);
        return "Spring boot!" + word;
    }
}
