
public class MultiThreading implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiThreading t = new MultiThreading();
		Thread t1 = new Thread(t);
		t1.start();
		Thread t2 = new Thread(t);
		t2.start();
		Thread t3 = new Thread(t);
		t3.start();
		Thread t4 = new Thread(t);
		t4.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Doing heavy IO processing -START"+Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doFileProcessing();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	System.out.println("Doing heavy FILE IO processing -END"+Thread.currentThread().getName());	
	
	}

	private synchronized void doFileProcessing() throws InterruptedException{
		Thread.sleep(5000);
		System.out.println("Thread: "+Thread.currentThread().getId());
		
	}
}
