package com.boris.spring.basics.springin5steps;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.boris.spring.basics.springin5steps.basic.BinarySearchimpl;

@Configuration
@ComponentScan
public class SpringIn5StepsBasicApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringIn5StepsBasicApplication.class);) {

			BinarySearchimpl binarySearchimpl = applicationContext.getBean(BinarySearchimpl.class);
			BinarySearchimpl binarySearchimpl2 = applicationContext.getBean(BinarySearchimpl.class);

			System.out.println(binarySearchimpl);
			System.out.println(binarySearchimpl2);

			int res = binarySearchimpl.binarySearch(new int[] { 1, 2, 3, 4 }, 3);
			System.out.println(res);
			
		}

	}

}
