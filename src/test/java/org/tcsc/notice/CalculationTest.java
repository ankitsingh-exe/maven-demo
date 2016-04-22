package org.tcsc.notice;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculationTest {
	@Test
	public void addition() {
		assertEquals(4, Calculation.addition(2, 2), 0);
		assertEquals(4.5, Calculation.addition(2, 2), 0.5);
	}
	
	@Test
	public void substraction() {
		assertEquals(0, Calculation.substraction(2, 2), 0);
		assertEquals(0.5, Calculation.substraction(2, 2), 0.5);
	}
}
