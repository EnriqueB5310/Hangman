import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;
import  java.io.File;
public class Game {

  public void play() throws FileNotFoundException {
    Scanner file = new Scanner(new File("words.txt"));
    Scanner cin = new Scanner();
    List<String> words = new ArrayList<>();
    String word;

    while (file.hasNext()) {
      words.add(file.nextLine());
    }

    Random ran = new Random();

word = words.get(ran.nextInt(words.size()));

System.out.println(word);

List<Character> userguess = new ArrayList<>();
printWordState(userguess,word);
GetPlayerGuess(cin, userguess, word);






}

  private void GetPlayerGuess(Scanner cin, List<Character> input, String word) {
System.out.println("Enter a letter");
String letter = cin.nextLine();
  }

  private void printWordState(List<Character> input, String word) {

    for (int i = 0; i < word.length(); i++) {

      if(input.contains(word.charAt(i))) {
        System.out.println(word.charAt(i));
      }

      else {System.out.print("-");}

    }

  }


}

