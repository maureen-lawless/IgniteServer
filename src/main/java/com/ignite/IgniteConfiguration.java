package com.ignite;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("ignite")
public class IgniteConfiguration {

    private String igniteConfigurationFilename;

    public String getIgniteConfigurationFilename() {
        return igniteConfigurationFilename;
    }

    public void setIgniteConfigurationFilename(String igniteConfigurationFilename) {
        this.igniteConfigurationFilename = igniteConfigurationFilename;
    }
}
