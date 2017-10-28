package com.atech.newdimension;
 
import java.util.Scanner;
 
public class NumberRepetition {
 
      
       public static void main(String[] args) {
              int choice=0, pos=0;
              int[] a = new int[20];
              Scanner scan = new Scanner(System.in);         
              while(choice!=2){
              System.out.println("Do you want to enter a number? If yes, press 1, if no, press 2");
              choice = scan.nextInt();
              if(choice==1){
              System.out.println("Enter the number:");
              a[pos]=scan.nextInt();
              System.out.println("The number list");
              for(int l=0;l<=pos;l++){
                     System.out.print(a[l] + " ");                  
              }
              System.out.println("Pos : "+pos);
              pos++;       
              }     
              }     
              if(choice==2){
           	   System.out.println("Input list : ");
                     for(int l=0;l<pos;l++){
                           System.out.print(a[l] + " ");
                           System.out.println();
                     } 
              System.out.println("Length : " +pos);
              int maxlength = 0, present=0;
              if(a[pos-1] > pos){
            	  maxlength = a[pos-1];            	  
              }
              else
              {
            	  maxlength = pos;
              }
              System.out.println("Maximum Length:" +maxlength);
              for(int m=1;m<=maxlength;m++){
            	  present=0;
            	  for(int n=0;n<=pos;n++){
            		  if(m == a[n]){
            			  present++;
            		  }            		  
            	  }
            	  if(present == 0){
        			  System.out.println("The number " +m +" is missing.");
        		  }
            	  if(present > 1){
            		  System.out.println("The number " +m +" is repeated.");
            	  }
            }                   
       }
       } 
}