package com.hcl.ex;

public class DivEx {
	public static void main(String[] args) {
		int a,b,c;
		try {
			a=Integer.parseInt(args[0]);
			b=Integer.parseInt(args[1]);
			c=a/b;
			System.out.println("Division id" +c);
		}catch(NumberFormatException e) {
			System.out.println("Strings cannot be converted as a integers");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("arguments are not passed");
		}
		catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Division is immpossible");
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Program by hcl");
		}
		
	}

}
