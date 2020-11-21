package distributor;

public class Program {

	public static void main(String[] args) {
		
		Wholesale alfa = new Wholesale();
		Truck truck = new Truck();
		Truck truck2 = new Truck();
		Travel travel = new Travel();
		Travel travel2 = new Travel();
		Retailer ret = new Retailer();
		Retailer ret2 = new Retailer();
		Retailer ret3 = new Retailer();
		Retailer ret4 = new Retailer();
		Retailer ret5 = new Retailer();
		
		
		alfa.addTruck(truck);
		truck.number = "02";
		truck.addTravel(travel);
		travel.number = "04";
		travel.addRetailer(ret);
		ret.name = "carlos";
		ret.listProducts.add(0,("arroz"));
		ret.listProducts.add(1,("panela"));
		travel.addRetailer(ret3);
		ret3.name = "pepe";
		ret3.listProducts.add(0,("panela"));
		travel.addRetailer(ret4);
		ret4.name = "kiko";
		ret4.listProducts.add(0,("panela"));
		travel.addRetailer(ret5);
		ret5.name = "suso";
		ret5.listProducts.add(0,("panela"));
		alfa.addTruck(truck2);
		truck2.number = "22";
		truck2.addTravel(travel2);
		travel2.number = "63";
		travel2.addRetailer(ret2);
		ret2.name = "juan";
		ret2.listProducts.add(0,("arroz"));
		ret2.listProducts.add(1,("arepa"));
		ret2.listProducts.add(2,("panela"));
		
		
		float totalCollection = alfa.totalProfits();
		System.out.println(totalCollection);
		
		String popular = travel.bestSellingProductOfTravel();
		System.out.println(popular);
		
		float average = alfa.averageEarnings();
		System.out.println(average);
		

	}

}
