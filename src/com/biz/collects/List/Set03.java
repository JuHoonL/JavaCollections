package com.biz.collects.List;

import java.util.Set;
import java.util.TreeSet;

public class Set03 {

	public static void main(String[] args) {
		// HashSet과 TreeSet의 차이점은 저장된 데이터의 자동정렬기능이다.
		Set<Integer> intSet = new TreeSet();
		
		for(int i = 0 ; i < 10 ; i++) {
			int intNum = (int)(Math.random() * (100+1));
			intSet.add(intNum);
		}
		System.out.println(intSet);
	}
}
