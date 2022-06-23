package StringCalculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = StringCalculator.calculate(input);
        System.out.println(result);
    }
}
