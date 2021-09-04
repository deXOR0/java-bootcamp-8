
public class Main {
	
//	Java Generic
//	Multi Threading
//	Cara Membuat:
//	1. Thread Inheritance
//	2. Runnable Interface
	
//	Tipe Thread:
//	1. User Thread -> Thread yang kita bikin dan kita manage sendiri
//	2. Daemon Thread -> Thread yang jalan di background / disebut juga Low-Priority Thread
//	Program tidak akan menunggu daemon thread untuk selesai sebelum terminate,
//	tapi kalau ada minimal 1 user thread, maka programnya tidak akan terminate

	@SuppressWarnings("deprecation")
	public Main() {
		// TODO Auto-generated constructor stub
//		IntegerClass integerObject = new IntegerClass(10);
//		DoubleClass doubleObject = new DoubleClass(3.14);
		
//		GenericClass<Integer> integerObject = new GenericClass<Integer>(10);
//		GenericClass<Double> doubleObject = new GenericClass<Double>(3.14);
//		
//		integerObject.printValue();
//		doubleObject.printValue();
//		integerObject.showType();
//		doubleObject.showType();
		
//		GenericClass<Integer, Double> numberObject = new GenericClass<Integer, Double>(10, 3.14);
//		numberObject.multiplyValues();
		
//		GenericClass<Integer> integerObject = new GenericClass<Integer>(5);
//		GenericClass<Double> doubleObject = new GenericClass<Double>(-5.0);
//		
//		System.out.println(integerObject.absolutelyEquals(doubleObject));
//		System.out.println(doubleObject.absolutelyEquals(integerObject));
		
		AscendingThread ascendingThread = new AscendingThread(); // User Thread
		DescendingRunnable descendingRunnable = new DescendingRunnable();
		Thread descendingThread = new Thread(descendingRunnable);
		
//		ascendingThread.setDaemon(true);
//		descendingThread.setDaemon(true);
		
		ascendingThread.start();
		ascendingThread.stop(); 
//		try {
//			ascendingThread.join(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		descendingThread.start();
		
		System.out.println("Hello I'm from Main!");
		System.out.println(1/0);
		
	}
	
	public void printAscending() {
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

	public void printDescending() {
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
