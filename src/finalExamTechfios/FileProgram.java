package finalExamTechfios;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileProgram {
	static String path = "file.txt";

	public static void main(String[] args) {
		try {
			if (doesFileExist(path)) {
				System.out.println("The file exists");
			} else {
				System.out.println("The file doesn't exist");
			}
			;
		} catch (Exception e) {
			e.printStackTrace();
		}
		readDataFromFile();
	}

	public static void readDataFromFile() {

		File file = new File(path);
		try {
			Scanner scn = new Scanner(file);

			List<String> textList = new ArrayList<>();
			while (scn.hasNextLine()) {
				String line = scn.nextLine();
				textList.add(line);
			}
			for (int i = 0; i < textList.size(); i++) {
				String row = textList.get(i);
				String[] splitter = row.split(" : ");
				if (splitter.length == 2) {
					String word = splitter[0];
					String possibleMeanings = splitter[1];

					System.out.println(word);
					System.out.println(possibleMeanings);
				}
				scn.close();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static boolean doesFileExist(String path) {
		Path pathFile = Paths.get(path);
		return Files.exists(pathFile);
	}
}
