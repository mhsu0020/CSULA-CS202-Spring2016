import java.math.BigInteger;


public class Main {

	public static void main(String[] args) {

		//Immutable, just like String
		BigInteger veryBigNum = new BigInteger("1193740932180921830921832130912380921830921");
		BigInteger result = veryBigNum.multiply(new BigInteger("20"));
		System.out.println("unchanged: "+veryBigNum);
		System.out.println(result);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);



	}

}
