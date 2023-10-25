// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.print("Unesite n: ");
        int n = scanner.nextInt();
        // Press Shift+F10 or click the green arrow button in the gutter to run the code.

        for (int i = 1; i <= n; i++) {
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            if (i % sumofn(i) == 0) {
                System.out.println(i);
            }
        }
    }

    public static int sumofn(int b) {
        int sum = 0;
        while (b != 0) {
            sum += b % 10;
            b /= 10;
        }
        return sum;
    }
}