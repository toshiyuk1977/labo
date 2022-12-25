public class RunnableExecutor {

	public static void main(String[] args) {

		SampleRunnable r = new SampleRunnable();

		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);

		t1.start();
		t2.start();
	}
}