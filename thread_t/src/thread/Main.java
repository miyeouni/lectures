package thread;

public class Main {
	public static void main(String[] args) {
		
		// ù��° TaskFirst ����
		Thread firstThread = new TaskFirst(1432);
		firstThread.start(); 
		// �����带 �����ų ���� run() �޼ҵ尡 �ƴ϶� 
		// start() �޼ҵ带 ȣ���ؾ��Ѵ�.
		
		// �ι�° TaskFirst ���� 
		Thread secondThread = new TaskFirst(467);
		secondThread.start();
		
		
	}
}
