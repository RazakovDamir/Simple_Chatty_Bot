import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = 0;
        int n1 = 0;

        for (int i = 0; i < n; i++) {
            n1 = in.nextInt();
            if (n1 % 4 == 0 && max < n1) {
                max = n1;
            }
        }
        System.out.println(max);
    }

}