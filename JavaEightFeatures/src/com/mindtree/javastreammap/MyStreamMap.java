package com.mindtree.javastreammap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamMap {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<Integer>();
		list.add(10);
		list.add(23);
		list.add(5);
		list.add(25);
		list.add(50);
		
		List<Integer> resultList=list.stream().map(data->data*2).collect(Collectors.toList());
		
		System.out.println(resultList);

	}

}
