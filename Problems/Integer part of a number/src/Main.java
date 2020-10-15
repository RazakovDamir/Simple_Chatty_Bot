import java.util.Scanner;

public class Main {

    public static int extractInt(double d) {
        int c = 0;
        if (d >= 0) {
            c = (int) d;
            return c;
        }
        return c;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final double d = scanner.nextDouble();
        System.out.println(extractInt(d));
    }
}