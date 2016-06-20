package task121;

public class Threadss extends Thread {

	public void run() {
		int b=500_000;
		for (int i = 0; i < 1_000_000; i++) {

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.print(e);
				e.printStackTrace();
			}
			System.out.print("z ");
			try {
				
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.print(e);
				e.printStackTrace();
			}
			System.out.print(b--+" ");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.print(e);
				e.printStackTrace();
			}
			System.out.print("z ");
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Threadss();
		t1.start();
	}

}