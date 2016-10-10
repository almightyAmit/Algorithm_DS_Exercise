package sorting;

import java.util.Scanner;

/**
 * Name  	: Amit Saroj
 * Topic 	: sorting
 * Subtopic : BubbleSort.java 
 */
public class BubbleSort {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the Size of array.");
		int size = n.nextInt();
		System.out.println();
		
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = n.nextInt();
		}
		
		//Bubble Sort
		int temp;
		// All elements are sorted in this loop itself with the help of second loop
		for(int i=0; i<arr.length-1; i++){
			for(int j=i+1; j<arr.length; j++){
				if(arr[i] > arr[j]){
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		
		//printing sorted array
		System.out.println();
		System.out.println("The sorted array is...");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		n.close();
	}

}
