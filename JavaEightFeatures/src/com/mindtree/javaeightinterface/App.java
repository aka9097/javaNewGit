package com.mindtree.javaeightinterface;




public class App implements User {
	
	@Override
	public void updateSalary(String str) {
		System.out.println(str);
	}

	public static void main(String[] args) {
		App app=new App();
		//java existing method
		app.updateSalary("My salary is 8546654");
		//Calling static method
		User.newAddSlary();
		//calling default method
		app.addSlary();

	}

	

}
