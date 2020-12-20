package com.example.demo.tms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "file:./tms.properties")
@ConfigurationProperties(prefix = "gettile")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTile {
    private String service;
    private String version;
}
