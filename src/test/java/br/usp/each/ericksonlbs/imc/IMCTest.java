package br.usp.each.ericksonlbs.imc;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for Max.
 */
public class IMCTest {
	@Test
	public void test1() {
		int expected = 0;
		int actual = IMC.Calc(55.0, 1.75);
		Assert.assertEquals(expected, actual);
	}	
	@Test
	public void test2() {
		int expected = 1;
		int actual = IMC.Calc(75.0, 1.75);
		Assert.assertEquals(expected, actual);
	}	
	@Test
	public void test3() {
		int expected = 2;
		int actual = IMC.Calc(90.0, 1.75);
		Assert.assertEquals(expected, actual);
	}	
	@Test
	public void test4() {
		int expected = 3;
		int actual = IMC.Calc(100.0, 1.75);
		Assert.assertEquals(expected, actual);
	}	
	@Test
	public void test5() {
		int expected = 4;
		int actual = IMC.Calc(110.0, 1.75);
		Assert.assertEquals(expected, actual);
	}	
	@Test
	public void test6() {
		int expected = 5;
		int actual = IMC.Calc(150.0, 1.75);
		Assert.assertEquals(expected, actual);
	}	
}
