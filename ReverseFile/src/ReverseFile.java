import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ReverseFile {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<String>();
		reverse(list);
	}
	
	public static void reverse(ArrayList<String> list) throws FileNotFoundException {
		
		//Reads the text file
		File document = new File("mobydick.txt");
		Scanner scan = new Scanner(document);
		
		//Scans for lines then adds them to the ArrayList
		while (scan.hasNext()) {
			list.add(scan.nextLine());
		}
		
		//Reverse the text file
		Collections.reverse(list);
		
		//Reverse the words
		for (int i = 0; i < list.size(); i++) {
			list.set(i, new StringBuilder(list.get(i)).reverse().toString());
		}
		
		//Prints on separate lines 
		for (String element : list ) {
			System.out.println(element);
		}
		
		scan.close();
	}
}
