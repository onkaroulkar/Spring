package com.onkar.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.onkar")
public class AppConfig {

   /* @Bean
    public Alien alien(Computer com){      // @Qualifier("laptop")
        Alien alien = new Alien();
        alien.setAge(34);
        alien.setCom(com);
        return alien;
    }

   // @Bean(name={"com","beast"})
    @Bean
    // @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    @Primary
    public Laptop laptop(){
        return new Laptop();
    }*/
}
