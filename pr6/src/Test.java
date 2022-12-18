public class Test {

    public static void main(String[] args) {
        double C = 36.6;
        K k=new K();
        F f= new F();
        System.out.print("В кельвинах "+k.convert(C));

        System.out.print("В Фаренгейтах "+f.convert(C));
    }
}
