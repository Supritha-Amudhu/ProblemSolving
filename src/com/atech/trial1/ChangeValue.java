package com.atech.trial1;

public class ChangeValue {
	
	public static void main(String[] args) {
		ChangeValue val = new ChangeValue();
		val.start();

	}
	public void start(){
		long a1[] = {5,6,7};
		System.out.println(a1[0]+a1[1]+a1[2]);
		long a2[] = doThis(a1);
		System.out.println(a1[0]+a1[1]+a1[2] + "hey there " + a1[1] + a1[2]);
		System.out.println(a2[0]+a2[1]+a2[2] );
		
		boolean bo1 = false;
		System.out.println(bo1);
		boolean bo2 = doThat(bo1);
		System.out.println(bo1);
		System.out.println(bo2);
		
	}
	public long[] doThis(long[] a3){
		a3[1] = 10;
		return a3;
	}
	public boolean doThat(boolean b){
		b = true;
		return b;
	}
	
}
