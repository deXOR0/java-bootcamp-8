
public class DescendingRunnable implements Runnable {

	public DescendingRunnable() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 9; i >= 0; i--) {
			System.out.println("Descending: " + i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.out.println("Descending is done!");
	}

}
