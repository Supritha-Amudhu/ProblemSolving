package com.atech.logicsolving;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class LiveRampTest2 {
	
	public int solution(int[] A) {
		int minDays = 0;
			Set<Integer> locationSet = new HashSet();
			for(int i:A){
				locationSet.add(i);
			}
			Set<Integer> locationSetCopy = new HashSet<Integer>();
			for(int i=0;i<A.length;i++){
				locationSetCopy.addAll(locationSet);
				int tempMinDays = 0;
				for( int j=i;j<A.length;j++){
					tempMinDays++;
					if(locationSetCopy.contains(A[j])){
						locationSetCopy.remove(A[j]);
					}
					if(locationSetCopy.isEmpty()){
						break;
					}
				}
				if(i==0){
					minDays = tempMinDays;
				}
				else{
					if(tempMinDays<minDays && locationSetCopy.isEmpty()){
						minDays = tempMinDays;
					}
				}			
			}		
		return minDays;       
    }
}
