package interfaces.unit;

public abstract class Unit {
	protected String unitName;
	protected int hp;       // �����
	protected int mana;     // �����
	protected int attack;   // ���ݷ�
	protected int intelli;  // ����
	protected int power;    // ��
	
	public abstract void active() ;
}
