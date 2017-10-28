package com.atech.trial1;

public interface InterfaceTrial {

	int a =2;
	public void sayHello();
	public void sayBye();
}
class ImplementInterface{
	InterfaceTrial inter = new InterfaceTrial() {
		
		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void sayBye() {
			// TODO Auto-generated method stub
			
		}
	};
}

