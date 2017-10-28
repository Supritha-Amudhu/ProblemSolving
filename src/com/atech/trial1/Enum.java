package com.atech.trial1;
//http://javarevisited.blogspot.in/2011/08/enum-in-java-example-tutorial.html
/*
class EnumExample
{
	enum Favorites  {Harry, Ronald, Hermione, Supritha};
	Favorites sampleobject;
}


public class Enum 
{	
	
	public static void main(String[] args) 
	{
		 EnumExample enum1 = new EnumExample();
		 enum1.sampleobject = EnumExample.Favorites.Harry;
		 System.out.print(enum1.sampleobject+ " likes ");
		 enum1.sampleobject = EnumExample.Favorites.Supritha;
		 System.out.println(enum1.sampleobject);
		 
	}
	
}
*/


class EnumTest
{

}


public class Enum 
	{
	enum Destiny {HarryPotter, HungerGames, NicholasSparks, GameOfThrones, DanBrown, SidneySheldon};
	Destiny d;
	
	private Enum(Destiny d)
	{
		this.d = d;
	}
	
	public void theNature()
	{
		switch(d)
		{
		case HarryPotter :
		{
			System.out.println("Harry Potter is life, no matter what.");
			break;
		}
		case HungerGames :
		{
			System.out.println("Every girl ought to be like Katniss, like the Mockinjay.");
			break;
		}
		case NicholasSparks :
		{
			System.out.println("Love like never. Makes you cry every single time, creates a deception that a non-lovable life can never exist.");
			break;
		}
		case GameOfThrones :
		{
			System.out.println("I'm yet to be amazed by it.");
			break;
		}
		case DanBrown :
		{
			System.out.println("Brains no one can get nowhere.");
			break;
		}
		case SidneySheldon :
		{
			System.out.println("Women power is mighty.");
			break;
		}
		default :
		{
			System.out.println("You have not lived your life.");
			break;
		}
	}
	
	
}
		
		public static void main(String[] args) 
		{
			Enum always = new Enum(Destiny.HarryPotter);
			always.theNature();
			Enum odds = new Enum(Destiny.HungerGames);
			odds.theNature();
			Enum crypto = new Enum(Destiny.DanBrown);
			crypto.theNature();
			Enum determined = new Enum(Destiny.SidneySheldon);
			determined.theNature();
			Enum lovealways = new Enum(Destiny.NicholasSparks);
			lovealways.theNature();
			Enum nil = new Enum(Destiny.GameOfThrones);
			nil.theNature();
			
		}
	}

		