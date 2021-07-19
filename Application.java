package main;
import java.util.Scanner;

public static void menuTop(String[] args){

	int select = 0;
	int exit = 0;
	int amountIn = 0;
	double result = null;
	
	while(Selection != 4) {
		
		System.out.println("Select an option:");  
		System.out.println("1. Teaspoons -> Cups");
		System.out.println("2. Miles -> Kilometers");
		System.out.println("3. US Gallons -> Imperial Gallons");
		System.out.println("4. Quit");
		
		Scanner scan = new Scanner(System.in);
		int Selection = scan.nextInt();
		
		switch(Selection) {
		
			case 1:
				
				System.out.println("Number of Teaspoons?");
				scan = new Scanner(System.in);
				
				amountIn = scan.nextInt();
				result = amountIn * 48;
				System.out.println(result + " teaspoons -> " + amountIn + " cups.");
				break;
		
			case 2:
				
				System.out.println("Number of Miles?");
				scan = new Scanner(System.in);
				amountIn = scan.nextInt();
				
				double miKi = 0.6213;
				result = (double)amountIn * miKi;
				System.out.println(result + " kilometers  ->  " + amountIn + " miles.");
				break;
		
			case 3:
				
				System.out.println("Number of US Gallons?");
				scan = new Scanner(System.in);
				amountIn = scan.nextInt();
				
				result = (double)amountIn * 0.8326;
				System.out.println(result + "US Gallons -> " + amountIn + " Imperial Gallons.");
				break;	
		
			case 4:
				
				Selection = 0;
				System.out.println("Hope you had fun!");
				break;
			
			default:
				
				System.out.println("Invalid number. Please use 1-4.");
				break;
				
			}
		}
	}
}
