package distributor;

import java.util.ArrayList;


public class Truck {
	
	
	
	String number;
	
	ArrayList<Travel> listTravels = new ArrayList<>();
	
	int cantTravel = listTravels.size();
	
	ArrayList<String> bestSellofTravel = new ArrayList<>();
	
	public void addTravel(Travel travel) {
		listTravels.add(travel);
	}
	
	public float truckProfits() {
		float total = 0;
		for(Travel travel : listTravels) {
			total = total + travel.travelProfits();
		}
		return total;
	}
	
	public int truckSales() {
		int total = 0;
		for(Travel travel : listTravels) {
			total = total + travel.travelSales();
		}
		return total;
	}	

}
