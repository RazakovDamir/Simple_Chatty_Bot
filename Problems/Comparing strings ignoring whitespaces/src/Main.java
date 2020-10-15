import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        String n = a.replace(" ", "");
        String m = b.replace(" ", "");
        Boolean l = n.equals(m);
        System.out.println(l);
    }
}