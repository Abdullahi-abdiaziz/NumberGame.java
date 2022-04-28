import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        int randomNumber = (int) (Math.random()*200)+1;
        boolean hasWon = false;

        System.out.println("I have randomly chosen a number between 1 and 200");
        System.out.println("Try to guess it");

        Scanner scanner = new Scanner(System.in);
        for (int i=5 ; i>0 ; i--) {
            System.out.println("Waxaa kuu hartay "+ i +" iskuday  dooro markale");
            int guess = scanner.nextInt();

            if (randomNumber < guess)
                System.out.println("wuu ka yar yahay ");
            else if (randomNumber > guess)
                System.out.println("wuu ka wayn yahay ");
            else {
                hasWon = true;
                break;
            }
        }
        if (hasWon) {
            System.out.println("SAX .... WAAD GUULAYSATAY!!");
        }
        else {
            System.out.println("DHAMAAD !?.");
            System.out.println("LAMBARKU WUXUU AHAA : "+randomNumber);
        }
    }
}
