package variable;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class OperatorTest {
 
	@Test
	public void opertatorTest1 () {
		// ���������
		int a = 1;
		int b = 2;
		
		int c = a + b;
		assertThat(c, is(3));
		
		c = a - b;
		assertThat(c, is(-1));
		
		c = a * b;
		assertThat(c, is(2));
		
		c = a / b;  // 0.5�� ���;��ϳ� Ÿ���� int���̱�
		            // ������ �Ҽ����� ���� 0�� �ȴ�. 
		assertThat(c, is(0));
		
		c = a % b; 
		assertThat(c, is(1));
		
		a++;    // a = a + 1
		assertThat(a, is(2));
		
		a--;
		assertThat(a, is(1));  // ������ ++ ���ػ��¿��� �ٽ� --(1����)�� �����Ƿ�
		
		++b;
		assertThat(b, is(3));
		
		--b;
		assertThat(b, is(2));
		
		a += a;    // a = a + a
		assertThat(a, is(2));
		
		b += b;     // b = b + b
		assertThat(b, is(4));
		
		b *= 5;     // b = b * 5
		assertThat(b, is(20));
		
	}
	
	@Test
	public void operatorTest2() {
		// �񱳿�����
		int a = 5;
		int b = 7;
		
		assertFalse(a == b);
		assertTrue(a != b);
		
		assertFalse(a > b);
		assertTrue (a < b);
		
		assertFalse(a >= b);
		assertTrue(a <= b);
		
	}
	
	@Test
	public void operatorTest3() {
		// ��������
		boolean a = true;
		boolean b = false;
		
		assertFalse (a && b);   // ����. ������ ��� true���� true�� �ȴ�. 		
		assertTrue  (a || b);    // ����. ��� �����̶� true�� ������ true�̴� .
		
		assertTrue  (!b );  // not�� true�� false�� false�� true�� ����� �ش�. 
		assertFalse (!a );
		
		// ���� ������
		int c = 4;
		int d = 7;
		           //  ����  ? ���϶� ��: �����϶� ��
		int result = (c == d) ? c + d   : c * d; 
		assertThat(result, is(28));
		
		
	}

}










