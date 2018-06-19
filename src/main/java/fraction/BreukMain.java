package fraction;

public class BreukMain extends Breuk {
    public static void main(String[] args) {

        Breuk a = new Breuk(2, 4);
        Breuk b = new Breuk(3, 5);
        Breuk output = new Breuk(0, 0);

        output = a.plus(b);
        String outputString = output.toString();

        System.out.println(outputString);
    }


}
