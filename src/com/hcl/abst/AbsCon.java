package com.hcl.abst;


abstract class Employ {
	int empno;
	String name;
	double salary;
	public Employ(int empno, String name, double salary) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", salary="
				+ salary + "]";
	}
}
class Laddu extends Employ {

	public Laddu(int empno, String name, double salary) {
		super(empno, name, salary);
		// TODO Auto-generated constructor stub
	}
}	
	class Mounika extends Employ {

		public Mounika(int empno, String name, double salary) {
			super(empno, name, salary);
			// TODO Auto-generated constructor stub
		}
		
	}
	
public class AbsCon {
   public static void main(String[] args) {
	Employ[] arrEmploy={new Laddu(1,"Laddu",6543656),new Mounika(2,"Mounika",6363667)};
	for (Employ employ : arrEmploy) {
		System.out.println(employ);
		
	}
	
}
}
