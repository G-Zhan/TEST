package com.example.demo.wms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "file:./wms.properties")
@ConfigurationProperties(prefix = "getmap")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetMapProperties {
    private String service;
    private String version;
}
