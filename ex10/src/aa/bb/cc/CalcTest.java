package aa.bb.cc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CalcTest {

	@Test
	void test() {
		assertEquals(Calc.sum(3,2), 5);
	}

}
