package com.atech.newdimension;

import java.util.Scanner;

public class NumberNotPresent {
 
       public static void main(String[] args) {
              NumberNotPresent n = new NumberNotPresent();
              n.insertNumbers();
       }
       public void check(int[] set1, int[] set2){
              int count;
              for(int i=0;i<set1.length;i++){
                     count=0;
                     for(int j=0;j<set2.length;j++){
                           if(set1[i]==set2[j]){
                                  count++;
                           }                   
                     }
                     if(count==0){
                           System.out.println(set1[i] + " is missing.");
                     }
              }
       }
      
       public void insertNumbers(){
              int count1, count2,i=0,ctr=1;
              int[] set1 = null, set2 = null;
              Scanner scan = new Scanner(System.in);
              System.out.println("How many numbers would you be needing in your first set?");
              count1 = scan.nextInt();
              set1 = new int[count1];
              while(i<count1){
                     System.out.println("Enter number " +ctr+ " : ");
                     set1[i] = scan.nextInt();
                     i++;ctr++;
              }
              ctr=1;i=0;
              System.out.println("How many numbers would you be needing in your second set?");
              count2 = scan.nextInt();
              set2 = new int[count2];
              while(i<count2){
                     System.out.println("Enter number " +ctr+ " : ");
                     set2[i] = scan.nextInt();
                     i++;ctr++;
              }     
              display(set1, set2);
              check(set1, set2);
             
       }
       public void display(int[] set1, int[] set2){
              System.out.println("The first set contains : ");
              for(int i=0;i<set1.length;i++){
                     System.out.println(set1[i]);
              }
              System.out.println("The second set contains : ");
              for(int i=0;i<set2.length;i++){
                     System.out.println(set2[i]);
              }
       }
      
}
 
