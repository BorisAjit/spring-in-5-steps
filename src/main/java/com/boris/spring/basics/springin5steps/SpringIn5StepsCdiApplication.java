package com.boris.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.boris.spring.basics.springin5steps.cdi.SomeCDIBussiness;

@Configuration
@ComponentScan
public class SpringIn5StepsCdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsCdiApplication.class);
	
	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsCdiApplication.class);){
			SomeCDIBussiness bussiness = applicationContext.getBean(SomeCDIBussiness.class);
			
			LOGGER.info("{} - {}", bussiness,bussiness.getSomeCDIDao());
		}
	}

}
