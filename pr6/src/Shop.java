import java.util.Scanner;

public class Shop {

    Scanner in = new Scanner(System.in);
     Fill[] a;

     public void add()
     {
        System.out.println("Введите компьютер (память, монитор, процессор, для выхода введите 0");
        while(in.nextLine()!="0") {
            String z = in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            a[1] = new Computer(z, b, c);
        }

     }

    public void search()
    {

        System.out.println("Введите компьютер (память, монитор, процессор, для выхода введите 0");

        String z = in.nextLine();



    }

}
