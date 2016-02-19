package net.biala;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MinAvgTwoSliceTest {
	
	private MinAvgTwoSlice sut;
	
	@Before
	public void setUp() throws Exception {
		sut = new MinAvgTwoSlice();
	}

	@Test
	public void shouldReturnSmalestValue() throws Exception {
			int[] A = {4,2,2,5,1,5,8};
			
		assertEquals(1, sut.solution(A));
	}
	
	@Test
	public void shouldReturnSmalestValue2() throws Exception {
			int[] A = {2,2};
			
		assertEquals(0, sut.solution(A));
	}
	
	@Test
	public void shouldReturnSmalestValue3() throws Exception {
			int[] A = {5,2,0,1};
			
		assertEquals(2, sut.solution(A));
	}
	
	@Test
	public void shouldReturnSmalestValue4() throws Exception {
			int[] A = {5,2,-1,1,1,1,1};
			
		assertEquals(2, sut.solution(A));
	}

}
