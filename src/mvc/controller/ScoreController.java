package mvc.controller;

import java.util.Scanner;

public class ScoreController {

	public static void main(String[] args) {
//		�л� �����͸� �Է� �޾Ƽ� StudentVO��ü�� ����(���� �л� ���� : �ݺ���)
//		������ StudentVO��ü�� ArrayList�� �߰�
		
		Scanner s1 = new Scanner(System.in); //���ڿ� �Է¿�
		Scanner s2 = new Scanner(System.in); //���� �Է¿�
		
		System.out.println("*** �л����� ������ �Է��� �ּ��� ***");
		while(true) {
			System.out.print("* �����Է� : ");
			String name = s1.nextLine();

			System.out.print("* �й��Է� : ");
			int StuID = s1.nextInt();
			
			System.out.println("* ��� �ۼ��Ͻðڽ��ϱ�?(y/n) ");
			String msg = s1.nextLine();
			if(msg.equals("n") || msg.equals("no"))
				break;
			
		}
		
	}

}
