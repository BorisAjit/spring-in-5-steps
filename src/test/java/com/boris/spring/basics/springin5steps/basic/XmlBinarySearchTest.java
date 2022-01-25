package com.boris.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.xml")
public class XmlBinarySearchTest {

	@Autowired
	BinarySearchimpl binarySerarch;
	
	@Test
	public void test() {
		int actualresult = binarySerarch.binarySearch(new int[] {0}, 0);
		assertEquals(actualresult, 0);
	}

}
