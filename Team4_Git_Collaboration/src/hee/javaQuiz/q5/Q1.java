package javaQuiz.q5;

import java.util.Scanner;

/*
�޸��� �ۼ� : Ex1.java
Scanner ��� (ã�� �� �Է�)import java.util.Scanner;Scanner sc = new Scanner(System.in);//����ex) int val = sc.nextInt(); //���� �Է� �ޱ�
�迭 �ʱ�ȭ
   {10, 21, 32, 43, 54, 65, 76, 87, 98, 109}
�迭�� ũ�� : �迭�̸�.length
Boolean ���� ����Ͽ� Ž���� ����
    ������ ���°�� �ִ��� ���,
    Ž���� ���� ������
    ��Ž���� ���� �迭�� �����ϴ�.�� ��� 
*/
public class Q1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] iArr = { 10, 21, 32, 43, 54, 65, 76, 87, 98, 109 };

		System.out.print("Ž���� ���� �Է� : ");
		int answer = Integer.parseInt(sc.nextLine());
		int arri = 0;
		for (int i = 0; i < iArr.length; i++) {
			if (iArr[i] == answer) {
				arri = i + 1;
			}
		}
		if(arri==0) {
			System.out.println("Ž���� ���� �迭�� �����ϴ�.");
		}else {
			System.out.println("Ž���� ����" + arri + "��°�� �ֽ��ϴ�."); 
		}

	}
}
