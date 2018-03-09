package thread;

public class TaskFirst extends Thread {
	
	private int sleepTime = 1000;
	
	public TaskFirst(int sleepTime) {
		this.sleepTime = sleepTime;
	}
	
	// Thread Ŭ������ ��ӹ޾Ƽ� Thread�� ����� ���
	// run() �޼ҵ带 override ����� �Ѵ�. 
	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println(getName() + " : " + i);
			try {
				Thread.sleep(this.sleepTime); // <= �۾����߿� �����ð����� ������ ���߰� ���ش�.
			} catch (InterruptedException e) {
				
			}
		}
	}
}
