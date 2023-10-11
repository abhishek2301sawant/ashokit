package com.java;



import com.ashokit.PassService;

public class Demo {
	
	public static void main(String[] args) {
		
	String encodedtxt=	PassService.encode("india");
	System.out.println(encodedtxt);
	String decodetxt=PassService.decode(encodedtxt);
	System.out.println(decodetxt);
	}

}
