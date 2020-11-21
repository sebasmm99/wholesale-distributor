package distributor;

import java.util.ArrayList;

public class Wholesale {
	
	ArrayList<Truck> listTrucks = new ArrayList<>();
	
	int cantTruck;
	
	public void addTruck(Truck truck) {
		listTrucks.add(truck);
	}
	
	public float totalProfits() {
		float total = 0;
		for(Truck truck : listTrucks) {
			total = total + truck.truckProfits();
		}
		return total;
	}
	
	public float totalSales() {
		float total = 0;
		for(Truck truck : listTrucks) {
			total = total + truck.truckSales();
		}
		return total;
	}
	
	public float averageEarnings() {
		float average = 0;
		average = totalProfits() / totalSales();
		return average;
	}

}
