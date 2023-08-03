package com.lumen.threads;

public class ThreadSleep {
	public static void main(String[] args) {
		Thread thread = Thread.currentThread();
		System.out.println(thread);
//		int []nums = null;
//		System.out.println(nums[0]);
		
//		thread.setName("sathish");
//		thread.setPriority(Thread.MAX_PRIORITY);
//		System.out.println(thread);
//		int []nums1 = null;
//		System.out.println(nums1[0]);
//		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}

		}

}
