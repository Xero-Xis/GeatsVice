//Name: Miles Adedjouma
package org.howard.edu.hw2;

import java.io.FileNotFoundException;
import java.util.HashMap;

public class FileReaderAndCounter {
	public static void main(String[] args) {
		FileReader fr = new FileReader();
		HashMap<String, Integer> ZaWords = new HashMap<String, Integer>();

		try {
			String file_string = fr.readToString("main/resources/words.txt");
			String[] separated = file_string.replaceAll("[^a-zA-z]", "").toLowerCase().split(" ");
			for (int x = 0; x < separated.length; x++) {
				if (separated[x].length() > 3) {
					if (ZaWords.get(separated[x]) == null){
					ZaWords.put(separated[x],1);
				}
					else {
						ZaWords.put(separated[x], ZaWords.get(separated[x]) + 1);
				}
			}
		}
			for (String i : ZaWords.keySet()) {
				System.out.println(i + " " + ZaWords.get(i));
		}
	} 	catch (FileNotFoundException e) {
			System.out.println("Unable to Process");
		}		
	}
}