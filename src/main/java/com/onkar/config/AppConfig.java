package com.onkar.config;

import com.onkar.Desktop;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {

   // @Bean(name={"com","beast"})
    @Bean
    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }
}
