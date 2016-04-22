package exception;

import java.util.Scanner;

public class ExceptionExamples {

	public static void main(String[] args) {

		ExceptionExamples.outOfBounds();
	}

	public static void outOfBounds(){
        int[] array = new int[5];
       // try{
        System.out.println(array[10000]);
        //unchecked exception
        //        } catch(ArrayIndexOutOfBoundsException e){
//        	//Handle the exception
//        	System.out.println("array out of bounds!!!!!");
//        	e.printStackTrace();
//        }
	}

}
