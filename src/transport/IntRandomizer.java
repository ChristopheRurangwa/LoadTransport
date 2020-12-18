package transport;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;



public class IntRandomizer {
	
	static ArrayList<Integer>arr=new ArrayList<>();
	
	/**
	 * reads file.dat and takes input, searched using linear sear
	 * @param input
	 * @param bool
	 * @return
	 */
	
	public static int readFile(int input,boolean bool) {
		
		
		try {
			File fileRd=new File("file.dat");
			
			Scanner scan= new Scanner(fileRd);
			if(bool==true) {
			while(scan.hasNextLine()) {
				
				String data = scan.nextLine();
				String conv=Integer.toString(input);
					System.out.println("Truck-"+data);
			}	}
			}
			catch(FileNotFoundException ex) {
				System.out.println(ex);
				ex.printStackTrace();
				System.out.println("AN ERROR OCCURRED READING THE FILE!!!");
			}

			for(int i=0;i<=arr.size()-1;i++) {
				if(input==arr.get(i)) {
				System.out.println("The entry you entered "+input+" was found.");
				break;
			
				}
				
			}
		 
		
		return input;
		}

	/**
	 * Generates integer numbers, and writes them on file.dat
	 */
	public static void numbersGenerator() {
		
		File file =new File("file.dat");
		FileWriter fwriter=null;
		int numb=4999;
		
		try {
			fwriter=new FileWriter(file);//<--file writer object.
			//lets use the buffer
			
			BufferedWriter wrb= new BufferedWriter(fwriter);
			
			int intNumb=5000;
			
			Random rand= new Random();
			
			for(int i=100;i<500;i++) {
				
				intNumb+=i;
				
				fwriter.write(intNumb+"\n");
				
				arr.add(intNumb);
				
			}
			fwriter.close(); 
			
		}catch (IOException ex) 
		{
			System.out.println(ex);
			ex.printStackTrace();
			System.out.println("AN ERROR OCCURRED WRITTING TO FILE!!!");
			System.exit(0);
		}
		
	}
}
