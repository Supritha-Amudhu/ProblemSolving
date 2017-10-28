package com.atech.concepts;

class Quiz1 
{ 
    public Quiz1(int x){} 
    public Quiz1(){
    }
} 
class B extends Quiz1 {

	public B(){
		
	}
	/*public B(int x) {
		super(x);
		// TODO Auto-generated constructor stub
	}*/
	} 
class test 
{ 
    public static void main (String args []) 
    {
        Quiz1 quiz1 = new B(); 
        System.out.println("complete"); 
    } 
}

