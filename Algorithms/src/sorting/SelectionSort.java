package sorting;

import java.util.*;

/**
 * Name  	: Amit Saroj
 * Topic 	: sorting
 * Subtopic : SelectionSort.java (Select the smallest/(largest in case of descending) element and swap it to appropriate position).
 */
public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the Size of an Array");
		int size = n.nextInt();
		System.out.println();
		
		int[] arr = new int[size];
		
		for(int i=0; i<arr.length; i++){
			arr[i] = n.nextInt();
		}
		
		
		//Selection Sorting
		int temp;
		int smallestP = 0;
		for(int i=0; i<arr.length; i++){
			smallestP = i;							//initializing the smallestP with first element of the array;
			for(int j=i; j<arr.length; j++){
				if(arr[smallestP] > arr[j]){
					smallestP = j; 					
				}
			}
			temp = arr[i];
			arr[i] = arr[smallestP];
			arr[smallestP] = temp;
		}
		
		//Printing the sorted array;
		System.out.println();
		System.out.println("Sorted Array..");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
		n.close();
	}

}
