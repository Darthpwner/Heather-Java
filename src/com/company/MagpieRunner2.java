//package magpie;   //Uncomment this line
package com.company;    //Remove this line
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner2 {
    /**
     * Create a Magpie, give it user input, and print its replies.
     */
    public static void main(String[] args)
    {
        Magpie2 maggie = new Magpie2();

        System.out.println(maggie.getResponse("My mother has a dog but no cat."));
        System.out.println(maggie.getResponse("I am not hungry"));

        System.out.println (maggie.getGreeting());  //Prints "Hello let's talk"
        Scanner in = new Scanner (System.in);
        String statement = in.nextLine();   //There is a problem in scanning

        while (!statement.equals("Bye"))
        {
            System.out.println (maggie.getResponse(statement));
            statement = in.nextLine();
        }
    }

}