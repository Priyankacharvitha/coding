package com.hcl.abst;


abstract class Student {
	int sno;
	String name;
	double cgp;
	public Student(int sno, String name, double cgp) {
		super();
		this.sno = sno;
		this.name = name;
		this.cgp = cgp;
	}
	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + ", cgp=" + cgp + "]";
	}
}
class Sai extends Student {

	public Sai(int sno, String name, double cgp) {
		super(sno, name, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
class Kiran extends Student {

	public Kiran(int sno, String name, double cgp) {
		super(sno, name, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
class Sunny extends Student {

	public Sunny(int sno, String name, double cgp) {
		super(sno, name, cgp);
		// TODO Auto-generated constructor stub
	}
	
}
public class AbsStudent {
	public static void main(String[] args) {
	Student[] arrStudent={new Sai(1,"Sai",98.8),new Kiran(2,"Kiran",74.9),new Sunny(3,"Sunny",76.9)};
	for (Student student : arrStudent) {
		System.out.println(student);
		
 }
}
}
