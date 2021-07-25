package com.mindtree.javaeightinterface;




public class App implements User {
	
	@Override
	public void updateSalary(String str) {
	
	}

	public static void main(String[] args) {


		int numsix=10;
		int numseven=20;
		System.out.println(numsix+numseven);


		App app=new App();
		//java existing method
		app.updateSalary("My salary is 8546654");
		//Calling static method
		User.newAddSlary();
		//calling default method
		app.addSlary();

	}

	

}
