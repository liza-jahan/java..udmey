package Udemy;

import java.util.Scanner;


public class Project1 {
	public static void main(String[] args) {
		System.out.println("Hellow welcome to the food app");
		System.out.println("please create a password: ");
		Scanner scan = new Scanner(System.in);
		String pass1 = scan.next();
		System.out.println("your paswsword is save : "+pass1);
		
		System.out.println("plase enter your password : ");
		String pass = scan.next();
		while (!pass.equals(pass1))
		{
			System.out.println("It is not correct password plase try after again: ");
			pass = scan.next();
			
		}
		 System.out.println("access granted" );
		 System.out.println("Are you hungry yes or no : ");
		 String ans = scan.next();
		 if(ans.equals("yes"))
		 {
			 System.out.println("choose what  you want to eat between pizza,bargur or fish");
			 String ans2 = scan.next();
			 while(!ans2.equals("pizza") && !ans2.equals("bargur")&& !ans2.equals("fish"))
			 {
		 System.out.println("sorry we do not have it what would you like between pizza,bargur or fish");
		 ans2 = scan.next();
		  }
			 if(ans2.equals("pizza")|| ans2.equals("bargur")||ans2.equals("fish"))
			 {System.out.println("Do you want something to drink : ");
			 String ans3 = scan.next();
			  while(!ans3.equals("yes")&& !ans3.equals("no") )
			  {
				  System.out.println("wrong comment please try again : ");
				  ans3 = scan.next();	  
			  }
			  if(ans3.equals("yes"))
			  {
				  System.out.println("what would you like to drink coke or juice ?:");
				  String ans4 = scan.next();
				  
				  while(!ans4.equals("coke")&& !ans4.equals("juice") )
				  {
			System.out.println("sorry we don't have it what would you like between coke and juice: ");
					  ans4 = scan.next();
			  }
				  if(ans4.equals("coke") || ans4.equals("juice"))
				  {
					  System.out.println("Great you have orders "+ ans2 +"and"  + ans4);
					  }
				  System.out.println("please inter your password : ");
				  pass = scan.next();
				  while (!pass.equals(pass1))
					{
						System.out.println("It is not correct password plase try after again: ");
						pass = scan.next();
						
					}
				  System.out.println("Thank you your erear is oh it's say");
				  
			 }
			  else 
			  {
				  System.out.println("you have ordares " +ans2);
  }	
			  System.out.println("please inter your password : ");
			  pass = scan.next();
			  while (!pass.equals(pass1))
				{
					System.out.println("It is not correct password plase try after again: ");
					pass = scan.next();
					
				}
			  }	 
		 
	}
	else  {
			 
				System.out.println("Allright have a good day") ;
				
			 }
		}

}
