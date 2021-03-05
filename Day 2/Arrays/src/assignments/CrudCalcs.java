package assignments;

//import java.util.Arrays;
import java.util.Scanner;


public class CrudCalcs {
	// this should accept an array, and the user should be able to create, retrieve,
	// update, delete
	// create
	
	// public static int[] userArray;
	/*
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		userArray = createArray(s);
		int[] newArray = insert(s, userArray);
		System.out.println(Arrays.toString(newArray));
		s.close();
	}
	*/
	public static int[] createArray(Scanner sc) {
		System.out.println("Type in the number of array elements:");
		int len = sc.nextInt();
		
		int[] newArray = new int[len];
		System.out.println("Type in the array elements: ");
		for (int i = 0; i < len; i++) {
			System.out.println("You have " + (len-i) + " left:");
			newArray[i] = sc.nextInt();
		}
		//System.out.println("The following is your newly created array:\n" + Arrays.toString(newArray));
		return newArray;
	}

	// retrieve - based on the index
	// does the user have to supply the array? probably....
	public static int retrieve(Scanner sc, int arr[]) {
		System.out.println("Type in the index of the element you want to retrieve:");
		int index = sc.nextInt();
		return arr[index];
	}

	// ask for user input
	public static int[] insert(Scanner sc, int oldArray[]) {
		// create new array with length + 1
		// figure out the position - the user will likely think of it as starting from 1, not 0 like the indices of an array
		// place items in the front
		// place elements in the back
		System.out.println("Type in a number you'd like to insert");
		int newNum = sc.nextInt();
		
		System.out.println("Where in the array would you like to place it?");
		int pos = sc.nextInt();
		
		int[] newArray = new int[oldArray.length + 1];
		//System.out.println("This is your new array: \n" + Arrays.toString(newArray));			
		
		// front
		for (int i = 0; i < pos-1; i++) {
			newArray[i] = oldArray[i];
		}
		//System.out.println(Arrays.toString(newArray));

		// insert at position
		newArray[pos - 1] = newNum;
		//System.out.println(Arrays.toString(newArray));

		// back
		for (int i = pos; i < oldArray.length + 1; i++) {
			newArray[i] = oldArray[i - 1];
		}
		//System.out.println(Arrays.toString(newArray));

		return newArray;
	}
	
	// a method that other methods can use
	public static int[] insert(int pos, int num, int oldArray[]) {
		// create new array with length + 1
		// figure out the position
		// place items in the front
		// place elements in the back
		// front
		int newLen = oldArray.length+1;
		int[] newArray = new int[newLen];
		//System.out.println("New array length = " + newLen);
		for (int i = 0; i < pos; i++) {
			newArray[i] = oldArray[i];
		}

		// insert at position
		newArray[pos] = num;
		//System.out.println("The Number you are trying to push is = " + num);
		//System.out.println("Here is the new Array data = " + Arrays.toString(newArray));
		// back
		for (int i = pos+1; i < newLen; i++) {
			newArray[i] = oldArray[i - 1];
		}
		//System.out.println("Here is the new Array data after the back is added= " + Arrays.toString(newArray));
		return newArray;
	}

	// push - a minor change to the above for more convenient array manipulations
	public static int[] push(int num, int newArray[]) {
		int pos = newArray.length; // length is always the last index number plus 1 so its outside of the array
		return insert(pos, num, newArray);
	}
	
	// delete
	public static int[] delete(int pos, int oldArray[]) {
		// create a new array with length - 1
		int[] newArray = new int[oldArray.length - 1];
		// j iterates through the old array
		for (int i = 0, j = 0; i < oldArray.length - 1; i++, j++) {
			if (i == pos) {
				j++;
				continue;
			} else {
				newArray[i] = oldArray[j];
			}
		}

		return newArray;
	}
}
