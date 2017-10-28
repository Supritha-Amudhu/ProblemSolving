package com.atech.trial1;

public class genericsClass<T>
{
	private T value;
	private T[] array = null;; 
	public static void main(String[] args) 
	{
		genericsClass<Integer> object = new genericsClass<Integer>(5);
		object.setValue(5);
		System.out.println(object.getValue());
		Integer[] second = new Integer[10];
		for(int i=0;i<9;i++)
		{
			second[i] = i;
		}
		object.setArray(second);
		System.out.println(object.getArray().toString());
		//System.out.println(array[1]);
	}
	public genericsClass(T value) {
		super();
		this.value = value;
	}
	public T getValue() {
		return value;
	}
	public void setValue(T value) {
		this.value = value;
	}
	public T[] getArray() {
		return (T[]) array[1];
	}
	public void setArray(T[] array) {
		this.array = array;
	}
	
	

}
