package lab8;

import java.util.Scanner;

public class Lab8 {
	// Get info on Classmates
//Need to make 3 arrays (stuNames, favFood, studNum)
	// Atleast 7 people in the class
	static Scanner sc = new Scanner(System.in);
	static String cont;
	static String[] favFood = { "Spahgetti", "Chicken Parm", "Pancakes", " Mozarella Sticks", "Cake", "Dog Food",
			"Tuna" };
	static String[] stuNames = { "Steve", "Chris", "Zoe", "Forest", "Nicole", "Kelly", "Declan" };
	static String[] homeTown = { "Detroit", "Queens", "San Francisco", "Port Huron", "Hamtramck", "Ferndale",
			"Thunder Bay" };
	// make this the same variable as the one below
//+ ",  Favorite #: " + favNum[i] + ", Favorite Food: " + favFood[i]
//	int userOption = Validator.getInt(sc, "\n Pick a student (#1-7)", 1, stuNames.length);

	public static void main(String[] args) {
		begin();
	}

	public static String begin() {
		System.out.println("Hello user, these are the new recruits you should learn about ");
		System.out.println("Pick a number to choose a student");

		for (int i = 0; i < stuNames.length; i++) {
			System.out.println("Student: " + stuNames[i]);
		}
		int userOption = Validator.getInt(sc, "\n Pick a student (#1-7)", 1, stuNames.length);

		String output = (stuNames[userOption - 1])
				+ "  Would you like to learn their favorite food? Or their hometown? (food/hometown)";
		System.out.println(output);

		// foodTown();
		// return output;
///Match the number a user selects to a students info;
//		// show food match for selection
//		System.out.println(stuNames[userOption - 1] + "'s Favorite food is " + favFood[userOption - 1] + ".");
//		System.out.println("Would you like to find out " + stuNames[userOption - 1] + "'s hometown? (yes/no)");
//
//		if (cont.equalsIgnoreCase("yes")) {
//			System.out.println(stuNames[userOption - 1] + "'s hometown is " + homeTown[userOption - 1] + ".");
//		}
//		if (cont.equalsIgnoreCase("no")) {
//			System.out.println("yeesh, okay buh bye!");
//		}

		// public static String foodTown() {

		String cont = sc.next();
		if (cont.equalsIgnoreCase("Food")) {
			System.out.println(stuNames[userOption - 1] + "'s Favorite food is " + favFood[userOption - 1] + ".");
			System.out.println("Would you like to find out " + stuNames[userOption - 1] + "'s hometown? (yes/no)");
			String cont2 = sc.next();
			if (cont2.equalsIgnoreCase("yes")) {
				System.out.println(stuNames[userOption - 1] + "'s hometown is " + homeTown[userOption - 1] + ".");
			}
			if (cont2.equalsIgnoreCase("no")) {
				System.out.println("yeesh, okay buh bye!");
			}
		}

		if (cont.equalsIgnoreCase("Hometown")) {
			System.out.println(stuNames[userOption - 1] + "'s hometown is " + homeTown[userOption - 1] + ".");
			System.out.println("Would you like to find out " + stuNames[userOption - 1] + "'s Favorite food? (yes/no)");
			String cont3 = sc.next();
			if (cont3.equalsIgnoreCase("yes")) {
				System.out.println(stuNames[userOption - 1] + "'s Favorite food is " + favFood[userOption - 1] + ".");
			}
			if (cont3.equalsIgnoreCase("no")) {
				System.out.println("yeesh, okay buh bye!");
			}

		}
		System.out.println("want to learn about another student? (yes/no)");
		String cont4 = sc.next();
		if (cont4.equalsIgnoreCase("yes")) {
			begin();
		}
		if (cont4.equalsIgnoreCase("no")) {
			System.out.println("Good Bye!");
		}
		return "Thanks for Playing";
	}
}
