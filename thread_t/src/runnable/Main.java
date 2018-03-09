package runnable;

public class Main {
	public static void main(String[] args) {
		// �����带 �����ϴ� ��� 2
		// Runnable �������̽��� ���� Ŭ������
		// ������ ������ �������� �Ķ���ͷ� �Ѱ��ش�.
//		TaskFirst taskFirst = new TaskFirst("first thread", 1000);		
		/*
		Runnable taskFirst = new TaskFirst("first thread", 1000);		
		Thread firstThread = new Thread(taskFirst);
		
		firstThread.start();
		*/
		/*
		Thread firstThread = new Thread(new TaskFirst("first thread", 1000));
		firstThread.start();
		*/
		
		/* Runnable �� �͸� Ŭ������ �ۼ��غ��ٸ�...
		 */
		Runnable taskFirst = new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i < 100; i++) {
					System.out.println(i);
					try {
						Thread.sleep(1000); 
					} catch (InterruptedException e) {
						
					}
				}
			}
		};
		
		Thread firstThread = new Thread(taskFirst);
		firstThread.start();
		
		
	}
}














