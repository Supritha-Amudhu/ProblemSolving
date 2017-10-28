package com.atech.logicsolving;

import java.util.Arrays;

public class LiveRampTest {
	
	public static void main(String[] args){
		
	}
	
    public int solution(int[] A) {
        int result = 1;
    	Arrays.sort(A);
    	int i=0;
    	if(A[0]>=2 || A[A.length-1]<0){
    		result = 1;
    	}
    	else{
    		boolean found = false;
        	for(i=0;i<A.length;i++){
        		if(A[i+1]-A[i] > 1){
        			result = A[i]+1;
        			found = true;
        			break;
        		}	
        	}
        	if(found==false){
        		result = A[A.length-1]+1;
        	}
    	}	
    	return result;
    }

}
