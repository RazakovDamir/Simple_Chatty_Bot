import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        int number = 0;
        do {
            number = in.nextInt();
            if (max < number) {
                max = number;
            }
        } while (number != 0);
        System.out.println(max);
    }
}