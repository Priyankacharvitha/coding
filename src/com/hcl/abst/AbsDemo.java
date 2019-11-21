package com.hcl.abst;

abstract class HclTraining {
	abstract void loginTime();
	abstract void employeeName();
	abstract void logoutTime();
	
}

class Haritha extends HclTraining {

	@Override
	void loginTime() {
		System.out.println("came at 9:30 AM");
		
	}

	@Override
	void employeeName() {
	System.out.println("Hi i am Haritha");
		
	}

	@Override
	void logoutTime() {
      System.out.println("leave at 7:30PM");
		
	}
	
}
class Vidya extends HclTraining {


@Override
void loginTime() {
	System.out.println("came at 9:30 AM");
}
	
	


@Override
void employeeName() {
	System.out.println("Hi i am Vidya");
	
	
}

@Override
void logoutTime() {
	 System.out.println("leave at 7:30PM");
		
}
	
}
public class AbsDemo {
	public static void main(String[] args) {
		HclTraining[] arrTrainings={new Haritha(),new Vidya()};
		for (HclTraining hclTraining : arrTrainings) {
			hclTraining.employeeName();
			hclTraining.loginTime();
			hclTraining.logoutTime();
			
			
			
		}
	}
}
