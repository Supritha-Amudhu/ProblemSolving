package com.atech.newdimension;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class AccessInnerValue {
	
	public static void main(String[] args) {
		List<BValues> B = new LinkedList<BValues>();
		try{
		B.add(new BValues(1, 1.1F, "one"));
		B.add(new BValues(2, 2.1F, "two"));
		B.add(new BValues(3, 3.1F, "three"));
		B.add(new BValues(4, 4.1F, "four"));
		System.out.println(B);
		Iterator<BValues> itr = B.iterator();
		System.out.println("This is the input");
		while(itr.hasNext()){
			BValues bv = itr.next();
			System.out.println(bv.getInt1() + " " + bv.getFloat1() + " " +bv.getStr1());			
		}
		System.out.println("B : " +B.get(0));
		List<LinkedList<BValues>> A = new LinkedList<LinkedList<BValues>>();
		A.add((LinkedList<BValues>) B);	
		System.out.println("Sample first value : ");
		System.out.println(A.get(0).get(0).getInt1());
		}
		catch(Exception ex){
			ex.printStackTrace();
			System.out.println("Exception caught");
		}
	}
}
class BValues{
	private int int1;
	private Float float1;
	private String str1;
	
	public BValues(int int1, Float float1, String str1) {
		this.int1 = int1;
		this.float1 = float1;
		this.str1 = str1;
	}
	public int getInt1() {
		return int1;
	}
	public Float getFloat1() {
		return float1;
	}
	public String getStr1() {
		return str1;
	}	
	@Override
	public String toString(){
		return new String("Int : " +int1 + " Float : " +float1 + " String : " +str1);
	}
}