package com.jenkins.training.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class JenkinsCalculatorTest {

	@Test
	public void addTest() {
		JenkinsCalculator ref = new JenkinsCalculator();
		assertEquals(10, ref.add(5, 5));
	}

	@Test
	public void subTest() {
		JenkinsCalculator ref = new JenkinsCalculator();
		assertEquals(0, ref.sub(5, 5));
	}
}
