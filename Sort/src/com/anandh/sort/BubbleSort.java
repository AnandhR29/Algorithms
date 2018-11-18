package com.anandh.sort;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayToSort = {5,8,1,6,9,2};
		int tmp=0;
		
		for(int i=0;i<arrayToSort.length;i++){
			for(int j=0;j<arrayToSort.length-i-1;j++){
				if(arrayToSort[j]>arrayToSort[j+1]){
					//swap 
					tmp = arrayToSort[j];
					arrayToSort[j] = arrayToSort[j+1];
					arrayToSort[j+1] = tmp;
				}
				
			}
		}
		
		for(int a: arrayToSort){
			System.out.println(a);
		}

	}
	
	

}
