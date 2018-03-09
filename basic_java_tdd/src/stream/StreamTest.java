package stream;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Before;
import org.junit.Test;

public class StreamTest {

	List<Widget> list;
	
	@Before
	public void setUp() {
		list = Arrays.asList(
				new Widget("red",  20), new Widget("red",   34),
				new Widget("blue", 45), new Widget("sky",   76),
				new Widget("red",  34), new Widget("red",   10),
				new Widget("pink", 33), new Widget("red",   12),
				new Widget("red",  68), new Widget("green", 94)
				);
		// sum ==> red:178, blue:45, pink:33, green:94
	}
	
	@Test
	public void streamTest() {
		int resultSum = list.stream()
				.filter( w -> w.getColor().equals("red") )
				.mapToInt( w -> w.getWeight())
				.sum();
		
		assertThat(resultSum, is(178));
	}
	
	@Test
	public void collectionTest() {
		//////////////////////////////// raw ������<== ���� 
		
		// filter    <== ����
		List<Widget> filteredList = new ArrayList<Widget>();
		for(Widget w: list) {
			if (w.getColor().equals("red")) {
				filteredList.add(w);
			}
		}
		
		// mapToInt  <== ����:map(ping):������ �����͸� ������ �´� 
		// �����͸� �����ϰ� ���ο� ������ ����� ����
		List<Integer> mappedList = new ArrayList<Integer>();
		for(Widget w: filteredList) {
			mappedList.add(w.getWeight());
		}
		
		// sum       <== ����:reduce: ����� �����͸� �����ϴ� ����
		int resultSum = 0;
		for(int weight: mappedList) {
			resultSum += weight;
		}
		
		// print     <== �ð�ȭ : ������ �����͸� ����ϴ� ����
		System.out.println(resultSum);
		
		assertThat(resultSum, is(178));
		
	}

}






