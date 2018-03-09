package object;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import object.beans.DeptVo;

public class ObjectTest {

	@Test
	public void toStringTest() {
		DeptVo vo = new DeptVo();
		vo.setDeptNo("1001");
		vo.setDName("������");
		vo.setLoc("�λ�");
		
		assertThat(vo.getDeptNo(), is("1001"));
		assertThat(vo.toString(), is("1001_������_�λ�"));
		
		
		DeptVo vo1 = new DeptVo();
		vo1.setDeptNo("1002");
		vo1.setDName("�濵������");
		vo1.setLoc("��õ");
		
		assertThat(vo1.getDeptNo(), is("1002"));
		
		// "�μ���ȣ_�μ���_�μ���ġ"
		assertThat( 
				vo1.getDeptNo() + "_" +
				vo1.getDName() + "_" +
				vo1.getLoc()
				, is("1002_�濵������_��õ"));
		
		assertThat(vo1.toString()
				, is("1002_�濵������_��õ"));
	}

}








