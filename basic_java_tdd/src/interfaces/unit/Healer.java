package interfaces.unit;

import interfaces.skill.Attack;
import interfaces.skill.Heal;

public class Healer extends Unit implements Attack, Heal{
	@Override
	public void active() {
		attack();
		heal();
	}
	
	public void attack() {
		System.out.println("������ �����߽��ϴ�.");
	}
	
	public void heal() {
		System.out.println("������ ���� �߽��ϴ�.");
	}
}
