package com;

import java.util.Scanner;

public class Solution { //ctrl + font size increase && ctrl - font size decrease
 //SCANNER
	//CALCULATOR(REF) CALCULATORIMPL->ABSTRACTION->UPCASTING
	//MENU DIAGRAM PROGRAM-> DISPLAY OPTIONS-> 1.ADDITION 2.
	//SWITCH STATEMENT
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Calculator calc= new CalculatorImpl();//upcasting
		while(true) {
			
		
		System.out.println("1:Addition\n 2:Substraction\n3:Multiplication\n4:Division\n5:Exit\nEnter Choice");
		
		int choice=ip.nextInt();
		
		  int a=0;
		  int b=0;
		 
		if(choice>=1 && choice<=4) {
		   System.out.println("Enter the 2 numbers :");
		   a= ip.nextInt();
		   b= ip.nextInt();
	}
		switch(choice)
		{
		case 1 :
			     System.out.println("Sum of "+a+" & " +b+ " is:"+calc.add(a, b));
		         break;
		
	    case 2 :
	    	     System.out.println("substractiom of "+a+" & " +b+ " is:"+calc.sub(a, b));
		         break;
		        
	    case 3 :  
	    	     System.out.println("product of "+a+" & " +b+ " is:"+calc.mul(a, b));
		         break;
		        
        case 4 :
        	    int result=calc.div(a, b ); //calc.div(10,0) & calc.div(0,10)
        	    if(result!=0) {
        	    System.out.println("division of "+a+" & " +b+ " is:"+calc.div(a, b));
        	    }
        	    else 
        	    {
        	     System.out.println("Cannot Perform Division");
        	    }
        	    break;
		         
        case 5: System.out.println("Thank You");
                System.exit(0);
                
		default:
			    System.out.println(calc.displayErrorMessage());
		}
		System.out.println("--------------");
		
	 }
  }
}
