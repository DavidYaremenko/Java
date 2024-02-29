package com.legends.reverse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	void testHelloWorld() {
		assertEquals("olleH dlroW", Reverse.reverse("Hello World"));
	}
	@Test
	void testEmptyString() {
		assertEquals("olleH dlroW", Reverse.reverse("Hello World"));
	}

}
