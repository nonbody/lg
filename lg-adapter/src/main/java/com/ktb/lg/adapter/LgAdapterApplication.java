package com.ktb.lg.adapter;

import com.ktb.lg.repo.LgRepoApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackageClasses = {LgAdapterApplication.class, LgRepoApplication.class})
public class LgAdapterApplication {

    public static void main(String[] args) {
        SpringApplication.run(LgAdapterApplication.class, args);
    }
}
