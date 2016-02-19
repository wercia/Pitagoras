package net.biala;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrimeNumberTest {

	private PrimeNumber sut;

	@Before
	public void setUp() {
		sut = new PrimeNumber();
	}

	@Test
	public void shouldNotBeFirstNumerWhenIsLessThenZero() throws Exception {

		int number = -1;
		assertFalse(sut.isFirstNumber(number));
	}

	@Test
	public void shouldNotBeFirstNumberWhenIs0() throws Exception {
		int number = 0;
		assertFalse(sut.isFirstNumber(number));
	}

	@Test
	public void shouldNotBeFirstNumberWhenIs1() throws Exception {
		int number = 1;
		assertFalse(sut.isFirstNumber(number));
	}
	
	@Test
	public void shouldBeFirstNumberWhenIs2() throws Exception {
		int number = 2;
		assertTrue(sut.isFirstNumber(number));
	}

	@Test
	public void shouldBeFirstNumberWhenIs3() throws Exception {
		int number = 3;
		assertTrue(sut.isFirstNumber(number));
	}

	@Test
	public void shouldNotBeFirstNumberWhenIs4() throws Exception {
		int number = 4;
		assertFalse(sut.isFirstNumber(number));

	}

	@Test
	public void shouldNotBeFirstNumberWhenIs100() throws Exception {
		int number = 100;
		assertFalse(sut.isFirstNumber(number));
	}
	
	@Test
	public void shouldBeFirstNumberWhenIs101() throws Exception {
		int number = 101;
		assertTrue(sut.isFirstNumber(number));
	}
	

}
