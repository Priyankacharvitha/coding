package com.hcl.ex;

public class ThrEx {

	public void Check(int n) {
	boolean flag=true;
	if(n<0) {
		flag=false;
		throw new ArithmeticException("negartive not allowed");
	}
	if(n==0) {
		flag=false;
		throw new NumberFormatException("zero is valid");
	}
	if(flag==true) {
		System.out.println("n value" +n);
	}
	}
	public static void main(String[] args) {
		int n=-2;
		try {
			new ThrEx().Check(n);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch (NumberFormatException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}

}
