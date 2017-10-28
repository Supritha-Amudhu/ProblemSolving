package com.atech.trial1;
import java.util.*;

public class collectionsTreeMapObjectWrap
{
	public static void main(String[] args)
	{
		Map<Integer, Mine> treeMap = new TreeMap<>();
		Mine object = new Mine("Harry Potter", "Ronald Weasley", "Hermione Granger", "Supritha Amudhu");
		treeMap.put(12, object);
		treeMap.put(10, new Mine("Daniel Radcliffe", "Rupert Grint", "Emma Watson", "Supritha Amudhu"));
		System.out.println(treeMap.toString());
	}
	
}
class Mine
{
	String Harry;
	String Ron;
	String Hermione;
	String Supritha;
	Mine(String Harry, String Ron, String Hermione, String Supritha)
	{
		this.Harry = Harry;
		this.Ron = Ron;
		this.Hermione = Hermione;
		this.Supritha = Supritha;
	}
	@Override
	public String toString()
	{
		return new String(Harry+ " " + Ron + " "+ Hermione + " " + Supritha);
	}
	public String getHarry() {
		return Harry;
	}
	public void setHarry(String harry) {
		Harry = harry;
	}
	public String getRon() {
		return Ron;
	}
	public void setRon(String ron) {
		Ron = ron;
	}
	public String getHermione() {
		return Hermione;
	}
	public void setHermione(String hermione) {
		Hermione = hermione;
	}
	public String getSupritha() {
		return Supritha;
	}
	public void setSupritha(String supritha) {
		Supritha = supritha;
	}
	
}
