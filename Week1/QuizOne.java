
public class QuizOne {

	public static void main(String[] args) {
		QuizOne.checkNumsLife(1000);
	}

	/*
	 * If the number that you're currently checking contains "42" anywhere in
	 * the number (e.g. 1423, 42098, 89764209), print out "life" (without double
	 * quotes), otherwise print out the number itself
	 */
	public static void checkNumsLife(int max) {

		for(int i=0; i<= max; i++){

			String numberToCheck = Integer.toString(i);

			if(numberToCheck.contains("42")){
				System.out.println("life");
			} else{
				System.out.println(numberToCheck);
			}


		}

	}

}
