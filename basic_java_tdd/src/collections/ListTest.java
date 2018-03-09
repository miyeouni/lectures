package collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import collections.scoreComparator.MathComparator;
import collections.scoreComparator.ScienceComparator;
import collections.scoreComparator.TotalComparator;

public class ListTest {
	
	@Test
	public void addTest() {

		List list = new ArrayList();
		//ArrayList list = new ArrayList();
		list.add(100);
		list.add("start coding"); 
		// Generic�� ������� ������ � Ÿ���̵� ����Ʈ�� �߰��ϴ�
		// ���� �����ϴ�. 
		// �迭������ �Ұ���. 

		Object item1 = list.get(0);
		/*
		 <== 100�̶�� ���� ����ִ�. ������, �������� 
		 Object�θ� ������ �ִ�. ��, �������� ����ȯ�� �ʿ��ϴ�. 
		 */
		//int item1 = list.get(0); // �̷��Դ� �ȵȴ�. 
		//int item1_1 = (int)list.get(0); // ����ȯ�� �ʿ��ϴ�. 
		
		// Generic <== ������ Ÿ�� üũ�� �ʿ�
	}
	
	@Test
	public void genericTest() {
		// list�� generic �����ϱ�
		List<String> list = new ArrayList();
		//list.add(100); // �̷��Դ� �ȵȴ�. generic���� String�� �ޱ�� �����Ƿ�
		list.add("start coding");
		
		// ���׸��� 1.5���� �����Ǳ� �����߰�, ������ �Ǹ鼭 ������ 
		// ���ݾ� �߰��Ǿ���. 
		List<String> list1 = new ArrayList<String>(); // �յ� ��� ����ϴ� ���� : ����
		List<String> list2 = new ArrayList<>();       // �տ��� ����ϴ� ����:<>�� �־����.
		List<String> list3 = new ArrayList();         // �տ��� ����ϴ� ����
		
		// ���⼭�� �յ� ��� �����ϴ� ���·� �ڵ��� ����.
	}
	
	@Test
	public void getTest() {
		List<String> list = new ArrayList<String>();
		
		list.add("start");   // index : 0
		list.add("coding");  // index : 1
		list.add("hello");   // index : 2
		
		// �����͸� �߰��ϰ� �Ǹ� add�� ������� �ε����� �ο��ȴ�. 
		assertThat(list.get(0), is("start"));
		assertThat(list.get(1), is("coding"));
		assertThat(list.get(2), is("hello"));
	}
	
	@Test
	public void listLoopTest1() {
		// for ��
		List<String> list = new ArrayList<String>();
		list.add("start");
		list.add("coding");
		list.add("hello");
		list.add("world");
		
		// case 1
		System.out.println("=========== list loop");
		int listSize = list.size();
		for (int i = 0; i < listSize; i++) {
			// loop ����
			String item = list.get(i);
			System.out.println(item);
		}
		
		/*
		// case 2
		for (int i = 0; i < list.size(); i++) {
			// loop ���� 
		}
		*/
		// case2�� ���� for���� ����ϸ� loop�� �������� size() �����
		// �ϰԵǹǷ� ���� ������ ������ �� �� �ִ�. 
	}
	
	@Test
	public void listLoopTest2() {
		List<String> list = new ArrayList<String>();
		list.add("start");
		list.add("coding");
		list.add("hello");
		list.add("world");
		System.out.println("======== loop test 2: foreach");
		for(String item: list) {
			System.out.println(item);
		}
	}
	
	@Test
	public void listSortTest() {
		List<EmpVo> list = new ArrayList<EmpVo>();
		
		EmpVo vo1 = new EmpVo();
		vo1.setEmpNo("1001");
		vo1.setEName("start");
		vo1.setSal(200);
		
		list.add(vo1);
		
		EmpVo vo2 = new EmpVo();
		vo2.setEmpNo("1002");
		vo2.setEName("coding");
		vo2.setSal(400);
		
		list.add(vo2);
		
		EmpVo vo3 = new EmpVo();
		vo3.setEmpNo("1003");
		vo3.setEName("hello");
		vo3.setSal(700);
		
		list.add(vo3);
		System.out.println("====== EMP list");
		
		Collections.sort(list);
		
		for(EmpVo vo: list) {
			System.out.print(vo.getEmpNo() + "\t" );
			System.out.print(vo.getEName() + "\t" );
			System.out.print(vo.getSal());
			System.out.println();
		}
		
	}
	
