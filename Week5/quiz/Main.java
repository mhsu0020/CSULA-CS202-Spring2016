package quiz;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Main {

	public static void writeStudentsToFile(ArrayList<Student> students, String fileName){

		Path newFilePath = Paths.get(fileName);
		// This opens or creates an existing file
		try (BufferedWriter writer = Files.newBufferedWriter(newFilePath)) {

			// enhanced forloop, uses iterator in the background, useful when
			// index is not needed
			for (Student student : students) {
				writer.write(student.toString());
				// Line break
				writer.newLine();
			}

		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

	}
	public static void main(String[] args) {

		Student student1 = new Student("Mike", "121212");
		Student student2 = new Student("David", "343434");

		ArrayList<Student> students = new ArrayList<>();
		students.add(student1);
		students.add(student2);

		Main.writeStudentsToFile(students, "quiz.txt");


	}

}
