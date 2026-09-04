# 🧩 WordGuesser

This program is a two-player word guessing game written in Java. Player 1 enters a word, and Player 2 attempts to guess the word one letter at a time. The program displays the correctly guessed letters, tracks the number of guesses remaining, validates player input, and allows the players to start another round.

---

## 📂 Files

- [`WordGuesser.java`](./WordGuesser.java) — main source code file containing the game logic.
- [`SampleOutput.md`](./SampleOutput.md) — contains an example of the program running in the console.

---

## 🧠 Program Description

The `WordGuesser` program allows two players to play a simple word guessing game:

1. **Player 1 enters a word** for Player 2 to guess.
2. The program displays the word as underscores so Player 2 can see how many characters it contains.
3. **Player 2 enters one character at a time** as a guess.
4. Correct guesses reveal the corresponding characters in the word.
5. Incorrect guesses display a message and reduce the number of guesses remaining.
6. Player 2 wins if all characters in the word are revealed.
7. Player 1 wins if Player 2 uses all available guesses without completing the word.
8. The players can choose whether to start another round.

---

## ⚙️ How It Works

The program uses a `String[]` array to represent the word being guessed. Each position initially contains an underscore (`_`). When Player 2 correctly guesses a character, the corresponding position in the array is replaced with the guessed character.

The program allows Player 2 a maximum of **6 guesses per round**. Each unsuccessful attempt to complete the word decreases the remaining guess count.

Player input is converted to lowercase when entering the word and guesses, while the play-again response is converted to uppercase.

---

## 👀 Check Out My Other Projects!
- Here is an easier way to get there:
  
  --> [`CreateNewUser`](https://github.com/Royalj25/CreateNewUser) 
  
  --> [`HobbyRecommender`](https://github.com/Royalj25/HobbyRecommender) 

- Wanna get back to the main repository? --> [`Portfolio`](https://github.com/Royalj25/Portfolio)
