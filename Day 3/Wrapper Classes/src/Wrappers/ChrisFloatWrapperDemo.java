package Wrappers;

public class ChrisFloatWrapperDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		Float maxVal = Float.MAX_VALUE; // 3.4028235 E 38
		Float minVal = Float.MIN_VALUE; // 1.4 E -45
		System.out.println(maxVal);
		
		
		/*
		 * Context: Dr. Vinay's lecture on Heap Memory that applies
		 * to wrapper classes for primitives
		 * 
		*/
		Float el1 = 10f;
		Float el2 = 10f;
		Float el3 = new Float(10);
		
		// check to see if Float objects are the same as primitives
		System.out.println("el1 == el2: " + (el1 == el2)); // false
		System.out.println("el1 == el2: " + (el1 == el3)); // false
		// all are false. Float objects create different addresses each time.
		
		// check to see if values in memory address are the same
		System.out.println("(el1.equals(el2)) : " + (el1.equals(el2))); //true
		System.out.println("(el1.equals(el3)) : " + (el1.equals(el3))); //true
		// yes, the values of the objects are the same
		
		
		// check to see if memory addresses are the same
		System.out.println(System.identityHashCode(el1)); //1869997857
		System.out.println(System.identityHashCode(el2)); //1763847188
		System.out.println(System.identityHashCode(el3)); //1617791695
		// all of the addresses for the floats are different
		// not the same as Long
		
		// if we change el2's value will it point to the same address?
		el2++;
		System.out.println(System.identityHashCode(el2)); //125993742
		// no, it doesn't. Therefore, it changed locations in heap memory
		// since it changed values. The other value will be garbage collected
		
		//<<<<<<<<	AUTOBOXING >>>>>>>> NEED HELP!
		
		//autoboxing = changing a primitive to an object of the wrapper class
		// the following looks like unboxing
		System.out.println("Currently, this is what el2 is equal to: " + el2); // ll.0
		float x = el2;
		System.out.println("x = " + x); // x = 11.0
		System.out.println("Is el2 a Float object?" + (el2 instanceof Float)); // true
		// el2 is still a float
		x = 7;
		System.out.println("After x = 7: " + el2);
		// System.out.println("Is x a Float object?" + (x instanceof Float));
		// x is still a float primitive, not a FLOAT object
		
		el2 = x;
		System.out.println("el2 = " + el2); // l2 = 7
		System.out.println("Are x and el2 the same values?" + (el2 == x));
		// automatic conversion happened here!
		//QUESTION: but why do they share the same address? Does it convert then compare addresses?
		
		System.out.println("Are x and el2 the same?" + (el2.equals(x)));
		System.out.println("Is el2 still a Float object?" + (el2 instanceof Float));
		// System.out.println("Is el2 a Float object?" + (x instanceof Float));
		// the point is that calculations can still be done between primitives
		// and their wrapper values....Java will automatically convert
		
		
	}

}
