package com.boris.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ComponentDao {
	@Autowired
	ComponentJdbcConnection jdbcconnection;

	public ComponentJdbcConnection getJdbcconnection() {
		return jdbcconnection;
	}

	public void setComponentJdbcconnection(ComponentJdbcConnection jdbcconnection) {
		this.jdbcconnection = jdbcconnection;
	}
	
}

