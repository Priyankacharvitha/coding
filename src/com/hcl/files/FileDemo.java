package com.hcl.files;

import java.io.File;
public class FileDemo {

	public static void main(String[] args) {
		File f1=new File("C:/java_hcl/Day7/Demo/src/com/hcl/ex/Custom.java");
		System.out.println("FileName" +f1.getName());
		System.out.println("Parent" +f1.getParent());
		System.out.println("path" +f1.getPath());
		
		
	}
}
