import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        System.out.print("What's 8 X 3? ");

        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();

        System.out.println("83" + answer);
    }
}
