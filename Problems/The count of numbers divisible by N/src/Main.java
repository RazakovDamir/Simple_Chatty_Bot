import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % n == 0) {
                sum += 1;
            }
        }
        System.out.println(sum);
    }
}