package com.mindtree.javastreammap;

import java.util.ArrayList;
import java.util.List;

public class MyStreamMapReduce {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(-5);
		list.add(24);
		list.add(18);
		list.add(-25);
		list.add(35);
		
        int sum=list.stream().reduce(0,(first,second)->first+second);
        
        System.out.println(sum);

	}

}
