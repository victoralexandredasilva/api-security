package com.victor.security.configs;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JacksonConfig {
    public ObjectMapper objectMapper() {
        var mapper =  new ObjectMapper();
        mapper.findAndRegisterModules();
        return mapper;
    }
}
