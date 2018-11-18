package com.anandh.sort;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arrayToSort = {5,8,1,6,9,2};
		int minVal=0,minIndex=0, temp=0;
		
		for(int i=0;i<arrayToSort.length;i++){
			minVal =arrayToSort[i];
			for(int j=i+1;j<arrayToSort.length;j++){
				if(arrayToSort[j] < minVal){
					minVal = arrayToSort[j];	
					minIndex= j;
				}			
			}
			if(minVal < arrayToSort[i]){
				temp = arrayToSort[i];
				arrayToSort[i] = minVal;
				arrayToSort[minIndex] = temp;
			}
			
		}
		
		for(int a: arrayToSort){
			System.out.println(a);
		}

	}
	
	

}
