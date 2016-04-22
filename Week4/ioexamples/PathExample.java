package ioexamples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PathExample {

	public static void main(String[] args) {

		String filePathString = "C:\\Users\\Michael\\CS202Spring2015\\Week4\\src\\lyrics\\Album.java";

		// Check if a file exists on computer
		Path pathToCheck = Paths.get(filePathString);
		System.out.println(Files.exists(pathToCheck));

		// Reading all lines
		try {
			ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(pathToCheck);
			for (int i = 0; i < lines.size(); i++) {
				System.out.println(lines.get(i));
			}
			lines.get(100000);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			System.out.println("this always runs");
		}

	}

}
