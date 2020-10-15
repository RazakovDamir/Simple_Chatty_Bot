import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a = in.nextInt();

        if (a > -15 && a <= 12) {
            System.out.println("True");
        } else if (a > 14 && a < 17) {
            System.out.println("True");
        } else if (a >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
