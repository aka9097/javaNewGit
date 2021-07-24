package com.mindtree.javaeightlamdaexpression;

public class MyLamdaExpressionWithException {
	
	@FunctionalInterface
	interface Calculate{
		  int division(int numOne, int numTwo);
		}

	public static void main(String[] args) {
		Calculate calc=(numOne,numTwo)->{
			try {
			int num=numOne/numTwo;
			return num;
			}catch (Exception e) {
				System.out.println("Exception while calculating- " + e.getMessage());
				throw new RuntimeException();
			}
			};
         
			System.out.println("Division is:- "+calc.division(10, 0));
	}

}
