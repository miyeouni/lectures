package collections;

public class Member {
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	
	@Override
	public int hashCode() {
		// �Ϲ������� �ڹٿ����� hashCode�� �޸��ּҸ�
		// �̿��ؼ� �����ϳ� ���⼭�� override�� ����
		// ��ü�� ������ �ִ� �����͸� �������
		// hashcode�� �����ϰ� �ִ�. 
		// ��, ������ �ִ� ���� ������ hashcode�� ���Բ�
		// Ŀ���͸���¡ �� ���̴�. 
		return this.name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean isEquals = false;
		if (obj instanceof Member) {
			Member member = (Member) obj;
			isEquals =  member.getName().equals(name)
						  && member.getAge() == age;
		} 
		return isEquals;   
	}
}




















