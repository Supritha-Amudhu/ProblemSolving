package com.atech.newdimension;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;


public class MapCheck {
	
public static Map<Integer, Integer> inputMap = new TreeMap<Integer, Integer>();

	public static void main(String[] args) {
		try {
			getUserInput();
			
		} catch (Exception e) {
			System.out.println("Exception caught.");
			e.printStackTrace();
		}
	}
	
	public static void getUserInput() throws Exception{
		Scanner scan = new Scanner(System.in);
		int noOfEvents = 0, loop=0;
		System.out.println("Enter the number of events : ");
		noOfEvents = scan.nextInt();
		EventDetails[] eventObject = new EventDetails[noOfEvents];
		
		while(loop<noOfEvents){
			eventObject[loop] = new EventDetails();
			eventObject[loop].setEventNo(loop+1);
			System.out.println("Loop : "+loop);
			System.out.println("Enter the starting date of event "+(loop+1)+  " : ");
			eventObject[loop].setStartDate(scan.nextInt());
			System.out.println("Enter the duration of event "+(loop+1)+  " : ");
			eventObject[loop].setDuration(scan.nextInt());
			inputMap.put(eventObject[loop].getDuration(),loop+1);
			loop++;
		}			
			
	}
	public static void checkForConflicts(int number1, int number2){
		Set<Entry<Integer, Integer>> set = inputMap.entrySet();
		Iterator<Entry<Integer, Integer>> itr = set.iterator();
		while(itr.hasNext()){
			Map.Entry me = (Map.Entry)itr.next();
			
		}
	}
}

class EventDetails{
	
	private int eventNo =0;
	private int startDate =0;
	private int duration=0;
	
	public int getEventNo() {
		return eventNo;
	}
	public void setEventNo(int eventNo) {
		this.eventNo = eventNo;
	}
	public int getStartDate() {
		return startDate;
	}
	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
}