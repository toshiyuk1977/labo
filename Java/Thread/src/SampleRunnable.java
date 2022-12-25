class SampleRunnable implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();

		String name = t.getName();

		System.out.println("ƒXƒŒƒbƒh–¼‚Í" + name + "‚Å‚·");
	}
}