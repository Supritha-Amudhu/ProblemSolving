/**1.Write a program to have a class hierarchy of Employee. Manager is a employee.
Secretary is a employee. Programmer is a employee. Executive officer is a
manager. Use needed members and calculate their salary and bonus. Explain the
type of inheritance used.

Calculate Salary and Bonus
Employee - 
  1. Manager
  	 A. Executive Officer
  2. Secretary
  3. Programmer
**/

package com.atech.trial1;

import java.util.Scanner;


class GetSet
{
	private float monthly;
	private float performance;
	public float getMonthly() {
		return monthly;
	}
	public void setMonthly(float monthly) {
		this.monthly = monthly;
	}
	public float getPerformance() {
		return performance;
	}
	public void setPerformance(float performance) {
		this.performance = performance;
	}	
}

abstract class Employee
{
	protected float salary=0;
	protected float bonus=0;
	protected float monthly=0;
	protected float performance=0;
	/**Scanner sc = new Scanner(System.in);
	GetSet gs = new GetSet();
	public void getSet(int i)
	{
	    if(i==1)
	    {
			System.out.println("Enter the Manager's monthly salary");
			monthly = sc.nextFloat();
			gs.setMonthly(monthly);
			
			System.out.println("Enter the Manager's performance");
			performance=sc.nextFloat();
			gs.setPerformance(performance);
	    }
	    
	    if(i==2)
	    {
			System.out.println("Enter the Executive Officer's monthly salary");
			monthly = sc.nextFloat();
			gs.setMonthly(monthly);
			
			System.out.println("Enter the Executive Officer's performance");
			performance=sc.nextFloat();
			gs.setPerformance(performance);
	    }
	    
	    if(i==3)
	    {
			System.out.println("Enter the Secretary's monthly salary");
			monthly = sc.nextFloat();
			gs.setMonthly(monthly);
			
			System.out.println("Enter the Executive Officer's performance");
			performance=sc.nextFloat();
			gs.setPerformance(performance);
	    }
	 
	    if(i==4)
	    {
			System.out.println("Enter the Programmer's monthly salary");
			monthly = sc.nextFloat();
			gs.setMonthly(monthly);
			
			System.out.println("Enter the Executive Officer's performance");
			performance=sc.nextFloat();
			gs.setPerformance(performance);
	    }
	 
	}**/
	abstract public float annualSalary();
	abstract public float annualBonus();
	
}

class Manager extends Employee
{
	Scanner sc = new Scanner(System.in);
	GetSet gs = new GetSet();
	public void getSet()
	{
	       	System.out.println("Enter the Manager's monthly salary");
			monthly = sc.nextFloat();
			gs.setMonthly(monthly);
			
			System.out.println("Enter the Manager's performance");
			performance=sc.nextFloat();
			gs.setPerformance(performance);
	}
	    

	@Override
	public float annualBonus()
	{
		bonus = ((gs.getPerformance()/100)* salary);
		System.out.println("The Bonus is : " +bonus);
		bonus = salary + bonus;
		System.out.println("Salary along with Bonus is : " +bonus + "\n");
		return bonus;
	}
	@Override
	public float annualSalary()
	{
		salary = gs.getMonthly()*12;
		System.out.println("The salary is : " +salary);
		return salary;
	}
	
}

class ExecutiveOfficer extends Manager
{
	Scanner sc = new Scanner(System.in);
	GetSet gs = new GetSet();
	public void getSet()
	{
		System.out.println("Enter the Executive Officer's monthly salary");
		monthly = sc.nextFloat();
		gs.setMonthly(monthly);
		
		System.out.println("Enter the Executive Officer's performance");
		performance=sc.nextFloat();
		gs.setPerformance(performance);
	}
}

class Secretary extends Employee
{
	Scanner sc = new Scanner(System.in);
	GetSet gs = new GetSet();
	public void getSet()
	{
		System.out.println("Enter the Secretary's monthly salary");
		monthly = sc.nextFloat();
		gs.setMonthly(monthly);
		
		System.out.println("Enter the Executive Officer's performance");
		performance=sc.nextFloat();
		gs.setPerformance(performance);
	}
	@Override
	public float annualBonus()
	{
		bonus = ((gs.getPerformance()/100)* salary);
		System.out.println("The Bonus is : " +bonus);
		bonus = salary + bonus;
		System.out.println("Salary along with Bonus is : " +bonus + "\n");
		return bonus;
	}
	@Override
	public float annualSalary()
	{
		salary = gs.getMonthly()*12;
		System.out.println("The salary is : " +salary);
		return salary;
	}
}

class Programmer extends Employee
{
	Scanner sc = new Scanner(System.in);
	GetSet gs = new GetSet();
	public void getSet()
	{
		System.out.println("Enter the Programmer's monthly salary");
		monthly = sc.nextFloat();
		gs.setMonthly(monthly);
		
		System.out.println("Enter the Executive Officer's performance");
		performance=sc.nextFloat();
		gs.setPerformance(performance);
	}
	@Override
	public float annualBonus()
	{
		bonus = ((gs.getPerformance()/100)* salary);
		System.out.println("The Bonus is : " +bonus);
		bonus = salary + bonus;
		System.out.println("Salary along with Bonus is : " +bonus + "\n");
		return bonus;
	}
	@Override
	public float annualSalary()
	{
		salary = gs.getMonthly()*12;
		System.out.println("The salary is : " +salary);
		return salary;
	}
}

public class InheritanceEmployee 
{
	public static void main(String[] args)
	{
		int choice=0;
		System.out.println("There are the people whose Salary and Bonus can be calculated using their Monthly income and the percentage of performance that ll add up to their bonus:\n");
		while(choice != 5)
		{
		System.out.println("1. Manager \n2. Executive Officer \n3. Secretary \n4. Programmer \n5. Exit\n\nMake your choice :");
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		
		switch(choice)
		{
			case 1:
			{
				Manager m = new Manager();
				m.getSet();
				m.annualSalary();
				m.annualBonus();				
				break;
			}
			case 2:
			{
				ExecutiveOfficer eo = new ExecutiveOfficer();
				eo.getSet();
				eo.annualSalary();
				eo.annualBonus();
				break;
			}
			case 3:
			{
				Secretary s = new Secretary();
				s.getSet();
				s.annualSalary();
				s.annualBonus();
				break;
			}
			case 4:
			{
				Programmer p = new Programmer();
				p.getSet();
				p.annualSalary();
				p.annualBonus();
				break;
			}
			default:
			{
				System.out.println("Please enter a choice mentioned above. :)");
				break;
			}				
		}
		}
	}
}
