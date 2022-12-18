public class MathFunc implements MathCalculable {
         public double power(double a, double b)
         {
             return Math.pow(a, b);
         }

         public double abs(double a, double b)
         {
             return Math.sqrt(a*a+b*b);
         }

         public double S(double r)
         {
             return PI*r*r;
         }

}
