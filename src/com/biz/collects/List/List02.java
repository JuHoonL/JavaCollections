package com.biz.collects.List;
import java.util.ArrayList;
import java.util.List;

public class List02 {
	public static void main(String[] args) {
		List<String> strList = new ArrayList();
//		List<String> strList = new LinkedList(); 로 쓰고 import만 설정해주면 바로 사용가능(List로 설정했기 때문
		addList(strList);
		System.out.println(strList);
		
		rmList(strList);
		System.out.println(strList);
		
	}
	//임의의 숫자 생성해서 List 100개 만들기
	public static void addList(List<String> sList) {
		for(int i =0 ; i<10 ; i++) {
			int intNum = (int)(Math.random() * (100+1));
			sList.add(String.valueOf(intNum));
		}
	}
	//List에서 80이 있으면 모두 삭제
	public static void rmList(List<String> sList) {
		int nSize = sList.size();
		for(int i = 0 ; i < nSize ; i ++) {
			sList.remove("80");
		}
	}
}
