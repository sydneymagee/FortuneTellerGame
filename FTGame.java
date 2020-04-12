package solution;
import java.util.Scanner;


public class FTGame
{
    Scanner kb = new Scanner(System.in);
    static String[] fortunes = {"Today is your day!", 
        "Stay positive, better days are on their way!", 
        "Every moment is a fresh beginning.", 
        "Die with memories, not dreams.", 
        "You are unlimited.", 
        "When nothing goes right, go left.", 
        "Good things take time.", 
        "If you wish to see the best in others, show the best of yourself.",
        "We can't control the wind, but we can alwasy adjust the sails.", 
        "Be not afraid of growing slowly, be afraid only of standing still."};
    static int one;
    static int two;
    static int three;
    
    public static void main(String[] args)
    {
        System.out.println("Welcome to the Fortune Teller!");
        FTGame ftg = new FTGame();
        ftg.askQues();
        ftg.play();
    }
    public void getName()
    {
        System.out.println("Please enter your name: ");
        String name = kb.nextLine();
        one = name.length();
    }
    public void getAge()
    {
        System.out.println("Age: ");
        String age = kb.nextLine();
        two = age.length();
    }
    public void getColor()
    {
        System.out.println("Favorite color: ");
        String color = kb.nextLine();
        three = color.length();
        System.out.println();
    }
    public void askQues() 
    {
        getName();
        getAge();
        getColor();
    }
    public void play()
    {
        int info = one + two + three;
        info = info % fortunes.length;
        System.out.println("Your fortune is");
        System.out.println(fortunes[info]);
    }       
}
    
    