package example.variable;

import java.util.Scanner;

public class Variable {
	public void initVariable() {
		// ���� 1byte
		boolean isTrue = true;
		boolean isFalse = false;

		// ���� 2byte
		char ch = 'a'; // single quotation, �ϳ��� ���ڸ� ���� ����

		// ���ڿ� : ������ (�ּҰ� ����)
		String str = "Hello Java"; // double quotation

		// ������
		// ����
		byte bnum = 1; // 1byte
		short snum = 2; // 2byte
		int inum = 4; // 4byte
		long lnum = 8L; // 8byte long �� ���ͷ� ���������� �빮�� L
		// �Ǽ�
		float fnum = 4.0f; // 4byte ���ͷ� ������ �ҹ��� f
		double dnum = 8.0; // 8byte

		// ������ ����� �� ���
		System.out.println("isTrue �� �� : " + isTrue);
		System.out.println("isFalse�� �� : " + isFalse);
		
		System.out.println("ch�� �� : " + ch);
		System.out.println("str�� �� : " + str);
		
		System.out.println("bnum�� �� " + bnum);
		System.out.println("snum�� �� " + snum);
		System.out.println("inum�� �� " + inum);
		System.out.println("lnum�� �� " + lnum);
		
		System.out.println("fnum�� �� " + fnum);
		System.out.println("dnum�� �� " + dnum);

	}
	public void changeValue() {
		String name;
		char gender;
		int age;
		double height;
		
		name = "ȫ�浿";
		gender = 'M';
		age = 30;
		height = 180.2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�̸��� �Է� �ϼ��� : ");
		name = sc.nextLine();
		System.out.println("������ �Է� �ϼ��� : ");
		gender = sc.next().charAt(0); //���ڸ� �о���� �޼ҵ�� �������� �ʱ� ������ ���
		System.out.println("���̸� �Է��ϼ��� : ");
		age = sc.nextInt();
		System.out.println("Ű�� �Է� �ϼ���");
		height = sc.nextDouble();
		
		System.out.println(name + "���� ��������");
		System.out.println("gender : " + gender);
		System.out.println("age : " + age);
		System.out.println("height : " + height);
				
				
	}
}
