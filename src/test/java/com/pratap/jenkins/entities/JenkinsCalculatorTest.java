package com.pratap.jenkins.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class JenkinsCalculatorTest {
	
	private JenkinsCalculator calc;
	
	@Before
	public void setup() {
		calc = new JenkinsCalculator();
	}

	@Test
	public void testAddNumbers() {
		assertEquals(10, calc.addNumbers(5, 5));
	}
	
	@Test
	public void testSubtractNumbers() {
		assertEquals(10, calc.subtractNumbers(20, 10));
	}

}
