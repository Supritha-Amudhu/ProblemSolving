package com.atech.newdimension;

public class LCM {
	static int a; static int b;
	static int mul1=0; static int mul2=0;
	public static void main(String[] args) {
		LCM lcm = new LCM();
		lcm.findLCM(5, 8);
	}
	public void findLCM(int a, int b){
		ThreadLoop1 t1 = new ThreadLoop1();
		ThreadLoop2 t2 = new ThreadLoop2();
		t1.start();
		t2.start();
		t1.run1(a, b, mul1);
		t2.run2(a, b, mul2);
		if(mul1 == mul2){
			System.out.println("Mul1 : "+mul1);
			System.out.println("Mul2 : "+mul2);
			System.out.println("Maybe.");
		}
		/*int i=0, j=0,mul1=0,mul2=0;
		for(i=1;i<(a*b);i++){
			mul1 = (a*i);
		}
		for(j=1;j<(a*b);j++){
			mul2 = (b*j);
		}*/
	}

}

class ThreadLoop1 extends Thread{
	int i=0;
	public void run(){
		
	}
	public void run1(int a, int b, int mul1){
		for(i=1;i<(a*b);i++){
			mul1 = (a*i);
			System.out.println("Mul 1 : "+mul1);
		}
	}
}

class ThreadLoop2 extends Thread{
	int j=0;
	public void run(){
		
	}
	public void run2(int a, int b, int mul2){
		for(j=1;j<(a*b);j++){
			mul2 = (b*j);
			System.out.println("Mul 2 : "+mul2);
		}
	}
}
