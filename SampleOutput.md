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

- Player 1's word must be non-empty but is not restricted to letters.
- Player 2 must enter exactly one character, but the program does not require it to be a letter.
- Numbers, symbols, and other single characters are accepted as guesses.

---

## 🧪 Want to Test My Code?
Ready to see my code in action? -->
[Click here to learn how!](https://github.com/Royalj25/TestingTutorial)

