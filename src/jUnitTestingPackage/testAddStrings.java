package jUnitTestingPackage;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction obj = new jUnitFunction();
		String res = obj.addString("ice", "cream");
		assertEquals("icecream", res);
	}

}
