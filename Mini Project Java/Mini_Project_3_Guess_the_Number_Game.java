
import java.util.Random;
import java.util.Scanner;
class Game1{

    int userInput;
    int randomNum;
    boolean isCorrect = false;
    int noOfGuesses = 0 ;

    public Game1(){
        Random rand = new Random();
        randomNum = rand.nextInt(100);
    }
    public void takeUserInput(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the number between 0 and 99:");
        userInput = sc.nextInt();
    }
    public void isCorrectNumber(){
        if(userInput == randomNum){
            System.out.println("Your guess is absolutely correct.Congratulation");
            isCorrect = true;
        }else if(userInput>randomNum){
            System.out.println("Your number is high..,enter any low number");
            isCorrect = false;
        }else{
            System.out.println("Low number.., Please enter any greater number.");
            isCorrect = false;
        }
    }
}
public class Mini_Project_3_Guess_the_Number_Game {
    public static void main(String[] args) {

        Game1 g = new Game1();
        while(!g.isCorrect){
            g.takeUserInput();
            g.isCorrectNumber();
            g.noOfGuesses+=1;
        }
        System.out.println("No of Guesses :"+ g.noOfGuesses);
        System.out.println("correct number :" + g.userInput);
    }
}