import java.util.Scanner; //put imports you need here

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String age = in.next();
        String edu = in.next();
        String exp = in.next();
        String pref = in.next();

        age = "The form for ";
        edu = " is completed. We will contact you if we need a chef that cooks ";
        exp = " dishes.";

        System.out.print(age);
        System.out.print(name);
        System.out.print(edu);
        System.out.print(pref);
        System.out.print(exp);
    }
}