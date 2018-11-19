package com.biz.collects.arrayList;

import java.util.ArrayList;

import com.biz.collects.vo.BookVO;

public class ArrayList01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] ai = new int[3];
//		ai[0] = Integer.valueOf("대한민국");		// 숫자가 아니기때문에 오류 발생(Exception) 오류발생
		
		//Collections 중에 가장 많이 사용하는 ArrayList라는 클래스 사용법 연습
		
		ArrayList bookList = new ArrayList();
		ArrayList<String> strList = new ArrayList();		// String[] strList; 와 같음
		
		ArrayList<Integer> intList = new ArrayList();		// 정수형을 쓰고자하면 <>에 int가 아니라 Integer를 넣어야함
		ArrayList<Long> longList = new ArrayList();
		ArrayList<Float> floatList = new ArrayList();
		ArrayList<Double> doList = new ArrayList();
		ArrayList<Character> charList = new ArrayList();
		ArrayList<Boolean> boolList = new ArrayList();
		ArrayList<BookVO> bookVOList = new ArrayList();
		
		
		
	}

}
