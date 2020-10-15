import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int a = 0;
        int b = 0;
        do {
            a += 1;
            b += 1;
            if (a * b <= n) {
                System.out.println(a * b);
            }
        } while (a * b <= n);
    }
}