package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddNumbers {

	@Test
	void testMainIntInt() {
		jUnitTesting ju=new jUnitTesting();
		int r=ju.addNumbers(100, 200);
		assertEquals(300,r);
	}

}
