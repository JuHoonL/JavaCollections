package com.biz.collects.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList();
		//List class는 선언전용 클래스로 객체를 생성하는 용도로는 사용 못함
		//List<String> strList1 = new List(); (X)
		List03.addList(strList);
		
		//while을 사용한 반복문을 구현할 때 List를 Iterator로 변환하여 사용한다.
		Iterator<String> itr = strList.iterator();
		int intSum = 0;
		while(true) {
			if(itr.hasNext()) {		// 객체.hasNext : 꺼내올 데이터가 있는지 알아볼 때 사용
				String s = itr.next();
				intSum += Integer.valueOf(s);
			} else {
				break;
			}
		}
		System.out.println("===========================================");
		
		intSum = 0;
		while(true) {
			if( !itr.hasNext()) break;
			String s = itr.next();
			intSum += Integer.valueOf(s);
		}
		System.out.println("===========================================");	
	
		intSum = 0;
		while(itr.hasNext()) {
			String s = itr.next();
			intSum += Integer.valueOf(s);
		}
		// 3가지 다 같은 코드
	}

}
