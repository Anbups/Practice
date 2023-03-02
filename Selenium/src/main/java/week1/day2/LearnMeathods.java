package week1.day2;

public class LearnMeathods {
	
	public void printCarName() {
	System.out.println("FORD MUSTANG GT");
	} 	  	
	public int getCarRegNumber() {
	int carNum = 9333;
	return carNum;
	}
	public String getCarFuelType() {
		String energy = "Batary";
		return energy;
	}
	private int multiplyTwoNumbers(int a, int b) {
		
		return a * b;
	}
	public static void main(String[] args) {
		LearnMeathods obj = new LearnMeathods();
		obj.printCarName();
		
		int carNum = obj.getCarRegNumber();
		System.out.println(carNum);
		String energy = obj.getCarFuelType();
		System.out.println(energy);
		int multipl = obj.multiplyTwoNumbers(32, 21);
		System.out.println(multipl);
	}

}
