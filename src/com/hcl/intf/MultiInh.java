package com.hcl.intf;


interface Ione {
	void name();
	
}
interface Itwo {
	void email();
}
class Demo implements Ione,Itwo {

	@Override
	public void email() {
		// TODO Auto-generated method stub
		System.out.println("vidyad@gmail.com");
		
	}

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Vidya");
	}
	
}
public class MultiInh {

	public static void main(String[] args) {
		Demo obj=new Demo();
		obj.name();
		obj.email();
		
		
	}
}
