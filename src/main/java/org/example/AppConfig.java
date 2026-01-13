package org.example;
//added this class to show how we can work on both xml based and annotation based work in spring core

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("org.example")
@ImportResource("classpath:spring.xml")
public class AppConfig {
}
