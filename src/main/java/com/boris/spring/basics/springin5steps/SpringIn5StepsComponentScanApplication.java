package com.boris.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.boris.spring.basics.componentscan.ComponentDao;

@Configuration
@ComponentScan("com.boris.spring.basics.componentscan")
public class SpringIn5StepsComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsComponentScanApplication.class);
	
	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsComponentScanApplication.class);){
			ComponentDao personDao = applicationContext.getBean(ComponentDao.class);
			ComponentDao personDao1 = applicationContext.getBean(ComponentDao.class);
			
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcconnection());
			
			LOGGER.info("{}", personDao1);
			LOGGER.info("{}", personDao1.getJdbcconnection());
		
		}
	}

}
