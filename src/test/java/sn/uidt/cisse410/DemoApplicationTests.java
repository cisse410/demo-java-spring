package sn.uidt.cisse410;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import sn.uidt.cisse410.service.BusinessService;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	BusinessService bs;

	@Test
	void contextLoads() {
	}

	public void testGetWelcome() {
		String expected = "A demo java spring application";

		String result = bs.getWelcome().getValue();
		assertEquals(expected, result);
	}

}
