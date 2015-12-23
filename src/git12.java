


	//package com.java2novice.algos;

	import java.util.Scanner;

	public class git12 {
		
		public static void convert(String number){
			System.out.println("number is " + number);
		}

		public static void main(String args[]){
			
			System.out.println("Welcome,");
			
			Scanner scanner = new Scanner(System.in);
			
				while(true){

					System.out.println("Enter a Number or type exit to exit");
					
					String number = scanner.next();
					
					if(number.equals("exit")){
						break;
					}

					convert(number);
				}
				
			System.out.println("Thank you");
			
			scanner.close();
		}
	}

