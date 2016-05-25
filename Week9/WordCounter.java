import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.TreeMap;


/*
 * Grab a webpage,
 *
 * Get the unique words within a webpage
 *
 *
 * */
public class WordCounter {

	public static void main(String[] args) {

		HashSet<String> uniqueWords = new HashSet<>();

		//Key: word, Value: count of word occrance within file
		TreeMap<String, Integer> wordCount = new TreeMap<>();

		Path fileToRead = Paths.get("fxtutorial.txt");
		try {
			ArrayList<String> lines = (ArrayList<String>) Files.readAllLines(fileToRead);
			for (String line : lines) {
				//What's in the file
				String[] words = line.split("\\s+");
				for(String word : words){
					uniqueWords.add(word);
					if(wordCount.containsKey(word)){
						int oldWordCount = wordCount.get(word);
						oldWordCount++;
						wordCount.put(word, oldWordCount);
					}
					//word is not in map, put 1, first time seeing it
					else{
						wordCount.put(word, 1);
					}
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		for(Entry<String, Integer> entry : wordCount.entrySet()){
			System.out.println(entry.getKey()+", "+entry.getValue());
		}
	}

}
