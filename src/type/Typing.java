package type;

 
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
/**
 * 
 * @author Leon
 * @version 1.0
 * @since 11/25/2021
 *
 */

/**
 * This method is used to scan the words in a file and add it to the arraylist
 * @param args
 * @throws InterruptedException
 * @throws FileNotFoundException
 */
public class Typing {
	
	public static ArrayList<String> words = new ArrayList<>();	
	
	public static void fileReader(String file) throws FileNotFoundException {
		

		Scanner scan = new Scanner(new File(file));
		
		try {
			while(scan.hasNextLine()) {
				words.add(scan.nextLine());
				
			}
			
			
		} catch(Exception e ) {
			
		}
		
		
		
		
	}
	
	
	/**
	 * This method is the main method puts a timer on the program and does the math for the type racer
	 * @param args
	 * @throws InterruptedException
	 * @throws FileNotFoundException
	 */
	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		Scanner scan = new Scanner(System.in);
		
		fileReader("C:\\Users\\Leon\\Desktop\\type racer.txt");
		
		System.out.println("Ready");
		
		Thread.sleep(1000);
		
		System.out.println("Set");
		
		Thread.sleep(1000);
		
		System.out.println("Go");
		
		Thread.sleep(1000);
		

		for(int i=0; i<words.size();i++) {
			
			int index = (int)(Math.random() * words.size());
			
			System.out.println(words.get(index));
		}
		
		double start =LocalTime.now().toNanoOfDay();
		
		String typed = scan.nextLine();
		
		double end = LocalTime.now().toNanoOfDay();
		double totaltime = end-start;
		double seconds = totaltime / 1000000000.0;
		
		int chars = typed.length();
		
		int wpm = (int) ((((double)(chars/5)) / seconds) * 60);
		
		System.out.print(wpm + " Words Per Minute");
		
		
		
		
		
	}

}
