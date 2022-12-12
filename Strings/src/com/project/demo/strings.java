package com.project.demo;

public class strings {
	public static void main(String[]args) {
	String name="PaVan";
	String name2="kumar";
	System.out.println(name==name2);
	//System.out.println(name.equals(name2));
	System.out.println(name.length());
	System.out.println(name.toUpperCase());
	System.out.println(name.toLowerCase());
	System.out.println(name.endsWith("n"));
	System.out.println(name.startsWith("p"));
	System.out.println(name.charAt(2));
	System.out.println(name.substring(2));
	System.out.println(name.substring(1));
	System.out.println(name.substring(1, 2));
	System.out.println(name.hashCode());
	System.out.println(name.startsWith("p"));
	System.out.println(name.endsWith("n"));
	System.out.println(name+" ".concat(name2));
	System.out.println(name.contains("v"));
	System.out.println(name.isBlank());
	System.out.println(name.isEmpty());
	
	
	
	}
}
