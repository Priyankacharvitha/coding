package com.hcl.ex;

public class ArrEx {
	
	public static void main(String[] args) {
		int[] arr=new int[]{12,7};
		try {
			arr[10]=6;
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array size is small");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
