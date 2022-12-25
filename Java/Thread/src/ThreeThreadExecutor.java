class ThreeThreadExecutor {
	public static void main(String[] args) {
		SampleThread2 st1 = new SampleThread2();
		SampleThread2 st2 = new SampleThread2();
		SampleThread2 st3 = new SampleThread2();
		st1.start();
		st2.start();
		st3.start();
	}
}