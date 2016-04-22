package ioexamples;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;

public class WritingStudentObjectsExample {

	public static void main(String[] args) {

		ArrayList<Student> students = new ArrayList<>();

		Student studentOne = new Student("Mike", "12324324");
		Student studentTwo = new Student("Mary", "342432424");

		students.add(studentOne);
		students.add(studentTwo);

		//relative path, creates file in project root directory, remember to refresh eclipse project to see the file
		String fileName = "student.txt";

		writeStudentsToFile(students, fileName);


		ArrayList<Student> savedStudents = readStudentsFromFile(fileName);
		for(Student student : savedStudents){
			System.out.println("name: "+student.getName()+", CIN: "+student.getCIN());
		}


	}

	public static void writeStudentsToFile(ArrayList<Student> studentsToWrite, String fileName) {

		Path newFilePath = Paths.get(fileName);
		// This opens or creates an existing file
		try (BufferedWriter writer = Files.newBufferedWriter(newFilePath)) {

			// enhanced forloop, uses iterator in the background, useful when
			// index is not needed
			for (Student student : studentsToWrite) {

				// Format: NAME,CIN
				writer.write(student.getName() + "," + student.getCIN());
				// Line break
				writer.newLine();
			}

		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

	}

	public static ArrayList<Student> readStudentsFromFile(String fileName) {

		ArrayList<Student> studentsFromFile = new ArrayList<>();

		Path fileToRead = Paths.get(fileName);
		try {
			ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(fileToRead);
			for (String line : lines) {
				//What's in the file
				System.out.println(line);
				//Separated by commas
				String[] tokens = line.split(",");

				//We know that we are storing name then CIN
				Student student = new Student(tokens[0], tokens[1]);
				studentsFromFile.add(student);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		return studentsFromFile;

	}

}
