/*
 * Written by Olivia Kaloyannides
 */
import java.util.Scanner;

public class Whatisyourzodiac {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What is your zodiac?  Enter your birthday -- Month followed by Day as numbers.");
		String answer = s.nextLine();//This is for the first line that the computer tells the user once the program is started.
	
		int iMonth = answer.indexOf(" ");
		String sMonth = answer.substring(0, iMonth);
		String sDay = answer.substring(iMonth+1);
		int aDay = Integer.parseInt(sDay);//This block was to tell the computer how to tell what input is the month and what input is the day.
	
	
		if(iMonth == 3 && (aDay <= 31 && aDay >= 21)) System.out.println("You are an Aries!");
		
		if(iMonth == 4 && (aDay <= 0 && aDay >= 19)) System.out.println("You are an Aries!");//These two were for telling the computer what an Aries is.
		
		if(iMonth == 4 && (aDay <= 20 && aDay >= 30)) System.out.println("You are a Taurus!");
		
		if(iMonth == 5 && (aDay <= 0 && aDay >=20)) System.out.println("You are a Taurus!");
		
		
	}
}
