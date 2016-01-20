import java.util.Random;
import java.util.Scanner;


public class MultiplcationTables {
	
	final static Random rad = new Random();
	/**
	 * generates a random number between given lower bound and upper
	 * bound (low and high)
	 * @param low
	 * @param high
	 * @return number between low and high
	 */
	private static int getNum(int low, int high) {
		int rnum = rad.nextInt() % (high-low + 1);
		if (rnum < 0){
			return (-1 * rnum) + low;
		}
		return rnum + low;
	}
	
	public static void main(String[] args) {
		//grabbing upper and lower bounds from the user
		Scanner s1 = new Scanner(System.in);
		System.out.print("Please enter a lower bound: ");
		int lowB = s1.nextInt();
		System.out.print("Please enter an upper bound: ");
		int upB = s1.nextInt();
		
		String input = "yes";
		// could also use a do...while (runs thru loop once then checks
		// condition)
		while(input.equalsIgnoreCase("yes")) {
			
			// shows the multiplication question to user
			int n1 = getNum(lowB, upB);
			int n2 = getNum(lowB, upB);
			System.out.print(n1 + " x " + n2 + " = ");
		
			// checking if the user's answer is correct
			int corans = n1*n2;
			int ans = s1.nextInt();
			if (ans == corans){
				System.out.println("Correct! :)");
			} else {
				System.out.println("Wrong! The correct answer is: " + 
						corans);
			}
			System.out.print("Would you like to continue (yes/no)? ");
			input = s1.next();
		}
	}
	
}
