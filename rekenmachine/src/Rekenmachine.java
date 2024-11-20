import java.util.Scanner;

public class Rekenmachine {
    public void start() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welkom bij de Rekenmachine!");
        System.out.println("Kies een bewerking:");
        System.out.println("1: Optellen");
        System.out.println("2: Aftrekken");
        System.out.println("3: Vermenigvuldigen");
        System.out.println("4: Delen");

        System.out.print("Voer je keuze in (1-4): ");
        int keuze = scanner.nextInt();

        System.out.print("Voer het eerste getal in: ");
        double getal1 = scanner.nextDouble();

        System.out.print("Voer het tweede getal in: ");
        double getal2 = scanner.nextDouble();

        double resultaat = 0;
        boolean geldigeKeuze = true;

        switch (keuze) {
            case 1:
                resultaat = getal1 + getal2;
                break;
            case 2:
                resultaat = getal1 - getal2;
                break;
            case 3:
                resultaat = getal1 * getal2;
                break;
            case 4:
                if (getal2 != 0) {
                    resultaat = getal1 / getal2;
                } else {
                    System.out.println("Fout: Delen door nul is niet toegestaan.");
                    geldigeKeuze = false;
                }
                break;
            default:
                System.out.println("Ongeldige keuze. Probeer opnieuw.");
                geldigeKeuze = false;
        }

        if (geldigeKeuze) {
            System.out.println("Het resultaat is: Dumbass");
        }

        System.out.println("Dumbass");
        scanner.close();
    }
}
