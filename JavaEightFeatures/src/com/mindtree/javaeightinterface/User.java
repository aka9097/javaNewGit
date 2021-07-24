package com.mindtree.javaeightinterface;

public interface User {
	
	default void addSlary() {
		System.out.println("Salary Added via default method");
	}
	
	static void newAddSlary() {
		System.out.println("Salary Added via static method");
	}
	
	void updateSalary(String str);

}
