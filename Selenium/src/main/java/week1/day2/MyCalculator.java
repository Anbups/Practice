package week1.day2;

public class MyCalculator {
	
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		
		int add = obj.add(10, 20, 30);
		System.out.println(add);
		
		int substract = obj.substract(50, 75);
		System.out.println(substract);
		
		double multiplay = obj.multiplay(12.125482, 42.51477);
		System.out.println(multiplay);
		
		float divide = obj.divide(1.22222f, 2.22222f);
		System.out.println(divide);
		
	}

}
