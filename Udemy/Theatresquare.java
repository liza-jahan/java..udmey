package Udemy;

import java.util.Scanner;

public class Theatresquare {
	public static  void main() {
		
		Scanner scan = new Scanner(System.in);
		double n = scan.nextDouble();
		double m = scan.nextDouble();
		double a = scan.nextDouble();
		double x,y,sum;
		if(m%a==0)
		{
			y = m/a;
		}
		else {
			y = m/a+1;
		}
		if(n%a==0)
		{
			x = n/a;
		}
		else {
			x = n/a+1;
				
			}
		sum = y*x;
		System.out.println("%lf"+sum);
		}
	}


