import java.util.Scanner;
/**
 *
 *A program for a word guesser
 *
 *@author Jaiah Royal L2
 *@version 2026-07-01
 */
public class WordGuesser {

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

        System.out.println(WELCOME_MESSAGE);
        
        String player1; //  Variable for word entered by Player 1.
        String player2 = ""; // Variable for characters entered by Player 2.
        String playAgain = ""; // Variable for input entered by either player.
        boolean wordComplete; // Tracks whether Player 2 has guessed the entire word.
        
        do { 

            System.out.println(WORD_INPUT);
            
            do {
                player1 = scan.nextLine().toLowerCase(); 

                if (player1.equals("")) {
                    System.out.println(EMPTY_WORD_PROMPT);
                }
             
            } while ((player1.equals("")));
          
            // ^^^
            // Continue prompting until Player 1 provides a non-empty word.
       
            int length = player1.length(); 
            String[] word = new String[length];
            // This array stores the contents of Player 1's word.
            
           
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
            
            System.out.println(GUESS_PROMPT);
            // ^^^
            // Prints the amount of guesses Player 2 has with spaces for each character.
          
            do { 
           
                player2 = scan.nextLine().toLowerCase(); 
           
                if ((player2.length() > 1) || (player2.equals(""))) {
                    System.out.println(INVALID_GUESS_PROMPT);
                }
           
            } while ((player2.length() > 1) || (player2.equals("")));

            // ^^^
            // Checks that Player 2 enters exactly one character before continuing.
            
            wordComplete = false;
            int numGuesses = (length + 3);
            // Player 2 receives three additional guesses beyond the word length.

            do {
                
                if (!(player1.contains(player2))) {
                    System.out.println("There is no " + player2 + "!");
                } // Checks first if the letter Player 2 enter is in the word Player 1 entered.
                
                for (int i = 0; i < player1.length(); i++) {
                    if (player1.substring(i, i + 1).equals(player2)) {
                         word[i] = player2;
                    }
                }  // This loop runs if the letter Player 2 enters is equal to any letter in Player 1's word.
                
                wordComplete = true;
                // Assumes the word is completed / Player 2 fully guesses the word.
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
                 } // Checks to make sure Player 2 hasn't ran out of guesses.
                 
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
                 // Prints the amount of guesses Player 2 has left.
                 // Prints the amount of correct letters Player 2 has guessed thus far.
                 // Reprompts Player 2 to continue.
                    
                 do {
                        player2 = scan.nextLine().toLowerCase(); // Scans user input.
                     
                        if ((player2.length() > 1) || (player2.equals(""))) {
                            System.out.println(INVALID_GUESS_PROMPT);
                        }
                    
                    } while ((player2.length() > 1) || (player2.equals("")));

                     // ^^^
                     // This loop checks if Player 2 enters exact one letter.
                     // Reprompts otherwise. 
                   
             
            } while (!wordComplete && numGuesses > 0); 
            // This loop continues while "wordComplete" is false AND the number of guesses is greater than 0.
            // Once one of these conditions becomes false, the loop breaks and the program continues below.

       
            if (wordComplete) {
                System.out.println(WINNING_PROMPT);
            } else {
                System.out.println(LOSING_PROMPT); 
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
