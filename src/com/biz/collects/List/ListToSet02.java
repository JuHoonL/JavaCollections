package com.biz.collects.List;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class ListToSet02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strList = new ArrayList();
		List03.addList(strList);
		
		strList = new ArrayList(new HashSet(strList));		// 중복되지않는 데이터만을 무작위로 추출(변환)
		strList = new ArrayList(new TreeSet(strList));		// 중복되지않는 데이터만을 자동정렬(오름차순)해서 추출(변환)
	}

}
