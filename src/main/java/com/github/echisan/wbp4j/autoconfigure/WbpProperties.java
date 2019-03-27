package com.github.echisan.wbp4j.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Properties;

@ConfigurationProperties(prefix = WbpProperties.WBP4J_PREFIX)
public class WbpProperties {

    public static final String WBP4J_PREFIX = "wbp4j";

    private Properties properties = new Properties();

    public void setEnableRetry(String isEnable){
        properties.setProperty("enableRetry",isEnable);
    }

    public String getEnableRetry(){
        return properties.getProperty("enableRetry");
    }

    public void setUsername(String username){
        properties.setProperty("username",username);
    }

    public String getUsername(){
        return properties.getProperty("username");
    }


    public void setPassword(String password){
        properties.setProperty("password",password);
    }

    public String getPassword(){
        return properties.getProperty("password");
    }


}
