package net.biala;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class PitagorasTest {

	private Pitagoras sut;

	@Before
	public void setUp() {
		sut = new Pitagoras();
	}

	@Test
	public void shouldCorectlyCalculateHypotenuse() throws Exception {

		Double a = 3.;
		Double b = 4.;
		assertEquals((Double) 5., sut.calculateHypotenuse(a, b));

	}

	@Test
	public void shouldCalculateHypotenuseSecondTriangle() throws Exception {

		Double a = 6.;
		Double b = 8.;
		assertEquals((Double) 10., sut.calculateHypotenuse(a, b));
	}

	@Test(expected = RuntimeException.class)
	public void shouldThrowRuntimeWhenFirstLegIsLessThenZero() throws Exception {
		Double a = -6.;
		Double b = 8.;
		sut.calculateHypotenuse(a, b);
	}

	@Test(expected = RuntimeException.class)
	public void shouldThrowRuntimeWhenSecondLegIsLessThenZero()
			throws Exception {
		Double a = 6.;
		Double b = -8.;
		sut.calculateHypotenuse(a, b);
	}

}
