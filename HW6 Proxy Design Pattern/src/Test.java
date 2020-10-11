
public class Test {

	public Test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		OrderInfo oi = new OrderProxy();
		oi.getState();
		oi.getState();
		
		oi.setState("Dealer", "Fulfill");
		oi.setState("Customer", "Fulfill");
		
	}

}
