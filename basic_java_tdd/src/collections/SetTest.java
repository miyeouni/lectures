package collections;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


import org.junit.Test;

public class SetTest {
	
	@Test
	public void setTest() {
		Set<String> set = new HashSet<String>();
		
		set.add("start");
		set.add("coding");
		set.add("hello");
		set.add("world");
		
		set.add("start");
		set.add("world");
		
		assertThat(set.size(), is(4));
		// ==> �ߺ��� ���� ������� �����Ƿ� 6���� �־�����
		// ������� 4���� ����� �ȴ�. 		
	}
	
	@Test
	public void setTest2() {
		Set<EmpVo> empSet = new HashSet<EmpVo>();
		
		EmpVo vo1 = new EmpVo();
		vo1.setEmpNo("1002");
		vo1.setEName("kim");
		vo1.setSal(2000);

		EmpVo vo2 = new EmpVo();
		vo2.setEmpNo("1003");
		vo2.setEName("ahn");
		vo2.setSal(300);
		
		EmpVo vo3 = new EmpVo();
		vo3.setEmpNo("1004");
		vo3.setEName("moon");
		vo3.setSal(120);
		
		EmpVo vo4 = new EmpVo();  // vo1 �� ������ ���� �� �ִ�. 
		vo4.setEmpNo("1002");
		vo4.setEName("kim");
		vo4.setSal(2000);
		
		empSet.add(vo1);
		empSet.add(vo2);
		empSet.add(vo3);
		empSet.add(vo4);
		
		assertThat(empSet.size(), is(4));
		// vo1�� vo4�� ������ ������ ����������� 
		// �ߺ��� ������ �ν����� �ʴ´�. 
		// �̷��� ������ �����Ϸ��� hashCode(), equals() �޼ҵ带
		// override �ؼ� �ߺ������� �ڵ����־�� �Ѵ�. 
		
	}
	
	@Test
	public void setTest3() {
		// Memeber Ŭ������ hashCode(), equals() �޼ҵ带 
		// override�Ͽ� �ߺ������� �ڵ��ϰ� �� ��� Ȯ��
		Set<Member> memberSet = new HashSet<Member>();
		
		Member member1 = new Member("kim", 33);			
		Member member2 = new Member("kim", 33);
		
		memberSet.add(member1);
		memberSet.add(member2);
		
		assertThat(memberSet.size(), is(1));
		// set���� �����ϴٴ� ����
		// hashcode�� ����, 
		// equals �޼ҵ尡 true�� ���� ���Ѵ�.
		
	}
	
	@Test
	public void setIteratorTest() {
		Set<Member> memberSet = new HashSet<Member>();
		
		memberSet.add(new Member("kim", 23));
		memberSet.add(new Member("prk", 53));
		memberSet.add(new Member("jon", 13));
		memberSet.add(new Member("hey", 45));
		/*
			memberSet.add(new Member("hey", 45));
		 	<== �Ʒ� �ڵ带 ���ٷ� ǥ���� ��.		 
			Member mem1 = new Member("hey", 45);
			memberSet.add(mem1);		 
		*/
		// set�� ����� �����͸� ���������� iterator�� �ʿ��ϴ�.
		Iterator<Member> iter = memberSet.iterator();
		System.out.println("=========set iterator");
		while(iter.hasNext()) {
			Member mem = iter.next();
			System.out.println(mem.getName() + " | " + mem.getAge());
		}
		// => set�� ������ �����Ƿ� �����ö� ������ �����̴�. 
	}
	
	
}





























