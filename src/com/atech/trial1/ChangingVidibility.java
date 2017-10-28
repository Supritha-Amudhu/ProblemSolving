package com.atech.trial1;

public class ChangingVidibility extends ChangeVisi{

	public static void main(String[] args) {
		ChangeVisi ch = new ChangeVisi();
		ch.execute();
		ChangingVidibility chr = new ChangingVidibility();
		chr.execute();
	}
	public void execute(){
		System.out.println("This is changed.");
		String str = "Hello";
		str = str + "          World";
		System.out.println(str);
		System.err.println("The Chamber of secrets has been opened! Enemies of the heir, beware!");
			
	}

}
class ChangeVisi{
	private int a;
	protected void execute(){
		for(int i=0;i<10;i++){
			System.out.println(a);
		}
	}
}
