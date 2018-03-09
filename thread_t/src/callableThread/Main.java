package callableThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

	public static void main(String[] args) throws Exception{
		
		ExecutorService executor = Executors.newFixedThreadPool(
						Runtime.getRuntime().availableProcessors()
					);
		
		long start = System.nanoTime();
		
		Future<Long> resultTask1 = executor.submit(new Task("�۾�1", 234));
		Future<Long> resultTask2 = executor.submit(new Task("�۾�2", 534));
		Future<Long> resultTask3 = executor.submit(new Task("�۾�3", 90));
		Future<Long> resultTask4 = executor.submit(new Task("�۾�4", 1025));
		
		Long resultTime1 = resultTask1.get();
		Long resultTime2 = resultTask2.get();
		Long resultTime3 = resultTask3.get();
		Long resultTime4 = resultTask4.get();

		long end = System.nanoTime();
		long realTotalTime = (end - start) / 1000;
		
		long totalTime = resultTime1 +resultTime2 + resultTime3 + resultTime4; 
		System.out.println("�Ѽҿ�ð�(�۾��� �հ�) : " + totalTime);
		System.out.println("���� �Ѽҿ�ð� : " + realTotalTime);
		
		
		executor.shutdown();

	}

}
