public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // Tipos primitivos
        
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 6;
        numero = 10;

        System.out.print(numero);

        // Para garantir que o valor não poderá ser modificado.
        final double VALOR_DE_PI = 3.14;
    }
}
