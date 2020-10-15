import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double m = scanner.nextDouble();
        double p = scanner.nextDouble();
        double k = scanner.nextDouble();
        int sum = 0;
        if (m != k) {
            do {
                m += m * p / 100;
                sum += 1;
            } while (m < k);
        } else {
            sum = 0;
        }
        System.out.println(sum);
    }
}