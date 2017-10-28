package com.atech.concepts;

public class methodOverriding1 extends Super1{

	
	public static void main(String[] args) {
		//Throws error

	}
	public Integer getLength(){
		return 2;
	}

}
class Super1{
	public Integer getLength(){
		return 1;
	}
}
