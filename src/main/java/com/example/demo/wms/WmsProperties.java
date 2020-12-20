package com.example.demo.wms;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "file:./wms.properties")

public class WmsProperties {

    @Bean
    @ConfigurationProperties(prefix = "getmap1")
    public GetMap getMap(){
        return new GetMap();
    }

    @Bean
    @ConfigurationProperties(prefix = "getcapabilities")
    public GetCapabilities getCapabilities(){
        return new GetCapabilities();
    }
}
