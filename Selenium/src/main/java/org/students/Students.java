package org.students;

import org.Department.Department;

public class Students extends Department {

	private String studentName() {
		return "Nijanthan";
	}
	private String studentDepartment() {
		return "maths";
	}
	private int studentID() {
		return 2025;
}
	public static void main(String[] args) {
		Students stuobj = new Students();
		stuobj.collegeName();
		stuobj.collegeCode();
		stuobj.collegeRank();
		String departMantMathod = stuobj.departMantMathod();
		System.out.println(departMantMathod);
		String sname = stuobj.studentName();
		System.out.println(sname);
		String stDepartment = stuobj.studentDepartment();
		System.out.println(stDepartment);
		int id = stuobj.studentID();
		System.out.println(id);
	}
}
