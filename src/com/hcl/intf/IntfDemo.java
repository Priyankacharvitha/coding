package com.hcl.intf;


interface ITraining {
	void name();
	void email();
	
}

class Niharika implements ITraining {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Niharika");
		
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("Niharika@gmail.com");
	}
	
}
class Deepak implements ITraining {

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Deepak");
		
	}

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("deepak@gmail.com");
	}
	
}
public class IntfDemo {
public static void main(String[] args) {
	ITraining[] arrtraining={new Niharika(),new Deepak()};
	for (ITraining iTraining : arrtraining) {
		iTraining.name();
		iTraining.email();
	}
}
}
