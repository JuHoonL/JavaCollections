package com.biz.collects.arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intList = new ArrayList();
		
		for(int i =0; i<=45; i++) {
			intList.add(i+1);
		}
		
		Collections.shuffle(intList);			// Collections.shuffle(객체); : 배열을 섞음
		
		ArrayList<Integer> lottoNums = new ArrayList();
		for(int i = 0 ; i < 6 ; i++) {
			lottoNums.add(intList.get(i));
			//System.out.print(intList.get(i) + ", ");
		}
		System.out.println();
		Collections.sort(lottoNums);
		System.out.println(lottoNums);
	}

}
