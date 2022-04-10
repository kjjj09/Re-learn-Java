package example.test;

import java.util.Scanner;

public class Variable_Test {

	public void Variable_No1() {
		/*
		 * 키보드로 원의 반지름 값을 정수형으로 입력 받고 원의 둘레와 면적을 계산하여 소수점 이하 1자리까지만 출력하는 코드를 작성하시오. 원의
		 * 반지름 입력: 5 반지름이 5인 원의 둘레 : 31.4 반지름이 5인 원의 면적 : 78.5
		 * 원의 둘레를 구하는 공식 : 2 * (반지름) * 3.14
		 * 원의 면적을 구하는 공식 : (반지름) * (반지름) * 3.14
		 */
		Scanner sc = new Scanner(System.in);
		int ban = 0;
		double dul = 0.0;
		double myun = 0.0;
		
		System.out.println("원의 반지름 값을 정수형으로 입력하세요 : ");
		try {
			ban = sc.nextInt();
		} catch (Exception e) {
			System.out.println("정수형만 입력이 가능합니다.");
		}
		dul = 2 * ban * 3.14;
		myun = ban * ban * 3.14;
		System.out.print("반지름이 " + ban + "인 원의 둘레는 : " + String.format("%.2f",dul) + "\n면적은 : " + myun);
	}

}
