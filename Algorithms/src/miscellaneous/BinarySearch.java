package miscellaneous;

import java.util.Scanner;

/**
 * Name  	: Amit Saroj
 * Topic 	: miscellaneous
 * Subtopic : BinarySearch.java
 * Complexity : Log n
 */
public class BinarySearch {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size = n.nextInt();
		System.out.println();
		
		int[] arr = new int[size];
		for(int i=0; i<arr.length; i++){
			arr[i] = n.nextInt();
		}
		
		System.out.println();
		System.out.println("Enter the element to search in the element");
		int element = n.nextInt();
		System.out.println();
		
		//Binary Search
		int max = size -1;
		int min = 0;
		int midpoint = (max+min)/2;
		while(min <= max){
			if(arr[midpoint] == element){
				System.out.println("Element is present at "+(midpoint+1)+ " position.");
				break;
			}
			else{
				
				if(arr[midpoint]<element){
					min = midpoint + 1;
					midpoint = (max+min)/2;
				}
				else{
					max = midpoint -1;
					midpoint = (max+min)/2;
				}
			}
		}
		if(min>max){
			System.out.println("Element not present");
			
		}
	}

}
