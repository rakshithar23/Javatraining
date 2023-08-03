package com.lumen.threads;

class Child extends Thread{

	@Override
	public void run() {
		
		// TODO Auto-generated method stub
		super.run();
	}
	
}

public class ExThread {
	
	public static void main(String[] args) {
		Thread child1 = new Child();
		child1.setName("Rak");
		child1.setPriority(Thread.MAX_PRIORITY);
		child1.start();
		
		Thread child2 = new Child();
		child2.setName("Sanju");
		child2.setPriority(Thread.MIN_PRIORITY+2);
		child2.start();
		
		Thread child3 = new Child();
		child3.setName("Sathi");
		child3.setPriority(Thread.NORM_PRIORITY+3);
		child3.start();
		
	}
		
		public void run() {
			String tname = Thread.currentThread().getName();
		for(int i = 0; i < 5; i++) {
				System.out.println(tname +" "+i);
				try {
					Thread.sleep(3000);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			
	
		
	}
		
	}
	

	



