package com.github.echisan.wbp4j.autoconfigure;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(WbpProperties.class)
@ConditionalOnProperty("wbp4j")
public class WbpAutoConfiguration {
}
