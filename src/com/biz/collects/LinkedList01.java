package com.biz.collects;
import java.util.Collections;
import java.util.LinkedList;

public class LinkedList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> strList = new LinkedList();
		/*
			ArrayList와 같이 다수의 데이터를 
			저장, 추가, 삭제, 리스트 보기등을 수행할 수 있는 Collections(배열class)이다.
			ArrayList에 사용되는 기본 method들 add(), get(), set(), remove(), clear(), size() 등 모두 사용 가능
		 */
		
		strList.add("홍길동");
		strList.add("이몽룡");
		strList.add("성춘향");
		strList.add("장보고");
		strList.add("임꺽정");
		
		Collections.sort(strList);
		System.out.println(strList);
	}

}
