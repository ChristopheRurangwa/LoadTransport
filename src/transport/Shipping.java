package transport;

import java.util.Random;
import java.util.Scanner;

public class Shipping {
	static Scanner sc=new Scanner(System.in);
	
	
	private static int day;
	private static int month;
	private static int year=2020;
	
	
	public  int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public  int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	/**
	 * calls a readfile method that reads a file.dat file
	 * allow the user to search the for the number of the road and track it.
	 * @param bool
	 * @return
	 */
	public static int truckNumber(boolean bool) {
		
		IntRandomizer.numbersGenerator();
		
		if(bool==true) {
			
			
			IntRandomizer.readFile(0,bool);
			
				}

		else {
			System.out.println("Enter the number of the load (Track By Number): eg:5100, 5201,9366, 107930,108395, 108395");
			int input=sc.nextInt();
			
			sc.nextLine();
			
			IntRandomizer.readFile(input,bool);
		
		}		
		
		
		return 0;
		
	}
	
	/**
	 * shows all delivery and expected delivery dates.
	 * @return
	 */
	public static String deliveryDates() {
		
		Shipping shipmt=new Shipping();
		
		IntRandomizer.numbersGenerator();//<generates numbers of roads to be printed
		
		Random rand=new Random();
		int randDay=(int) (Math.random()*31+1);
		int randMonth=1+rand.nextInt(12);
		int randYear=2020+rand.nextInt(2021);
		
		
		
	System.out.println("TRUCK-No.    DATES OF DELIVERIES\n ");
		
		for(int i=0;i<IntRandomizer.arr.size()-1;i++) {
			if(i%2==0) {
				randMonth=(int) (Math.random()*12+1);
				randDay=(int) (Math.random()*30+1)+1;
				shipmt.setDay(randDay);
				shipmt.setMonth(randMonth);
			}
			
		System.out.println("Truck-"+IntRandomizer.arr.get(i)+" ---> "+shipmt.getDay()+" / "
			+shipmt.getMonth()+" / "+shipmt.getYear());
		}
		
		return null;}
	
	public static String servicesMap() {
		System.out.println("The following cities are areas where we provide our services: \n");
		System.out.println("CENTER		PHONE\n");
		System.out.println("CLEVELAND   9090XXXXX\n");
		System.out.println("LOVELAND    9090XXXXX\n");
		System.out.println("CINCY       9090XXXXX\n");
		System.out.println("AKRON       9090XXXXX\n");
		System.out.println("MORAINE     9090XXXXX\n");
		System.out.println("MIDDLETOWN  9090XXXXX\n");
		System.out.println("DAYTON      9090XXXXX\n");
		System.out.println("COLUMBUS    9090XXXXX\n");
		return null;
		
	}
	
	public static void menu() {
		System.out.println(" 1. SHOW ALL TRUCK LOADS NUMBER \n "
				+ "2. DELIVERY \n "
				+ "3. RATE ESTIMATE \n "
				+ "4. SHIPPING LABEL \n "
				+ "5. SEARCH FOR TRUCK LOAD NUMBER \n "+"6. SERVICE CENTERS\n "
				+ "7. Exit\n\n Press Enter after every entry.\n");
		
		
	}
	

	public static void main(String[] args) {
		menu();
		
		int choix; 
		
		
		
		
		do {
			choix=sc.nextInt();
			
			switch(choix) {
			case 1:truckNumber(true);
			
				break;
			case 2:{
				
				deliveryDates();
				
				
				break;}
			case 3:
				
				break;
			case 4:
				
				break;
			case 5:truckNumber(false);
			
				break;
			case 6:servicesMap();
				
				break;
			case 7:System.exit(0);
				
			
				
			
			default:
				System.out.println("You entered an invalid option, please select from the menu below.\n");
				menu();
				choix=sc.nextInt();
				break;
			}
			
		}while(choix<8);
		

	}

}
