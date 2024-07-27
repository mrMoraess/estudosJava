public class App {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto1 = (short) numeroNormal;

        numeroNormal = - numeroNormal;
        System.out.println(numeroNormal);

        numeroNormal = numeroNormal * (-1);
        System.out.println(numeroNormal);

        numeroNormal++;
        System.out.println(numeroNormal --);
        System.out.println(numeroNormal);

        boolean verdade = true;

        System.out.println(!verdade);

        // ternary operator

        int x, y;
        x = 0;
        y = 1;

        System.out.println(x == y ? "Impossible" : "it is not true");

        //

        System.out.println(x != y);
        System.out.println(x > y);
        System.out.println(x >= y);

        //
        // usa-se .equals() para comparar objetos

        String nome1 = "Matheus";
        String nome2 = new String("Matheus");

        System.out.println(nome1 == nome2);
        System.out.println(nome1.equals(nome2));

        // logic operators
        // || or 
        // && and
    }
}
