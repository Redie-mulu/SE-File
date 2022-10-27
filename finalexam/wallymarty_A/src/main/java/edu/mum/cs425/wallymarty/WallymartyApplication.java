package edu.mum.cs425.wallymarty;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.TimeZone;

@SpringBootApplication
public class WallymartyApplication {

    public static void main(String[] args) {
        SpringApplication.run(WallymartyApplication.class, args);
    }

    @PostConstruct
    void started() {

        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
    }


}
