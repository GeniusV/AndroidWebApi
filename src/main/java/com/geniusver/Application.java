package com.geniusver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/21/18.
 */
@ComponentScan(value = "com.geniusver")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}
