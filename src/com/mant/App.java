package com.mant;

import com.mant.pojo.Person;

public class App {
	public static void main(String[] args) {
		System.out.println("this can be a problem");
		System.out.println("conflict");
		Person person1 = new Person();
		System.out.println(person1.getCI());
		System.out.println("Initializing project");
		
		System.out.println("Adding another change from GitHub");
		System.out.println(person1.getLocalization().toString());
	}
}
