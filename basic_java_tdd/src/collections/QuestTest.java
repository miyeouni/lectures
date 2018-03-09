package collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Collectors;

import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class QuestTest {

	// ��Ű�� ���ε�� '������_������_�������.xls' �����͸�
	// collection �� �̿��ؼ� �����͸� �ְ� ����ϴ�
	// �ڵ带 �ۼ��Ͻÿ�. 
	
	// ��Ʈ : List<Map<String, String>>
	//        �Ǵ� List<Book> 
	//        �Ǵ� Map<String, Book>
	//        �� ���� ���·� �ۼ� �� �� �ִ�. 
	//        ==> List<Map<String, String>> ���� �켱 �۾����� 
	//             �ι�° ������ε� �ۼ��� �� ��.
	
	@Test
	public void questListMapTest() {
		
		List<Map<String, String>> bookList = new ArrayList<Map<String, String>>();
		
		Map<String, String> row1 = new HashMap<String, String>();
		Map<String, String> row2 = new HashMap<String, String>();
		Map<String, String> row3 = new HashMap<String, String>();
		Map<String, String> row4 = new HashMap<String, String>();
		Map<String, String> row5 = new HashMap<String, String>();
		Map<String, String> row6 = new HashMap<String, String>();
		Map<String, String> row7 = new HashMap<String, String>();
		
		row1.put("��Ϲ�ȣ", "CNB000000788"); row1.put("������", "������ ���� õ��"); row1.put("����", "�ų������ [����]"); row1.put("Ű����", ""); row1.put("����⵵", "2000"); row1.put("KDC�з���ȣ", "675");
		row2.put("��Ϲ�ȣ", "CNB000000798"); row2.put("������", "�г��� ����BACKDRAFT /"); row2.put("����", "�� �Ͽ��� ����"); row2.put("Ű����", ""); row2.put("����⵵", "2000"); row2.put("KDC�з���ȣ", "688.20942");
		row3.put("��Ϲ�ȣ", "CNB000000954"); row3.put("������", "Andrea Bocelli Sacred Arias"); row3.put("����", "Andrea Bocelli �뷡 ;���Ϲ��� ���� [����]"); row3.put("Ű����", ""); row3.put("����⵵", "1999"); row3.put("KDC�з���ȣ", "673.313");
		row4.put("��Ϲ�ȣ", "CNB000001031"); row4.put("������", "(�����鼭 �����ϴ�)���丮"); row4.put("����", "�뿵�� �丮"); row4.put("Ű����", ""); row4.put("����⵵", "2001"); row4.put("KDC�з���ȣ", "594.5");
		row5.put("��Ϲ�ȣ", "CNB000001034"); row5.put("������", "(������ ������)�ڵ��� �������!"); row5.put("����", "������ ����"); row5.put("Ű����", ""); row5.put("����⵵", "2001"); row5.put("KDC�з���ȣ", "556.53");
		row6.put("��Ϲ�ȣ", "CNB000000870"); row6.put("������", "���߿�"); row6.put("����", "����Ŭ�� J. ������"); row6.put("Ű����", ""); row6.put("����⵵", "1973"); row6.put("KDC�з���ȣ", "688.20942");
		row7.put("��Ϲ�ȣ", "CNB000005004"); row7.put("������", "�����鼭 .2002 /"); row7.put("����", "������û ��ȹ����� ����.��ȹ"); row7.put("Ű����", "�����鼭 ������"); row7.put("����⵵", "2002"); row7.put("KDC�з���ȣ", "359.1158");
		
		bookList.add(row1);
		bookList.add(row2);
		bookList.add(row3);
		bookList.add(row4);
		bookList.add(row5);
		bookList.add(row6);
		bookList.add(row7);
		
		
		
		System.out.println("================List<Map<String, String>>");
		System.out.format("%s, %s, %s, %s, %s, %s%n"
				,"��Ϲ�ȣ" ,"������" ,"����"
				,"Ű����" ,"����⵵" ,"KDC�з���ȣ"
				);
		
		for(Map<String, String> book: bookList) {
			System.out.format("%s, %s, %s, %s, %s, %s%n"
					,book.get("��Ϲ�ȣ") ,book.get("������") ,book.get("����")
					,book.get("Ű����") ,book.get("����⵵") ,book.get("KDC�з���ȣ")
					);
		}
	}
	
	@Test
	public void questListBookTest() {
		List<Book> bookList = makeBookList();
		
		System.out.println("=============List<Book>");
		for(Book book: bookList) {
			System.out.println(book.toString());
		}
	}
	
	private List<Book> makeBookList() {
		List<Book> bookList = new ArrayList<Book>();
		
		Book book1 = new Book("CNB000000788","������ ���� õ��","�ų������ [����]","","2000","675");
		Book book2 = new Book("CNB000000954","Andrea Bocelli Sacred Arias","Andrea Bocelli �뷡 ;���Ϲ��� ���� [����]","","1999","673.313");
		Book book3 = new Book("CNB000001031","(�����鼭 �����ϴ�)���丮","�뿵�� �丮","","2001","594.5");
		Book book4 = new Book("CNB000001034","(������ ������)�ڵ��� �������!","������ ����","","2001","556.53");
		Book book5 = new Book("CNB000000870","���߿�","����Ŭ�� J. ������","","1973","688.20942");
		Book book6 = new Book("CNB000000798","�г��� ����BACKDRAFT /","�� �Ͽ��� ����","","2000","688.20942");
		Book book7 = new Book("CNB000005004","�����鼭 .2002 /","������û ��ȹ����� ����.��ȹ","�����鼭 ������","2002","359.1158");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6);
		bookList.add(book7);
		
		return bookList;
	}
	
	@Test
	public void groupingTest() {
		List<Book> bookList = makeBookList();
		
		/*
		Map<String, List<Book>> groupedBook = new HashMap<String, List<Book>>();
		 */
		Map<String, List<Book>> groupedBook = new TreeMap<String, List<Book>>(new Comparator<String>() {

			@Override
			public int compare(String key1, String key2) {
				return Integer.parseInt(key2) - Integer.parseInt(key1);
			}
			
		});
		for(Book book: bookList) {
			String pubYear = book.get����⵵();
			if (groupedBook.containsKey(pubYear)) {
				List<Book> yearBook = groupedBook.get(pubYear);
				yearBook.add(book);
			} else {
				List<Book> yearBook = new ArrayList<Book>();
				yearBook.add(book);
				groupedBook.put(pubYear, yearBook);
			}
		}
		System.out.println("========== ����⵵�� �׷���(TreeMap���� ��Ʈ)");
		// ���
		for (Map.Entry<String, List<Book>> yearBook: groupedBook.entrySet()) {
			System.out.println("======== ����⵵ : " + yearBook.getKey() + "��");
			List<Book> yearBookList = yearBook.getValue();
			for (Book book: yearBookList) {
				System.out.println(book.toString());
			}
		}
	}
	
	@Test
	public void mapSortTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("2017", "kim");
		map.put("2008", "lee");
		map.put("2012", "park");
		map.put("1993", "choi");
		
		List<String> keyList = new ArrayList<String>();
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		while(iter.hasNext()) {
			keyList.add(iter.next());
		}
		
		Collections.sort(keyList, new Comparator<String>() {

			@Override
			public int compare(String year1, String year2) {
				
				return Integer.parseInt(year2) - Integer.parseInt(year1);
			}
			
		});
		System.out.println("===========key sort");
		for(String key: keyList) {
			System.out.println(key + " : " + map.get(key));
		}
	}
	
	@Test
	public void groupingLambdaTest() {
		List<Book> bookList = makeBookList();
		Map<String, List<Book>> groupedBook = bookList.stream().collect(
				Collectors.groupingBy(Book::get����⵵, Collectors.toList())
				);
		
		System.out.println("========== ����⵵�� �׷��� (���ٽ� ����-��Ʈ����)");
		// ���
		for (Map.Entry<String, List<Book>> yearBook: groupedBook.entrySet()) {
			System.out.println("======== ����⵵ : " + yearBook.getKey() + "��");
			List<Book> yearBookList = yearBook.getValue();
			for (Book book: yearBookList) {
				System.out.println(book.toString());
			}
		}		
	}
}