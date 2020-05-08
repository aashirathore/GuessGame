import java.util.Scanner;
import java.util.Random;

class GuessGame {
	static int objCount;
	static double end=100;
	static double guess, actual;
	static public void setInitialValue() {
		objCount++;
		actual =(double) (new Random().nextInt((int)end)+1);
	}
	void setGuess(double g) {
		guess = g;
	}
	boolean validateGuess() {
		if(guess == actual) {
			System.out.println("You are Genius");
			return true;
		}
		else {
			if(guess<actual) {
				System.out.println("Your guess is lower then actual");
			}
			else {
				System.out.println("Your guess is higher then actual");
			}
			return false;
		}
	}
}
class StaticMembersExample {
	public static void main(String args[]) {
		GuessGame gg1 = new GuessGame();
		gg1.setInitialValue();
		System.out.println("Total Objects of Guess Game = "+GuessGame.objCount);
		Scanner sobj  = new Scanner(System.in);
		boolean f = true;
		for(int i=1;i<=7;i++) {
			System.out.print("Enter Your Guess (1-100) :");
			gg1.setGuess(sobj.nextDouble());
			f = gg1.validateGuess();
			if(f) {
				break;
			}
		}
		if(!f) {
			System.out.println("No Luck!!! Try Again");
		}
		GuessGame gg2 = new GuessGame();
		gg2.setInitialValue();
		System.out.println("Total Objects of Guess Game = "+gg1.objCount);
		System.out.println("Total Objects of Guess Game = "+gg2.objCount);
	}
}