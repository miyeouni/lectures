package nonThread;

public class Main {
	public static void main(String[] args) {
		
		TaskFirst cloneFirstTask = new TaskFirst("ù��° �۾�", 1237);
		TaskFirst cloneSecondTask = new TaskFirst("�ι�° �۾�", 123);
		
		cloneFirstTask.run();
		cloneSecondTask.run();	
		
	}
}
