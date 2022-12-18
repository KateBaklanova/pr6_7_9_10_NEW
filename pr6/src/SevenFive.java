public class SevenFive implements Stringa {

      public String a;
      public int Count()
      {
          return a.length();
      }

      public String Odd()
      {
           String b="";
           for(int i =0; i<a.length(); i++)
          {
                 if (i%2==0) {
                     b+=a.charAt(i);
                 }
          }
           return b;
      }

      public String reverse ()
      {
          String b="";
          for(int i =a.length()-1; i>=0; i--)
          {
               b+=a.charAt(i);
          }
          return b;

      }

    public static void main(String[] args)
    {
         SevenFive b = new SevenFive();
         b.a = "Practice5";
         System.out.println(b.reverse());

        System.out.println(b.Odd());

        System.out.println(b.Count());
    }
}
