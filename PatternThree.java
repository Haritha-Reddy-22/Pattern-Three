import java.util.Scanner;

public class PatternThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square (even number recommended): ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == n) {
                    // Last row should be all hashes
                    System.out.print("# ");
                } else if ((i + j) % 2 == 0) {
                    // Alternate pattern
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
