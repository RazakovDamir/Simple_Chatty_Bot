import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int oldNum = scanner.nextInt();
        int newNum;
        int a = 0;
        int b = 0;
        while ((newNum = scanner.nextInt()) != 0) {
            if (newNum > oldNum) {
                a++;
            }
            if (newNum < oldNum) {
                b++;
            }
            oldNum = newNum;
        }
        System.out.println(a == 0 || b == 0);
    }
}