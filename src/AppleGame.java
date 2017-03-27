import java.util.Scanner;


public class AppleGame {
    public static void main(String[] args) {
        outer:

        while (true) {
            System.out.print("Hello.You can bye an apple in our imaginary shop :)");
            System.out.print("Press '1' key - red apples or '2' key - green apples: ");
            Scanner scan = new Scanner(System.in);
            String answer = scan.next();
            switch (answer) {
                case "1":
                    RedApple redApples = new RedApple();
                    redApples.output();
                    break outer;
                case "2":
                    GreenApple greenApples = new GreenApple();
                    greenApples.output();
                    break outer;
                default:
                    System.out.println("Ooops...");
                    continue outer;
            }
        }
    }
}

