package object;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import object.example.Car;
// import �� ����� Ŭ������ ��� ��ġ�� �ִ��� �˷��ִ� ������ �Ѵ�.

public class CarTest {

	@Test
	public void carFieldTest() {
		Car car = new Car();
		
		assertThat(car.company, is("HYUNDAI"));
	}
	
	@Test
	public void carFieldAccessTest() {
		Car car = new Car();
		
		//assertThat(car.model, is("�׷���"));
		// <== �̿� ���� ����� �� ����. 
		// model �ʵ�� private ���� ���� �ܺο����� 
		// ������ �� ����. 
		// public, private, protected 
		// <== ���������� access modifier
		// ���������ڸ� ����ϴ� ������ ��ü�������α׷�����
		// ĸ��ȭ ����.
		/*
		 	public : ������ ���� ����
		 	private : Ŭ���� �������� ��밡��
		 	protected : ������Ű�� �Ǵ� ��Ӱ���
		 	�ƹ��͵� ������ ���� ���: ������Ű��
		 */
		assertThat(car.getColor(), is("����"));
		// �Ϲ������� ���¸� ��Ÿ���� �ʵ�� private��
		// �ܺγ����� ���� �ʿ��� ��� �޼ҵ带 ����
		// �ʵ� �� ������ ����ϴ� ����� ����Ѵ�. 
		
	}
	
	@Test
	public void instanceTest() {
		// ������
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setSpeed(100);
		car2.setSpeed(200);
		
		assertThat(car1.getSpeed(), is(100));
		assertThat(car2.getSpeed(), is(200));
	}
	
	@Test
	public void instanceTest2() {
		
		Car car1 = new Car("�׷���2", "����");
		assertThat(car1.getColor(), is("����"));
		
		Car car2 = new Car();
		assertThat(car2.getColor(), is("����"));
	}
	
	@Test
	public void staticTest() {
		Car car1 = new Car();
		assertThat(car1.company, is("HYUNDAI"));
		
		assertThat(Car.madeBy, is("KOREA"));
		// madeBy  �ʵ�� static Ű���带 �ٿ���⶧����
		// new �����ڸ� ������� �ʰ� ���ٰ����ϴ�. 
		
		Car.madeBy = "JAPAN";
		assertThat(Car.madeBy, is("JAPAN"));
		
		Car.madeBy = "CHINA";
		assertThat(Car.madeBy, is("CHINA"));
		
		assertThat(Car.exportTo, is("USA"));
		//Car.exportTo = "CHINA";
		// �̷��Դ� ��������. exportTo�� final�̱⶧���̴�.
		// final Ű���尡 ������ ���� ������ �� ����.
		
		
		
	}
	
	

}










