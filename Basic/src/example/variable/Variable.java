package example.variable;

import java.util.Scanner;

public class Variable {
	public void initVariable() {
		// 논리형 1byte
		boolean isTrue = true;
		boolean isFalse = false;

		// 문자 2byte
		char ch = 'a'; // single quotation, 하나의 문자만 대입 가능

		// 문자열 : 참조형 (주소값 저장)
		String str = "Hello Java"; // double quotation

		// 숫자형
		// 정수
		byte bnum = 1; // 1byte
		short snum = 2; // 2byte
		int inum = 4; // 4byte
		long lnum = 8L; // 8byte long 형 리터럴 마지막에는 대문자 L
		// 실수
		float fnum = 4.0f; // 4byte 리터럴 마지막 소문자 f
		double dnum = 8.0; // 8byte

		// 변수에 저장된 값 출력
		System.out.println("isTrue 의 값 : " + isTrue);
		System.out.println("isFalse의 값 : " + isFalse);
		
		System.out.println("ch의 값 : " + ch);
		System.out.println("str의 값 : " + str);
		
		System.out.println("bnum의 값 " + bnum);
		System.out.println("snum의 값 " + snum);
		System.out.println("inum의 값 " + inum);
		System.out.println("lnum의 값 " + lnum);
		
		System.out.println("fnum의 값 " + fnum);
		System.out.println("dnum의 값 " + dnum);

	}
	public void changeValue() {
		String name;
		char gender;
		int age;
		double height;
		
		name = "홍길동";
		gender = 'M';
		age = 30;
		height = 180.2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력 하세요 : ");
		name = sc.nextLine();
		System.out.println("성별을 입력 하세요 : ");
		gender = sc.next().charAt(0); //문자를 읽어오는 메소드는 제공하지 않기 때문에 사용
		System.out.println("나이를 입력하세요 : ");
		age = sc.nextInt();
		System.out.println("키를 입력 하세요");
		height = sc.nextDouble();
		
		System.out.println(name + "님의 개인정보");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
				
				
	}
}
