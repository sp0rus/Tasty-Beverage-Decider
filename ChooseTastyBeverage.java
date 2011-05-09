/*
Program by: sp0rus
Program Objective: use java's random number generator to decide what beverage (coffee or tea) to drink, and if tea, decide what type of tea.
*/

import java.util.Random;
import java.util.Scanner;

public class ChooseTastyBeverage
{
    public static void main( String [] args )
    {
        int coffee = 0;
        int tea = 1;
        int noClueDrink = 2;
        int green = 10;
        int black= 11;
        int white = 12;
        int rooibos = 13;
        int chai = 14;
        int herbal = 15;
        int noClueTea = 16;

        Scanner console = new Scanner( System.in );
        System.out.println( "This program will decide what you should drink using mind reading :)");
        System.out.print( "Do you wish to continue [yes or no]? ");
        String response = console.nextLine();
        System.out.println( "Hold on while the computer attempts to read your mind \n"
			  + "and see what you really want to drink...\n");
        sleep();

        while (response.equals("yes"))
        {
            Random generator = new Random ();
            int typeOfDrink = generator.nextInt(3);

            if ( typeOfDrink == coffee )
            {
		printDrink("Coffee");
            }
            else if (typeOfDrink == tea )
            {
                printDrink("Tea");

                Random generator2 = new Random ();
                int typeOfTea = generator2.nextInt(7) + 10;

                if ( typeOfTea == green )
                {
                    printTea("green");
                }
                else if ( typeOfTea == black )
                {
                    printTea("black");
                }
                else if ( typeOfTea == white )
                {
                    printTea("white");
                }
                else if ( typeOfTea == rooibos )
                {
                    printTea("rooibos");
                }
                else if ( typeOfTea == chai )
                {
                    printTea("chai");
                }
                else if ( typeOfTea == herbal )
                {
                    printTea("herbal");
                }
                else if ( typeOfTea == noClueTea )
                {
                System.out.println( "Your mind was blocked, and I was unable to see \n"
				  + "what tea really wanted, so you can try again \n"
				  + "(and maybe end up with coffee!) or you can man\n"
				  + "up and make your own decisions.\n");
                }
            }
            else if ( typeOfDrink == noClueDrink )
            {
                System.out.println( "I couldn't read your mind, try again later or read your own mind you lazy bum.\n" );
            }
            System.out.print( "Hope you got your answer, if not, do you care to try again [yes or no]? " );
            response = console.nextLine();
	    System.out.println();
        }
        System.out.println();
        System.out.println( "Enjoy your tasty beverage!" );
    }
    private static void printDrink(String drink){
	System.out.println("The drink that you subconsciouly desire is " + drink);
    }
    private static void printTea(String tea){
	System.out.println("...and the type you are craving is " + tea + " tea.\n");
    }
    private static void sleep(){
	try
        {
            Thread.sleep( 3000 );
        }
        catch ( InterruptedException e )
        {
        System.out.println( "awakened prematurely" );
        }
    }
}
