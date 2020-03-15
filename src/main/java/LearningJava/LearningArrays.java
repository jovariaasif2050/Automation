package LearningJava;

public class LearningArrays {

	public static void main(String[] args) {
		/*
		 	Arrays:

			int [] values = new int[100];

			^ in the above line, we declared “values” to be an int of type array [] 

			Array allows us to store multiple values. 
			new int[100]; 
			Value inside the brackets decide how many values we can store inside the array.
	
			So, in the example above we have 100 position slots. Starts with 0 zero index position. Ending at 99 index position.

		 */
		
		int [] values = new int[100];
		values[0] = 1000;
		values[1] = 90899;
		values[99] = 99325;
		
		System.out.println(values[99]);
		// System.out.println(value[100]); will give you an error because index position 100 doesn't exist.

	String [] words = new String[] {"My", "Name", "is"};
	System.out.println(words[2]);
	// expecting "is" as the answer
	
	
	String [] newWords = new String[3];
	newWords[0] = "My";
	newWords[1] = "Name";
	newWords[2] = "is";
	
	System.out.println(words[2]);
	// expecting "is" as the answer
	}

}
