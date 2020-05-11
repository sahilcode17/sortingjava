package sorting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testAddStrings {

	@Test
	void test() {
		jUnitTesting ju1=new jUnitTesting();
		String r= ju1.addStrings("capstone", "project");
		assertEquals("capstoneproject",r);
	}

}
