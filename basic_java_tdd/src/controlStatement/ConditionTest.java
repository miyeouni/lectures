package controlStatement;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;
// ���ǹ�
public class ConditionTest {
 
	@Test
	public void ifTest() {
		// if ( ���� ) {
		//		 ������ ���϶� ����Ǵ� �ڵ�
		// } else {
		//  	������ �������� ������ ����Ǵ� �ڵ�
		// }
		
		int a = 1;
		int b = 2;
		
		if (a == b) {
			System.out.println("a�� b�� �����ϴ�.");
		} else {
			System.out.println("a�� b�� ���� �ʽ��ϴ�.");
		}
		
		// if ~ else if
		/*
		 *    90�̻� A
		 *    80�̻� B
		 *    70�̻� C
		 *    ������ D
		 */
		int score = 97;
		if (score >= 90) {
			System.out.println("A ����");
		} else if (score >= 80) {
			System.out.println("B ����");
		} else if (score >= 70) {
			System.out.println("C ����");
		} else  {
			System.out.println("D ����");
		}
		////////////////////////////////
		System.out.println("----------------");
		if (score >= 90) {
			System.out.println("A ����");
		}  
		if (score >= 80) {
			System.out.println("B ����");
		} 
		if (score >= 70) {
			System.out.println("C ����");
		} else  {
			System.out.println("D ����");
		}		
	}
	
	@Test
	public void switchTest() {
		/*
		 	switch ( �˻��� �� ) {
			 	case �˰��� ���� ���̽�1 :
			 		����� �ڵ�;
			 		break;
			 	case �˰��� ���� ���̽�2 :
			 		����� �ڵ�;
			 		break;
			 	case �˰��� ���� ���̽�3 :
			 		����� �ڵ�;
			 		break;
			 	default :
			 		����� �ڵ�;
			 		break;
		 	} 
		 */
		/*
		 	1: ��
		 	2: ȭ
		 	3: ��
		 	4: ��
		 	5: ��
		 	6: ��
		 	7: ��		 
		 */
		System.out.println("---switch-----------------");
		int weekNum = 3;
		switch(weekNum) {
		case 1: 
			System.out.println("��");
			break;                   
			//  break �� �־����� ������ case �� ������� ���� �ڵ���� ���� ������ �ȴ�. 
		case 2: 
			System.out.println("ȭ");
			break;
		case 3: 
			System.out.println("��");
			break;
		case 4: 
			System.out.println("��");
			break;
		case 5: 
			System.out.println("��");
			break;
		case 6: 
			System.out.println("��");
			break;
		case 7: 
			System.out.println("��");
			break;
		}
		
		
	}
}










