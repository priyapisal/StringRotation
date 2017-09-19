package com.scp.stringrotation;

public class StringRotation {
	public static void main(String[] args) {
		String s1="javahibernate";
		String s2="hibernatejava";
		if(s1.length() !=s2.length()){
			System.out.println("s1 and s2 are same length");
		}else
		{
			String s3=s1+s1;
			if(s3.contains(s2)){
			System.out.println("s2 is roteted version");
		}else{
			System.out.println("no");
		}
	}
		
	}
}

	 