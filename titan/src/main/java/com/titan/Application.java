package com.titan;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author yk
 * @version 1.0.0
 */
@SpringBootApplication
@EnableAsync
public class Application {

    public static void main(String[] args) {

        new SpringApplicationBuilder(Application.class).web(true).run(args);


    }

}
