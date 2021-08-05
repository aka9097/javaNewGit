package com.mindtree.javaeightinterface;




public class App implements User {
	
	@Override
	public void updateSalary(String str) {
	
	}

	public static void main(String[] args) {


		int numOne=10;
		int numTwo=20;
		System.out.println(numOne+numTwo);


		App app=new App();
		//java existing method
		app.updateSalary("My salary is 8546654");
		//Calling static method
		User.newAddSlary();
		//calling default method
		app.addSlary();

	}

	

}
