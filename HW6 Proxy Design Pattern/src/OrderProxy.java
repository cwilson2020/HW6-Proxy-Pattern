
public class OrderProxy implements OrderInfo {


	private static OrderInfo orderInfo;


	public OrderProxy() {

	}

	@Override
	public String getState() {
		String ret = new String("");
		if(orderInfo == null) {
			orderInfo = new OrderInfoImpl();
			System.out.println("Creating new order instance");
			ret = "Creating new order instance";
		}
		orderInfo.getState();	

		return ret;
	}

	@Override
	public String setState(String p, String state) {
		Order order = new Order();
		order.setState(state);
		String ret;

		if(orderInfo == null) {
			orderInfo = new OrderInfoImpl();
			System.out.println("Creating new order instance");
			ret = "Creating new order instance";
		}


		if(p.equals("Dealer") && state.equals("reorder")) {
			orderInfo.setState(p, "No state change a dealer can't issue a reorder");	
			ret = "No state change a dealer can't issue a reorder";
		}
		else if(p.equals("Customer") && state.equals("Fulfill")) {
			ret = "No state change a customer can't fulfill an order";

			orderInfo.setState(p, "No state change a customer can't fulfill an order");	
		}
		else {
			ret = orderInfo.setState(p, state);	

		}

		return ret;

	}
}
