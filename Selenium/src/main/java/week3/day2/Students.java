package week3.day2;

public class Students {
	
	private int getStuInfo(int id) {
		return id;
	}
	private String getStuInfo(int id, String name) {
		return name;

	}
	private String getStuInfo(String mail, long phone) {
		return mail;
	}
	public static void main(String[] args) {
		Students overlod = new Students();
		int s = overlod.getStuInfo(201);
		System.out.println(s);
		String s1 = overlod.getStuInfo(201, "Sethu");
		System.out.println(s1);
		String s2 = overlod.getStuInfo("sethujoe@gmail.com",8675182102L);
		System.out.println(s2);
	}
}
