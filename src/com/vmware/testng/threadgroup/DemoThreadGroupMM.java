package com.vmware.testng.threadgroup;

public class DemoThreadGroupMM implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			System.out.println("["+Thread.currentThread().getName()+"]:mm:"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}

		
	}

}
