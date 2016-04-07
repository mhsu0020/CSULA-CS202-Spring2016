import java.util.Scanner;

/*
 * Ask the user how many names they want to type in
Read in the number of names that the user specified
Pick a random name from the names that the user entered
Display a partially masked word - that is, show two random characters in the name, replace all the other characters with underscore. For example, j _ _ _ n for jason, m _ k _ for mike.
Ask the user to guess a name.
If the entered name is the randomly chosen name, print out a congrats message then end the program.
If the user made a mistake, ask them to try again until they get it correct.
 * */
public class Quiz2 {
	public static void main(String[] args){

		int numberOfFoodItems = 4;

		String[] foodItemNames = new String[100];
		int[] foodItemCount = new int[100];

		foodItemNames[numberOfFoodItems] = "pizza";
		foodItemCount[numberOfFoodItems] = 5;
		numberOfFoodItems++;


		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the number names:");
		int numberOfNames = scanner.nextInt();
		String[] names = new String[numberOfNames];
		for (int i = 0; i < names.length; i++) {
			names[i] = scanner.next();
		}
		String randomName = names[(int)(Math.random() * numberOfNames)];
		String nameWithUnderscores = "";

		int firstChar = (int)(Math.random() * randomName.length());
		int secondChar = (int)(Math.random() * randomName.length());

		for (int i = 0; i < randomName.length(); i++) {
			if(i==firstChar || i == secondChar){
				nameWithUnderscores+=randomName.charAt(i);
			} else{
				nameWithUnderscores+="_";
			}
		}
		boolean didTheyGuessIsRight = false;
		while(!didTheyGuessIsRight){
			System.out.println("Guess the name:");
			System.out.println(nameWithUnderscores);
			String guessed = scanner.next();
			if(guessed.equals(randomName)){
				System.out.println("You win!");
				didTheyGuessIsRight = true;
			}

		}
		scanner.close();


	}

}
