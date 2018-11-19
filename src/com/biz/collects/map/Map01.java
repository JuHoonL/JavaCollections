package com.biz.collects.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> strAddr = new HashMap();
		
		strAddr.put("홍길동", "001-3011-0162");		// (데이터를 찾기위한 key, 데이터값)
		strAddr.put("성춘향", "001-6011-0162");
		strAddr.put("이몽룡", "001-7011-0162");
		strAddr.put("임꺽정", "001-5011-0162");
		strAddr.put("이종환", "010-8011-0162");
		
		String sTel = strAddr.get("임꺽정");
		System.out.println(sTel);
		System.out.println("=================================================================");
		
		Set<String> strKey = strAddr.keySet();
		for(String s : strKey) {
			System.out.println(strAddr.get(s));
		}
		System.out.println("=================================================================");
		
		Map<Integer,String> intNum = new HashMap();
		intNum.put(90, "홍길동");
		intNum.put(87, "이몽룡");
		intNum.put(70, "성춘향");
		intNum.put(60, "임꺽정");
		intNum.put(50, "이종환");
		
		String strName = intNum.get(87);
		System.out.println(strName);
		System.out.println("=================================================================");
		
		Set<Integer> setInt = intNum.keySet();
		for(int i : setInt) {
			String s = intNum.get(i);
			System.out.println(s);
		}
		
	}

}
