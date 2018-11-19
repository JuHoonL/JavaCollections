package com.biz.collects.arrayList;

import java.util.ArrayList;

/*
 	ArrayList는 다수의 객체를 다루기 위한 Java의 collection이며, 최초 생성 될 때는 size()가 0이며
 	필요에 따라서 값을 추가, 삭제하며 크기를 자유롭게 설정하여 쓸수 있다.
 
 		arrayList.add(값) : 배열 끝에 값을 추가할 때
 		arrayList.add(n, 값) : n번째 에 값을 끼워넣을 때
 		arrayList.get(n) : n번 위치의 값을 읽을 때
 		arrayList.remove(n) : n번째 위치의 값을 삭제
 		arrayList.remove(값) : 숫자형은 오류, 문자열의 경우 해당 값이 처음으로 나오는 항목 삭제
 		arrayList.clear() : 모든 값을 삭제하고 size를 0으로 reset
 		arrayList.size() : 리스트의 개수를 확인
 */

public class ArrayList03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> strList = new ArrayList();
		
		strList.add("사과");
		strList.add("배");
		strList.add("토마토");
		strList.add("망고");
		strList.add("단감");
		strList.add("포도");
		
		int nSize = strList.size();
		for(int i = 0 ; i<nSize ; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("======================================================");
		
		strList.add(3, "바나나");
		for(int i = 0 ; i<nSize ; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("======================================================");
		
		strList.remove(2);
		for(int i = 0 ; i<nSize ; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("======================================================");
		
		strList.add("대봉");
		strList.add(1, "대봉");
		strList.add(3, "대봉");
		strList.add(5, "대봉");
		for(int i = 0 ; i<nSize ; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("======================================================");
		
		strList.remove("대봉");			// 대봉이라는 글자를 처음 만나서 그 부분만 삭제
		for(int i = 0 ; i<nSize ; i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("======================================================");
		
/*		nSize = strList.size();
		for(int i = 0 ; i<nSize ; i++) {
			if(strList.get(i).equals("대봉")) {
				strList.remove(i);
			}
			System.out.println(strList.get(i) + "오류?");		// 출력시 오류 발생
		}	*/
		
		nSize = strList.size();
		for(int i = 0 ; i<nSize ; i++) {
			strList.remove("대봉");
		}
		nSize = strList.size();
		for(int i = 0 ; i<nSize ; i++) {
		System.out.println(strList.get(i));
		}
		System.out.println("======================================================");
		
		
		
	}

}
