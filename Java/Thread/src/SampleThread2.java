class SampleThread2 extends Thread {
	public void run() {
		System.out.println("これはスレッド" + getName() + "からです");
	}
}