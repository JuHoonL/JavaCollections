package com.biz.collects.List;

import java.util.LinkedList;
import java.util.List;

public class List04 {
	public static void main(String[] args) {
		List<String> strList = new LinkedList();
		List03.addList(strList);
		
		int intSum = 0;
		for(String s : strList) {		
			/*
			 for(int i = 0 ; i < strList.length ; i ++){
			 	String s = strList.get(s);
			 	} 와 같음
			 
			 for~each 라고 하는 향상, 확장된 for구문으로 List를 0번째 위치부터 끝까지 반복적으로 순회하면서
			 연산을 처리할 경우 사용할 수 있는 for구문
			 
			 strList의 개수만큼 자동으로 반복 개수가 설정되며 매 회전 마다 strList로 부터 요소를 1개씩 읽어서 
			 String s에 복사한다.
			 
			 for 구문 내에서 s 변수를 사용해서 여러가지 연산을 수행 할 수 있다.
			*/
			intSum += Integer.valueOf(s);
		}
		System.out.println(strList);
		System.out.println("합계 : " + intSum);
	}
}
