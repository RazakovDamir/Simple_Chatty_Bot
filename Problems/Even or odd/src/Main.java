import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {
            int number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            if (number % 2 == 0 && number != 1) {
                System.out.println("even");
            } else if (number == 1) {
                System.out.println("odd");
            } else {
                System.out.println("odd");
            }

        } while (true);
    }

}