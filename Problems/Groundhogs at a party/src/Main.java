import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cups = scanner.nextInt();
        Boolean wek = scanner.nextBoolean();
        Boolean party = cups >= 10 && cups <= 20 && !wek || cups >= 15 && cups <= 25 && wek;
        System.out.println(party);
    }
}