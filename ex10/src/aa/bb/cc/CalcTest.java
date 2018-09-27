package aa.bb.cc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test() {
		assertEquals(Calc.sum(2,2), 4);
		assertEquals(Calc.sum(45,3), 48);
	}

}
