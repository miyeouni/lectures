package interfaces.unit;

import interfaces.skill.Attack;

public class Knight extends Unit implements Attack {
	@Override
	public void active() {
		attack();
	}

	@Override
	public void attack() {
		System.out.println("��簡 ������ �߽��ϴ�");
		
	}
}
