package sorting;

import java.util.Scanner;
/**
 * Name  	: Amit Saroj
 * Topic 	: sorting
 * Subtopic : InsertionSort.java	(analogous to group of playing cards sorted in hand while picking.)
 */
public class InsertionSort {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter Size of the array");
		int size = n.nextInt();
		System.out.println();
		
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = n.nextInt();
		}
		
		
		//Insertion Sort
		int current;
		for(int i=0; i<=arr.length-1; i++){
			current = arr[i];
			int j = i-1;
			while(j>=0 && arr[j] > current){
				arr[j+1] = arr[j];				//shifting element like playing card in hand is shifted if it is greater;
				j--;
			}
			arr[j+1] = current;			//j+1 because in while loop j is already decremented;
		}
		
		
		//Printing sorted array.
		System.out.println();
		System.out.println("Sorted array is...");
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		n.close();
	}

}
