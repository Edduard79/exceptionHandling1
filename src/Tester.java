import java.util.Scanner;

public class Tester {

    public Tester() {
    }

    public static void checkScore(double score) {


        if (0 < score && score <= 50.00) {
            System.out.println("Average score!");
        } else if (score > 50.00 && score <= 100.00) {
            System.out.println("Very good score");
        } else {
            throw new ArithmeticException("Score is out of scale!");
        }
    }


    public static void main(String[] args) {

        System.out.println("Insert the number: ");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        checkScore(num);



    }
}
