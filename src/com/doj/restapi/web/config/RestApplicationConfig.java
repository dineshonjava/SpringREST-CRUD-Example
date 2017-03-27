/**
 * 
 */
package com.doj.restapi.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * @author Dinesh.Rajput
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.doj.restapi.web.controller")
public class RestApplicationConfig{
	
}
