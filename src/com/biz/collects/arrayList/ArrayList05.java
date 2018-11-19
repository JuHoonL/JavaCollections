package com.biz.collects.arrayList;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayList05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList();
		
		for(int i = 0 ; i<10 ; i++) {
			int rndNum = (int)(Math.random()*(100-1+1))+1;
			intList.add(rndNum);
		}
		System.out.println(intList);
		System.out.println(intList.get(3));
		
		Collections.sort(intList);			// Collections.sort(객체); : 해당 배열을 정렬
		System.out.println(intList);
	}

}
