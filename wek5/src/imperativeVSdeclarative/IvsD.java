package imperativeVSdeclarative;

import java.util.Arrays;

public class IvsD {
		//Find the even numbers sum

		//Imperative programming

		public static void main(String[] args) {

		// Step 1: Count even numbers to determine new array size

		int[] array1 = new int[] {2, 2, 3, 3, 6};

		int count = 0;

		for (int num: array1) {

			if (num%2==0) {

				count++;

			}

		}

		// Step 2: Create a new array for even numbers

		int[] evenArray1= new int[count];

		int index = 0;

		for (int num: array1) {

			if (num % 2 == 0) {

				evenArray1 [index++] = num;

			}
		}
		
		//Step 3 : Print the result
		System.out.println(Arrays.toString(evenArray1));
		
		//Find the even number sum
		//Declarative programming
		int[] array = new int[] {2,4,6,8,10,11};
		int[] evenArray = Arrays.stream(array)
				.filter(a->a % 2 == 0)
				.toArray();
			System.out.println(Arrays.toString(evenArray));
		
			
			//More Function
			//Sum of even number 
				int sumEven = Arrays.stream(evenArray).sum();
				System.out.println("Sum of even number:" + sumEven);
				
			//Count the number of even number
				long countEven = Arrays.stream(evenArray).count();
				System.out.println("Number of even number: "+ countEven);
			
				//Sort the even numbers
				Arrays.sort(evenArray);
				System.out.println("Sorted even numbers : "+ Arrays.toString(evenArray));
			
		}
	}
