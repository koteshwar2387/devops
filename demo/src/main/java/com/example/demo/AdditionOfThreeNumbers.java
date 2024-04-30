package com.example.demo;

public class AdditionOfThreeNumbers {
	 public static void main(String[] args) {
         int[] a = {20,30,50,60,10,70,25,25,65};
         
         for(int i=0;i<a.length;i++){
                 for(int j=i+1;j<a.length-2;j++) {
                 int sum = a[i]+a[j]+a[j+1];
                 if(sum==100) {
 System.out.println("AdditionOfThreeNumbers.main()" + a[i]  +a[j] + a[j+1] );
                         }
                 }
         }
 }

}
