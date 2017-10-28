package com.atech.logicsolving;

import java.util.HashMap;

public class LiveRampTest1 {
	
	public static void main(String[] args){
		
	}
	
	public int solution(int[] T) {
		int maryCandiesType = 0;
		int maryCandies = 0;
		HashMap<Integer,Integer> candies = new HashMap();
		for(int i=0;i<T.length;i++){
			if(candies.containsKey(T[i])){
				int count = candies.get(T[i]);
				candies.put(T[i], count+1);
			}
			else{
				candies.put(T[i], 1);
			}
		}
		boolean half = true;
		boolean firstIteration = true;
		while(half){
			for(int i:candies.keySet()){
				if(candies.get(i)>=1){
					if(maryCandies<T.length/2){
						maryCandies++;
						if(firstIteration){
							maryCandiesType++;
						}
					}
					else{
						half = false;
						break;
					}
				}
			}
			if(maryCandiesType >= candies.size()){
				break;
			}
			firstIteration = false;
		}	
		return maryCandiesType;
        
    }

}
