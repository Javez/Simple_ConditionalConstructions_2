import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yourNumber = 0;
        int max = 10;
        int min = 5;
        int range = max - min + 1;

        Scanner in = new Scanner(System.in);

        yourNumber = in.nextInt();

        if(yourNumber < 9 && yourNumber > 2) {
            int randNumb = 0;
            System.out.println( randNumb = (int)(Math.random() * range) + min );
        } else {
            System.out.println("Unexpected number");
        }
        in.close();
    }
}
