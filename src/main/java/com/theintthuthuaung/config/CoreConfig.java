package com.theintthuthuaung.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
// @formatter:off
@ComponentScan(basePackages = { 
		"com.theintthuthuaung.service"})
// @formatter:on
public class CoreConfig {

}