	@Test
	public void anonymousTest() {
		// �͸� ��ü ����..
		List<String> list = new List<String> () {
			
			private String[] arrStr = new String[100];
			private int curIndex = 0;
			
			@Override
			public boolean add(String str) {
				arrStr[curIndex] = str;
				curIndex++;
				
				return true;
			}
			
			@Override
			public String get(int index) {				
				return arrStr[index];
			}
			
			@Override
			public int size() {				
				return arrStr.length;
			}
			
			
			@Override
			public void add(int arg0, String arg1) {
				// TODO Auto-generated method stub
				
			}
			

			@Override
			public boolean addAll(Collection<? extends String> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(int arg0, Collection<? extends String> arg1) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public boolean contains(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			

			@Override
			public int indexOf(Object arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<String> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public int lastIndexOf(Object arg0) {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public ListIterator<String> listIterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public ListIterator<String> listIterator(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean remove(Object arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String remove(int arg0) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean removeAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> arg0) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public String set(int arg0, String arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			

			@Override
			public List<String> subList(int arg0, int arg1) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] arg0) {
				// TODO Auto-generated method stub
				return null;
			}
		};
		
		
		list.add("start");
		list.add("coding");
		list.add("hello");
		list.add("world");
		
		assertThat(list.get(0), is("start"));
		assertThat(list.get(1), is("coding"));
		assertThat(list.get(2), is("hello"));
		assertThat(list.get(3), is("world"));
		
		
	}
	
	@Test
	public void comparatorTest() {
		
		// Score ������ �����ϴ� Ŭ����(bean)�� �ϳ� �����
		// ScoreVo 
		// 		studuentName �л��̸�
		// 		language     �������
		// 		math         ��������
		//		science      ��������
		// ����Ʈ�� �ټ��� �����͸� �߰��� ��
		// ������ ������ �� ȭ�鿡 ���
		// ������ ���� ����.
		
		// �� ������ �� �ذ��Ͻź��� Comparable �������̽����ƴ�
		// Comparator �������̽��� �̿��� ������� �����غ�����.
		
		List<ScoreVo> list = new ArrayList<ScoreVo>();
		
		ScoreVo vo1 = new ScoreVo();
		vo1.setStudentName("kim");
		vo1.setLanguage(34);
		vo1.setMath(23);
		vo1.setScience(76);
		
		list.add(vo1);

		ScoreVo vo2 = new ScoreVo();
		vo2.setStudentName("ahn");
		vo2.setLanguage(65);
		vo2.setMath(34);
		vo2.setScience(98);
		
		list.add(vo2);
		
		ScoreVo vo3 = new ScoreVo();
		vo3.setStudentName("moon");
		vo3.setLanguage(34);
		vo3.setMath(56);
		vo3.setScience(87);
		
		list.add(vo3);
		
		ScoreVo vo4 = new ScoreVo();
		vo4.setStudentName("hong");
		vo4.setLanguage(97);
		vo4.setMath(78);
		vo4.setScience(58);
		
		list.add(vo4);
		/*
		 * jdk 1.7 ���� ���������� Collections.sort() �޼ҵ带 �����.
		Collections.sort(list, new Comparator<ScoreVo>() {

			@Override
			public int compare(ScoreVo vo1, ScoreVo vo2) {
				int vo1Total = vo1.getLanguage() + vo1.getMath() + vo1.getScience();
				int vo2Total = vo2.getLanguage() + vo2.getMath() + vo2.getScience();
				return vo2Total - vo1Total;
			}
		} );
		*/
		// �������� ���� (�͸�Ŭ���� ���)
		/*
		list.sort(new Comparator<ScoreVo>() {

			@Override
			public int compare(ScoreVo vo1, ScoreVo vo2) {
				int vo1Total = vo1.getLanguage() + vo1.getMath() + vo1.getScience();
				int vo2Total = vo2.getLanguage() + vo2.getMath() + vo2.getScience();
				return vo2Total - vo1Total;
			}
		})		;
		*/
		// ==> �Ʒ��� ���� ������ �ִ�. 
		// Comparator�������̽��� ������ TotalComparator Ŭ������ ����ٸ�.
		list.sort(new TotalComparator());
		
		/*
		 	    la  ma  sc   total
		 kim	34	23	76	/172
		 ahn	65	34	98 	/197
		 moon	34	56	87	/177
		 hong	97	78	58	/233
		 */
		System.out.println("========���� ����");
		for (ScoreVo vo: list) {
			System.out.println(vo.getStudentName());
		}
		
		// math ������ ���� (���ٽ� ���)
		//list.sort( (v1, v2) ->  v2.getMath() - v1.getMath() );
		
		/*Comparator Ÿ���� �ι�° �Ķ���ͷ� �Ѱ������. */
		Collections.sort(list, new MathComparator());
		//Collections.sort(list, new ScienceComparator());
		
		
		System.out.println("========math ����");
		for (ScoreVo vo: list) {
			System.out.println(vo.getStudentName() + " : " + vo.getMath());
		}
	}
	
}





























