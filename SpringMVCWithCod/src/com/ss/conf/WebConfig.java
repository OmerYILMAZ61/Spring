package com.ss.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@Import(ViewConfig.class)
@ComponentScan(basePackages = {"com.ss"})
public class WebConfig {

	
	//Buradan da scope ayarlaması yapilabilirdi
	
//    @Bean
//    public HelloController helloController () {
//        return new HelloController();
//    }
//
//    @Bean
//    @Scope(WebApplicationContext.SCOPE_SESSION)
//    public HelloController hello(HttpServletRequest request){
//         return new HelloController(request.getRemoteAddr());
//    }
}