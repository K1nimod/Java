import java.util.Scanner;

public class SzovegesErtekeles {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Adjon meg egy egész számot: ");

        int szam = sc.nextInt();

        String ertekeles = switch(szam)
        {
            case 1 -> "elégtelen";
            case 2 -> "elégséges";
            case 3 -> "közepes";
            case 4 -> "jó";
            case 5 -> "jeles";
            default -> "nincs ilyen jegy";
        };

        System.out.println(ertekeles);

    }
}
