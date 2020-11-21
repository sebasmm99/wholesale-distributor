package distributor;

import java.util.ArrayList;

public class Retailer implements Comparable<Retailer>{
	
	
	
	public String name;
	ArrayList<String> listProducts = new ArrayList<>();
	
	public int priority = listProducts.size();
	
	
	@Override
	public int compareTo(Retailer anotherRetailer) {
		return anotherRetailer.priority - this.priority;
	}
	
	public float calculateBill() {
		float total = 0;
		total = listProducts.size() * 100;
		return total;
	}

}
