import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class stateTest {

	@Test
	void test() {
		//fail("Not yet implemented");
		OrderInfo oi = new OrderProxy();
		String s=oi.getState();
		System.out.println(s);
		assertNotNull("Creating new order instance");
	}	

	@Test
	void test2() {
		//fail("Not yet implemented");
		OrderInfo oi = new OrderProxy();
		String s=oi.setState("Dealer", "Fulfill");
		System.out.println(s);
		assertNotNull("Creating new order instance");
	}	
	
}
