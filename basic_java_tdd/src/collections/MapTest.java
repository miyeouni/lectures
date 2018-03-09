package collections;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class MapTest {
	
	@Test
	public void putGetTest() {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("kim" , "������");
		map.put("park", "��������");
		map.put("ahn" , "�濵������");
		
		assertThat(map.get("kim"), is("������"));
	}
	
	@Test
	public void containsKeyTest() {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("1002", "busan");
		map.put("2003", "seoul");
		map.put("3002", "incheon");
		
		assertTrue(map.containsKey("1002"));
		assertFalse(map.containsKey("4001"));
	}
	
	@Test
	public void keySetTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("43039", "gana");
		map.put("34409", "dara");
		map.put("90743", "maba");
		map.put("83746", "caca");
		
		System.out.println("=========keySet");
		Set<String> keys =  map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			System.out.println(map.get(iter.next()));
		}				
	}
	
	@Test
	public void mapLoopTest() {
		// map�� loop�� �� Ű�� ���� ���ÿ� �������� ���
		Map<String, String> map = new HashMap<String, String>();
		map.put("43039", "gana");
		map.put("34409", "dara");
		map.put("90743", "maba");
		map.put("83746", "caca");
		
		System.out.println("=========entrySet");
		for(Map.Entry<String, String> item: map.entrySet()) {
			System.out.println(item.getKey() + " | " + item.getValue());
		}
	}
	
	@Test
	public void mapObjectTest() {
		Map<String, Member> map = new HashMap<String, Member>();
		map.put("1001", new Member("kim" , 34));
		map.put("1002", new Member("ahn" , 54));
		map.put("1003", new Member("choi", 38));
		map.put("1004", new Member("song", 21));
		
		System.out.println("=======���� Member ��ü �ֱ�");
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			String key = iter.next();			
			Member mem = map.get(key);
			System.out.println(mem.getName() + " | " + mem.getAge());
		}
	}
	
	
}

