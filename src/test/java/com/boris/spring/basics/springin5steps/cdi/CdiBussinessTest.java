package com.boris.spring.basics.springin5steps.cdi;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CdiBussinessTest {

	@InjectMocks
	SomeCDIBussiness cdiBussiness;
	
	@Mock
	SomeCDIDao daoMock;
	
	@Test
	public void test() {
		Mockito.when(daoMock.getdata()).thenReturn(new int[] {2,4});
		assertEquals(cdiBussiness.findGreatest(), 4);
	}
	
	@Test
	public void test2() {
		Mockito.when(daoMock.getdata()).thenReturn(new int[] {});
		assertEquals(cdiBussiness.findGreatest(), Integer.MIN_VALUE);
	}
	
	@Test
	public void test3() {
		Mockito.when(daoMock.getdata()).thenReturn(new int[] {3,3});
		assertEquals(cdiBussiness.findGreatest(), 3);
	}

}
