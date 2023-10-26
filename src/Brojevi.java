

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Brojevi {

    public static void main(String[] args) {
        List<Double> numbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite brojeve, ili unesite 'stop' za zaustavljanje unosa:");

        while (true) {
            String input = scanner.next();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }

            try {
                double number = Double.parseDouble(input);
                numbers.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Unijeli ste nevažeći broj. Pokušajte ponovno.");
            }
        }

        scanner.close();

        if (numbers.isEmpty()) {
            System.out.println("Niste unijeli nijedan broj.");
            return;
        }

        double min = numbers.stream().mapToDouble(Double::doubleValue).min().orElse(0);
        double max = numbers.stream().mapToDouble(Double::doubleValue).max().orElse(0);
        double sum = numbers.stream().mapToDouble(Double::doubleValue).sum();
        double mean = sum / numbers.size();
        double variance = numbers.stream()
                .mapToDouble(number -> Math.pow(number - mean, 2))
                .sum() / numbers.size();
        double standardDeviation = Math.sqrt(variance);

        System.out.println("Minimum: " + min);
        System.out.println("Maksimum: " + max);
        System.out.println("Srednja vrijednost: " + mean);
        System.out.println("Standardna devijacija: " + standardDeviation);
    }
}


