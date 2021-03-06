package com.lyl.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.krb5.Config;

@SpringBootApplication
@RestController
public class ConfigClientApplication {
    @Autowired
    private ConfigInfo configInfo;

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientApplication.class, args);

    }

    @RequestMapping("/configInfo")
    public String configInfo() {
        return this.configInfo.toString();
    }
}
