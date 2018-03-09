package interfaces.unit;

import interfaces.skill.Attack;
import interfaces.skill.Flight;

public class Archer extends Unit implements Attack{
	@Override
	public void active() {
		attack();
		fly();
	}
	
	public void attack() {
		System.out.println("�ü��� ������ �߽��ϴ�.");
	}
	
	public void fly() {
		System.out.println("�ü��� �ϴ��� ���ҽ��ϴ�");
	}
}
