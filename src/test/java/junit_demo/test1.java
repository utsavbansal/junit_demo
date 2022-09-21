package junit_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class test1 {
	sum_demo sd=new sum_demo();
	@Test
	public void test() {
		//fail("Not yet implemented");
		assertEquals(25, sd.sum(10, 15));
	}

}
