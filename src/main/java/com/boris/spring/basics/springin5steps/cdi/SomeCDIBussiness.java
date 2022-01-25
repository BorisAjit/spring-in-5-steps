package com.boris.spring.basics.springin5steps.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBussiness {
	
	@Inject
	SomeCDIDao someCDIDao;

	public SomeCDIDao getSomeCDIDao() {
		return someCDIDao;
	}

	public void setSomeCDIDao(SomeCDIDao someCDIDao) {
		this.someCDIDao = someCDIDao;
	}
	
	public int findGreatest() {
		int[] arrary = someCDIDao.getdata();
		int greatest = Integer.MIN_VALUE;
		for (int i : arrary) {
			if(greatest<i) {
				greatest = i;
			}
		}
		return greatest;
	}
}
