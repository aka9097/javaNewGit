package com.mindtree.javastreamfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamFilter {

	public static void main(String[] args) {
		List<String> playerList=new ArrayList<String>();
		playerList.add("Sachin");
		playerList.add("dhoni");
		playerList.add("dravid");
		playerList.add("kohli");
		playerList.add("yuvraj");
		
		List<String> resultList=playerList.stream().filter(name->name.length()>5).collect(Collectors.toList());
		
		System.out.println(resultList);
		
		long count=playerList.stream().filter(name->name.length()>5).count();
		
		System.out.println(count);

	}

}
