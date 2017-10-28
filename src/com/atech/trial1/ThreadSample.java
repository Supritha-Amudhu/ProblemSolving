package com.atech.trial1;

public class ThreadSample {
	public static void main(String[] args) {
		Thread t1 = new NewThreadTest("Thread1", "\t", 7);
		Thread t2 = new NewThreadTest("Thread2", "\t\t", 9);
		Thread t3 = new NewThreadTest("Thread3", "\t\t\t", 2);
		t1.start();
		t2.start();
		t3.start();
	}

}

class NewThreadTest extends Thread {
	private String string = null;
	private String space;

	public NewThreadTest() {
	}

	public NewThreadTest(String string, String space, int priority) {
		this.string = string;
		this.space = space;		
	}

	@Override
	public void run() {
		try {
			print();
		} finally {
			System.out.println("Exiting Child Thread:" + string);
		}
	}

	private void print() {
		for (int i = 1; i < 1000; i++) {
			System.out.println(space + i + ")Printing in:" + string);
		}
	}

}
