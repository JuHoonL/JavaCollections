package com.biz.collects.arrayList;

import java.util.ArrayList;

public class ArrayList02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList();
		
		//객체.add(해당값); 는 해당값을 배열의 마지막부터 추가
		intList.add(30);		// 0
		intList.add(40);		// 1
		intList.add(50);		// 2
		intList.add(60);		// 3
		intList.add(70);		// 4
		
		//intList의 3번째 데이터 60을 보고 싶다.
		System.out.println(intList.get(3));
		
		//intList의 2번째 데이터를 100으로 바꾸고싶다.
		intList.set(2, 100);
		System.out.println(intList.get(2));
		
		//intList의 개수가 몇개냐
		int nSize = intList.size();		// 배열의 개수 = 객채.size();
		System.out.println("intList 개수 : " + nSize);
		
		/*
		for(int i =0; i < intList.size() ; i++) {
			System.out.println(intList.get(i));
		}
		*/
		
		for(int i =0; i < nSize ; i++) {
			System.out.println(intList.get(i));
		}
		System.out.println("======================================================");
		
		intList.remove(3);		// n번째 값을 뺴고싶을 때 : 객체.remover(n);
		nSize = intList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(i + " : " + intList.get(i));
		}
		System.out.println("======================================================");
		
		intList.add(2, 900);		// n번째 값을 넣고 싶을 때 : 객체.add(n, 원하는값);
		nSize = intList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(i + " : " + intList.get(i));
		}
		System.out.println("======================================================");
		
		intList.add(2, 100);
		intList.add(4, 100);
		intList.add(100);
		nSize = intList.size();
		for(int i = 0 ; i < nSize; i++) {
			System.out.println(i + " : " + intList.get(i));
		}
		System.out.println("======================================================");
		
	}

}
