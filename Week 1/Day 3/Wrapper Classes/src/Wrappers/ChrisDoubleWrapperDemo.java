package Wrappers;

public class ChrisDoubleWrapperDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		Double maxVal = Double.MAX_VALUE; // 1.7976931348623157 E 308
		Double minVal = Double.MIN_VALUE; // 4.9 E -324
		System.out.println(minVal);
		
		/*
		 * Context: Dr. Vinay's lecture on Heap Memory that applies
		 * to wrapper classes for primitives
		 * 
		 */
		
		Double el1 = 10d;
		Double el2 = 10d;
		Double el3 = new Double(10);
		
		// check to see if Double objects are the same as primitives
		System.out.println("el1 == el2: " + (el1 == el2)); // false
		System.out.println("el1 == el2: " + (el1 == el3)); // false
		// all are false. Double objects create different addresses each time.
		// just like FLoat!
		
		// check to see if values in memory address are the same
		System.out.println("(el1.equals(el2)) : " + (el1.equals(el2))); //true
		System.out.println("(el1.equals(el3)) : " + (el1.equals(el3))); //true
		// yes, the values of the objects are the same
		// Just like Float and Long
		
		// check to see if memory addresses are the same
		System.out.println(System.identityHashCode(el1)); //1869997857
		System.out.println(System.identityHashCode(el2)); //1763847188
		System.out.println(System.identityHashCode(el3)); //1617791695
		// all of the addresses for the doubles are different
		// The addresses are the exact same as that of Floats!!
		
		// if we change el2's value will it point to the same address?
		el2++;
		System.out.println(System.identityHashCode(el2)); //125993742
		// no, it doesn't. Therefore, it changed locations in heap memory
		// The other value will be garbage collected
		// however the new memory location is the same as that for Floats
		
		//<<<<<<<<	AUTOBOXING >>>>>>>> NEED HELP!
		
		//autoboxing = changing a primitive to an object of the wrapper class
		// the following looks like unboxing
		System.out.println("Currently, this is what el2 is equal to: " + el2); // ll.0
		double x = el2;
		System.out.println("x = " + x); // x = 11.0
		System.out.println("Is el2 a Double object?" + (el2 instanceof Double)); // true
		// el2 is still a double
		// same for floats....
		x = 7;
		System.out.println("After x = 7: " + el2);
		// System.out.println("Is x a Double object?" + (x instanceof Double));
		// x is still a float primitive, not a FLOAT object
		
		el2 = x;
		System.out.println("el2 = " + el2); // l2 = 7
		System.out.println("Are x and el2 the same values?" + (el2 == x));
		// automatic conversion happened here!
		//QUESTION: but why do they share the same address? Does it convert then compare addresses?
		
		System.out.println("Are x and el2 the same?" + (el2.equals(x)));
		System.out.println("Is el2 still a Double object?" + (el2 instanceof Double));
		// System.out.println("Is el2 a Double object?" + (x instanceof Double));
		// the point is that calculations can still be done between primitives
		// and their wrapper values....Java will automatically convert
		
		/* 
		*/
		
	}

}
