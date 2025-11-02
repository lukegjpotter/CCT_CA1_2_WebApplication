package com.lukegjpotter.cct.CCT_CA1_2_WebApplication;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CctCa12WebApplication {

    private static Logger logger = LoggerFactory.getLogger(CctCa12WebApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(CctCa12WebApplication.class, args);
        logger.info("Application started");
    }

}
