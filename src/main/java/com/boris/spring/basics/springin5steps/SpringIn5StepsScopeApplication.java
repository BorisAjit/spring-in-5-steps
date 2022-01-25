package com.boris.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.boris.spring.basics.springin5steps.scope.PersonDao;

@Configuration
@ComponentScan
public class SpringIn5StepsScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsScopeApplication.class);
	
	public static void main(String[] args) {
		
		try(ConfigurableApplicationContext applicationContext = 
				new AnnotationConfigApplicationContext(SpringIn5StepsScopeApplication.class);){
			PersonDao personDao = applicationContext.getBean(PersonDao.class);
			PersonDao personDao1 = applicationContext.getBean(PersonDao.class);
			
			LOGGER.info("{}", personDao);
			LOGGER.info("{}", personDao.getJdbcconnection());
			
			LOGGER.info("{}", personDao1);
			LOGGER.info("{}", personDao1.getJdbcconnection());
		}
		
	}

}
