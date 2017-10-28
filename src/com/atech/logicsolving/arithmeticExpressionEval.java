package com.atech.logicsolving;
import java.util.*;

public class arithmeticExpressionEval
{
	public static void main(String[] args) 
	{
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("*", 5);
		map.put("/", 5);
		map.put("+", 4);
		map.put("-", 4);
		map.put("(", 3);
		//map.put(")", 10);
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Infix expression : ");
		String infix = scan.nextLine();
		scan.close();
		LinkedList<String> stack = new LinkedList<String>();
		LinkedList<String> output = new LinkedList<String>();
		String[] split = infix.split(" ");
		for(String c : split)
		{
			System.out.println("Split string : " +c);
			if(!c.equals("*") && !c.equals("/") && !c.equals("+") && !c.equals("-") && !c.equals("(") && !c.equals(")"))
			{
				System.out.println("Operand : ");				
				output.add(c);				
			}
			else if(c.equals("*") || c.equals("/") || c.equals("+") || c.equals("-"))
			{
				System.out.println("Operator : ");
				if(stack.isEmpty())
				{
					System.out.println("If stack is empty : ");
					stack.add(c);
					System.out.println("Stack elements after adding a value when stack is empty : " +stack);
					System.out.println("Map.get(c) : " +map.get(c));
				}			
				else if(((int)(map.get(c))) <= ((int)(map.get(stack.getLast()))))
				{				
					System.out.println("Operator with lower priority : ");
					System.out.println("If the operand has a lower priority than the stack operator : ");
					output.add(stack.removeLast());	
					stack.add(c);
					System.out.println("Stack elements : " +stack);
				}				
				else if(((int)(map.get(c))) > ((int)(map.get(stack.getLast()))))
				{
					System.out.println("Operator with higher priority : ");
					stack.add(c);
				}
				else
				{
					stack.add(c);
				}
			}
			else if(c.equals("("))
			{
				System.out.println("If stack = ( : ");
				stack.add(c);
			}			
			else if(c.equals(")"))
			{
				System.out.println("If stack = ) : ");
				//This loop is not running. If I encounter a ), I am not able to add the elements from stack to output till the loop encounters a (
				for(int i=stack.size()-1;i>=stack.lastIndexOf("(");i--)
				{
					//Hello is not being printed, so control does not enter this loop
					System.out.println("Hello " + i);
					System.out.println(stack.get(i));
					output.add(stack.get(i));	
				}
				for(int i=stack.lastIndexOf("(");i<stack.size();i++)
				{
					stack.removeLast();
				}
			}
			System.out.println("Stack : " +stack);
			System.out.println("Output : " +output);
			//System.out.println("Last Index of ( : " +stack.lastIndexOf("("));
		
		}
		System.out.println("Stack size : " +stack.size());
		int size = stack.size();
		for(int i=size-1;i>=0;i--)
		{
			output.add(stack.get(i));
		}
		
		System.out.println("Stack : " +stack);
		System.out.println("Output : " +output);
		output.remove("(");			
		Iterator<String> itr = output.iterator();
		System.out.println("After declaring an iterator for output : (Postfix expression)");
		Object o;
		while(itr.hasNext())
		{
			o = itr.next();
			if(!o.equals("("))
			{
				System.out.print(o + " ");
			}
		}
		System.out.println();
		arithmeticExpressionEval evalObject = new arithmeticExpressionEval();
		evalObject.solve(output);
		
	}
	
	
public void solve(LinkedList<String> output)
{
	Iterator<String> itr = output.iterator();
	String[] str = new String[output.size()];
	LinkedList<String> eval = new LinkedList<String>();
	int j=0;
	while(itr.hasNext())
	{
		Object o = itr.next();
		if(!o.equals("("))
		{
			str[j] = (String) o;
			j++;
		}
	}
	for(int i=0;i<str.length;i++)
	{
		if(!str[i].equals("*") && !str[i].equals("/") && !str[i].equals("+") && !str[i].equals("-"))
		{
			eval.add(str[i]);
		}
		else if(str[i].equals("*"))
		{
			while(!eval.isEmpty())
			{
				String str1 = (String) eval.removeLast();
				String str2 = (String) eval.removeLast();
				int a = Integer.parseInt(str1);
				int b = Integer.parseInt(str2);
				int r = a*b;
				eval.add(""+r);
			}
		}
		else if(str[i].equals("/"))
		{
			while(!eval.isEmpty()){
				String str1 = (String) eval.removeLast();
				String str2 = (String) eval.removeLast();
				int a = Integer.parseInt(str1);
				int b = Integer.parseInt(str2);
				int r = a/b;
				eval.add(""+r);
			}
		}
		else if(str[i].equals("+"))
		{
			if(!eval.isEmpty())
			{
				/*String str1 = (String) eval.removeLast();
				String str2 = (String) eval.removeLast();
				int a1 = Integer.parseInt(str1);
				int b1 = Integer.parseInt(str2);*/
				Integer a = Integer.parseInt(eval.removeLast());
				Integer b = Integer.parseInt(eval.removeLast());
				Integer r = a+b;
				eval.add(""+r);
			}
		}
		else if(str[i].equals("-"))
		{
			while(!eval.isEmpty())
			{
				String str1 = (String) eval.removeLast();
				String str2 = (String) eval.removeLast();
				int a = Integer.parseInt(str1);
				int b = Integer.parseInt(str2);
				int r = a-b;
				eval.add(""+r);
			}
		}
		else
		{
			System.out.println("There is some problem.");
		}
		System.out.println(eval);
	}
	
}
	

}
