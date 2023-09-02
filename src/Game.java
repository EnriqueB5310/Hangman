import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import  java.io.File;
public class Game {

  public void play() throws FileNotFoundException {
    Scanner file = new Scanner(new File("words.txt"));
    Scanner cin = new Scanner(System.in);
    List<String> words = new ArrayList<>();
    String word;

    while (file.hasNext()) {
      words.add(file.nextLine());
    }

    Random ran = new Random();

word = words.get(ran.nextInt(words.size()));

System.out.println(word);

List<Character> userguess = new ArrayList<>();

int wrongCount = 0;

while (true) {
display(wrongCount);

  if (wrongCount >= 6) {
    System.out.println("You lost, the word was  " + word);
    break;
  }

  printWordState(userguess, word);
  if(!GetPlayerGuess(cin, userguess, word)) {
    wrongCount++;
  };
  printWordState(userguess, word);

}



}

  private boolean GetPlayerGuess(Scanner cin, List<Character> input, String word) {
System.out.println("Enter a letter");
String letter = cin.nextLine();
input.add(letter.charAt((0)));

return word.contains(letter);
  }

  private void printWordState(List<Character> input, String word) {

    for (int i = 0; i < word.length(); i++) {

      if(input.contains(word.charAt(i))) {
        System.out.print(word.charAt(i));
      }

      else {System.out.print("-");
      }

    }
System.out.println();
  }

  private void display(int wrongCount) {

    if(wrongCount >= 1) {System.out.println("0");}
    if (wrongCount >= 2) {System.out.print("\\");}
    if (wrongCount >= 3) {System.out.println("/");}
    if  (wrongCount >= 4) {System.out.println("|");}
    if (wrongCount >= 5) {System.out.print("/");}
    if (wrongCount >= 6) {System.out.println("\\");}



  }




}

