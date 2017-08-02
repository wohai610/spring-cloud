package com.lyl.study;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * Created by liuyili on 2017/8/3.
 */
@Component
@Configuration
@ConfigurationProperties(prefix = "profile")
public class ConfigInfo {
    @Value("${appname:default}")
    private String appname;

    public String getAppname() {
        return appname;
    }

    public void setAppname(String appname) {
        this.appname = appname;
    }

    public String getActive() {
        return active;
    }

    private String active;

    @Override
    public String toString() {
        return "appname:" + appname + ", active:" + active;
    }

    public void setActive(String active) {
        this.active = active;
    }
}
