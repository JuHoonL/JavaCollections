package com.biz.collects;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterface01 {

	public static void main(String[] args) {

		// List는 ArrayList, LinkedList의 상위개념
		List<String> strList = new ArrayList();
/*		
		ArrayList<Integer> intList = new ArrayList();
		addList(intList);
		System.out.println(intList);
*/		
/*		LinkedList<Integer> intList = new LinkedList();
		addList(intList);
*/		
		
		//List<Integer> intList = new ArrayList();	//List는 둘다 가능
		List<Integer> intList = new LinkedList();	//List는 둘다 가능
		
		
	}

	public static void addList(List<Integer> intList) {
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
	}
/*	public static void addList(LinkedList<Integer> intList) {
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
		intList.add(10);
	}
*/		
	
}
