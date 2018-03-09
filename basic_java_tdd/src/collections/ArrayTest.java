package collections;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import object.beans.DeptVo;

public class ArrayTest {
	@Test
	public void referenceTypeArrayTest() {
		DeptVo[] arrVo = new DeptVo[10];
		
		DeptVo vo1 = new DeptVo();
		vo1.setDeptNo("1220");
		vo1.setDName("����");
		vo1.setLoc("�λ�");
		
		arrVo[0] = vo1;
		
		assertThat(arrVo[0].getDeptNo(), is("1220"));
		
	}
	
	@Test
	public void referenceTypeArrayForStatementTest() {
		DeptVo[] arrVo = new DeptVo[3];
		
		DeptVo vo1 = new DeptVo();
		vo1.setDeptNo("1220");
		vo1.setDName("����");
		vo1.setLoc("�λ�");
		
		arrVo[0] = vo1;
		
		DeptVo vo2 = new DeptVo();
		vo2.setDeptNo("1220");
		vo2.setDName("����");
		vo2.setLoc("����");
		
		arrVo[1] = vo2;
		
		DeptVo vo3 = new DeptVo();
		vo3.setDeptNo("4220");
		vo3.setDName("������");
		vo3.setLoc("��õ");
		
		arrVo[2] = vo3;
		
		for (int i = 0; i < arrVo.length; i++) {
			DeptVo deptVo = arrVo[i];
			System.out.println(deptVo.getDName());
		}
		
		/*
		
			
		
		*/
	}
	
	
	
	
	
	
	
	
}
