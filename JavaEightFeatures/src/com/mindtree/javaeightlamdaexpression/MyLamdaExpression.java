package com.mindtree.javaeightlamdaexpression;

@FunctionalInterface
interface Calculator{
	public int add(int numOne,int numTwo);
}

@FunctionalInterface
interface Demo{
	public void printMessage();
	default void printName(String name) {
		System.out.println("My name is:- "+name);
	}
}

public class MyLamdaExpression {

	public static void main(String[] args) {
		Calculator calc=(numOne,numTwo)->numOne+numTwo;
		System.out.println("Addtion is:- "+calc.add(10, 20));
		
		System.out.println("Addtion is:- "+calc.add(10, 20));
		
		
		Demo demo=()->{
			System.out.println("Printing message");
		};
		demo.printMessage();
		
		demo.printName("Akash");
	}

}
