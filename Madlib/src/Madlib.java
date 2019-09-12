import java.util.Scanner;
public class Madlib
{
    public static void main(String[] args)
    {
        //All variables needed for madlib (19 inputs total)

        //There are three adjectives needed
        String adj1; String adj2; String adj3;

        //There are three singular nouns needed
        String singleNoun1; String singleNoun2; String singleNoun3;

        //There are four plural nouns needed
        String pluralNoun1; String pluralNoun2; String pluralNoun3; String pluralNoun4;

        //There is one game name needed
        String game1;

        //There are four verbs ending in 'ing' needed
        String verbing1; String verbing2; String verbing3; String verbing4;

        //There is one plant name needed
        String plant1;

        //There is one part of the body needed
        String bodyPart1;

        //There is one place needed
        String place1;

        //There is one number needed
        String number1;

        //Start of getting user's inputs
	    Scanner sc = new Scanner(System.in);

        System.out.print("Please enter an adjective: ");
        adj1 = sc.next();
        System.out.print("Please enter another adjective: ");
        adj2 = sc.next();
        System.out.print("Please enter a noun: ");
        singleNoun1 = sc.next();
        System.out.print("Please enter another noun: ");
        singleNoun2 = sc.next();
        System.out.print("Please enter a plural noun: ");
        pluralNoun1 = sc.next();
        System.out.print("Please enter the name of a game: ");
        game1 = sc.next();
        System.out.print("Please enter a plural noun: ");
        pluralNoun2 = sc.next();
        System.out.print("Please enter a verb ending in 'ing': ");
        verbing1 = sc.next();
        System.out.print("Please enter another verb ending in 'ing': ");
        verbing2 = sc.next();
        System.out.print("Please enter a plural noun: ");
        pluralNoun3 = sc.next();
        System.out.print("Please enter a verb ending in 'ing': ");
        verbing3 = sc.next();
        System.out.print("Please enter a noun: ");
        singleNoun3 = sc.next();
        System.out.print("Please enter the name of a plant: ");
        plant1 = sc.next();
        System.out.print("Please enter a part of the body: ");
        bodyPart1 = sc.next();
        System.out.print("Please enter the name of a place: ");
        place1 = sc.next();
        System.out.print("Please enter a verb ending in 'ing': ");
        verbing4 = sc.next();
        System.out.print("Please enter an adjective: ");
        adj3 = sc.next();
        System.out.print("Please enter a number: ");
        number1 = sc.next();
        System.out.print("Please enter a plural noun: ");
        pluralNoun4 = sc.next();

        //End of user input

        System.out.println("A vacation is when you take a trip to some " + adj1 +
                " place with your " + adj2 + " family.");
        System.out.println("Usually you go to some place that is near a/an " + singleNoun1
                + " or up on a/an " + singleNoun2 + ".");
        System.out.println("A good vacation place is one where you can ride " + pluralNoun1
                + " or play " + game1 + " or go hunting for " + pluralNoun2 + ".");
        System.out.println("I like to spend my time " + verbing1 + " or " + verbing2 + ".");
        System.out.println("When parents go on a vacation, they spend their time eating three " +
                pluralNoun3 + " a day, and fathers play golf, and mothers sit around " + verbing3 + ".");
        System.out.println("Last summer, my little brother fell in a/an " + singleNoun3 +
                " and got poison " + plant1 + " all over his " + bodyPart1 + ".");
        System.out.println("My family is going to go to (the) " + place1 +
                ", and I will practice " + verbing4 + ".");
        System.out.println("Parents need vacations more than kids because parents are always very " +
                adj3 + " and because they have to work " + number1 + " hours every day all year making enough " +
                pluralNoun4 + " to pay for the vacation" + ".");
    }
}