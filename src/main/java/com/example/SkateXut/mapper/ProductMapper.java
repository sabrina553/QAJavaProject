package com.example.SkateXut.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductMapper {

    @Bean
    public ModelMapper mapper() {
        return new ModelMapper();
    }
}
