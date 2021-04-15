package jUnitTestingPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		jUnitFunction obj = new jUnitFunction();
		int res = obj.addNumbers(65, 45);
		assertEquals(110, res);
	}

}
