package controlStatement;

import static org.junit.Assert.*;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;


public class SortTest {
	
	@Test
	public void bubbleSortTest() {
		// �����Ʈ: ������ ���� ũ�⸦ ���Ͽ� ��ȯ�س����� ���
		int [] arr = {3, 4, 5, 2, 1};
		int temp = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j= 1 ; j < arr.length-i; j++) {
				if(arr[j] < arr[j-1]) {
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	@Test
	public void treeTest() {
		// ������ 2�����迭�� Ʈ�����·� ����Ͻÿ�.
		// �ι�° ���� �θ� ���� ǥ���Ѵ�. ��, 
		// {1001, 1000} �� 1001�� �θ� 1000���� ��Ÿ��.
		/* 
	 		int [][] tree = {
	 							{0000, 0000}
	 							, {1000, 0000}
	 							, {1001, 1000}
	 							, {2000, 0000}
	 							, {2001, 2000}
	 							, {2002, 2000}
	 							, {3000, 2001}
	 							, {3001, 2001}
	 							, {3002, 1000}
	 							, {3003, 0000}
	 						};
	 		==>
	 		0000
	 			1000
	 				1001
	 				3002
	 			2000
	 				2001
	 					3000
	 					3001
	 				2002
	 			3003

		 *
		 */
		
	}
	
}








