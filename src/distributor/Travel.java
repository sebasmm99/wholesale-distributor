package distributor;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.PriorityQueue;

public class Travel {
	
	
	
	String number;
	
	PriorityQueue<Retailer> colRetailer = new PriorityQueue<Retailer>();
	
	int cantRetailer;
	
	ArrayList<String> bestSellofTravel = new ArrayList<>();
	
	public void addRetailer(Retailer retailer) {
		colRetailer.add(retailer);
	}
	
	public float travelProfits() {
		float total = 0;
		for(Retailer retailer : colRetailer) {
			System.out.println(retailer.name + " con prioridad: " + retailer.listProducts.size());
			System.out.println("Se le venden productos, por un valor de " + retailer.calculateBill());
			total = total + retailer.calculateBill();
		}
		return total;
	}
	
	public int travelSales() {
		int total = 0;
		for(Retailer retailer : colRetailer) {
			total = total + retailer.listProducts.size();
		}
		return total;
	}
	
	public String bestSellingProductOfTravel() {
		Hashtable<String, Integer> hashProducts = new Hashtable<String, Integer>();
		
		for(Retailer retailer : colRetailer) {
			for(String product : retailer.listProducts) {
				int cant = 1;
				if(hashProducts.containsKey(product)) {
					cant = hashProducts.get(product);
					cant++;
				}
				hashProducts.put(product, cant);
			}
		}
		int higher = 0;
		String best = "";
		Enumeration<String> enumeration = hashProducts.keys();
		while(enumeration.hasMoreElements()) {
			String key = enumeration.nextElement();
			if(hashProducts.get(key) > higher) {
				higher = hashProducts.get(key);
				best = key;
			}
		}
		return best;
	}
	
	

}
