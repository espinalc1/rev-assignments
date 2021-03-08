package Wrappers;

/*Assignment Wrapper classes -> 
 Try the same above with Float, 
						 Double and 
						 Long classes
*/
public class ChrisLongWrapperDemo {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		
		Long maxVal = Long.MAX_VALUE; // 9223372036854775807
		Long minVal = Long.MIN_VALUE; //-9223372036854775808
		System.out.println(minVal);
		
		/*
		 * Context: Dr. Vinay's lecture on Heap Memory that applies
		 * to wrapper classes for primitives
		 * 
		 */
		
		Long el1 = 10L;
		Long el2 = 10L;
		Long el3 = new Long(10);
		
		// check to see if Long objects are the same as primitives
		System.out.println("el1 == el2: " + (el1 == el2)); // true
		System.out.println("el1 == el2: " + (el1 == el3)); // false
		// the last one was cloned and therefore a different obj in Heap
		
		// check to see if values in memory address are the same
		System.out.println("(el1.equals(el2)) : " + (el1.equals(el2))); //true
		System.out.println("(el1.equals(el3)) : " + (el1.equals(el3))); //true
		// yes, the values of the objects are the same
		
		
		// check to see if memory addresses are the same
		System.out.println(System.identityHashCode(el1)); //971848845
		System.out.println(System.identityHashCode(el2)); //971848845
		System.out.println(System.identityHashCode(el3)); //1910163204
		// the memory addresses are the same for the first two but the 
		// last is a different address. This is because it was cloned.
		
		// if we change el2's value will it point to the same address?
		el2++;
		System.out.println(System.identityHashCode(el2)); //305623748
		// no, it doesn't. Therefore, it changed locations in heap memory
		// since it changed values. The other value will be garbage collected
		
		//<<<<<<<<	AUTOBOXING >>>>>>>> NEED HELP!
		
		//autoboxing = changing a primitive to an object of the wrapper class
		// the following looks like unboxing
		System.out.println("Currently, this is what el2 is equal to: " + el2); // ll
		long x = el2;
		System.out.println("x = " + x); // x = 11
		System.out.println("Is el2 a Long object?" + (el2 instanceof Long)); // true
		// el2 is still a Long
		x = 7;
		System.out.println("After x = 7: " + el2);
		// System.out.println("Is x a Long object?" + (x instanceof Long));
		// x is still a long primitive, not a Long object
		
		el2 = x;
		System.out.println("el2 = " + el2); // l2 = 7
		System.out.println("Are x and el2 the same?" + (el2 == x));
		System.out.println("Are x and el2 the same?" + (el2.equals(x)));
		System.out.println("Is el2 a Long object?" + (el2 instanceof Long));
		//System.out.println("Is el2 a Long object?" + (x instanceof Long));
		// the point is that calculations can still be done between primitives
		// and their wrapper values....Java will automatically convert
	}
}
