//package magpie;   //Uncomment this line
package com.company;

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *       Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

/* DELETE EVERYTHING IN THIS COMMENT!

//What happens when more than one keyword appears in a string? Consider the string “My mother has a dog but no cat.”
// Explain how to prioritize responses in the reply method.

    //If more than one keyword appears, the program will output the response corresponding to the first keyword. This is because the conditional
    //statements will leave the if-else block after executing the code in that condition.
    //For example, in "My mother has a dog but no cat", the program will print "Why so negative?" because "no" is the first
    //keyword that is checked AND identified. Since all the if, else if, and else statements are grouped together, program execution leaves that conditional
    //block and proceeds to the rest of the program

    //Question 1: What happens when a keyword is included in another word? Consider statements like “I know all the state capitals”
//  and “I like vegetables smothered in cheese.” Explain the problem with the responses to these statements.

    //I don't fully understand what the question is asking, but if the keyword is a substring of another word i.e. if you have "no" as the keyword
    //and "I am not" as the statement, the conditional statements detect "no" in the statement and will print out an incorrect response

*/

public class Magpie2 {

    public String getGreeting() {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     *
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement) {
        String response = "";
        int trimLength = statement.trim().length(); //Get the length of the trimmed String

        if (statement.indexOf("No") >= 0 || (statement.indexOf(" no")) >= 0) {
            response = "Why so negative?";
        } else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0) {
            response = "Tell me more about your family.";
        } else if (statement.indexOf("dog") >= 0 || (statement.indexOf("cat")) >= 0) {
            response = "Tell me more about your pets.";
        } else if (statement.indexOf("How are you?") >= 0) {
            response = "Great!";
        } else if (statement.indexOf("Hello") >= 0) {
            response = "Hello, how are you?";
        } else if (statement.indexOf("Mr. Binz") >= 0) {    //This is space sensitive, make sure to include the space character
            response = "He sounds like a great teacher!";
        } else if (statement.indexOf("pet") >= 0) {
            response = "What is your pet's name?";
        } else if (trimLength == 0) {   //Compare the length of the trimmed string
            response = "Say something, please.";
        } else {
            response = getRandomResponse();
        }

        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */

    private String getRandomResponse() {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int) (r % NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0) {
            response = "Interesting, tell me more.";
        } else if (whichResponse == 1) {
            response = "Hmmm.";
        } else if (whichResponse == 2) {
            response = "Do you really think so?";
        } else if (whichResponse == 3) {
            response = "You don't say.";
        } else if (whichResponse == 4) {
            response = "That's great!";
        } else if (whichResponse == 5) {
            response = "Really?";
        }

        return response;
    }
}