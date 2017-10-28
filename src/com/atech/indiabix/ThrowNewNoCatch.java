package com.atech.indiabix;

public class ThrowNewNoCatch {

	
	public static void main(String[] args) {
		try{
			System.out.println("Hello world");
			throwIt();
			System.out.println("Done with try.");			
		}
		catch(RuntimeException r){
			System.out.println("RTE caught.");
		}
		finally{
			System.out.println("This is it.");
			Object ob = new Object();
			System.out.println(ob);
			Object oc = ob;
			System.out.println(oc);
			String str = new String();
			str = "Harry Potter";
			char[] c = {'a','b','c'};
			String str2 = str.substring(0,1);
			System.out.println(str2);
			boolean boo = str.contains("Harry ");
			System.out.println(boo);
			boolean boo2 = str.endsWith("er");
			System.out.println(boo2);
			System.out.println(str.contentEquals("Harry Potter"));
			System.out.println(str.intern());
			System.out.println(str.getBytes());
			byte[] by = str.getBytes();
			System.out.println(by[01]);
			String[] ss = new String[]{"Heyyy","Theree", "Youuuu"};
			System.out.println(ss[02]);
			ThrowNewNoCatch oo = new ThrowNewNoCatch(){
				private void heyThere() {
					System.out.println("This is newwwwwwwwwwww");
					
				}				
			};			
			
		}
		

	}
	public static void throwIt(){
		throw new RuntimeException();
	}

}
