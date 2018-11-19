package com.biz.collects;

public class Arrays01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aa();
		
		//나 자신(Arrays01 class)를 내가 객체를 별도로 선언하는 방식
		//새로운 Arrays01을 a라는 객체로 복제한 것
		Arrays01 a = new Arrays01();
		a.bb();		// a라는 객체로 별도 선언해주었기 때문에 static main의 영향 안받음(static method가 아니어도 사용가능)
		
		//Arrays01에 포함된 mybook inner class를 사용할 때는 먼저 Arrays01을 별도로 객체로 생성(복제)하여 그 객체로
		//부터 new키워드를 호출 사용해야 inner class를 사용할 수 있다.
		MyBook mybook = a.new MyBook();
		mybook.strTitle = "자바야놀자";
		mybook.strAuth = "남궁성";
		mybook.strComp = "영진문화사";
		
		
	}
	public void bb() {
		System.out.println("나는 BB Method");
	}
	
	public static void aa() {
		System.out.println("나는 aa Method!!");
	}
	
	// inner class : 현재 class 만을 위한 특별히 작성되는 class
	// inner class 는 첫 시작 키워드를 일반적으로 private로 선언을 한다.
	private class MyBook {		
		String strTitle;
		String strAuth;
		String strComp;
	}
}
