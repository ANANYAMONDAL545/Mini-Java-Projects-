import java.util.Random;
import java.util.Scanner;

public class Mini_Project_2_Stone_Paper_Scissors {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int userScore = 0;
        int computerScore = 0;

        // 0 for Stone  // 1 for Paper  // 2 for Scissors

        for (int i = 0; i < 5; i++) {
        System.out.println("Round " + (i + 1));
        System.out.println("Enter your choice, * 0 for Stone * 1 for Paper * 2 for Scissors: ");
        int userInput = sc.nextInt();




        int computerInput = random.nextInt(3);


        if(userInput == computerInput){
            System.out.println("Draw");
        } else if (userInput == 0 && computerInput == 2 || userInput == 1 && computerInput == 0 || userInput == 2 && computerInput == 1){
            System.out.println("Congratulations ! You win");
            userScore++;
        } else{
            System.out.println("Computer win !");
            computerScore++;
        }


        if(computerInput == 0){
            System.out.println("Computer input: Stone");
        }
        else if(computerInput == 1){
            System.out.println("Computer input: Paper");
        }
        else if (computerInput == 2){
            System.out.println("Computer input: Scissors");
        }
        System.out.println("Current Score => You: " + userScore + " | Computer: " + computerScore);
        System.out.println();

    }
     // Final Result
System.out.println("Final Score => You: " + userScore + " | Computer: " + computerScore);
        if (userScore > computerScore) {
        System.out.println("🎉 Congratulations! You won the game!");
        } else if (computerScore > userScore) {
        System.out.println("💻 Computer wins the game! Better luck next time.");
        } else {
        System.out.println("🤝 It's a tie overall!");
        }
}
}
