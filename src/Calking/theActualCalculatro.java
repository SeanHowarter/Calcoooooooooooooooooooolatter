package Calking;

import java.util.Scanner;


public class theActualCalculatro {
	
	public static Scanner inp = new Scanner(System.in);
	
	public static String defFunction() {
		//get input from user to add sub or other
		System.out.print("What function would you like to use: ");
		String function = inp.nextLine();
		return function;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if no static on function theActualCalculatro calculatro = new theActualCalculatro();
		
		System.out.println("Welcome to the first Java Calculator in the multiverse!!!!!");
		
		
		//Define Function add, sub, mult, divide
		
		//String function = calculatro.defFunction();
		String function = defFunction();
		
		if(function.equals("add")) {
			System.out.print("Add two numbers: ");
			double x = inp.nextDouble();
			double y = inp.nextDouble();
			
			//Adding addTwo = new Adding();
			
			//double total = addTwo.AddTwoNums(x,y);
			double total = Adding.AddTwoNums(x,y);
					
			System.out.println(total);
		}
		else if(function.equals("subtract")) {
			System.out.print("Subtract two numbers: ");
			double x = inp.nextDouble();
			double y = inp.nextDouble();
			
			//Subtract SubTwo = new Subtract();
			
			double total = Subtract.SubTwoNums(x,y);
					
			System.out.println(total);
		}

		

	}

}
