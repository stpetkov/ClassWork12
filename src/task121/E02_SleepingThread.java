package task121;

public class E02_SleepingThread extends Thread {

	public void run() {
		int b=500_000;
		for (int i = 0; i < 1_000_000; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.print(e);
				e.printStackTrace();
			}
			try {
				System.out.print("z ");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print(e);
				e.printStackTrace();
			}
			System.out.print(b--+" ");
		}
	}

	public static void main(String[] args) {
		Thread t1 = new E02_SleepingThread();
		t1.start();
	}

}