package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
	public static void main(String[] args) {
		
		// 1. ������ Ǯ ����
		ExecutorService executor = Executors.newFixedThreadPool(
					Runtime.getRuntime().availableProcessors()
				);
		long start = System.nanoTime();
		// 2. ������ Ǯ�� �۾������带 ����ϰ� ����
		executor.execute(new Task("�۾�1��", 10)); //  200
		executor.execute(new Task("�۾�2��", 23)); //  460
		executor.execute(new Task("�۾�3��", 46)); //  920
		executor.execute(new Task("�۾�4��", 71)); // 1420
		                                           // 4��
		long end = System.nanoTime();
		System.out.println("�ҿ�ð� : " + (end - start) + " ��");
		
		// 3. ������ Ǯ ����
		executor.shutdown();       //<== Ǯ�� ��ϵ� ��� �����带 �����ϰ� ����
		// executor.shutdownNow(); //<== ��������
		
		
	}
}
