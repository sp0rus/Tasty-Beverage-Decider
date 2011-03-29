/*

If you're reading this you got into my sourcecode, but anyway, here's the info:

Program by: Sp0rus
Date Written: December 5, 2009
Program Objective: use java's random number generator to decide what beverage (coffee or tea) to drink, and if tea, decide what type of tea.

-----BEGIN GEEK CODE BLOCK-----
Version 3.1
GCS d-?pu s:(+) a--- C++(++++)>$ 
ULC++()>$ P>$ L+(++)>$ !E W+++>$ 
!N !o K-? w++++>$ !O !M !V PS---@ 
PE++ !Y+ !PGP !t !5 X+ R(+) tv+ 
b+++ DI+++ D++ G+ e h r++ y
------END GEEK CODE BLOCK------

*/

import java.util.Random;
import java.util.Scanner;

public class ChooseDrink
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
        System.out.print( "Do you wish to continue [yes or no]?");
        String response = console.nextLine();
        System.out.println( "Hold on while the computer attempts to read your mind and see what you really want to drink...");
        System.out.println();

        try
        {
            Thread.sleep( 3000 );
        }
        catch ( InterruptedException e )
        {
        System.out.println( "awakened prematurely" );
        }

        while (response.equals("yes"))
        {
            Random generator = new Random ();
            int typeOfDrink = generator.nextInt(3);

            if ( typeOfDrink == coffee )
            {
                System.out.println( "The program thinks you should drink some coffee." );
            }
            else if (typeOfDrink == tea )
            {
                System.out.println( "The program thinks you should drink some Tea" );

                Random generator2 = new Random ();
                int typeOfTea = generator2.nextInt(7) + 10;

                if ( typeOfTea == green )
                {
                    System.out.println( "The decision of the type is *drumroll* Green Tea!" );
                }
                else if ( typeOfTea == black )
                {
                    System.out.println( "The decision of the type is *drumroll* Black Tea!" );
                }
                else if ( typeOfTea == white )
                {
                    System.out.println( "The decision of the type is *drumroll* White Tea!" );
                }
                else if ( typeOfTea == rooibos )
                {
                    System.out.println( "The decision of the type is *drumroll* Rooibos Tea!" );
                }
                else if ( typeOfTea == chai )
                {
                    System.out.println( "The decision of the type is *drumroll* Chai Tea!" );
                }
                else if ( typeOfTea == herbal )
                {
                    System.out.println( "The decision of the type is *drumroll* Herbal Tea!" );
                }
                else if ( typeOfTea == noClueTea )
                {
                System.out.println( "The program couldn't decide what type of tea you really want to drink, so you can try again (and maybe end up with coffee!) or you can man up and make your own decisions :P");
                }
            }
            else if ( typeOfDrink == noClueDrink )
            {
                System.out.println( "The program couldn't read your mind, try again later or read your own mind you lazy bum" );
            }
            System.out.println();
            System.out.print( "Hope you got your answer, if not, do you care to try again [yes or no]?" );
            response = console.nextLine();
        }
        System.out.println();
        System.out.println( "Hope this helped :)" );
    }
}
