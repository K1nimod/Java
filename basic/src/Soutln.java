import java.util.Scanner;

public class Soutln {
    static void main() {
        String msg = "I'm happy today";
        int a = 150;
        int o = 0226;
        int h = 0x96;
        double d = 10;

        System.out.print(msg);
        System.out.println(a);
        System.out.println(o);
        System.out.println(h);
        System.out.println(d);

        Scanner sc = new Scanner(System.in);

        System.out.print("Kedvenc zenéje: ");
        String music = sc.next();

        System.out.print("Kedvenc étele: ");
        String food = sc.next();

        System.out.print("Kedvenc hobbina: ");
        String hobby = sc.next();

        System.out.print("Kedvenc filmje: ");
        String film = sc.next();

        System.out.print("Kedvenc uticélja: ");
        String destination = sc.next();

        System.out.println("A kedvenc zenéd: " + music);
        System.out.println("A kedvenc ételed: " + food);
        System.out.println("Kedvenc filmed:" + film);
        System.out.println("Uticélod: " + destination);


    }
}
