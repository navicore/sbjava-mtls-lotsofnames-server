package tech.navicore.lotsofnamesj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SbjavaMtlsDemoApplication {
    private static final Logger log = LoggerFactory.getLogger(SbjavaMtlsDemoApplication.class);

    public static void main(String[] args) {

        SpringApplication.run(SbjavaMtlsDemoApplication.class, args);

    }

}
