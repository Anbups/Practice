package week1.day1;

public class FibonaccicSeries {
	public static void main(String[] args) {
		
int f = 0, s = 1,t;
int n = 8;
System.out.println(f);

for(int i = 0; i<n; i++) {
	 t = f+s;
	
	System.out.println(t);
	f=s;
	s=t;	
}
	}

}
