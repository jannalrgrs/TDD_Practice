
public class fizzbuzzClass {

	public static String fizzBuzzProcess (int input)
	{
		//build test cases	
	/*if ((Mod(input, 3) == 0) && (Mod(input,5) == 0)) //goes up top because computers go in order
	return "fizzbuzz";*/
	
		String output = "";
		
	if (Mod(input,3) == 0)
		output += "fizz";
	
	if (Mod(input,5) == 0) 
		output += "buzz";
		

	
		//return Integer.toString(input);
	
	//? is like a compacted if statement, if not true returns what's after the question mark
	//***?(ternary)*** true : false 
	//     condition(output.equals)  returns if true
	return output.equals("") ? Integer.toString(input): output;
	}

		public static int Mod(int x, int y) {
			return x%y;
		}
	}
	
