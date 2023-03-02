package learnTopics;

public class AnotherVehicle extends Vehicle{
	@Override
	void ownerName() {
System.out.println("sethu");		
	}

	@Override
	void insureValid() {
System.out.println("till may 2024");		
	}
	public static void main(String[] args) {
		
		AnotherVehicle obj = new AnotherVehicle();
	
		obj.ownerName();
		obj.insureValid();
		obj.VehicleNum();
		
	}

}
