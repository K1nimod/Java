import java.util.Scanner;
public class ParosParatlanWhile {
    static void main() {
        int be = -1;
        Scanner sc = new Scanner(System.in);

        while(be < 0)
        {

            System.out.print("Adjon meg egy egész számot: ");
            be = sc.nextInt();
            if(be > 0)
            {
                if(be % 2 == 0)
                {
                    System.out.println("Páros.");
                }
                else
                {
                    System.out.println("Páratlan.");
                }
            }
            else
            {
                System.out.println("Pozitív számot.");
            }
        }
    }
}
