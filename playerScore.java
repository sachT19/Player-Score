import java.util.Scanner;

public class Basketball
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter player one's name:");
        String play1 = input.nextLine();
        
        System.out.println("Enter player two's name:");
        String play2 = input.nextLine();
        
        System.out.println("Enter " + play1 + "'s score:");
        int score1 = input.nextInt();
        
        System.out.println("Enter " + play2 + "'s score:");
        int score2 = input.nextInt();
        
        if (play1.compareTo(play2) <= 0){
            System.out.println(play1 + " scored " + score1 + " points");
            System.out.println(play2 + " scored " + score2 + " points");
        }
        else{
            System.out.println(play2 + " scored " + score2 + " points");
            System.out.println(play1 + " scored " + score1 + " points");
        }
        if (score1 > score2){
            System.out.println(play1 + " wins!");
        }
        else{
            System.out.println(play2 + " wins!");
        }
        
        // Start by listing the steps you need to take
        //Print out the player’s scores in alphabetical order according to the player’s names. Use the String method compareTo that was covered in lesson 2.8. You can also refer to the DOCS if you’ve forgotten how to use it, or to the JavaDocs here:
        
        
        
        
    }
}
