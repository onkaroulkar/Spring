package com.onkar;

import com.onkar.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       // Desktop dsk = context.getBean("beast",Desktop.class);
        Desktop dsk = context.getBean("desktop",Desktop.class);
        Desktop dsk1 = context.getBean("desktop",Desktop.class);
        dsk.compile();














        /*ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");
        System.out.println(obj.getAge());
        obj.code();*/
    }
}
