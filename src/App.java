import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {


        System.out.print("Enter a 4 digit number: ");

        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();

        String digit1, digit2, digits34;

        digit1 = number.substring(0, 1);
        digit2 = number.substring(1,2);
        digits34 = number.substring(2, 4);

        int first, second, third;

        first = Integer.parseInt(digit1);
        second = Integer.parseInt(digit2);
        third = Integer.parseInt(digits34);

        if(first * second == third) {
            System.out.println("SUCCESS! " + first + " X " + second + " == "  + third);
        }
        else{
            System.out.println("FAIL - " + first + " X " + second + " != " + third);
        }
    }
}
