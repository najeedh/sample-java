package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {
	@Test
	public void testGetMessage() {
		App app = new App();
		assertEquals("Hello, Bamboo!", app.getMessage());
	}
}
