
public class AscendingThread extends Thread{

	public AscendingThread() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Ascending: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Ascending is done!");
	}

}
