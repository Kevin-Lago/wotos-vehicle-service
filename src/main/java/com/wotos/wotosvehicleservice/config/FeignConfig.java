package com.wotos.wotosvehicleservice.config;

import feign.Feign;
import org.springframework.cloud.openfeign.support.SpringMvcContract;
import org.springframework.context.annotation.Bean;

public class FeignConfig {

    @Bean
    public Feign.Builder WotApi() {
        return Feign.builder().contract(new SpringMvcContract());
    }

}
