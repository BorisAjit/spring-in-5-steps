package com.boris.spring.basics.springin5steps.cdi;

import javax.inject.Named;

@Named
public class SomeCDIDao {
	public int[] getdata() {
		return new int[] {5,89,100};
	}
}
