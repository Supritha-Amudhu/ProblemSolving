package com.atech.newdimension;

public class LCM1 {

	public static void main(String[] args) {
		int lcm = 0;
		LCM1 lcmObject = new LCM1();
		lcm = lcmObject.findHCF(5, 8);

	}
	
	public int findLCM(int a, int b, int hcf){
		int lcm = (a*b)/hcf;
		return lcm;
	}
	public int findHCF(int a, int b){
		int rem=1, lcm=0, hcf=0;
		while(rem!=0){
			rem = b%a;
			System.out.println("Rem : "+rem);
			b=a;
			System.out.println("b : "+b);
			a=rem;
			System.out.println("a :"+a);
		}
		hcf = b;
		System.out.println(b + " is the HCF.");
		lcm = findLCM(a, b, hcf);
		return lcm;
	}
	

}
