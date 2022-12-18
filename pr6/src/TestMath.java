import java.util.Scanner;

import static java.lang.System.exit;

public class TestMath {
    public static void main(String[] args)
    {
        int n;
        double a, b;
        MathFunc f=new MathFunc();
        while(true) {
            System.out.println("Введите 1 для возведения в степень \n 2 - для вычисления модуля комплексного числа \n 3 - для вычисления площади окружности ");
            Scanner in = new Scanner(System.in);
            n = in.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Введите число и степень ");
                    a = in.nextInt();
                    b = in.nextDouble();
                    System.out.println(f.power(a, b));
                    break;
                case 2:
                    System.out.println("Введите x и y для комплексного числа вида x+i*y ");
                    a = in.nextDouble();
                    b = in.nextInt();
                    System.out.println(f.abs(a, b));
                    break;
                case 3:
                    System.out.println("Введите радиус r ");
                    a = in.nextDouble();
                    System.out.println(f.S(a));
                    break;
                default:
                    exit(0);
            }
        }
    }

}
