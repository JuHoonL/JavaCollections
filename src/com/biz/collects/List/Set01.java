package com.biz.collects.List;

import java.util.HashSet;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Set은 List와 비슷하지만 중복데이터를 허용 안함
		
		Set<String> strSet6 = new HashSet<String>();		// Java 6
		Set<String> strSet7 = new HashSet<>();				// Java 7
		Set<String> strSet8 = new HashSet<>();				// Java 8
		
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		strSet8.add("대한민국");
		
		System.out.println(strSet8);
	}

}
