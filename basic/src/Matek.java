public class Matek {
    static void main() {

        /*int max = Math.max(5, 10);
        int min = Math.min(5, 10);
        double sqrt = Math.sqrt(64);
        double abs = Math.abs(-4.7);
        double pow = Math.pow(4, 3);
        double round = Math.round(4.4);
        double ceil = Math.ceil(3.85);
        double floor = Math.floor(-4.69);
        int rand = (int)(Math.random() * 101);
        double pi = Math.PI;
        double e = Math.E;*/

        int random1 = (int)(Math.random() * 201 + 1);
        int random2 = (int)(Math.random() * 201 + 1);

        System.out.println(Math.max(random1,random2));

        System.out.println(Math.min(random1,random2));

        System.out.println(Math.sqrt(random1) + " " + Math.sqrt(random2));

        System.out.println(Math.max(random1,random2) - Math.min(random1,random2));

        System.out.println(Math.pow(random1, 2) + " " + Math.pow(random2, 2));

        System.out.println(Math.round((Math.max(random1,random2) * 1.0) / Math.min(random1,random2)));

        System.out.println(Math.floor((Math.max(random1,random2) * 1.0) / Math.min(random1,random2)));

        System.out.println(Math.ceil((Math.max(random1,random2) * 1.0) / Math.min(random1,random2)));







    }
}
