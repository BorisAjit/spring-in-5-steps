package com.boris.spring.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.boris.spring.basics.springin5steps.xml.XmlPersonDao;

public class SpringIn5StepsXmlContextApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(SpringIn5StepsXmlContextApplication.class);

	public static void main(String[] args) {
		
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("ApplicationContext.xml");) {

			XmlPersonDao personDao = applicationContext.getBean(XmlPersonDao.class);
			
			LOGGER.info("Beans Loaded -> {}",(Object)applicationContext.getBeanDefinitionNames());
			
			LOGGER.info("{} {}", personDao, personDao.getJdbcconnection());
		}

	}

}
