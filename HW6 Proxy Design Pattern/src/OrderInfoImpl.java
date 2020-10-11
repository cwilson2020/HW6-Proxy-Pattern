
public class OrderInfoImpl  implements OrderInfo{

	public OrderInfoImpl() {
		
		
	}

	@Override
	public String getState() {
	return	FetchOrder();
		
	}

	@Override
	public String setState(String p, String s) {
		System.out.println("Setting Order state to: "+ s + " state");
		return "Setting Order state to: "+ s + " state";
		
	}
	
	private String FetchOrder() {
		System.out.println("Fetching Order from XML in the background");
		return "Fetching Order from XML in the background";
	}

}
