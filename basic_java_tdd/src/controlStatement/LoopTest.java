package controlStatement;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class LoopTest {

	@Test
	public void loopTest1() {
		// for��
		// for (�ʱⰪ; �ݺ��� ���� ����; ������) {
		// �ݺ��� ������ �ڵ�
		// }

		// 10�� �ݺ��ϰ� �ȴ�.
		for (int i = 0; i < 10; i++) {
			System.out.println("start coding");
		}
		System.out.println("====================");

		int[] arrNum = { 2, 32, 56, 30, 90, 56 };
		// arrNum �迭�� ���� ��ŭ �ݺ��ϰ� �ش� �ε����� ���� ����Ѵ�.
		for (int i = 0; i < arrNum.length; i++) {
			System.out.println(arrNum[i]);
		}
	}

	@Test
	public void loopTest2() {
		// for each
		System.out.println("-----for each---------");
		int[] arrNum = { 2, 32, 56, 30, 90, 56 };
		for (int val : arrNum) {
			System.out.println(val);
		}
	}

	@Test
	public void loopSumTest() {
		int[] arrNum = { 2, 32, 56, 30, 90, 56 };

		int resultsum = 0;
		for (int i = 0; i < arrNum.length; i++) {
			resultsum += arrNum[i]; // resultsum = resultsum + arrNum[i]
		}

		assertThat(resultsum, is(266));
		// System.out.println("arrNum�迭�� ����: " + resultsum);
	}

	@Test
	public void loopBreakTest() {
		int[] arrNum = { 2, 32, 56, 30, 90, 56 };
		int resultsum = 0;
		for (int i = 0; i < arrNum.length; i++) {
			resultsum += arrNum[i];
			if (resultsum > 200) { // ������ 200�� ������ �ݺ����� �����Ѵ�.
				break;
			}
		}
		assertThat(resultsum, is(210));
	}

	@Test
	public void loopContinueTest() {
		int[] arrNum = { 2, 32, 56, 30, 90, 56 };
		int resultsum = 0;
		for (int i = 0; i < arrNum.length; i++) {
			if (arrNum[i] > 50) { // 50���� ū ���� �������� �ʴ´�.
				continue;
			}
			resultsum += arrNum[i];
		}
		assertThat(resultsum, is(64));
	}

	@Test
	public void gugudanTest() {
		// �������� ����ϴ� for���� �ۼ��϶�.
		for (int i = 2; i < 10; i++) {
			System.out.println(("\n" + i + "��"));
			for (int j = 1; j <= 9; ++j) {
				System.out.format("%2d *%2d = %2d\n", i, j, i*j);
			}
		}

	}
	@Test
	public void gugudanTest2() {
		// �������� ����ϴ� for���� �ۼ��϶�. 2~5��, 6~9�� �и� ���
		for (int p = 0; p < 2; p++) {
			for (int times = 1; times < 10; times++) {
				String row = "";
				for (int dan = p * 4 + 2; dan < p * 4 + 6; dan++) {
					row += dan + " * " + times + " = " + (dan * times) + "\t";
				}
				System.out.println(row);
			}
			System.out.println();
		}
				
		for (int i = 2; i < 10; i++) {
			System.out.println(("\n" + i + "��"));
			for (int j = 1; j <= 9; ++j) {
				System.out.format("%2d *%2d = %2d\n", i, j, i*j);
			}
		}
		
	}
	
	@Test
	public void whileStmtTest() {
		// while 
		// ���ѷ��� ������ ���� �� - ������ �ʴ� ���α׷��� ������ ��
		
		/*
		 	while (����) {     
		 		// <= ������ �����Ǵ� ���� ��� �ڵ尡 �����
		 	}
		int i = 0;
		while (true) {
			System.out.println(i++);
		}
		     // <== ���� ����
		*/
		
		int i = 0;		
		while ( i < 100) {
			System.out.println(i++);
		}
	}
	
	@Test
	public void whileBreakTest() {
		int i = 0;
		while ( i < 1000) {
			if ( i == 73) {
				break;
			}
			System.out.println(i++);
		}
	}
	
	@Test
	public void whileContinueTest() {
		// 1���� 10 ���� �����߿��� ¦���� ��
		int i = 1;
		int result = 0;
		
		while ( i <= 10) {     // 2 + 4 + 6 + 8 + 10 = 30
			if ( i % 2 == 1) {
				i++;
				continue;
			}
			result += i++;  // result = result + i++;
		}
		
		assertThat(result, is (30));
	}
	
	@Test
	public void doWhileTest() {     // 11 * 5 = 55
		// do~ while ���� while�� ������ ���� �ʴ��� 
		// �ּ� �ѹ��� �ڵ尡 ������ �ǵ��� �����Ѵ�. 
		
		int i = 11;
		int result = 0;
		
		do {
			result += i++;
		} while (i <= 10);
		
		assertThat(result, is(11));  // 		
	}

}













