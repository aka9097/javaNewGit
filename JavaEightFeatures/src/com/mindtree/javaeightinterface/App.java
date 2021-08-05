package com.mindtree.javaeightinterface;




public class App implements User {
	
	@Override
	public void updateSalary(String str) {
	
	}

	public static void main(String[] args) {


		int numThree=10;
		int numFour=20;
		System.out.println(numThree+numFour);


		App app=new App();
		//java existing method
		app.updateSalary("My salary is 8546654");
		//Calling static method
		User.newAddSlary();
		//calling default method
		app.addSlary();

	}

	

}
