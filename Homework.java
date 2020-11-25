package Lab;

import java.util.Random;
import java.util.Scanner;

public class Homework {
	

	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("please enter your name");
		
		String firstName = userInput.next();
		
		System.out.println("Hello" + firstName);
		
		System.out.println("would you like to continue the interactive portion?");
		
		String answer = userInput.next();
		
		if (answer.equalsIgnoreCase("no")) {
			System.exit(0);
		  }else if (answer.equalsIgnoreCase("yes")) {
			  System.out.println("do you have a red car?");
			  String car = userInput.next();
		  
			  System.out.println("what is the name of your pet?");
			  String petName = userInput.next();
			  
			  System.out.println ("What is your lucky number?");
			  int lucky = userInput.nextInt();
			  
			  System.out.println("Do you have a favorite Quarterback?");
			  String QB = userInput.next();
			  
			  if (QB.equalsIgnoreCase ("yes"));
			  System.out.println("What is their jersey number?");
			  int qbum =userInput.nextInt();
			  
			  }
		  System.out.println("what is the two digit model year of your car?");
		  int year = userInput.nextInt();
		  
		  System.out.println ("what is the first name of your favorite actor or actress?");
		  String actor = userInput.next();
		  
		  System.out.println("enter a random number between 1 and 58");
		  int random = userInput.nextInt (); 
		  
		  Random Random = new Random();
			int upperbound = 65;
			int petName =0;
			int lucky =0;
			int rando = petName + lucky;
			int int_Random = Random.nextInt(rando);
			int intRandom0 = Random.nextInt(upperbound);
			int intRandom1 = Random.nextInt(upperbound);
			int intRandom2 = Random.nextInt(upperbound);
			int intRandom3 = Random.nextInt(upperbound);
			int upper = 75;
			int magic = lucky * int_Random;
			
			System.out.println("Lottery numbers: " + int_Random + "," + intRandom0 + "," + intRandom1 + "," + intRandom2 + "," + intRandom3);
			System.out.println("Magic Ball: " + magic);
			System.out.println();
			System.out.println("Would you like to answer questions to generate a new set of numbers?");
			String newQuest = userInput.next();
	
		    System.out.println ("Thank you for Playing");
	}
		    public static void printNumbers() {
			  Homework.printNumbers();
			  int i;
			  for(i = 0; i >= 47 && i <= 57; i++); {
			    System.out.println("The ControlFlow value of" + (char)i + "=" + i);
			}
		 }
		    
		    public static void printLowerCase() {
		      Homework.printLowerCase();
		      int a;
		      for(a = 0; a >= 97 && a <= 122; a++);
		        System.out.println("The ControlFlow value of" + (char)a + "=" + a);
		        }
		    
		}

	
