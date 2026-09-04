# 🖥️ Sample Program Run — WordGuesser

This file shows a **sample run** of the `WordGuesser` program, including example user inputs (in brackets) and the resulting program output.

---

## Sample Input & Output

Welcome to WordGuesser.java!

Player 1, enter the word for Player 2 to guess

[cat]

Player 2, below is the word with your guesses so far

'_ _ _'

Player 2, enter the letter you would like to guess

[x]

There is no x!

Player 2, you have 5 guesses left!

Player 2, below is the word with your guesses so far

'_ _ _'

Player 2, enter the letter you would like to guess

[a]

Player 2, you have 4 guesses left!

Player 2, below is the word with your guesses so far

_ a _

Player 2, enter the letter you would like to guess

[c]

Player 2, you have 3 guesses left!

Player 2, below is the word with your guesses so far

c a _

Player 2, enter the letter you would like to guess

[t]

Congratulations Player 2! You have guessed the word correctly!

Would you like to play again (Y or N)?

[N]

---

## 📝 Notes

- Player 1 enters the word that Player 2 will attempt to guess.
- Player 2 enters one character at a time as a guess.
- Correct guesses reveal the corresponding characters in the word.
- Incorrect guesses reduce the number of guesses remaining.
- The number of available guesses is based on the length of Player 1's word, with **three additional guesses** provided.
- Player 2 wins when all characters in the word have been revealed.
- The players can enter `Y` to start another round or `N` to end the program.

---

## ⚠️ Input Assumptions

The program assumes that Player 1 enters a word consisting of letters and that Player 2 enters letters as guesses.

The current input validation for Player 2 only checks that the input contains **exactly one character**. It does not verify whether that character is specifically a letter. Therefore, numbers, symbols, or other single characters can technically be entered as guesses and will count toward the available guesses.

Player 1's input is only checked to make sure that it is not empty. Other types of characters are not specifically restricted.

These cases are outside the scope of the current implementation and are not specifically tested in this sample.

---

## 🧪 Want to Test My Code?
Ready to see my code in action? -->
[Click here to learn how!](https://github.com/Royalj25/HowToTestMyCode) <--

