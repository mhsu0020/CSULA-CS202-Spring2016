

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class CreateAppendExample {

	public static void main(String[] args) {

		String fileName = "example.txt";
		String[] linesToWrite={"first", "second", "third"};
		Path newFilePath = Paths.get(fileName);
		// This opens or creates an existing file

		try (BufferedWriter writer = Files.newBufferedWriter(newFilePath, new StandardOpenOption[]{StandardOpenOption.CREATE, StandardOpenOption.APPEND, })) {

			for (String line : linesToWrite) {

				writer.write(line);
				// Line break
				writer.newLine();
			}

		} catch (IOException x) {
			System.err.format("IOException: %s%n", x);
		}

	}

}
