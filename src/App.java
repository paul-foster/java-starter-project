import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int i = scanner.nextInt();
        System.out.println(i);

        System.out.print("Enter any number: ");
        float f = scanner.nextFloat();
        System.out.println(f);

        System.out.print("Enter any character: ");
        String s = scanner.next();
        System.out.println(s.charAt(0));

        short x = Short.MAX_VALUE;
        System.out.println(x);
        x++;
        System.out.println(x);
    }
}
