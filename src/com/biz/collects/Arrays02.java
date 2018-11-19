package com.biz.collects;

public class Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mybook myBook = new Arrays02.Mybook();		// static 으로 선언하면 따로 자기자신을 arrays02로 지정안해줘도 됌
		
		Arrays02 arrays02 = new Arrays02();			// static 으로 선언하지 않은 class의 경우
		MyAddr myAddr = arrays02.new MyAddr();
		
		myAddr.strName = "홍길동";
		myAddr.strAddr = "서울시";
		
		
	}

	private class MyAddr{
		String strName;
		String strAddr;
	}
	
	private static class Mybook{
		String strTitle;
		String strAuth;
	}
}
