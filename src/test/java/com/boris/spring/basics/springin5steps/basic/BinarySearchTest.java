package com.boris.spring.basics.springin5steps.basic;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.boris.spring.basics.springin5steps.SpringIn5StepsBasicApplication;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringIn5StepsBasicApplication.class)
public class BinarySearchTest {

	@Autowired
	BinarySearchimpl binarySerarch;
	
	@Test
	public void test() {
		int actualresult = binarySerarch.binarySearch(new int[] {0}, 0);
		assertEquals(actualresult, 0);
	}

}
