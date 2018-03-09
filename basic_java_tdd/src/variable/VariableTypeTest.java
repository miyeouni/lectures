package variable;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class VariableTypeTest {
 
	@Test
	public void booleanTypeTest() {
		boolean isMember = false;
		assertFalse(isMember);
		
		isMember = true;
		assertTrue(isMember);
		
		// boolean Ÿ���� ���ǹ����� ���� ���ȴ�. 
		if (isMember) {
			System.out.println("ȸ���Դϴ�."); // ���� isMember�� true�� �����̹Ƿ�
		}
		
		// ���� ������ ��
		boolean isManager = false;
		isMember = false;		
		assertFalse( isManager && isMember); // &&(AND)�� ���ʴ� true �̾�� true �̴�. 
		
		isManager = true;
		isMember = true;
		assertTrue( isManager && isMember);
		
		isManager = false;
		isMember = true;
		assertTrue( isManager || isMember); // ||(OR)�� ���ʸ� true���� true�̴�. 		
	}
	
	
	@Test
	public void charTypeTest() {
		char c = 'A'; // char Ÿ���� '' �� �����ش�.
		//assertTrue('A' == "A"); // Ÿ���� �ٸ��Ƿ� �񱳺Ұ�
		// c = 'CC';  //  ���� �Ѱ��� ǥ���� �� �ִ�. 
		char[] cStr = new char[5];
		cStr[0] = 'A';
		cStr[1] = 'B';
		cStr[2] = '1';
		cStr[3] = '^';
		cStr[4] = '(';
		
		assertTrue( cStr[4] == '(');
		
		for (int i = 0; i < cStr.length; i++) {
			System.out.print(cStr[i]);
		}
		System.out.println("");
		// java���� "" (ū����ǥ) �� ���� ���ڿ��� char Ÿ������ �迭ó���Ѱ��̴�.
		// �̸� ������ Ŭ������ java.lang.String Ŭ�����̸�
		// new �����ڸ� ������� �ʰ� �ν��Ͻ�ȭ(�޸𸮿� �ø��°�)�� �� �ִ�
		// ������ Ŭ�����̴�. 
		// "start coding" <== ���ڿ��� String Ŭ�����̴�. 
	}
	
	@Test
	public void byteTypeTest() {
		byte ip = 127;
		System.out.println(ip);		
		// ascii �ڵ� -> 127 �� 
		// utf-8 =>  �ѱ��� 3byte
		// ip => 4byte, 6byte      ip4v, ip6v
		byte[] ipv = new byte[4];   // <== byte �� �ڸ��� �迭�� ǥ���ϴ� ��찡 ����.
		
		// [byte] [byte] [byte] [byte]  => 192.168.0.190
		
		// 3,459 byte �� ������ ���� �� 1kbyte �� �о ó���ϰ� �ʹٸ�
		// byte[] readFile = new byte[1024]; �����ϰ� �̸� �ݺ������� ���� ����Ʈ
		// ��ŭ�� ó�����ش�. 
	}
	
	
	@Test
	public void numberTypeTest() {
		assertTrue( 1 == 1 ) ;
		assertTrue( 1 == 1.0 ) ;
		assertTrue( 1 == 1.0f ) ; // float���� 1.0f �� ���� f�� ���� �ο��൵ �ȴ�.
		
		int num1 = 1;
		assertTrue( num1 == 1) ;
		// num1 = 1.0f;  // type�� �ٸ��� ������ �Ҵ��� �� ����. 
		int num2 = 1;
		assertTrue(num1 == num2);
		
		float num3 = 1.0f;
		assertTrue(num1 == num3);
		
		// javascript������ 1 == "1" <==  ���� ������ �ν�
		String strNum1 = "1";
		//assertTrue(num1 == strNum1);
		// Ÿ���� �ٸ��� ����ü�� ���� �ʴ´�. 
		
		num1 = 2134567890; // int ���� ������ �� �ִ� �ִ� ũ�Ⱚ�� 21������..
		/*
		 * �ִ� �ڸ���
		 * short : 16 bit
		 * 
		 * int : 32 bit
		 * long : 64 bit
		 * 
		 * float : 32 bit
		 * double : 64 bit
		 */
		
	}

}










