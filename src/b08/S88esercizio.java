package b08;

import java.util.Scanner;

public class S88esercizio {
	

	    public static void main (String[] args) {  
	        Scanner input=new Scanner(System.in);
	        System.out.println("Enter the size of array:");
	        int n=input.nextInt();
	        double total=0;
	        double array[]=new double[n]; 
	        System.out.println("Enter the elements one by one:");
	        for (int s=0;s<array.length;s++){
	            array[s]=input.nextDouble();
	        }
	        for(int i=0;i<array.length;i++){
	            total=total+array[i];
	        }
	        input.close ();
	        double average=total/n;
	        System.out.println("The average value is:"+average);
	        
	    }  
	}
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		int size = 0;
//		double somma = 0;
//		double average = 0;
//		
//		
//		System.out.println("Enter the number of size of array");
//
//		while (scanner.hasNext()) {
//			if (scanner.hasNext()) {
//				size = scanner.nextInt();
//			} else {
//				System.out.println("Bad input, the number of size should be greater than 0");
//			}
//		}
//		int[] array = new int[size];
//		System.out.println("Enter the array element");
//		while (scanner.hasNext()) {
//			if (scanner.hasNextDouble()) {
//				somma += scanner.nextDouble();
//				
//			} else {
//				System.out.println("Bad input, discarded: " + scanner.next());
//			average = somma / size;
//			scanner.close();
//			System.out.println("Average: " + average);
//		}
//	}
//}
//}