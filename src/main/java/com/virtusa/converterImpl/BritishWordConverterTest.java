package com.virtusa.converterImpl;

import static org.junit.Assert.*;


import org.junit.Test;

public class BritishWordConverterTest {

	@Test
	public void testLargeNumber() {
			long input=123456789;
			String expected="OneHundred Twenty Three Lakhs FourHundred Fifty Six Thousand SevenHundred Eighty Nine Twenty One ";
			BritishWordConverter bwc= new BritishWordConverter();
			assertEquals(expected, bwc.convert(input));
		}
	@Test
	public void testSmallNumber() {
			long input=21;
			String expected="Twenty One ";
			BritishWordConverter bwc= new BritishWordConverter();
			assertEquals(expected, bwc.convert(input));
		}

}
