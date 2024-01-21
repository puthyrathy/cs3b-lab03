import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        //create Scanner object for reading in input
        Scanner input = new Scanner(System.in);
        
        //store the suits and ranks in arrays
        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        //prompt user for card number and store it
        System.out.print("Enter Card Number (1-52): ");
        int n = input.nextInt();
        
        //print card associated with card number
        System.out.println("The card you picked is " + ranks[(n - 1) % 13] + " of " + suits[(n - 1) / 13]);
    }
}
