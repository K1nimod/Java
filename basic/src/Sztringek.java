import java.util.Scanner;

public class Sztringek {
    static void main() {
        /*String firstName = "John";
        String lastName = "Doe";

        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));

        System.out.println(firstName.length());

        System.out.println(firstName.toUpperCase());

        System.out.println(firstName.toLowerCase());

        String txt = "Please locate where 'locate' occurs!";
        System.out.println(txt.indexOf("locate"));*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Adja meg a vezetéknevét:");
        String vezNev = sc.next();

        System.out.print("Adja meg a keresztnév:");
        String kerNev = sc.next();

        System.out.print("Adja meg a születési helyét::");
        String szulHely = sc.next();

        System.out.print("Adja meg az életkorát:");
        int kor = Integer.parseInt(sc.next());


        String fullName = vezNev + " " + kerNev;
        System.out.println(fullName.toUpperCase());

        System.out.println(fullName.indexOf(kerNev));

        System.out.println(fullName.toLowerCase() + " " + szulHely.toLowerCase());

        System.out.println("A felhasználó: " + kor + " éves, " + fullName + "-nak hívják és " + szulHely + "-n született");

        if(kerNev.charAt(0) == 'a' || kerNev.charAt(0) == 'A' )
        {
            System.out.println("Igen.");
        }
        else
        {
            System.out.println("Nem.");
        }

        if(vezNev.charAt(vezNev.length() - 1) == 't')
        {
            System.out.println("Igen.");
        }
        else
        {
            System.out.println("Nem.");
        }

        System.out.println(vezNev.length() + kerNev.length());

        System.out.println(fullName.replaceAll("i","y"));

    }
}
