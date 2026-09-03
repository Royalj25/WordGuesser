import java.util.Scanner;
/**
 *
 *A program for a word guesser
 *
 *@author Jaiah Royal L2
 *@version 2026-07-01
 */
public class WordGuesser {

    // These are immutable static final strings that allow for repeated use through variables.
    public static final String WELCOME_MESSAGE = "Welcome to WordGuesser.java!";
    public static final String WORD_INPUT = "Player 1, enter the word for Player 2 to guess";
    public static final String EMPTY_WORD_PROMPT = "Word cannot be empty. Player 1, please enter a non-empty word.";
    public static final String GUESS_PROMPT = "Player 2, enter the letter you would like to guess";
    public static final String INVALID_GUESS_PROMPT = "A guess should not be more than one letter. " +
                                                        "Player 2, please enter a letter.";
    public static final String CURRENT_WORD_PROMPT = "Player 2, below is the word with your guesses so far";
    public static final String WINNING_PROMPT = "Congratulations Player 2! You have guessed the word correctly!";
    public static final String LOSING_PROMPT = "Congratulations Player 1! Player 2 was unable to guess your word!";
    public static final String PLAY_AGAIN_PROMPT = "Would you like to play again (Y or N)?";
    public static final String INVALID_INPUT_PROMPT = "Invalid input, please try again.";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // This prints the welcome message.
        System.out.println(WELCOME_MESSAGE);
        
        // Assigning variables.
        String player1;
        String player2 = "";
        String playAgain = "";
        boolean wordComplete;
        
        do { 

            // This prints the prompt for player 1.
            System.out.println(WORD_INPUT);
            
            do {
                player1 = scan.nextLine().toLowerCase(); // Scans user input.

                if (player1.equals("")) {
                    System.out.println(EMPTY_WORD_PROMPT);
                }
             
            } while ((player1.equals("")));
          
            // ^^^
            // This loop checks to make sure player 1 didn't enter an empty String.
            // Reprompts if there is no word entered.
       
            int length = player1.length(); 
            String[] word = new String[length];
            // This array stores the letters of player 1's word.
            
           
            System.out.println(CURRENT_WORD_PROMPT);
            
            for (int i = 0; i < word.length; i++) {
                word[i] = "_"; 
                
                if ( i < word.length - 1) {
                    System.out.print(word[i] + " ");
                } else {
                    System.out.print(word[i]);
                }
            }
            System.out.println();

            // ^^^
            // This prints for player 2 to see how many letters to guess.
            
    
            System.out.println(GUESS_PROMPT);
            // This prompt lets player 2 know they are able to make a guess.
          

            do { 
           
                player2 = scan.nextLine().toLowerCase(); // Scans user input.
           
                if ((player2.length() > 1) || (player2.equals(""))) {
                    System.out.println(INVALID_GUESS_PROMPT);
                }
           
            } while ((player2.length() > 1) || (player2.equals("")));

            //^^^
            // This loop checks if player 2 enters exact one letter.
            // Reprompts otherwise.
            
            wordComplete = false;
            int numGuesses = (length + 3);
            //number of guesses = length of player 1's word + 3 extra guesses.

            do {
                
                if (!(player1.contains(player2))) {
                    System.out.println("There is no " + player2 + "!");
                } // Checks first if the letter player 2 enter is in the word player 1 entered.
                
                for (int i = 0; i < player1.length(); i++) {
                    if (player1.substring(i, i + 1).equals(player2)) {
                         word[i] = player2;
                    }
                }  // This loop runs if the letter player 2 enters is equal to any letter in player 1's word.
                
                wordComplete = true;
                // Assumes the word is completed / player 2 fully guesses the word.
                for (int i = 0; i < word.length; i++) {
                    if (word[i].equals("_")) {
                        wordComplete = false;
                        break;
                    }
                } // Turns the boolean "wordComplete" to false if there are any dashes / empty spaces left.
                
                if (wordComplete) {
                    break;
                } // If the word is actually complete, then the loop breaks.
                 // If the loop is broken/ends, the code below is skipped.
               
                
                 numGuesses--;
                 // When the boolean "wordComplete" is still false, the game keeps going.
              
                 if (numGuesses == 0) {
                     break;
                 } // Checks to make sure player 2 hasn't ran out of guesses.
                 
                 System.out.printf("Player 2, you have %d guesses left!\n", numGuesses);
                 System.out.println(CURRENT_WORD_PROMPT);
                 
                 for (int i = 0; i < word.length; i++) {
                     if ( i < word.length - 1) {
                         System.out.print(word[i] + " ");
                     } else {
                         System.out.print(word[i]);
                     }
                 }
                 System.out.println(); 
                        
                 System.out.println(GUESS_PROMPT);

                 // ^^^
                 // Prints the amount of guesses player 2 has left.
                 // Prints the amount of correct letters player 2 has guessed thus far.
                 // Reprompts player 2 to continue.
                    
                 do {
                        player2 = scan.nextLine().toLowerCase(); // Scans user input.
                     
                        if ((player2.length() > 1) || (player2.equals(""))) {
                            System.out.println(INVALID_GUESS_PROMPT);
                        }
                    
                    } while ((player2.length() > 1) || (player2.equals("")));

                     // ^^^
                     // This loop checks if player 2 enters exact one letter.
                     // Reprompts otherwise. 
                   
             
            } while (!wordComplete && numGuesses > 0); 
            // This loop continues while "wordComplete" is false AND the number of guesses is greater than 0.
            // Once one of these conditions becomes false, the loop breaks and the program continues below.

       
            if (wordComplete) {
                System.out.println(WINNING_PROMPT); // Prints if the word is fully guessed.
            } else {
                System.out.println(LOSING_PROMPT); // Prints if the word is not fully guessed.
            }


            do {
                System.out.println(PLAY_AGAIN_PROMPT);
                playAgain = scan.nextLine().toUpperCase();

                if (!playAgain.equals("Y") && !playAgain.equals("N")) {
                    System.out.println(INVALID_INPUT_PROMPT);
                }
            
            } while (!playAgain.equals("Y") && !playAgain.equals("N"));

            // ^^^
            // This loop prompts the players with the option to play again.
            // The loop repeats if the response is not a "Y" or "N".
            
        } while(playAgain.equals("Y"));

        // ^^^
        // This last do-while loop, loops the entire game.
        // If the players want to play again, they can without having to rewrite the entire program.
        
    } //end main
} //close program
