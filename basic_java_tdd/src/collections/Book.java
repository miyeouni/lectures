package collections;

public class Book {
	private String ��Ϲ�ȣ;
	private String ������;
	private String ����;
	private String Ű����;
	private String ����⵵;
	private String KDC�з���ȣ;

	public Book(String ��Ϲ�ȣ, String ������, String ����, String Ű����, String ����⵵, String KDC�з���ȣ) {
		this.��Ϲ�ȣ = ��Ϲ�ȣ;
		this.������ = ������;
		this.���� = ����;
		this.Ű���� = Ű����;
		this.����⵵ = ����⵵;
		this.KDC�з���ȣ = KDC�з���ȣ;

	}

	public String get��Ϲ�ȣ() {
		return ��Ϲ�ȣ;
	}

	public void set��Ϲ�ȣ(String ��Ϲ�ȣ) {
		this.��Ϲ�ȣ = ��Ϲ�ȣ;
	}

	public String get������() {
		return ������;
	}

	public void set������(String ������) {
		this.������ = ������;
	}

	public String get����() {
		return ����;
	}

	public void set����(String ����) {
		this.���� = ����;
	}

	public String getŰ����() {
		return Ű����;
	}

	public void setŰ����(String Ű����) {
		this.Ű���� = Ű����;
	}

	public String get����⵵() {
		return ����⵵;
	}

	public void set����⵵(String ����⵵) {
		this.����⵵ = ����⵵;
	}

	public String getKDC�з���ȣ() {
		return KDC�з���ȣ;
	}

	public void setKDC�з���ȣ(String kDC�з���ȣ) {
		KDC�з���ȣ = kDC�з���ȣ;
	}

	public String toString() {
		return this.��Ϲ�ȣ + ", " 
				+ this.������ + ", " 
				+ this.���� + ", " 
				+ this.Ű���� + ", " 
				+ this.����⵵ + ", " 
				+ this.KDC�з���ȣ;

	}
}
