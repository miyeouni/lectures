package lambda;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class LambdaTest {

	@Test
	public void labbdaTest() {
		
		List<String> list = Arrays.asList("kim", "lee", "prk", "tae");
		/*
		List<String> list = new ArrayList<String>();
		list.add("kim");
		list.add("lee");
		list.add("prk");
		list.add("tae");
		*/
		
		// ������ ���
		int size = list.size();
		for(int i = 0; i < size; i++) {
			System.out.println(list.get(i));
		}
		
		//==> ��Ʈ���� ���ٽ��� Ȱ���ϸ�
		// list.stream().forEach(name -> System.out.println(name));
		
		// list.stream().forEach( (name) -> { System.out.println(name) });
		
		list.stream().forEach( (name) -> { 
			System.out.println(name); 
		});
		
	}

	
}












