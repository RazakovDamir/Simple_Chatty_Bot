import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.nextLine();
        int b = in.nextInt();
        int c = in.nextInt();
        System.out.print(a.substring(b, ++c));
    }
}