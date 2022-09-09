package com.wotos.wotosvehicleservice.config;

import feign.Feign;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EnvironmentConfig {

    @Bean
    public Feign.Builder WotApi() {
        return Feign.builder().contract(new SpringMvcContract());
    }

    @Value("${env.urls.world_of_tanks_api}")
    private String WOT_API;

    @Value("${env.app_id}")
    private String APP_ID;

    public String WOT_API() {
        return WOT_API;
    }

    public String APP_ID() {
        return APP_ID;
    }
}
