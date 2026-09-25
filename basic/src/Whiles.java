public class Whiles {
    static void main() {
        int random1 = (int)(Math.random() * 99 + 1);
        int random2 = (int)(Math.random() * 99 + 1);

        int kis = Math.min(random1,random2);
        int nagy = Math.max(random1,random2);
        int sor = 0;

        while(kis <= nagy)
        {
            if(sor == 10)
            {
                System.out.println();
                sor = 0;
            }
            System.out.print(kis + ", ");
            kis++;
            sor++;
        }

        System.out.println();

        int random3 = (int)(Math.random() * 99 + 1);
        int random4 = (int)(Math.random() * 99 + 1);

        int kis2 = Math.min(random3,random4);
        int nagy2 = Math.max(random3,random4);
        int sor2 = 0;

        do
        {
            if(sor2 == 10)
            {
                System.out.println();
                sor2 = 0;
            }
            System.out.print(kis2 + ", ");
            kis2++;
            sor2++;
        }
        while (kis2 <= nagy2);
    }
}
