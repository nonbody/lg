package com.ktb.lg.api;

import com.ktb.lg.repo.LgRepoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {LgApiApplication.class, LgRepoApplication.class})
public class LgApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(LgApiApplication.class, args);
    }
}
