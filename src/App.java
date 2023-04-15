import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //
        // First question
        //

        float x, y;

        System.out.print("Enter x: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextFloat();

        y = -0.16f * (float) Math.pow(x, 2.f) + 3.6f * x + 1.2f;

        System.out.println("Answer the height of the ball (y) is: " + y);

        //
        // Second question
        //

        double root1 = (-(3.6) + Math.sqrt(Math.pow(3.6, 2) - 4 * (-0.16) * (1.2))) / (2 * -0.16);
        double root2 = (-(3.6) - Math.sqrt(Math.pow(3.6, 2) - 4 * (-0.16) * (1.2))) / (2 * -0.16);
        double distanceTraveled;

        if (root1 > 0) {
            distanceTraveled = root1;
        } else if (root2 > 0) {
            distanceTraveled = root2;
        } else {
            System.out.println("ERROR: Both roots are negative! You did something wrong.");
            return;
        }

        System.out.println("Distance traveled: " + distanceTraveled);
    }
}
