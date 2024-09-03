import java.util.Scanner;

public class VerifyLetter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDigite uma string: ");
        String input = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'a' || c == 'A') {
                count++;
            }
        }

        if (count > 0) {
            System.out.println("\nA letra 'a' ocorre " + count + " vez(es) na string.");
        } else {
            System.out.println("\nA letra 'a' não ocorre na string.");
        }

        scanner.close();
    }
}
