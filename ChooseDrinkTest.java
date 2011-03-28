/*
Program by: Sp0rus
Date Written: December 5, 2009
Version: 2
Program Objective: use java's random number generator to decide what beverage (coffee or tea) to drink, and if tea, decide what type of tea.
Comments: It's a bit gimmicky, but it gets the job done and ended my boredom at the time I wrote it.  Might come back sometime and add more features, but it's not supposed to be afully featured program, it just does what it's supposed to.

The wait time between decisions relies on this class, so you'll need to compile this as well:

public class Pause
{
    public static void oneSec () 
    {
        try
        {
            Thread.currentThread().sleep( 1000 );
        }
        catch ( InterruptedException e ) 
        {
            e.printStackTrace ();
        }
    }  
    public static void manySec( long s ) 
    {
        try 
        {
            Thread.currentThread().sleep( s * 1000 );
        }
        catch ( InterruptedException e ) 
        {
            e.printStackTrace ();
        }
    }   
}

Version 1 did the pause generation itself, but I decided having the time be a bit more random to make it seem like sometimes it was having trouble coming up with your answer.  The code for generating the pauses was adapted from http://www.rgagnon.com/javadetails/java-0145.html

Other than than there aren't many differences in this version from version 1, just changed some text printed to the screen and formatted code a little different.

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

public class ChooseDrinkTest
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
        System.out.println();
        System.out.println();
        System.out.println( "    ******      *****     ***************" );
        System.out.println( "   *    **     *   **    *             **" );
        System.out.println( "  *    * *    *   * *   *             * *" );
        System.out.println( " *    *  *   *   *  *  *             *  *" );
        System.out.println( "******   *  ******  * ***************  *" );
        System.out.println( "******   *  ******  * *************** *" );
        System.out.println( "******   *  ******  * ****************" );
        System.out.println( "******   *  ******  *    ********  *" );
        System.out.println( "******************  *    ********  *" );
        System.out.println( "******************  *    ********  *" );
        System.out.println( "******************  *    ********  *" );
        System.out.println( "******   * *******  *    ********  ****" );
        System.out.println( "******  *  *******  *    ******** *   *" );
        System.out.println( "****** *   ******* *  ************** *" );
        System.out.println( "*******    ********   ***************" );
        System.out.println( "******     *******    **************" );
        System.out.println();
        System.out.println();
        System.out.println( "This program will decide what you should drink using mind reading :)");
        System.out.print( "Do you wish to continue [yes or no]?");
        String response = console.nextLine();
        System.out.println( "Hold on while the computer attempts to read your mind and see what you really want to drink...");
        System.out.println();
        
        Random timeGenerator = new Random ();
        int waitTimeOne = timeGenerator.nextInt (10) + 3;
        Pause.manySec (waitTimeOne);

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
                
                System.out.println( " Now wait while the computer determines what type of tea you really want..." );
                Random timeGeneratorTwo = new Random ();
                int waitTimeTwo = timeGeneratorTwo.nextInt (10) + 3;
                Pause.manySec (waitTimeTwo);
            
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