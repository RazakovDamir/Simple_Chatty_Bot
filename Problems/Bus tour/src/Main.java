import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int b = scanner.nextInt();
        boolean crash = false;
        for (int i = 0; i < b; i++) {
            int hb = scanner.nextInt();
            if (hb < h || hb == h) {
                crash = true;
                System.out.println("Will crash on bridge " + (i + 1));
                break;
            }

        }
        if (!crash) {
            System.out.println("Will not crash");
        }
    }

}
