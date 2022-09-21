package junit_demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {
	sum_demo sd=new sum_demo();

	@Test
	public void test() {
		assertEquals(-100, sd.sum(10,-110 ));
	}

}
